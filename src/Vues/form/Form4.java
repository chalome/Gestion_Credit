package Vues.form;

import DAO.ClientDAO;
import DAO.DemandeDAO;
import DAO.TypeCreditDAO;
import Modeles.Client;
import Modeles.Demande;
import Modeles.TypeCredit;
import Utilities.Utils;
import Utilities.Validation;
import Vues.transitions.TransitionsForm;
import java.awt.Color;
import java.util.Date;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

public class Form4 extends TransitionsForm {

    String client;
    String credit;
    Date date;
    Date dateRemb;
    int montant;

    public Form4() {
        initComponents();
        showComboValues();
        listDemandes();
        clientTxt.setBackground(new Color(240, 240, 240));
        TypeTxt.setBackground(new Color(240, 240, 240));
        dateRembTX.setBackground(new Color(240, 240, 240));
        dateTxt.setBackground(new Color(240, 240, 240));
        montantTxt.setBackground(new Color(240, 240, 240));
        table.setBackground(new Color(240, 240, 240));
        radioHome.setBackground(new Color(240, 240, 240));
        radioHome1.setBackground(new Color(240, 240, 240));
        radioHome2.setBackground(new Color(240, 240, 240));
        radioHome3.setBackground(new Color(240, 240, 240));
        radioHome4.setBackground(new Color(240, 240, 240));
        radioHome5.setBackground(new Color(240, 240, 240));
        radioHome6.setBackground(new Color(240, 240, 240));
        radioHome7.setBackground(new Color(240, 240, 240));
        radioHome8.setBackground(new Color(240, 240, 240));
    }

    void showComboValues() {
        List<Client> categorieList = new ClientDAO().getAll();
        categorieList.stream().forEach((cl) -> {
            clientTxt.addItem(cl);
        });
        List<TypeCredit> types = new TypeCreditDAO().getAll();
        types.stream().forEach((type) -> {
            TypeTxt.addItem(type);
        });
    }

