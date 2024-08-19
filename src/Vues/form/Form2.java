package Vues.form;

import DAO.CategorieClientDAO;
import DAO.ClientDAO;
import Modeles.CategorieClient;
import Modeles.Client;
import Utilities.Utils;
import Utilities.Validation;
import Vues.transitions.TransitionsForm;
import java.awt.Color;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

public class Form2 extends TransitionsForm {

    String nom;
    String prenom;
    String adresse;
    String telephone;
    String date;
    String civilite;
    String genre;
    String cni;
    String compte;
    String categorie;

    public Form2() {
        initComponents();
        listClients();
        showComboValues();
        nomTxt.setBackground(new Color(240, 240, 240));
        prenomTxt.setBackground(new Color(240, 240, 240));
        adresseTxt.setBackground(new Color(240, 240, 240));
        telTxt.setBackground(new Color(240, 240, 240));
        dateTxt.setBackground(new Color(240, 240, 240));
        radioHome.setBackground(new Color(240, 240, 240));
        radiofemme.setBackground(new Color(240, 240, 240));
        cniTxt.setBackground(new Color(240, 240, 240));
        compteTxt.setBackground(new Color(240, 240, 240));
        categorieTxt.setBackground(new Color(240, 240, 240));
        radiomarie.setBackground(new Color(240, 240, 240));
        radiononmarie.setBackground(new Color(240, 240, 240));
    }

    void showComboValues() {
        List<CategorieClient> categorieList = new CategorieClientDAO().getAll();
        categorieList.stream().forEach((categories) -> {
            categorieTxt.addItem(categories);
        });
    }

