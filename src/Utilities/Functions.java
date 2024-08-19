package Utilities;

import static Database.Connexion.getConnection;
import Modeles.Utilisateur;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class Functions {

    private static Connection connection;
    private static PreparedStatement pst;
    private static ResultSet res;

    public Functions() {
    }

    public static String today() {
        LocalDate today = LocalDate.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        String formattedDate = today.format(formatter);
        return formattedDate;
    }

    public static void setDette() {
        String date = today();
        connection = getConnection();
        String sql = "UPDATE demande SET etat='Retard' WHERE date_remb<?";
        try {
            pst = connection.prepareStatement(sql);
            pst.setString(1, date);
            pst.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void approuverDemande(int id) {
        connection = getConnection();
        String sql = "UPDATE demande SET etat='Approuvée' WHERE id=?";
        try {
            pst = connection.prepareStatement(sql);
            pst.setInt(1, id);
            pst.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static boolean isLogin(Utilisateur utilisateur) {
        connection = getConnection();
        String sql = "SELECT * FROM  utilisateur  where prenom=? and mot_de_passe=?";
        try {
            pst = connection.prepareStatement(sql);
            pst.setString(1, utilisateur.getUtilisateurPrenom());
            pst.setString(2, utilisateur.getUtilisateurMotDePasse());
            res = pst.executeQuery();
            while (res.next()) {
                return true;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }

    public static boolean verifierDemande(String client, String etat) {
        connection = getConnection();
        String sql = "SELECT * FROM  demande  where client=? and etat=?";
        try {
            pst = connection.prepareStatement(sql);
            pst.setString(1, client);
            pst.setString(2, etat);
            res = pst.executeQuery();
            while (res.next()) {
                return true;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }

    public static boolean demandeExiste(int demande) {
        connection = getConnection();
        String sql = "SELECT * FROM  demande  where id=?";
        try {
            pst = connection.prepareStatement(sql);
            pst.setInt(1, demande);
            res = pst.executeQuery();
            while (res.next()) {
                return true;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }

    public static String montant(String id) {
        String montant = "";
        connection = getConnection();
        String sql = "SELECT montant as mon FROM  demande  where id=?";
        try {
            pst = connection.prepareStatement(sql);
            pst.setString(1, id);
            res = pst.executeQuery();
            while (res.next()) {
                montant = res.getString("mon");
                return montant;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return montant;
    }

    public static <T> void populateTable(JTable table, ResultSet resultSet, String[] columnNames, String[] fieldNames) {
        try {
            DefaultTableModel model = (DefaultTableModel) table.getModel();
            model.setRowCount(0); // Clear existing data

            // Set column names
            model.setColumnIdentifiers(columnNames);

            // Add rows
            while (resultSet.next()) {
                Object[] rowData = new Object[fieldNames.length];
                for (int i = 0; i < fieldNames.length; i++) {
                    rowData[i] = resultSet.getObject(fieldNames[i]);
                }
                model.addRow(rowData);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static void loadData(JTable table, String query, String[] columnNames, String[] fieldNames) {
        try (Connection con = getConnection();
                Statement statement = con.createStatement();
                ResultSet resultSet = statement.executeQuery(query)) {

            populateTable(table, resultSet, columnNames, fieldNames);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
