/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * WinDetalheFrota.java
 *
 * Created on 08/08/2010, 23:57:56
 */
package br.com.view;

import br.com.dao.DAODetalhaFrota;
import br.com.dao.DAOEmpresa;
import br.com.pojo.Empresa;
import br.com.pojo.EmpresaDetalhaFrota;
import br.com.util.MyUtil;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Elton
 */
public class WinDetalheFrota extends javax.swing.JPanel {

    /** Creates new form WinDetalheFrota */
    private DefaultTableModel model;
    private List<EmpresaDetalhaFrota> edfs;
    private EmpresaDetalhaFrota edf;

    public WinDetalheFrota() {
        initComponents();

        initAction();
        refresh();
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane2 = new javax.swing.JScrollPane();
        jPanel1 = new javax.swing.JPanel();
        panelCrudEmpresa1 = new javax.swing.JPanel();
        btCadastrar = new javax.swing.JButton();
        jLabel20 = new javax.swing.JLabel();
        jLabel47 = new javax.swing.JLabel();
        btExcluir = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();
        btNovo = new javax.swing.JButton();
        jLabel28 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        tfCompMedio = new javax.swing.JTextField();
        tfFrota = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        tfEstocagem = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        tfPotMotor = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        table = new javax.swing.JTable();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        tfGps = new javax.swing.JTextField();
        tfEcos = new javax.swing.JTextField();
        tfRadar = new javax.swing.JTextField();
        tfSonar = new javax.swing.JTextField();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        tfGuincho = new javax.swing.JTextField();
        tfPowerBlock = new javax.swing.JTextField();
        tfDuracao = new javax.swing.JTextField();
        tfFreq = new javax.swing.JTextField();
        jLabel27 = new javax.swing.JLabel();
        tfProducao = new javax.swing.JTextField();
        jScrollPane3 = new javax.swing.JScrollPane();
        tfObs = new javax.swing.JTextPane();
        jLabel1 = new javax.swing.JLabel();

        setPreferredSize(new java.awt.Dimension(1000, 1700));

        panelCrudEmpresa1.setBackground(new java.awt.Color(255, 255, 255));

        btCadastrar.setText("Salvar");
        btCadastrar.setToolTipText("Realiza a Confirma��o do Pagamento definindo exatamente o dia de pagamento."); // NOI18N
        btCadastrar.setFocusable(false);
        btCadastrar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btCadastrar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);

        btExcluir.setText("Excluir");

        btNovo.setText("Novo");

        jLabel28.setFont(new java.awt.Font("Verdana", 1, 11));
        jLabel28.setText("Detalhamento da Frota ");