    void listClients() {
        ClientDAO Cdao = new ClientDAO();
        String header[] = {"ID", "NOM", "PRENOM", "DATE", "CIVILITE", "GENRE", "ADRESSE", "TELEPHONE", "CNI", "COMPTE", "CATEGORIE"};
        Object data[][] = new Object[Cdao.getAll().size()][11];
        int i = 0;
        for (Client client : Cdao.getAll()) {
            data[i][0] = client.getClientID();
            data[i][1] = client.getClientNom();
            data[i][2] = client.getClientPrenom();
            data[i][3] = client.getClientDate();
            data[i][4] = client.getClientCivilite();
            data[i][5] = client.getClientGenre();
            data[i][6] = client.getClientAdresse();
            data[i][7] = client.getClientTelephone();
            data[i][8] = client.getClientCNI();
            data[i][9] = client.getClientNumCompte();
            data[i][10] = client.getClientCategorie();
            i++;
        }
        table.setModel(new DefaultTableModel(data, header));
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        nomTxt = new Vues.swing.TextField();
        telTxt = new Vues.swing.TextField();
        prenomTxt = new Vues.swing.TextField();
        adresseTxt = new Vues.swing.TextField();
        categorieTxt = new Vues.swing.Combobox();
        creerCmd = new Vues.swing.Button();
        modifierCmd = new Vues.swing.Button();
        supprimerCmd = new Vues.swing.Button();
        resetCmd = new Vues.swing.Button();
        jScrollPane1 = new javax.swing.JScrollPane();
        table = new Vues.swing.TableDark();
        cniTxt = new Vues.swing.TextField();
        dateTxt = new com.toedter.calendar.JDateChooser();
        radioHome = new Vues.swing.RadioButtonCustom();
        radiofemme = new Vues.swing.RadioButtonCustom();
        radiomarie = new Vues.swing.RadioButtonCustom();
        radiononmarie = new Vues.swing.RadioButtonCustom();
        compteTxt = new Vues.swing.TextField();

        jLabel1.setFont(new java.awt.Font("sansserif", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(79, 79, 79));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Client");

        nomTxt.setFont(new java.awt.Font("Times New Roman", 0, 13)); // NOI18N
        nomTxt.setLabelText("Le nom");
        nomTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nomTxtActionPerformed(evt);
            }
        });

        telTxt.setFont(new java.awt.Font("Times New Roman", 0, 13)); // NOI18N
        telTxt.setLabelText("Le numéro de téléphone");

        prenomTxt.setFont(new java.awt.Font("Times New Roman", 0, 13)); // NOI18N
        prenomTxt.setLabelText("Le prénom");

        adresseTxt.setFont(new java.awt.Font("Times New Roman", 0, 13)); // NOI18N
        adresseTxt.setLabelText("L'adresse ");
        adresseTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                adresseTxtActionPerformed(evt);
            }
        });

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

        supprimerCmd.setBackground(new java.awt.Color(204, 204, 204));
        supprimerCmd.setText("Supprimer");
        supprimerCmd.setFont(new java.awt.Font("Times New Roman", 0, 17)); // NOI18N
        supprimerCmd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                supprimerCmdActionPerformed(evt);
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

        cniTxt.setFont(new java.awt.Font("Times New Roman", 0, 13)); // NOI18N
        cniTxt.setLabelText("Le CNI");

        dateTxt.setDateFormatString("yyyy-MM-dd");
        dateTxt.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N

        buttonGroup1.add(radioHome);
        radioHome.setSelected(true);
        radioHome.setText("Homme");
        radioHome.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N

        buttonGroup1.add(radiofemme);
        radiofemme.setText("Femme");
        radiofemme.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N

        buttonGroup2.add(radiomarie);
        radiomarie.setSelected(true);
        radiomarie.setText("Marié");
        radiomarie.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N

        buttonGroup2.add(radiononmarie);
        radiononmarie.setText("Non marié");
        radiononmarie.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N

        compteTxt.setFont(new java.awt.Font("Times New Roman", 0, 13)); // NOI18N
        compteTxt.setLabelText("Le numéro de compte");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(adresseTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 246, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(categorieTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 246, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(nomTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 246, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(telTxt, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(prenomTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 246, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(cniTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 246, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(dateTxt, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGap(10, 10, 10))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(radioHome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(radiomarie, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(radiononmarie, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(radiofemme, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(compteTxt, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGap(12, 12, 12)))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(creerCmd, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(modifierCmd, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(0, 0, Short.MAX_VALUE))
                                    .addComponent(supprimerCmd, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(resetCmd, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 841, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(creerCmd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(modifierCmd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(45, 45, 45)
                        .addComponent(supprimerCmd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(resetCmd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(dateTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(nomTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(telTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(cniTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(10, 10, 10)
                                        .addComponent(prenomTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(adresseTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(categorieTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(radioHome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(radiofemme, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(radiomarie, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(radiononmarie, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(compteTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(1, 1, 1)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 14, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 292, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void nomTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nomTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nomTxtActionPerformed

    private void adresseTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_adresseTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_adresseTxtActionPerformed

    private void creerCmdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_creerCmdActionPerformed
        int ajouter;
        nom = nomTxt.getText();
        prenom = prenomTxt.getText();
        adresse = adresseTxt.getText();
        telephone = telTxt.getText();
        date = ((JTextField) dateTxt.getDateEditor().getUiComponent()).getText();
        categorie = categorieTxt.getSelectedItem().toString();
        cni = cniTxt.getText();
        compte = compteTxt.getText();
        if (radioHome.isSelected()) {
            genre = "Homme";
        } else {
            genre = "Femme";
        }
        if (radiomarie.isSelected()) {
            civilite = "Marié";
        } else {
            civilite = "Non marié";
        }
        if (nom.isEmpty() || prenom.isEmpty() || adresse.isEmpty() || telephone.isEmpty()
                || date.isEmpty() || categorie.isEmpty()
                || cni.isEmpty() || compte.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Tous les champs sont obligatoires", "Erreur!", JOptionPane.ERROR_MESSAGE);
        } else if (!Validation.isValidPhoneNumber(telephone, Utils.PHONE_NUMBER_PATTERN)) {
            JOptionPane.showMessageDialog(this, "Le numero de telephone n'est pas valide", "Erreur!", JOptionPane.ERROR_MESSAGE);
        } else if (Validation.clientDejaExiste(compte)) {
            JOptionPane.showMessageDialog(this, "Le client existe deja", "Erreur!", JOptionPane.ERROR_MESSAGE);
        } else {
            Client client = new Client(nom, prenom, date, civilite, genre, adresse, telephone, cni, compte, categorie);
            ajouter = new ClientDAO().create(client);
            if (ajouter == 1) {
                JOptionPane.showMessageDialog(this, "Client ajouté avec succès", "Succès", JOptionPane.INFORMATION_MESSAGE);
                listClients();
            } else {
                JOptionPane.showMessageDialog(this, "Echec d'enregistrement du client", "Erreur", JOptionPane.ERROR_MESSAGE);
            }

        }
    }//GEN-LAST:event_creerCmdActionPerformed

    private void modifierCmdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_modifierCmdActionPerformed
        int modifier;
        nom = nomTxt.getText();
        prenom = prenomTxt.getText();
        adresse = adresseTxt.getText();
        telephone = telTxt.getText();
        date = ((JTextField) dateTxt.getDateEditor().getUiComponent()).getText();
        categorie = categorieTxt.getSelectedItem().toString();
        cni = cniTxt.getText();
        compte = compteTxt.getText();
        if (radioHome.isSelected()) {
            genre = "Homme";
        } else {
            genre = "Femme";
        }
        if (radiomarie.isSelected()) {
            civilite = "Marié";
        } else {
            civilite = "Non marié";
        }
        int ligne = table.getSelectedRow();
        int id = Integer.parseInt(table.getValueAt(ligne, 0).toString());
        if (nom.isEmpty() || prenom.isEmpty() || adresse.isEmpty() || telephone.isEmpty()
                || date.isEmpty() || categorie.isEmpty()
                || cni.isEmpty() || compte.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Tous les champs sont obligatoires", "Erreur!", JOptionPane.ERROR_MESSAGE);
        } else if (!Validation.isValidPhoneNumber(telephone, Utils.PHONE_NUMBER_PATTERN)) {
            JOptionPane.showMessageDialog(this, "Le numero de telephone n'est pas valide", "Erreur!", JOptionPane.ERROR_MESSAGE);
        } else if (ligne == -1) {
            JOptionPane.showMessageDialog(this, "Selectionnez la ligne a modifier ", "Erreur!", JOptionPane.ERROR_MESSAGE);
        } else {
            Client client = new Client(id, nom, prenom, date, civilite, genre, adresse, telephone, cni, compte, categorie);
            int y = JOptionPane.showConfirmDialog(this, "Voulez-vous vraiement faire la modification?",
                    "Confirmation", JOptionPane.YES_NO_OPTION);
            if (y == JOptionPane.OK_OPTION) {
                modifier = new ClientDAO().update(client);
                if (modifier == 1) {
                    JOptionPane.showMessageDialog(this, "Modifié avec succès", "Succès", JOptionPane.INFORMATION_MESSAGE);
                    listClients();
                } else {
                    JOptionPane.showMessageDialog(this, "Echec de modification", "Erreur", JOptionPane.ERROR_MESSAGE);
                }
            }
        }
    }//GEN-LAST:event_modifierCmdActionPerformed

    private void supprimerCmdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_supprimerCmdActionPerformed
        int delete;
        int ligne = table.getSelectedRow();
        int id = Integer.parseInt(table.getValueAt(ligne, 0).toString());
        if (ligne == -1) {
            JOptionPane.showMessageDialog(this, "Selectionnez la ligne a supprimer ", "Erreur!", JOptionPane.ERROR_MESSAGE);
        } else {
            int y = JOptionPane.showConfirmDialog(this, "Voulez-vous vraiement faire la suppression?",
                    "Confirmation", JOptionPane.YES_NO_OPTION);
            if (y == JOptionPane.OK_OPTION) {
                delete = new ClientDAO().delete(id);
                if (delete == 1) {
                    JOptionPane.showMessageDialog(this, "Supprimé avec succès", "Succès", JOptionPane.INFORMATION_MESSAGE);
                    listClients();
                } else {
                    JOptionPane.showMessageDialog(this, "Echec de suppression", "Error", JOptionPane.ERROR_MESSAGE);
                }

            }
        }
    }//GEN-LAST:event_supprimerCmdActionPerformed

    private void resetCmdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resetCmdActionPerformed
        nomTxt.setText("");
        prenomTxt.setText("");
        adresseTxt.setText("");
        telTxt.setText("");
        telTxt.setText("");
        dateTxt.setDate(null);
        categorieTxt.setSelectedItem(null);
        cniTxt.setText("");
        compteTxt.setText("");
    }//GEN-LAST:event_resetCmdActionPerformed

    private void tableMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableMouseReleased
        int ligne = table.getSelectedRow();
        nomTxt.setText(table.getValueAt(ligne, 1).toString());
        prenomTxt.setText(table.getValueAt(ligne, 2).toString());
        adresseTxt.setText(table.getValueAt(ligne, 6).toString());
        telTxt.setText(table.getValueAt(ligne, 7).toString());
        JTextField showdate = (JTextField) dateTxt.getDateEditor().getUiComponent();
        showdate.setText(table.getValueAt(ligne, 3).toString());
        categorieTxt.setSelectedItem(table.getValueAt(ligne, 10).toString());
        cniTxt.setText(table.getValueAt(ligne, 8).toString());
        compteTxt.setText(table.getValueAt(ligne, 9).toString());
    }//GEN-LAST:event_tableMouseReleased


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private Vues.swing.TextField adresseTxt;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private Vues.swing.Combobox categorieTxt;
    private Vues.swing.TextField cniTxt;
    private Vues.swing.TextField compteTxt;
    private Vues.swing.Button creerCmd;
    private com.toedter.calendar.JDateChooser dateTxt;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private Vues.swing.Button modifierCmd;
    private Vues.swing.TextField nomTxt;
    private Vues.swing.TextField prenomTxt;
    private Vues.swing.RadioButtonCustom radioHome;
    private Vues.swing.RadioButtonCustom radiofemme;
    private Vues.swing.RadioButtonCustom radiomarie;
    private Vues.swing.RadioButtonCustom radiononmarie;
    private Vues.swing.Button resetCmd;
    private Vues.swing.Button supprimerCmd;
    private Vues.swing.TableDark table;
    private Vues.swing.TextField telTxt;
    // End of variables declaration//GEN-END:variables
}
