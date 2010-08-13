/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * WinQuestionarioPescador.java
 *
 * Created on 10/08/2010, 00:50:14
 */
package br.com.view.pescador;

import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.Insets;
import java.awt.Toolkit;
import javax.swing.JPanel;
import javax.swing.UIManager;
import javax.swing.UIManager.LookAndFeelInfo;
import javax.swing.UnsupportedLookAndFeelException;

/**
 *
 * @author Elton
 */
public class WinQuestionarioPescador extends javax.swing.JFrame {

    /** Creates new form WinQuestionarioPescador */
     private Integer index = 1;
    private final int max = 5;
    private final int min = 2;

    public WinQuestionarioPescador() {
        initLookAndfeel();
        initComponents();
        btAnterior.setEnabled(false);
        ChangePanel("", new WinPanelPescador());
        Insets in = Toolkit.getDefaultToolkit().getScreenInsets(this.getGraphicsConfiguration());
        Dimension d = Toolkit.getDefaultToolkit().getScreenSize();
        int width = d.width - (in.left + in.top);
        int height = d.height - (in.top + in.bottom);
        setSize(width, height);
        setLocation(in.left, in.top);

    }

    private void initLookAndfeel() {
        try {
            for (LookAndFeelInfo info : UIManager.getInstalledLookAndFeels()) {

                if ("Nimbus".equals(info.getName())) {
                    UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
                    break;
                }
            }
        } catch (UnsupportedLookAndFeelException e) {
            // handle exception
        } catch (ClassNotFoundException e) {
            // handle exception
        } catch (InstantiationException e) {
            // handle exception
        } catch (IllegalAccessException e) {
            // handle exception
        }
    }

    /**
     * Realiza a troca de panel dinamicamente
     * @param nomePainel O nome do painel
     * @param jPanel O Jpanel a ser mostrada
     */
    private void ChangePanel(String nomePainel, JPanel jPanel) {

        panelDireito.removeAll();
        panelDireito.setVisible(false);

        try {

            Container container = getContentPane();
            container.setLayout(new BorderLayout());

            panelDireito = new JPanel(new CardLayout());
            panelDireito.add(nomePainel, jPanel);
            container.add(BorderLayout.AFTER_LINE_ENDS, panelDireito);
            CardLayout card = (CardLayout) panelDireito.getLayout();
            card.next(panelDireito);


        } catch (Exception e) {
        }
    }

     private void updatePanel(Integer index) {
        switch (index) {
            case 1: {
                  ChangePanel("", new WinPanelPescador());
                break;
            }
            case 2: {
               ChangePanel("", new WinComposicaoPescaria());
                break;
            }
            case 3: {
                  ChangePanel("", new WinDadosEmbarcacao());
                break;
            }
            case 4: {
                 ChangePanel("", new WinPescadorEspecies());
                break;
            }
            case 5: {
                  ChangePanel("", new WinPercepcaoAmbiental());
                break;
            }

        }
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelDireito = new javax.swing.JPanel();
        btAnterior = new javax.swing.JButton();
        btProximo = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        panelDireito.setBackground(new java.awt.Color(255, 255, 255));
        panelDireito.setPreferredSize(new java.awt.Dimension(999, 999));

        javax.swing.GroupLayout panelDireitoLayout = new javax.swing.GroupLayout(panelDireito);
        panelDireito.setLayout(panelDireitoLayout);
        panelDireitoLayout.setHorizontalGroup(
            panelDireitoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 931, Short.MAX_VALUE)
        );
        panelDireitoLayout.setVerticalGroup(
            panelDireitoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 616, Short.MAX_VALUE)
        );

        btAnterior.setText("Anterior");
        btAnterior.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btAnteriorActionPerformed(evt);
            }
        });

        btProximo.setText("Proximo");
        btProximo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btProximoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(btAnterior)
                .addGap(18, 18, 18)
                .addComponent(btProximo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 49, Short.MAX_VALUE)
                .addComponent(panelDireito, javax.swing.GroupLayout.PREFERRED_SIZE, 931, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelDireito, javax.swing.GroupLayout.DEFAULT_SIZE, 616, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(137, 137, 137)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btAnterior)
                    .addComponent(btProximo))
                .addContainerGap(456, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btAnteriorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btAnteriorActionPerformed
        // TODO add your handling code here:

        if (index-- == min) {
            updatePanel(index);
            btAnterior.setEnabled(false);

        } else {
            updatePanel(index);
        }

        btProximo.setEnabled(true);
}//GEN-LAST:event_btAnteriorActionPerformed

    private void btProximoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btProximoActionPerformed
        // TODO add your handling code here:

        if (index++ == max) {
            updatePanel(index);
            btProximo.setEnabled(false);

        } else {

            updatePanel(index);
        }
        btAnterior.setEnabled(true);
    }//GEN-LAST:event_btProximoActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btAnterior;
    private javax.swing.JButton btProximo;
    private javax.swing.JPanel panelDireito;
    // End of variables declaration//GEN-END:variables
}
