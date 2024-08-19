package Vues.form;

import DAO.RemboursementDAO;
import Modeles.Remboursement;
import Utilities.Utils;
import Utilities.*;
import Vues.transitions.TransitionsForm;
import java.awt.Color;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

public class Form5 extends TransitionsForm {

    int demande;
    int montant;
    Date date;

    public Form5() {
        initComponents();
        lisRemboursements();
        idTxt.setBackground(new Color(240, 240, 240));
        montantTxt.setBackground(new Color(240, 240, 240));
        dateTxt.setBackground(new Color(240, 240, 240));
        table.setBackground(new Color(240, 240, 240));
    }

    final void lisRemboursements() {
        RemboursementDAO rdao = new RemboursementDAO();
        String header[] = {"ID", "DEMANDE", "MONTANT", "DATE"};
        Object data[][] = new Object[rdao.getAll().size()][4];
        int i = 0;
        for (Remboursement remboursement : rdao.getAll()) {
            data[i][0] = remboursement.getId();
            data[i][1] = remboursement.getDemande();
            data[i][2] = remboursement.getMontant();
            data[i][3] = remboursement.getDate();
            i++;
        }
        table.setModel(new DefaultTableModel(data, header));
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        idTxt = new Vues.swing.TextField();
        dateTxt = new com.toedter.calendar.JDateChooser();
        montantTxt = new Vues.swing.TextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        table = new Vues.swing.TableDark();
        demanderCmd = new Vues.swing.Button();
        modifierCmd = new Vues.swing.Button();
        demanderCmd1 = new Vues.swing.Button();
        modifierCmd1 = new Vues.swing.Button();

        jLabel1.setFont(new java.awt.Font("sansserif", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(79, 79, 79));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Remboursement");

        idTxt.setFont(new java.awt.Font("Times New Roman", 0, 13)); // NOI18N
        idTxt.setLabelText("L'id de la demande");
        idTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                idTxtActionPerformed(evt);
            }
        });
        idTxt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                idTxtKeyReleased(evt);
            }
        });

        dateTxt.setDateFormatString("yyyy-MM-dd");
        dateTxt.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N

        montantTxt.setFont(new java.awt.Font("Times New Roman", 0, 13)); // NOI18N
        montantTxt.setLabelText("Le montant");
        montantTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                montantTxtActionPerformed(evt);
            }
        });

        table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        table.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                tableMouseReleased(evt);
            }
        });
        jScrollPane1.setViewportView(table);

        demanderCmd.setBackground(new java.awt.Color(204, 204, 204));
        demanderCmd.setText("demander");
        demanderCmd.setFont(new java.awt.Font("Times New Roman", 0, 17)); // NOI18N
        demanderCmd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                demanderCmdActionPerformed(evt);
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

        demanderCmd1.setBackground(new java.awt.Color(204, 204, 204));
        demanderCmd1.setText("Supprimer");
        demanderCmd1.setFont(new java.awt.Font("Times New Roman", 0, 17)); // NOI18N
        demanderCmd1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                demanderCmd1ActionPerformed(evt);
            }
        });

        modifierCmd1.setBackground(new java.awt.Color(204, 204, 204));
        modifierCmd1.setText("Reset");
        modifierCmd1.setFont(new java.awt.Font("Times New Roman", 0, 17)); // NOI18N
        modifierCmd1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                modifierCmd1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 833, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(montantTxt, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(idTxt, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 246, Short.MAX_VALUE)
                                .addComponent(dateTxt, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 246, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(demanderCmd, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(modifierCmd, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(demanderCmd1, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(modifierCmd1, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane1)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(idTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(montantTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(20, 20, 20)
                        .addComponent(dateTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(26, 26, 26)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(modifierCmd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(demanderCmd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(2, 2, 2)))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(modifierCmd1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(demanderCmd1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(2, 2, 2))))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 459, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(21, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void idTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_idTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_idTxtActionPerformed

    private void montantTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_montantTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_montantTxtActionPerformed

    private void demanderCmdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_demanderCmdActionPerformed
        demande = Integer.parseInt(idTxt.getText());
        montant = Integer.parseInt(montantTxt.getText());
        date = dateTxt.getDate();

        if (idTxt.getText().trim().isEmpty() || montantTxt.getText().trim().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Tous les champs sont obligatoires", "Erreur!", JOptionPane.ERROR_MESSAGE);
        } else if (!Validation.isValidNumber(montantTxt.getText(), Utils.NUMBER)) {
            JOptionPane.showMessageDialog(this, "Le montant n'est pas valide", "Erreur!", JOptionPane.ERROR_MESSAGE);
        } else if (!Functions.demandeExiste(demande)) {
            JOptionPane.showMessageDialog(this, "La demande n'existe pas", "Erreur!", JOptionPane.ERROR_MESSAGE);
        } else if (Validation.demandeDejaRembourse(demande)) {
            JOptionPane.showMessageDialog(this, "La demande deja rembourse", "Erreur!", JOptionPane.ERROR_MESSAGE);
        } else {
            int demnader = new RemboursementDAO().create(new Remboursement(demande, date, montant));
            if (demnader == 1) {
                JOptionPane.showMessageDialog(this, "Succès", "Succès", JOptionPane.INFORMATION_MESSAGE);
                lisRemboursements();
            } else {
                JOptionPane.showMessageDialog(this, "Echect", "Erreur", JOptionPane.ERROR_MESSAGE);
            }
        }
    }//GEN-LAST:event_demanderCmdActionPerformed

    private void modifierCmdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_modifierCmdActionPerformed
        demande = Integer.parseInt(idTxt.getText());
        montant = Integer.parseInt(montantTxt.getText());
        date = dateTxt.getDate();
        int modifier;
        int ligne = table.getSelectedRow();
        int id = Integer.parseInt(table.getValueAt(ligne, 0).toString());
        if (ligne == -1) {
            JOptionPane.showMessageDialog(this, "Selectionnez la ligne a modifier ", "Erreur!", JOptionPane.ERROR_MESSAGE);
        } else {
            int y = JOptionPane.showConfirmDialog(this, "Voulez-vous vraiement faire la modification?",
                    "Confirmation", JOptionPane.YES_NO_OPTION);
            if (y == JOptionPane.OK_OPTION) {
                modifier = new RemboursementDAO().update(new Remboursement(id, demande, date, montant));
                if (modifier == 1) {
                    JOptionPane.showMessageDialog(this, "Modifié avec succès", "Succès", JOptionPane.INFORMATION_MESSAGE);
                    lisRemboursements();
                } else {
                    JOptionPane.showMessageDialog(this, "Echec de modification", "Erreur", JOptionPane.ERROR_MESSAGE);
                }

            }
        }
    }//GEN-LAST:event_modifierCmdActionPerformed

    private void demanderCmd1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_demanderCmd1ActionPerformed
        int delete;
        int ligne = table.getSelectedRow();
        int id = Integer.parseInt(table.getValueAt(ligne, 0).toString());
        if (ligne == -1) {
            JOptionPane.showMessageDialog(this, "Selectionnez la ligne a supprimer ", "Erreur!", JOptionPane.ERROR_MESSAGE);
        } else {
            int y = JOptionPane.showConfirmDialog(this, "Voulez-vous vraiement faire la suppression?",
                    "Confirmation", JOptionPane.YES_NO_OPTION);
            if (y == JOptionPane.OK_OPTION) {
                delete = new RemboursementDAO().delete(id);
                if (delete == 1) {
                    JOptionPane.showMessageDialog(this, "Supprimé avec succès", "Succès", JOptionPane.INFORMATION_MESSAGE);
                    lisRemboursements();
                } else {
                    JOptionPane.showMessageDialog(this, "Echec de suppression", "Error", JOptionPane.ERROR_MESSAGE);
                }

            }
        }
    }//GEN-LAST:event_demanderCmd1ActionPerformed

    private void modifierCmd1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_modifierCmd1ActionPerformed
        idTxt.setText("");
        montantTxt.setText("");
        dateTxt.setDate(null);
    }//GEN-LAST:event_modifierCmd1ActionPerformed

    private void tableMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableMouseReleased
        int ligne = table.getSelectedRow();
        idTxt.setText(table.getValueAt(ligne, 1).toString());
        montantTxt.setText(table.getValueAt(ligne, 2).toString());
        JTextField showdate = (JTextField) dateTxt.getDateEditor().getUiComponent();
        showdate.setText(table.getValueAt(ligne, 3).toString());
    }//GEN-LAST:event_tableMouseReleased

    private void idTxtKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_idTxtKeyReleased
        if (!idTxt.getText().trim().isEmpty()) {
            montantTxt.setText(Functions.montant(idTxt.getText()));
        }
    }//GEN-LAST:event_idTxtKeyReleased


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.toedter.calendar.JDateChooser dateTxt;
    private Vues.swing.Button demanderCmd;
    private Vues.swing.Button demanderCmd1;
    private Vues.swing.TextField idTxt;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private Vues.swing.Button modifierCmd;
    private Vues.swing.Button modifierCmd1;
    private Vues.swing.TextField montantTxt;
    private Vues.swing.TableDark table;
    // End of variables declaration//GEN-END:variables
}