    void listDemandes() {
        DemandeDAO Cdao = new DemandeDAO();
        String header[] = {"ID", "NOM", "CREDIT", "DATE", "MONTANT","REMBOURSEMENT","ETAT"};
        Object data[][] = new Object[Cdao.getAll().size()][7];
        int i = 0;
        for (Demande demande : Cdao.getAll()) {
            data[i][0] = demande.getDemandeID();
            data[i][1] = demande.getDemandeClient();
            data[i][2] = demande.getDemandeTypeCredit();
            data[i][3] = demande.getDemandeDate();
            data[i][4] = demande.getDemandeMontant();
            data[i][5] = demande.getDemandeDateRemboursement();
            data[i][6] = demande.getDemandeEtat();
            i++;
        }
        table.setModel(new DefaultTableModel(data, header));
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        TypeTxt = new Vues.swing.Combobox();
        montantTxt = new Vues.swing.TextField();
        clientTxt = new Vues.swing.Combobox();
        dateTxt = new com.toedter.calendar.JDateChooser();
        jScrollPane1 = new javax.swing.JScrollPane();
        table = new Vues.swing.TableDark();
        radioHome = new Vues.swing.RadioButtonCustom();
        jLabel2 = new javax.swing.JLabel();
        l1 = new javax.swing.JLabel();
        l2 = new javax.swing.JLabel();
        radioHome1 = new Vues.swing.RadioButtonCustom();
        l3 = new javax.swing.JLabel();
        radioHome2 = new Vues.swing.RadioButtonCustom();
        l4 = new javax.swing.JLabel();
        radioHome3 = new Vues.swing.RadioButtonCustom();
        l5 = new javax.swing.JLabel();
        radioHome4 = new Vues.swing.RadioButtonCustom();
        radioHome5 = new Vues.swing.RadioButtonCustom();
        l6 = new javax.swing.JLabel();
        radioHome6 = new Vues.swing.RadioButtonCustom();
        l7 = new javax.swing.JLabel();
        radioHome7 = new Vues.swing.RadioButtonCustom();
        l8 = new javax.swing.JLabel();
        radioHome8 = new Vues.swing.RadioButtonCustom();
        l9 = new javax.swing.JLabel();
        l10 = new javax.swing.JLabel();
        modifierCmd = new Vues.swing.Button();
        demanderCmd = new Vues.swing.Button();
        resetCmd = new Vues.swing.Button();
        supprimerCmd3 = new Vues.swing.Button();
        dateRembTX = new com.toedter.calendar.JDateChooser();

        jLabel1.setFont(new java.awt.Font("sansserif", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(79, 79, 79));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Demande de Crédit");

        TypeTxt.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        TypeTxt.setLabeText("Type Crédit");
        TypeTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TypeTxtActionPerformed(evt);
            }
        });

        montantTxt.setFont(new java.awt.Font("Times New Roman", 0, 13)); // NOI18N
        montantTxt.setLabelText("Le montant");
        montantTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                montantTxtActionPerformed(evt);
            }
        });

        clientTxt.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        clientTxt.setLabeText("Client");
        clientTxt.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                clientTxtItemStateChanged(evt);
            }
        });

        dateTxt.setDateFormatString("yyyy-MM-dd");
        dateTxt.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N

        table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        table.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                tableMouseReleased(evt);
            }
        });
        jScrollPane1.setViewportView(table);

        radioHome.setText("Attestation d'Identite complete");
        radioHome.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        radioHome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioHomeActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jLabel2.setText("Lste des documents");

        radioHome1.setText("Attestation de service");
        radioHome1.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        radioHome1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioHome1ActionPerformed(evt);
            }
        });

        radioHome2.setText("Photocopie de la CNI");
        radioHome2.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        radioHome2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioHome2ActionPerformed(evt);
            }
        });

        radioHome3.setText("Devis chiffres du projet a financer");
        radioHome3.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        radioHome3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioHome3ActionPerformed(evt);
            }
        });

        radioHome4.setText("Extrait d'acte de mariage");
        radioHome4.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        radioHome4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioHome4ActionPerformed(evt);
            }
        });

        radioHome5.setText("Accreditif");
        radioHome5.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        radioHome5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioHome5ActionPerformed(evt);
            }
        });

        radioHome6.setText("Justification des revenus declares");
        radioHome6.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        radioHome6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioHome6ActionPerformed(evt);
            }
        });

        radioHome7.setText("Garantie");
        radioHome7.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        radioHome7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioHome7ActionPerformed(evt);
            }
        });

        radioHome8.setText("Accreditif des derniers mois pour le salarie");
        radioHome8.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        radioHome8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioHome8ActionPerformed(evt);
            }
        });

        modifierCmd.setBackground(new java.awt.Color(204, 204, 204));
        modifierCmd.setText("modifier");
        modifierCmd.setFont(new java.awt.Font("Times New Roman", 0, 17)); // NOI18N
        modifierCmd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                modifierCmdActionPerformed(evt);
            }
        });

        demanderCmd.setBackground(new java.awt.Color(204, 204, 204));
        demanderCmd.setText("demander");
        demanderCmd.setFont(new java.awt.Font("Times New Roman", 0, 17)); // NOI18N
        demanderCmd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                demanderCmdActionPerformed(evt);
            }
        });

        resetCmd.setBackground(new java.awt.Color(204, 204, 204));
        resetCmd.setText("Reset");
        resetCmd.setFont(new java.awt.Font("Times New Roman", 0, 17)); // NOI18N
        resetCmd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resetCmdActionPerformed(evt);
            }
        });

        supprimerCmd3.setBackground(new java.awt.Color(204, 204, 204));
        supprimerCmd3.setText("Supprimer");
        supprimerCmd3.setFont(new java.awt.Font("Times New Roman", 0, 17)); // NOI18N
        supprimerCmd3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                supprimerCmd3ActionPerformed(evt);
            }
        });

        dateRembTX.setDateFormatString("yyyy-MM-dd");
        dateRembTX.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 880, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 831, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(TypeTxt, javax.swing.GroupLayout.DEFAULT_SIZE, 246, Short.MAX_VALUE)
                            .addComponent(montantTxt, javax.swing.GroupLayout.DEFAULT_SIZE, 246, Short.MAX_VALUE)
                            .addComponent(clientTxt, javax.swing.GroupLayout.DEFAULT_SIZE, 246, Short.MAX_VALUE)
                            .addComponent(dateTxt, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(203, 203, 203)
                                .addComponent(jLabel2))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(15, 15, 15)
                                .addComponent(l1, javax.swing.GroupLayout.PREFERRED_SIZE, 13, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(radioHome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(l2, javax.swing.GroupLayout.PREFERRED_SIZE, 13, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(l3, javax.swing.GroupLayout.PREFERRED_SIZE, 13, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(l5, javax.swing.GroupLayout.PREFERRED_SIZE, 13, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(radioHome4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addComponent(radioHome2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(l7, javax.swing.GroupLayout.PREFERRED_SIZE, 13, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(radioHome6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(l10, javax.swing.GroupLayout.PREFERRED_SIZE, 13, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(radioHome1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(l4, javax.swing.GroupLayout.PREFERRED_SIZE, 13, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(radioHome3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addGroup(layout.createSequentialGroup()
                                                        .addComponent(l6, javax.swing.GroupLayout.PREFERRED_SIZE, 13, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                        .addComponent(radioHome5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addGap(50, 50, 50)
                                                        .addComponent(l8, javax.swing.GroupLayout.PREFERRED_SIZE, 13, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                        .addComponent(radioHome7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(l9, javax.swing.GroupLayout.PREFERRED_SIZE, 13, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(radioHome8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(dateRembTX, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(55, 55, 55)
                        .addComponent(demanderCmd, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(modifierCmd, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(32, 32, 32)
                        .addComponent(supprimerCmd3, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(resetCmd, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(29, 29, 29)
                                .addComponent(clientTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(27, 27, 27)
                                .addComponent(jLabel2)
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(radioHome1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(l2, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(l10, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(radioHome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(l1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(9, 9, 9)
                                .addComponent(TypeTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(radioHome3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(l4, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(radioHome2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(l3, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(montantTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(dateTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(8, 8, 8)
                        .addComponent(dateRembTX, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(radioHome4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(l5, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(radioHome6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(l7, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(demanderCmd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(modifierCmd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(radioHome5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(l6, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(radioHome7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(l8, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(radioHome8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(l9, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(supprimerCmd3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(resetCmd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 243, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(30, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void montantTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_montantTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_montantTxtActionPerformed

    private void TypeTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TypeTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TypeTxtActionPerformed

    private void tableMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableMouseReleased
        int ligne = table.getSelectedRow();
        clientTxt.setSelectedItem(table.getValueAt(ligne, 1).toString());
        TypeTxt.setSelectedItem(table.getValueAt(ligne, 2).toString());
        montantTxt.setText(table.getValueAt(ligne, 4).toString());
        JTextField showdate = (JTextField) dateTxt.getDateEditor().getUiComponent();
        showdate.setText(table.getValueAt(ligne, 3).toString());
    }//GEN-LAST:event_tableMouseReleased

    private void radioHome1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioHome1ActionPerformed
        l10.setText("");        // TODO add your handling code here:
    }//GEN-LAST:event_radioHome1ActionPerformed

    private void radioHome3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioHome3ActionPerformed
        l4.setText("");        // TODO add your handling code here:
    }//GEN-LAST:event_radioHome3ActionPerformed

    private void radioHome5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioHome5ActionPerformed
        l6.setText("");        // TODO add your handling code here:
    }//GEN-LAST:event_radioHome5ActionPerformed

    private void radioHome7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioHome7ActionPerformed
        l8.setText("");        // TODO add your handling code here:
    }//GEN-LAST:event_radioHome7ActionPerformed

    private void radioHome8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioHome8ActionPerformed
        l9.setText("");        // TODO add your handling code here:
    }//GEN-LAST:event_radioHome8ActionPerformed

    private void modifierCmdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_modifierCmdActionPerformed
        client = clientTxt.getSelectedItem().toString();
        credit = TypeTxt.getSelectedItem().toString();
        montant = Integer.parseInt(montantTxt.getText());
        date = dateTxt.getDate();
        dateRemb=dateRembTX.getDate();
        int modifier;
        int ligne = table.getSelectedRow();
        int id = Integer.parseInt(table.getValueAt(ligne, 0).toString());
        if (ligne == -1) {
            JOptionPane.showMessageDialog(this, "Selectionnez la ligne a modifier ", "Erreur!", JOptionPane.ERROR_MESSAGE);
        } else {
            int y = JOptionPane.showConfirmDialog(this, "Voulez-vous vraiement faire la modification?",
                    "Confirmation", JOptionPane.YES_NO_OPTION);
            if (y == JOptionPane.OK_OPTION) {
                modifier = new DemandeDAO().update(new Demande(id, client, credit, date, montant,dateRemb));
                if (modifier == 1) {
                    JOptionPane.showMessageDialog(this, "Modifié avec succès", "Succès", JOptionPane.INFORMATION_MESSAGE);
                    listDemandes();
                } else {
                    JOptionPane.showMessageDialog(this, "Echec de modification", "Erreur", JOptionPane.ERROR_MESSAGE);
                }

            }
        }
    }//GEN-LAST:event_modifierCmdActionPerformed

    private void demanderCmdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_demanderCmdActionPerformed
        client = clientTxt.getSelectedItem().toString();
        credit = TypeTxt.getSelectedItem().toString();
        date = dateTxt.getDate();
        dateRemb=dateRembTX.getDate();
        montant = Integer.parseInt(montantTxt.getText());
        if (client.isEmpty() || credit.isEmpty() || montantTxt.getText().trim().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Tous les champs sont obligatoires", "Erreur!", JOptionPane.ERROR_MESSAGE);
        } else if (!Validation.isValidNumber(montantTxt.getText(), Utils.NUMBER)) {
            JOptionPane.showMessageDialog(this, "Le montant n'est pas valide", "Erreur!", JOptionPane.ERROR_MESSAGE);
        } else if (l1.getText().equals("?") || l3.getText().equals("?") || l4.getText().equals("?") || l5.getText().equals("?")
                || l6.getText().equals("?") || l7.getText().equals("?") || l8.getText().equals("?") || l9.getText().equals("?") || l10.getText().equals("?")) {
            JOptionPane.showMessageDialog(this, "Verifiez les documents obligatoires", "Erreur!", JOptionPane.ERROR_MESSAGE);
        } else {
            int demnader = new DemandeDAO().create(new Demande(client, credit, date, montant,dateRemb));
            if (demnader == 1) {
                JOptionPane.showMessageDialog(this, "Credit demandé avec succès", "Succès", JOptionPane.INFORMATION_MESSAGE);
                listDemandes();
            } else {
                JOptionPane.showMessageDialog(this, "Echec de demande du credit", "Erreur", JOptionPane.ERROR_MESSAGE);
            }
        }
    }//GEN-LAST:event_demanderCmdActionPerformed

    private void resetCmdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resetCmdActionPerformed
        clientTxt.setSelectedItem(null);
        TypeTxt.setSelectedItem(null);
        montantTxt.setText("");
        dateTxt.setDate(null);
        dateRembTX.setDate(null);
    }//GEN-LAST:event_resetCmdActionPerformed

    private void supprimerCmd3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_supprimerCmd3ActionPerformed
        int delete;
        int ligne = table.getSelectedRow();
        int id = Integer.parseInt(table.getValueAt(ligne, 0).toString());
        if (ligne == -1) {
            JOptionPane.showMessageDialog(this, "Selectionnez la ligne a supprimer ", "Erreur!", JOptionPane.ERROR_MESSAGE);
        } else {
            int y = JOptionPane.showConfirmDialog(this, "Voulez-vous vraiement faire la suppression?",
                    "Confirmation", JOptionPane.YES_NO_OPTION);
            if (y == JOptionPane.OK_OPTION) {
                delete = new DemandeDAO().delete(id);
                if (delete == 1) {
                    JOptionPane.showMessageDialog(this, "Supprimé avec succès", "Succès", JOptionPane.INFORMATION_MESSAGE);
                    listDemandes();
                } else {
                    JOptionPane.showMessageDialog(this, "Echec de suppression", "Error", JOptionPane.ERROR_MESSAGE);
                }

            }
        }

    }//GEN-LAST:event_supprimerCmd3ActionPerformed

    private void clientTxtItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_clientTxtItemStateChanged
        setDocument();
        radioHome.setSelected(false);
        radioHome1.setSelected(false);
        radioHome2.setSelected(false);
        radioHome3.setSelected(false);
        radioHome4.setSelected(false);
        radioHome5.setSelected(false);
        radioHome6.setSelected(false);
        radioHome7.setSelected(false);
        radioHome8.setSelected(false);
    }//GEN-LAST:event_clientTxtItemStateChanged

    private void radioHomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioHomeActionPerformed
        l1.setText("");// TODO add your handling code here:
    }//GEN-LAST:event_radioHomeActionPerformed

    private void radioHome2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioHome2ActionPerformed
        l3.setText("");// TODO add your handling code here:
    }//GEN-LAST:event_radioHome2ActionPerformed

    private void radioHome4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioHome4ActionPerformed
        l5.setText("");        // TODO add your handling code here:
    }//GEN-LAST:event_radioHome4ActionPerformed

    private void radioHome6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioHome6ActionPerformed
        l7.setText("");        // TODO add your handling code here:
    }//GEN-LAST:event_radioHome6ActionPerformed
    private void setDocument() {
        int type = Validation.categorieClient(clientTxt.getSelectedItem().toString().trim());
        if (type == 2) {
            //id co;att serv;photo;devixs;extrait;acrced
            //id co
            l1.setText("?");
            l1.setForeground(Color.red);
            //att
            l10.setText("?");
            l10.setForeground(Color.red);
            //photo
            l3.setText("?");
            l3.setForeground(Color.red);
            //devis
            l4.setText("?");
            l4.setForeground(Color.red);
            //extr
            l5.setText("?");
            l5.setForeground(Color.red);
            //accre
            l6.setText("");

        } else if (type == 2) {
            //id co;att serv;photo;extrait;devixs
            l1.setText("?");
            l1.setForeground(Color.red);

            l10.setText("?");
            l10.setForeground(Color.red);

            l3.setText("?");
            l3.setForeground(Color.red);

            l5.setText("?");
            l5.setForeground(Color.red);
            //gar
            l8.setText("?");
            l8.setForeground(Color.red);
            //rev
            l7.setText("?");
            l7.setForeground(Color.red);
        } else if (type == 1) {
            l10.setText("?");
            l10.setForeground(Color.red);
            l3.setText("?");
            l3.setForeground(Color.red);
            l1.setText("?");
            l1.setForeground(Color.red);

            l9.setText("?");
            l9.setForeground(Color.red);

            l4.setText("");
            l5.setText("");
            l7.setText("");
            l8.setText("");
            l6.setText("");
        } else if (type == 4) {
            l1.setText("?");
            l1.setForeground(Color.red);

            l10.setText("?");
            l10.setForeground(Color.red);

            l3.setText("?");
            l3.setForeground(Color.red);

            l5.setText("?");
            l5.setForeground(Color.red);
            //gar
            l8.setText("?");
            l8.setForeground(Color.red);
            //rev
            l7.setText("?");
            l7.setForeground(Color.red);

            l4.setText("?");
            l4.setForeground(Color.red);

            l6.setText("");
            l9.setText("");
        } else if (type == 5) {
            l1.setText("?");
            l1.setForeground(Color.red);

            l10.setText("?");
            l10.setForeground(Color.red);

            l3.setText("?");
            l3.setForeground(Color.red);

            l5.setText("?");
            l5.setForeground(Color.red);
            //gar
            l8.setText("?");
            l8.setForeground(Color.red);
            //rev
            l7.setText("?");
            l7.setForeground(Color.red);

            l4.setText("");
            l6.setText("");
            l9.setText("");
        } else {

        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private Vues.swing.Combobox TypeTxt;
    private Vues.swing.Combobox clientTxt;
    private com.toedter.calendar.JDateChooser dateRembTX;
    private com.toedter.calendar.JDateChooser dateTxt;
    private Vues.swing.Button demanderCmd;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel l1;
    private javax.swing.JLabel l10;
    private javax.swing.JLabel l2;
    private javax.swing.JLabel l3;
    private javax.swing.JLabel l4;
    private javax.swing.JLabel l5;
    private javax.swing.JLabel l6;
    private javax.swing.JLabel l7;
    private javax.swing.JLabel l8;
    private javax.swing.JLabel l9;
    private Vues.swing.Button modifierCmd;
    private Vues.swing.TextField montantTxt;
    private Vues.swing.RadioButtonCustom radioHome;
    private Vues.swing.RadioButtonCustom radioHome1;
    private Vues.swing.RadioButtonCustom radioHome2;
    private Vues.swing.RadioButtonCustom radioHome3;
    private Vues.swing.RadioButtonCustom radioHome4;
    private Vues.swing.RadioButtonCustom radioHome5;
    private Vues.swing.RadioButtonCustom radioHome6;
    private Vues.swing.RadioButtonCustom radioHome7;
    private Vues.swing.RadioButtonCustom radioHome8;
    private Vues.swing.Button resetCmd;
    private Vues.swing.Button supprimerCmd3;
    private Vues.swing.TableDark table;
    // End of variables declaration//GEN-END:variables
}
