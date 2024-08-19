package Vues.form;

import Utilities.Functions;
import static Utilities.Functions.loadData;
import Utilities.Validation;
import Vues.transitions.TransitionsForm;
import java.awt.Color;
import javax.swing.JOptionPane;


public class Form6 extends TransitionsForm {

    public Form6() {
        initComponents();
        table.setBackground(new Color(240, 240, 240));
        listedemandes();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        resetCmd = new Vues.swing.Button();
        jScrollPane1 = new javax.swing.JScrollPane();
        table = new Vues.swing.TableDark();
        retartbtn = new Vues.swing.ButtonOutLine();
        attentbtn = new Vues.swing.ButtonOutLine();
        creditbtn = new Vues.swing.ButtonOutLine();
        buttonOutLine4 = new Vues.swing.ButtonOutLine();
        title = new javax.swing.JLabel();

        jLabel1.setFont(new java.awt.Font("sansserif", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(79, 79, 79));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Crédit");

        resetCmd.setBackground(new java.awt.Color(204, 204, 204));
        resetCmd.setText("Approuver");
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

        retartbtn.setText("Les crédits en retard");
        retartbtn.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        retartbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                retartbtnActionPerformed(evt);
            }
        });

        attentbtn.setText("Les demandes en attente");
        attentbtn.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        attentbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                attentbtnActionPerformed(evt);
            }
        });

        creditbtn.setText("Les demandes  approuvées | les crédits");
        creditbtn.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        creditbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                creditbtnActionPerformed(evt);
            }
        });

        buttonOutLine4.setText("Les crédits payés");
        buttonOutLine4.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        buttonOutLine4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonOutLine4ActionPerformed(evt);
            }
        });

        title.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        title.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(58, 58, 58)
                        .addComponent(resetCmd, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(110, 110, 110)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(retartbtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(creditbtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(52, 52, 52)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(attentbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(buttonOutLine4, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 78, Short.MAX_VALUE))
                    .addComponent(title, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(title, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 411, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 17, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(retartbtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(resetCmd, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(creditbtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(29, 29, 29))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addComponent(attentbtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(buttonOutLine4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void resetCmdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resetCmdActionPerformed
        int ligne = table.getSelectedRow();
        int id = Integer.parseInt(table.getValueAt(ligne, 0).toString());
        if (ligne == -1) {
            JOptionPane.showMessageDialog(this, "Selectionnez la ligne a modifier ", "Erreur!", JOptionPane.ERROR_MESSAGE);
        } else if (Validation.demandeDejaApprouve(id)) {
            JOptionPane.showMessageDialog(this, "la demande déja approuvée ", "Erreur!", JOptionPane.ERROR_MESSAGE);
        } else {
            Functions.approuverDemande(id);
            JOptionPane.showMessageDialog(this, "Approuvée avec succès", "Succès", JOptionPane.INFORMATION_MESSAGE);
            listedemandes();
        }
    }//GEN-LAST:event_resetCmdActionPerformed

    private void tableMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableMouseReleased

    }//GEN-LAST:event_tableMouseReleased

    private void retartbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_retartbtnActionPerformed
        afficherDemandes("Retard", "Listes des crédits en retards");
    }//GEN-LAST:event_retartbtnActionPerformed

    private void creditbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_creditbtnActionPerformed
        afficherDemandes("Approuvée", "Listes des crédits");
    }//GEN-LAST:event_creditbtnActionPerformed

    private void attentbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_attentbtnActionPerformed
        afficherDemandes("En attente", "Listes des crédits en attente");
    }//GEN-LAST:event_attentbtnActionPerformed

    private void buttonOutLine4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonOutLine4ActionPerformed
        listedemandes();
    }//GEN-LAST:event_buttonOutLine4ActionPerformed
    private void afficherDemandes(String etat, String titre) {
        title.setText(titre);
        String sql = "SELECT demande.id as i,concat(client.nom,' ',client.prenom) as nom_cl,type_credit.nom as credit,"
                + "demande.date as dt,demande.date_remb as dtr,demande.montant as mon,demande.etat as et  FROM demande,"
                + "client,type_credit where demande.client=client.id and demande.type_credit=type_credit.id "
                + "AND etat='" + etat + "'";
        loadData(table, sql,
                new String[]{"ID", "NOM", "CREDIT", "DATE", "REMBOURSEMENT", "MONTANT", "ETAT"},
                new String[]{"i", "nom_cl", "credit", "dt", "dtr", "mon", "et"});
    }

    final void listedemandes() {
        title.setText("Liste des credits remboursés");
        String sql = "SELECT rembourcement.id as i,rembourcement.demande as dem,concat(client.nom,' ',client.prenom)"
                + " as nom_cl,rembourcement.date as dt,rembourcement.montant as mon FROM demande,client,"
                + "rembourcement where demande.client=client.id and rembourcement.demande=demande.id";
        loadData(table, sql,
                new String[]{"ID", "DEMANDE", "NOM", "DATE", "MONTANT"},
                new String[]{"i", "dem", "nom_cl", "dt", "mon",});
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private Vues.swing.ButtonOutLine attentbtn;
    private Vues.swing.ButtonOutLine buttonOutLine4;
    private Vues.swing.ButtonOutLine creditbtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private Vues.swing.Button resetCmd;
    private Vues.swing.ButtonOutLine retartbtn;
    private Vues.swing.TableDark table;
    private javax.swing.JLabel title;
    // End of variables declaration//GEN-END:variables
}
