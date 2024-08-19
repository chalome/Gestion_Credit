package Vues.form;

import DAO.CategorieClientDAO;
import DAO.CategorieUtilisateurDAO;
import DAO.TypeCreditDAO;
import Modeles.CategorieClient;
import Modeles.CategorieUtilisateur;
import Modeles.TypeCredit;
import Vues.transitions.TransitionsForm;
import java.awt.Color;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class Form3 extends TransitionsForm {

    String user;
    String credit;
    String client;

    public Form3() {
        initComponents();
        userTxt.setBackground(new Color(240, 240, 240));
        clientTxt.setBackground(new Color(240, 240, 240));
        typeTxt.setBackground(new Color(240, 240, 240));
        table.setBackground(new Color(240, 240, 240));
    }

    void listCategorieUtilisateur() {
        CategorieUtilisateurDAO cdao = new CategorieUtilisateurDAO();
        String header[] = {"ID", "CATEGORIE"};
        Object data[][] = new Object[cdao.getAll().size()][2];
        int i = 0;
        for (CategorieUtilisateur utilisateur : cdao.getAll()) {
            data[i][0] = utilisateur.getCategorieID();
            data[i][1] = utilisateur.getCategorieNom();
            i++;
        }
        table.setModel(new DefaultTableModel(data, header));
    }

    void listCategorieClient() {
        CategorieClientDAO cdao = new CategorieClientDAO();
        String header[] = {"ID", "CATEGORIE"};
        Object data[][] = new Object[cdao.getAll().size()][2];
        int i = 0;
        for (CategorieClient cClient : cdao.getAll()) {
            data[i][0] = cClient.getCategorieClID();
            data[i][1] = cClient.getCategoeirClNom();
            i++;
        }
        table.setModel(new DefaultTableModel(data, header));
    }

    void listCategorieCredit() {
        TypeCreditDAO cdao = new TypeCreditDAO();
        String header[] = {"ID", "CATEGORIE"};
        Object data[][] = new Object[cdao.getAll().size()][2];
        int i = 0;
        for (TypeCredit credits : cdao.getAll()) {
            data[i][0] = credits.getTypeCreditID();
            data[i][1] = credits.getTypeCreditNom();
            i++;
        }
        table.setModel(new DefaultTableModel(data, header));
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        userTxt = new Vues.swing.TextField();
        addUser = new Vues.swing.ButtonOutLine();
        updateUser = new Vues.swing.ButtonOutLine();
        deleteUser = new Vues.swing.ButtonOutLine();
        displayUser = new Vues.swing.ButtonOutLine();
        clientTxt = new Vues.swing.TextField();
        buttonOutLine5 = new Vues.swing.ButtonOutLine();
        buttonOutLine6 = new Vues.swing.ButtonOutLine();
        buttonOutLine7 = new Vues.swing.ButtonOutLine();
        buttonOutLine8 = new Vues.swing.ButtonOutLine();
        buttonOutLine9 = new Vues.swing.ButtonOutLine();
        buttonOutLine10 = new Vues.swing.ButtonOutLine();
        typeTxt = new Vues.swing.TextField();
        buttonOutLine11 = new Vues.swing.ButtonOutLine();
        buttonOutLine12 = new Vues.swing.ButtonOutLine();
        jScrollPane1 = new javax.swing.JScrollPane();
        table = new Vues.swing.TableDark();

        jLabel1.setFont(new java.awt.Font("sansserif", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(79, 79, 79));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("MUPAD");

        userTxt.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        userTxt.setLabelText("Categorie de l'utilisateur");

        addUser.setText("Ajouter");
        addUser.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        addUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addUserActionPerformed(evt);
            }
        });

        updateUser.setText("Modifier");
        updateUser.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        updateUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateUserActionPerformed(evt);
            }
        });

        deleteUser.setText("Supprimer");
        deleteUser.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        deleteUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteUserActionPerformed(evt);
            }
        });

        displayUser.setText("Afficher");
        displayUser.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        displayUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                displayUserActionPerformed(evt);
            }
        });

        clientTxt.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        clientTxt.setLabelText("Categorie du client");

        buttonOutLine5.setText("Ajouter");
        buttonOutLine5.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        buttonOutLine5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonOutLine5ActionPerformed(evt);
            }
        });

        buttonOutLine6.setText("Supprimer");
        buttonOutLine6.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        buttonOutLine6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonOutLine6ActionPerformed(evt);
            }
        });

        buttonOutLine7.setText("Modifier");
        buttonOutLine7.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        buttonOutLine7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonOutLine7ActionPerformed(evt);
            }
        });

        buttonOutLine8.setText("Afficher");
        buttonOutLine8.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        buttonOutLine8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonOutLine8ActionPerformed(evt);
            }
        });

        buttonOutLine9.setText("Modifier");
        buttonOutLine9.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        buttonOutLine9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonOutLine9ActionPerformed(evt);
            }
        });

        buttonOutLine10.setText("Ajouter");
        buttonOutLine10.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        buttonOutLine10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonOutLine10ActionPerformed(evt);
            }
        });

        typeTxt.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        typeTxt.setLabelText("Type de credit");

        buttonOutLine11.setText("Supprimer");
        buttonOutLine11.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        buttonOutLine11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonOutLine11ActionPerformed(evt);
            }
        });

        buttonOutLine12.setText("Afficher");
        buttonOutLine12.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        buttonOutLine12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonOutLine12ActionPerformed(evt);
            }
        });

        table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(table);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 819, Short.MAX_VALUE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(userTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(addUser, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(deleteUser, javax.swing.GroupLayout.DEFAULT_SIZE, 67, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(displayUser, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(updateUser, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(97, 97, 97)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(clientTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(buttonOutLine5, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(buttonOutLine6, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(buttonOutLine8, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(buttonOutLine7, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(typeTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(buttonOutLine10, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(buttonOutLine11, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(buttonOutLine12, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(buttonOutLine9, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(userTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(addUser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(updateUser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(30, 30, 30)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(deleteUser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(displayUser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(clientTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(buttonOutLine5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(buttonOutLine7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(30, 30, 30)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(buttonOutLine6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(buttonOutLine8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(typeTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(buttonOutLine10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(buttonOutLine9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(30, 30, 30)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(buttonOutLine11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(buttonOutLine12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 333, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(20, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void addUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addUserActionPerformed
        user = userTxt.getText();
        if (user.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Le champ est vide", "Erreur!", JOptionPane.ERROR_MESSAGE);
        } else {
            int add = new CategorieUtilisateurDAO().create(new CategorieUtilisateur(user));
            if (add == 1) {
                JOptionPane.showMessageDialog(this, "La categorie est ajoutée avec succès!", "Succès", JOptionPane.INFORMATION_MESSAGE);
                listCategorieUtilisateur();
            } else {
                JOptionPane.showMessageDialog(this, "Echec", "Erreur", JOptionPane.ERROR_MESSAGE);
            }
        }

    }//GEN-LAST:event_addUserActionPerformed

    private void buttonOutLine5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonOutLine5ActionPerformed
        client = clientTxt.getText();
        if (client.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Le champ est vide", "Erreur!", JOptionPane.ERROR_MESSAGE);
        } else {
            int add = new CategorieClientDAO().create(new CategorieClient(client));
            if (add == 1) {
                JOptionPane.showMessageDialog(this, "La categorie est ajoutée avec succès!", "Succès", JOptionPane.INFORMATION_MESSAGE);
                listCategorieClient();
            } else {
                JOptionPane.showMessageDialog(this, "Echec", "Erreur", JOptionPane.ERROR_MESSAGE);
            }
        }
    }//GEN-LAST:event_buttonOutLine5ActionPerformed

    private void buttonOutLine10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonOutLine10ActionPerformed
        credit = typeTxt.getText();
        if (credit.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Le champ est vide", "Erreur!", JOptionPane.ERROR_MESSAGE);
        } else {
            int add = new TypeCreditDAO().create(new TypeCredit(credit));
            if (add == 1) {
                JOptionPane.showMessageDialog(this, "Le Type est ajouté avec succès!", "Succès", JOptionPane.INFORMATION_MESSAGE);
                listCategorieCredit();
            } else {
                JOptionPane.showMessageDialog(this, "Echec", "Erreur", JOptionPane.ERROR_MESSAGE);
            }
        }
    }//GEN-LAST:event_buttonOutLine10ActionPerformed

    private void displayUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_displayUserActionPerformed
        listCategorieUtilisateur();        // TODO add your handling code here:
    }//GEN-LAST:event_displayUserActionPerformed

    private void buttonOutLine8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonOutLine8ActionPerformed
        listCategorieClient();        // TODO add your handling code here:
    }//GEN-LAST:event_buttonOutLine8ActionPerformed

    private void buttonOutLine12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonOutLine12ActionPerformed
        listCategorieCredit();        // TODO add your handling code here:
    }//GEN-LAST:event_buttonOutLine12ActionPerformed

    private void updateUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateUserActionPerformed
        user = userTxt.getText();
        int modifier;
        int ligne = table.getSelectedRow();
        if (user.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Le champ est vide", "Erreur!", JOptionPane.ERROR_MESSAGE);
        } else if (ligne == -1) {
            JOptionPane.showMessageDialog(this, "Selectionnez la ligne a modifier ", "Erreur!", JOptionPane.ERROR_MESSAGE);
        } else {
            int y = JOptionPane.showConfirmDialog(this, "Voulez-vous vraiement faire la modification?",
                    "Confirmation", JOptionPane.YES_NO_OPTION);
            if (y == JOptionPane.OK_OPTION) {
                modifier = new CategorieUtilisateurDAO().update(new CategorieUtilisateur(user));
                if (modifier == 1) {
                    JOptionPane.showMessageDialog(this, "Modifié avec succès", "Succès", JOptionPane.INFORMATION_MESSAGE);
                    listCategorieUtilisateur();
                } else {
                    JOptionPane.showMessageDialog(this, "Echec de modification", "Error", JOptionPane.ERROR_MESSAGE);
                }
            }
        }
    }//GEN-LAST:event_updateUserActionPerformed

    private void buttonOutLine7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonOutLine7ActionPerformed
        client = clientTxt.getText();
        int modifier;
        int ligne = table.getSelectedRow();
        if (client.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Le champ est vide", "Erreur!", JOptionPane.ERROR_MESSAGE);
        } else if (ligne == -1) {
            JOptionPane.showMessageDialog(this, "Selectionnez la ligne a modifier ", "Erreur!", JOptionPane.ERROR_MESSAGE);
        } else {
            int y = JOptionPane.showConfirmDialog(this, "Voulez-vous vraiement faire la modification?",
                    "Confirmation", JOptionPane.YES_NO_OPTION);
            if (y == JOptionPane.OK_OPTION) {
                modifier = new CategorieClientDAO().update(new CategorieClient(client));
                if (modifier == 1) {
                    JOptionPane.showMessageDialog(this, "Modifié avec succès", "Succès", JOptionPane.INFORMATION_MESSAGE);
                    listCategorieClient();
                } else {
                    JOptionPane.showMessageDialog(this, "Echec de modification", "Error", JOptionPane.ERROR_MESSAGE);
                }
            }
        }
    }//GEN-LAST:event_buttonOutLine7ActionPerformed

    private void buttonOutLine9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonOutLine9ActionPerformed
        credit = typeTxt.getText();
        int modifier;
        int ligne = table.getSelectedRow();
        if (credit.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Le champ est vide", "Erreur!", JOptionPane.ERROR_MESSAGE);
        } else if (ligne == -1) {
            JOptionPane.showMessageDialog(this, "Selectionnez la ligne a modifier ", "Erreur!", JOptionPane.ERROR_MESSAGE);
        } else {
            int y = JOptionPane.showConfirmDialog(this, "Voulez-vous vraiement faire la modification?",
                    "Confirmation", JOptionPane.YES_NO_OPTION);
            if (y == JOptionPane.OK_OPTION) {
                modifier = new TypeCreditDAO().update(new TypeCredit(credit));
                if (modifier == 1) {
                    JOptionPane.showMessageDialog(this, "Modifié avec succès", "Succès", JOptionPane.INFORMATION_MESSAGE);
                    listCategorieCredit();
                } else {
                    JOptionPane.showMessageDialog(this, "Echec de modification", "Error", JOptionPane.ERROR_MESSAGE);
                }
            }
        }
    }//GEN-LAST:event_buttonOutLine9ActionPerformed

    private void deleteUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteUserActionPerformed
        int delete;
        int ligne = table.getSelectedRow();
        int id = Integer.parseInt(table.getValueAt(ligne, 0).toString());
        if (ligne == -1) {
            JOptionPane.showMessageDialog(this, "Selectionnez la ligne a modifier ", "Erreur!", JOptionPane.ERROR_MESSAGE);
        } else {
            int y = JOptionPane.showConfirmDialog(this, "Voulez-vous vraiement faire la suppression?",
                    "Confirmation", JOptionPane.YES_NO_OPTION);
            if (y == JOptionPane.OK_OPTION) {
                delete = new CategorieUtilisateurDAO().delete(id);
                if (delete == 1) {
                    JOptionPane.showMessageDialog(this, "Supprimé avec succès", "Succès", JOptionPane.INFORMATION_MESSAGE);
                    listCategorieUtilisateur();
                } else {
                    JOptionPane.showMessageDialog(this, "Echec de suppression", "Error", JOptionPane.ERROR_MESSAGE);
                }
            }
        }
    }//GEN-LAST:event_deleteUserActionPerformed

    private void buttonOutLine6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonOutLine6ActionPerformed
        int delete;
        int ligne = table.getSelectedRow();
        int id = Integer.parseInt(table.getValueAt(ligne, 0).toString());
        if (ligne == -1) {
            JOptionPane.showMessageDialog(this, "Selectionnez la ligne a modifier ", "Erreur!", JOptionPane.ERROR_MESSAGE);
        } else {
            int y = JOptionPane.showConfirmDialog(this, "Voulez-vous vraiement faire la suppression?",
                    "Confirmation", JOptionPane.YES_NO_OPTION);
            if (y == JOptionPane.OK_OPTION) {
                delete = new CategorieClientDAO().delete(id);
                if (delete == 1) {
                    JOptionPane.showMessageDialog(this, "Supprimé avec succès", "Succès", JOptionPane.INFORMATION_MESSAGE);
                    listCategorieUtilisateur();
                } else {
                    JOptionPane.showMessageDialog(this, "Echec de suppression", "Error", JOptionPane.ERROR_MESSAGE);
                }
            }
        }
    }//GEN-LAST:event_buttonOutLine6ActionPerformed

    private void buttonOutLine11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonOutLine11ActionPerformed
        int delete;
        int ligne = table.getSelectedRow();
        int id = Integer.parseInt(table.getValueAt(ligne, 0).toString());
        if (ligne == -1) {
            JOptionPane.showMessageDialog(this, "Selectionnez la ligne a modifier ", "Erreur!", JOptionPane.ERROR_MESSAGE);
        } else {
            int y = JOptionPane.showConfirmDialog(this, "Voulez-vous vraiement faire la suppression?",
                    "Confirmation", JOptionPane.YES_NO_OPTION);
            if (y == JOptionPane.OK_OPTION) {
                delete = new TypeCreditDAO().delete(id);
                if (delete == 1) {
                    JOptionPane.showMessageDialog(this, "Supprimé avec succès", "Succès", JOptionPane.INFORMATION_MESSAGE);
                    listCategorieUtilisateur();
                } else {
                    JOptionPane.showMessageDialog(this, "Echec de suppression", "Error", JOptionPane.ERROR_MESSAGE);
                }
            }
        }
    }//GEN-LAST:event_buttonOutLine11ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private Vues.swing.ButtonOutLine addUser;
    private Vues.swing.ButtonOutLine buttonOutLine10;
    private Vues.swing.ButtonOutLine buttonOutLine11;
    private Vues.swing.ButtonOutLine buttonOutLine12;
    private Vues.swing.ButtonOutLine buttonOutLine5;
    private Vues.swing.ButtonOutLine buttonOutLine6;
    private Vues.swing.ButtonOutLine buttonOutLine7;
    private Vues.swing.ButtonOutLine buttonOutLine8;
    private Vues.swing.ButtonOutLine buttonOutLine9;
    private Vues.swing.TextField clientTxt;
    private Vues.swing.ButtonOutLine deleteUser;
    private Vues.swing.ButtonOutLine displayUser;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private Vues.swing.TableDark table;
    private Vues.swing.TextField typeTxt;
    private Vues.swing.ButtonOutLine updateUser;
    private Vues.swing.TextField userTxt;
    // End of variables declaration//GEN-END:variables
}
