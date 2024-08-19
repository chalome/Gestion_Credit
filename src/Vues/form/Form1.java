package Vues.form;

import DAO.CategorieUtilisateurDAO;
import DAO.UtilisateurDAO;
import Modeles.CategorieUtilisateur;
import Modeles.Utilisateur;
import Utilities.*;
import Vues.transitions.TransitionsForm;
import java.awt.Color;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class Form1 extends TransitionsForm {

    String nom;
    String prenom;
    String email;
    String telephone;
    String password;
    String categorie;

    public Form1() {
        initComponents();
        nomTxt.setBackground(new Color(240, 240, 240));
        prenomTxt.setBackground(new Color(240, 240, 240));
        emailTxt.setBackground(new Color(240, 240, 240));
        passTxt.setBackground(new Color(240, 240, 240));
        categorieTxt.setBackground(new Color(240, 240, 240));
        telTxt.setBackground(new Color(240, 240, 240));
        table.setBackground(new Color(240, 240, 240));
        listUtilisateur();
        showComboValues();
    }

    void showComboValues() {
        List<CategorieUtilisateur> categorieList = new CategorieUtilisateurDAO().getAll();
        categorieList.stream().forEach((categories) -> {
            categorieTxt.addItem(categories);
        });
    }

    private void listUtilisateur() {
        UtilisateurDAO udao = new UtilisateurDAO();
        String header[] = {"ID", "NOM", "PRENOM", "EMAIL", "TELEPHONE", "PASSWORD", "CATEGORIE"};
        Object data[][] = new Object[udao.getAll().size()][7];
        int i = 0;
        for (Utilisateur utilisateur : udao.getAll()) {
            data[i][0] = utilisateur.getUtilisateurID();
            data[i][1] = utilisateur.getUtilisateurNom();
            data[i][2] = utilisateur.getUtilisateurPrenom();
            data[i][3] = utilisateur.getUtilisateurEmail();
            data[i][4] = utilisateur.getUtilisateurTelephone();
            data[i][5] = utilisateur.getUtilisateurMotDePasse();
            data[i][6] = utilisateur.getUtilisateurCategorie();
            i++;
        }
        table.setModel(new DefaultTableModel(data, header));
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        nomTxt = new Vues.swing.TextField();
        prenomTxt = new Vues.swing.TextField();
        telTxt = new Vues.swing.TextField();
        emailTxt = new Vues.swing.TextField();
        passTxt = new Vues.swing.PasswordField();
        categorieTxt = new Vues.swing.Combobox();
        creerCmd = new Vues.swing.Button();
        modifierCmd = new Vues.swing.Button();
        resetCmd = new Vues.swing.Button();
        jScrollPane1 = new javax.swing.JScrollPane();
        table = new Vues.swing.TableDark();
        supprimerCmd = new Vues.swing.Button();

        jLabel1.setFont(new java.awt.Font("sansserif", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(79, 79, 79));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Créer un compte");

        nomTxt.setFont(new java.awt.Font("Times New Roman", 0, 13)); // NOI18N
        nomTxt.setLabelText("Le nom");
        nomTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nomTxtActionPerformed(evt);
            }
        });

        prenomTxt.setFont(new java.awt.Font("Times New Roman", 0, 13)); // NOI18N
        prenomTxt.setLabelText("Le prénom");

        telTxt.setFont(new java.awt.Font("Times New Roman", 0, 13)); // NOI18N
        telTxt.setLabelText("Le numéro de téléphone");

        emailTxt.setFont(new java.awt.Font("Times New Roman", 0, 13)); // NOI18N
        emailTxt.setLabelText("L'adresse email");
        emailTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                emailTxtActionPerformed(evt);
            }
        });

        passTxt.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        passTxt.setLabelText("Mot de passe");

        categorieTxt.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        categorieTxt.setLabeText("Catégorie");

        creerCmd.setBackground(new java.awt.Color(204, 204, 204));
        creerCmd.setText("Créer");
        creerCmd.setFont(new java.awt.Font("Times New Roman", 0, 17)); // NOI18N
        creerCmd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                creerCmdActionPerformed(evt);
            }
        });

        modifierCmd.setBackground(new java.awt.Color(204, 204, 204));
        modifierCmd.setText("Modifier");
        modifierCmd.setFont(new java.awt.Font("Times New Roman", 0, 17)); // NOI18N
        modifierCmd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                modifierCmdActionPerformed(evt);
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

        supprimerCmd.setBackground(new java.awt.Color(204, 204, 204));
        supprimerCmd.setText("Supprimer");
        supprimerCmd.setFont(new java.awt.Font("Times New Roman", 0, 17)); // NOI18N
        supprimerCmd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                supprimerCmdActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 94, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(prenomTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 246, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(nomTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 246, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(emailTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 246, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(46, 46, 46)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(telTxt, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(passTxt, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(categorieTxt, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 246, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(42, 42, 42)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(creerCmd, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(modifierCmd, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(supprimerCmd, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(resetCmd, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(0, 34, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1)
                        .addGap(24, 24, 24)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(38, 38, 38)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(nomTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(prenomTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(telTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(passTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(creerCmd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(modifierCmd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(3, 3, 3)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(emailTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(categorieTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(supprimerCmd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(resetCmd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 33, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 292, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void emailTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_emailTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_emailTxtActionPerformed

    private void creerCmdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_creerCmdActionPerformed
        int ajouter;
        nom = nomTxt.getText();
        prenom = prenomTxt.getText();
        email = emailTxt.getText();
        telephone = telTxt.getText();
        password = passTxt.getText();
        categorie = categorieTxt.getSelectedItem().toString();
        if (nom.isEmpty() || prenom.isEmpty() || email.isEmpty() || telephone.isEmpty() || password.isEmpty() || categorie.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Tous les champs sont obligatoires", "Erreur!", JOptionPane.ERROR_MESSAGE);
        } else if (!Validation.isValidEmail(email, Utils.EMAIL_PATTERN)) {
            JOptionPane.showMessageDialog(this, "L'adresse email n'est pas correcte", "Erreur!", JOptionPane.ERROR_MESSAGE);
        } else if (!Validation.isValidPhoneNumber(telephone, Utils.PHONE_NUMBER_PATTERN)) {
            JOptionPane.showMessageDialog(this, "Le numero de telephone n'est pas valid", "Erreur!", JOptionPane.ERROR_MESSAGE);
        } else {
            Utilisateur utilisateur = new Utilisateur(nom, prenom, email, telephone, password, categorie);
            ajouter = new UtilisateurDAO().create(utilisateur);
            if (ajouter == 1) {
                JOptionPane.showMessageDialog(this, "Compte creée avec succès", "Succès", JOptionPane.INFORMATION_MESSAGE);
                listUtilisateur();
            } else {
                JOptionPane.showMessageDialog(this, "Echec de creation du compte", "Erreur", JOptionPane.ERROR_MESSAGE);
            }
        }
    }//GEN-LAST:event_creerCmdActionPerformed

    private void nomTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nomTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nomTxtActionPerformed

    private void modifierCmdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_modifierCmdActionPerformed
        int modifier;
        nom = nomTxt.getText();
        prenom = prenomTxt.getText();
        email = emailTxt.getText();
        telephone = telTxt.getText();
        password = passTxt.getText();
        categorie = categorieTxt.getSelectedItem().toString();
        int ligne = table.getSelectedRow();
        int id = Integer.parseInt(table.getValueAt(ligne, 0).toString());
        if (nom.isEmpty() || prenom.isEmpty() || email.isEmpty() || telephone.isEmpty() || password.isEmpty() || categorie.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Tous les champs sont obligatoires", "Erreur!", JOptionPane.ERROR_MESSAGE);
        } else if (!Validation.isValidEmail(email, Utils.EMAIL_PATTERN)) {
            JOptionPane.showMessageDialog(this, "L'adresse email n'est pas correcte", "Erreur!", JOptionPane.ERROR_MESSAGE);
        } else if (!Validation.isValidPhoneNumber(telephone, Utils.PHONE_NUMBER_PATTERN)) {
            JOptionPane.showMessageDialog(this, "Le numero de telephone n'est pas valid", "Erreur!", JOptionPane.ERROR_MESSAGE);
        } else if (ligne ==-1) {
            JOptionPane.showMessageDialog(this, "Selectionnez la ligne a modifier ", "Erreur!", JOptionPane.ERROR_MESSAGE);
        } else {
            Utilisateur utilisateur = new Utilisateur(id, nom, prenom, email, telephone, password, categorie);
            int y = JOptionPane.showConfirmDialog(this, "Voulez-vous vraiement faire la modification?",
                    "Confirmation", JOptionPane.YES_NO_OPTION);
            if (y == JOptionPane.OK_OPTION) {
                modifier = new UtilisateurDAO().update(utilisateur);
                if (modifier == 1) {
                    JOptionPane.showMessageDialog(this, "Modifié avec succès", "Succès", JOptionPane.INFORMATION_MESSAGE);
                    listUtilisateur();
                } else {
                    JOptionPane.showMessageDialog(this, "Echec de modification", "Error", JOptionPane.ERROR_MESSAGE);
                }
            }
        }
    }//GEN-LAST:event_modifierCmdActionPerformed

    private void supprimerCmdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_supprimerCmdActionPerformed
        int delete;
        int ligne = table.getSelectedRow();
        int id = Integer.parseInt(table.getValueAt(ligne, 0).toString());
        if (ligne ==-1) {
            JOptionPane.showMessageDialog(this, "Selectionnez la ligne a modifier ", "Erreur!", JOptionPane.ERROR_MESSAGE);
        } else {
            int y = JOptionPane.showConfirmDialog(this, "Voulez-vous vraiement faire la suppression?",
                    "Confirmation", JOptionPane.YES_NO_OPTION);
            if (y == JOptionPane.OK_OPTION) {
                delete = new UtilisateurDAO().delete(id);
                if (delete == 1) {
                    JOptionPane.showMessageDialog(this, "Supprimé avec succès", "Succès", JOptionPane.INFORMATION_MESSAGE);
                    listUtilisateur();
                } else {
                    JOptionPane.showMessageDialog(this, "Echec de suppression", "Error", JOptionPane.ERROR_MESSAGE);
                }
            }
        }
    }//GEN-LAST:event_supprimerCmdActionPerformed

    private void resetCmdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resetCmdActionPerformed
        nomTxt.setText("");
        prenomTxt.setText("");
        emailTxt.setText("");
        telTxt.setText("");
        passTxt.setText("");
        categorieTxt.setSelectedItem(null);
    }//GEN-LAST:event_resetCmdActionPerformed

    private void tableMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableMouseReleased
        int ligne = table.getSelectedRow();
        nomTxt.setText(table.getValueAt(ligne, 1).toString());
        prenomTxt.setText(table.getValueAt(ligne, 2).toString());
        emailTxt.setText(table.getValueAt(ligne, 3).toString());
        telTxt.setText(table.getValueAt(ligne, 4).toString());
        passTxt.setText(table.getValueAt(ligne, 5).toString());
        categorieTxt.setSelectedItem(table.getValueAt(ligne, 6).toString());
    }//GEN-LAST:event_tableMouseReleased


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private Vues.swing.Combobox categorieTxt;
    private Vues.swing.Button creerCmd;
    private Vues.swing.TextField emailTxt;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private Vues.swing.Button modifierCmd;
    private Vues.swing.TextField nomTxt;
    private Vues.swing.PasswordField passTxt;
    private Vues.swing.TextField prenomTxt;
    private Vues.swing.Button resetCmd;
    private Vues.swing.Button supprimerCmd;
    private Vues.swing.TableDark table;
    private Vues.swing.TextField telTxt;
    // End of variables declaration//GEN-END:variables
}