        javax.swing.GroupLayout panelCrudEmpresa1Layout = new javax.swing.GroupLayout(panelCrudEmpresa1);
        panelCrudEmpresa1.setLayout(panelCrudEmpresa1Layout);
        panelCrudEmpresa1Layout.setHorizontalGroup(
            panelCrudEmpresa1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelCrudEmpresa1Layout.createSequentialGroup()
                .addGroup(panelCrudEmpresa1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelCrudEmpresa1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(panelCrudEmpresa1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelCrudEmpresa1Layout.createSequentialGroup()
                                .addGap(83, 83, 83)
                                .addComponent(jLabel20)
                                .addGap(45, 45, 45)
                                .addComponent(jLabel12))
                            .addGroup(panelCrudEmpresa1Layout.createSequentialGroup()
                                .addGap(16, 16, 16)
                                .addGroup(panelCrudEmpresa1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(panelCrudEmpresa1Layout.createSequentialGroup()
                                        .addComponent(btNovo)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(btCadastrar)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(btExcluir))
                                    .addComponent(jLabel47)))))
                    .addGroup(panelCrudEmpresa1Layout.createSequentialGroup()
                        .addGap(377, 377, 377)
                        .addComponent(jLabel28)))
                .addContainerGap(557, Short.MAX_VALUE))
        );
        panelCrudEmpresa1Layout.setVerticalGroup(
            panelCrudEmpresa1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelCrudEmpresa1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelCrudEmpresa1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel20)
                    .addGroup(panelCrudEmpresa1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jLabel47)
                        .addComponent(jLabel12))
                    .addComponent(jLabel28))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 12, Short.MAX_VALUE)
                .addGroup(panelCrudEmpresa1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btCadastrar)
                    .addComponent(btNovo)
                    .addComponent(btExcluir))
                .addContainerGap())
        );

        jLabel14.setText("Frota Especie");

        jLabel15.setText("Comp Medio");

        jLabel13.setText("Cap. Estocagem");

        jLabel16.setText("Pot�ncia do Motor");

        table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Frota Especie", "Comp Medio", "Cap Estocagem", "Pot Motor", "GPS", "Ecos", "Radar", "Sonar", "Guinchol", "Power Block", "Produ��o", "Dura��o", "Freq"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, true, true, true, true, true, true, true, true, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(table);
        table.getColumnModel().getColumn(12).setPreferredWidth(30);

        jLabel18.setText("Radar");

        jLabel19.setText("Sonar");

        jLabel21.setText("Ecos");

        jLabel22.setText("GPS");

        jLabel23.setText("Dura��o");

        jLabel24.setText("Freq");

        jLabel25.setText("Power Block");

        jLabel26.setText("Guincho");

        jLabel27.setText("Producao");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelCrudEmpresa1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addContainerGap()
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGap(27, 27, 27)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel16)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel15)
                                        .addComponent(jLabel14)
                                        .addComponent(jLabel13))
                                    .addGap(16, 16, 16)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(tfCompMedio, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGroup(jPanel1Layout.createSequentialGroup()
                                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(tfEstocagem, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 147, Short.MAX_VALUE)
                                                        .addComponent(tfPotMotor, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 147, Short.MAX_VALUE))
                                                    .addGap(5, 5, 5)))
                                            .addGap(11, 11, 11))
                                        .addComponent(tfFrota, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGap(16, 16, 16)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(jLabel18)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(tfRadar, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addComponent(jLabel22)
                                            .addGap(7, 7, 7))
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addComponent(jLabel21)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(tfGps, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(tfEcos, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(jLabel19)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(tfSonar, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGap(18, 18, 18)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel27)
                                .addComponent(jLabel23)
                                .addComponent(jLabel24))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(tfFreq, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addComponent(jLabel25)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(tfPowerBlock, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addComponent(jLabel26)
                                            .addGap(18, 18, 18)
                                            .addComponent(tfGuincho, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addComponent(tfDuracao, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(tfProducao, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(170, 170, 170))
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 1064, Short.MAX_VALUE))
                    .addContainerGap()))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(panelCrudEmpresa1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(833, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(89, 89, 89)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel14)
                                .addComponent(tfFrota, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel22)
                                .addComponent(tfGps, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel27)
                                .addComponent(tfProducao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel15)
                                .addComponent(tfCompMedio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel21)
                                .addComponent(tfEcos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(tfDuracao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel23))
                            .addGap(11, 11, 11)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel13)
                                .addComponent(tfEstocagem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(tfPotMotor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel16)))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGap(18, 18, 18)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel26)
                                .addComponent(tfGuincho, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel25)
                                .addComponent(tfPowerBlock, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel18)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(tfRadar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel24)
                                        .addComponent(tfFreq, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(tfSonar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel19))))))
                    .addGap(27, 27, 27)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(499, Short.MAX_VALUE)))
        );

        jScrollPane2.setViewportView(jPanel1);

        jScrollPane3.setViewportView(tfObs);

        jLabel1.setText("Observa��o:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 1000, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 364, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addContainerGap(624, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 424, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(1174, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btCadastrar;
    private javax.swing.JButton btExcluir;
    private javax.swing.JButton btNovo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel47;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JPanel panelCrudEmpresa1;
    private javax.swing.JTable table;
    private javax.swing.JTextField tfCompMedio;
    private javax.swing.JTextField tfDuracao;
    private javax.swing.JTextField tfEcos;
    private javax.swing.JTextField tfEstocagem;
    private javax.swing.JTextField tfFreq;
    private javax.swing.JTextField tfFrota;
    private javax.swing.JTextField tfGps;
    private javax.swing.JTextField tfGuincho;
    private javax.swing.JTextPane tfObs;
    private javax.swing.JTextField tfPotMotor;
    private javax.swing.JTextField tfPowerBlock;
    private javax.swing.JTextField tfProducao;
    private javax.swing.JTextField tfRadar;
    private javax.swing.JTextField tfSonar;
    // End of variables declaration//GEN-END:variables

    private void initAction() {

        btNovo.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e) {
                clear();
                edf = null;
            }
        });
        btCadastrar.addActionListener(getActionListener());
        // btAtualizar.addActionListener(getActionListener());
        btExcluir.addActionListener(getActionListener());
        table.addMouseListener(new MouseAdapter() {

            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                edf = getEDFofTable();

            }
        });
        WinSelecionaEmpresa.cbEmpresa.addItemListener(new ItemListener() {

            public void itemStateChanged(ItemEvent e) {
                if (e.getStateChange() == ItemEvent.SELECTED) {
                    if (WinSelecionaEmpresa.cbEmpresa.getSelectedIndex() > 0) {
                        refresh();
                    } else {
                        clear();
                        //  edf = null;
                    }
                }
            }
        });


    }

    private void refresh() {
        if (WinSelecionaEmpresa.cbEmpresa.getSelectedIndex() > 0) {
            edfs = new ArrayList<EmpresaDetalhaFrota>();
            edfs = new DAODetalhaFrota().getListWithQuery("select * from " +
                    "EmpresaDetalheFrota where empresaId = " +
                    WinSelecionaEmpresa.empresas.get(WinSelecionaEmpresa.cbEmpresa.getSelectedIndex() - 1).getId());

            refreshTable(edfs);
        } else {
            clear();
        }
    }

    private void refreshTable(List<EmpresaDetalhaFrota> list) {

        model = (DefaultTableModel) table.getModel();
        table.clearSelection();
        MyUtil.clearTable(table);
        for (int i = 0; i < list.size(); i++) {
            EmpresaDetalhaFrota e = list.get(i);
            Object[] objeto = {e.getFrotaEspecie(), e.getCompMedio(),
                e.getCapEstocagem(), e.getPotenciaMotor(), e.getGps(), e.getEcos(),
                e.getRadar(), e.getSonar(),
                e.getGuincho(), e.getPowerBlock(), e.getGuincho(),
                e.getPowerBlock(), e.getDuracao(), e.getFreq(), e.getProducao()};
            model.addRow(objeto);
        }
    }

    private EmpresaDetalhaFrota getEDFofPanel() {

        if (edf != null) {
            edf.setFrotaEspecie(tfFrota.getText());
            edf.setCompMedio(tfCompMedio.getText());
            edf.setCapEstocagem(tfEstocagem.getText());
            edf.setPotenciaMotor(tfPotMotor.getText());
            edf.setGps(tfGps.getText());
            edf.setEcos(tfEcos.getText());
            edf.setRadar(tfRadar.getText());
            edf.setSonar(tfSonar.getText());
            edf.setGuincho(tfGuincho.getText());
            edf.setPowerBlock(tfPowerBlock.getText());
            edf.setDuracao(tfDuracao.getText());
            edf.setFreq(tfFreq.getText());
            edf.setProducao(tfProducao.getText());

            return edf;
        }
        EmpresaDetalhaFrota e = new EmpresaDetalhaFrota();
        e.setFrotaEspecie(tfFrota.getText());
        e.setCompMedio(tfCompMedio.getText());
        e.setCapEstocagem(tfEstocagem.getText());
        e.setPotenciaMotor(tfPotMotor.getText());
        e.setGps(tfGps.getText());
        e.setEcos(tfEcos.getText());
        e.setRadar(tfRadar.getText());
        e.setSonar(tfSonar.getText());
        e.setGuincho(tfGuincho.getText());
        e.setPowerBlock(tfPowerBlock.getText());
        e.setDuracao(tfDuracao.getText());
        e.setFreq(tfFreq.getText());
        e.setProducao(tfProducao.getText());
        e.setEmpresaId(WinSelecionaEmpresa.empresas.get(WinSelecionaEmpresa.cbEmpresa.getSelectedIndex() - 1).getId());
        return e;
    }

    private EmpresaDetalhaFrota getEDFofTable() {

        EmpresaDetalhaFrota e = edfs.get(table.getSelectedRow());
        tfFrota.setText(e.getFrotaEspecie());
        tfCompMedio.setText(e.getCompMedio());
        tfEstocagem.setText(e.getCapEstocagem());
        tfPotMotor.setText(e.getPotenciaMotor());
        tfGps.setText(e.getGps());
        tfEcos.setText(e.getEcos());
        tfRadar.setText(e.getRadar());
        tfSonar.setText(e.getSonar());
        tfGuincho.setText(e.getGuincho());
        tfPowerBlock.setText(e.getPowerBlock());
        tfDuracao.setText(e.getDuracao());
        tfFreq.setText(e.getFreq());
        tfProducao.setText(e.getProducao());

        return e;
    }

    private ActionListener getActionListener() {
        return new ActionListener() {

            public void actionPerformed(ActionEvent e) {
                action(e);
            }
        };
    }

    private void action(ActionEvent e) {
        String cmd = e.getActionCommand();

        if (WinSelecionaEmpresa.cbEmpresa.getSelectedIndex() > 0) {
            if (cmd.equalsIgnoreCase("Salvar")) {
                if (edf == null) {
                    edf = getEDFofPanel();
                    new DAODetalhaFrota().cadastrar(edf);
                } else {
                    edf = getEDFofPanel();
                    new DAODetalhaFrota().atualizar(edf);
                }
            } else if (cmd.equalsIgnoreCase("Excluir")) {
                edf = getEDFofPanel();
                new DAODetalhaFrota().excluir(edf);
            } else if (cmd.equalsIgnoreCase("Atualizar")) {
            }
            refresh();
            clear();
            edf = null;

        }
    }

    private void clear() {
        MyUtil.FieldsClear(this);
        //MyUtil.clearTable(table);
    }
}
