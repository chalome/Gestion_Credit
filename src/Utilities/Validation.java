package Utilities;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import static Database.Connexion.getConnection;

public class Validation {

    private static Connection connection;
    private static PreparedStatement pst;
    private static ResultSet res;

    public Validation() {
    }

    public static boolean isValidEmail(String email, String patternString) {
        Pattern pattern = Pattern.compile(patternString);
        Matcher matcher = pattern.matcher(email);
        return matcher.matches();
    }

    public static boolean isValidPhoneNumber(String number, String patternString) {
        Pattern pattern = Pattern.compile(patternString);
        Matcher matcher = pattern.matcher(number);
        return matcher.matches();

    }

    public static boolean isValidNumber(String number, String patternString) {
        Pattern pattern = Pattern.compile(patternString);
        Matcher matcher = pattern.matcher(number);
        return matcher.matches();
    }

    public static int categorieClient(String valeur) {
        connection = getConnection();
        int id = 0;
        try {
            String sql = "SELECT type_client.id FROM client,type_client where CONCAT(client.nom,' ',prenom)=? and type_client.id=client.categorie";

            pst = connection.prepareStatement(sql);
            pst.setString(1, valeur);
            res = pst.executeQuery();
            while (res.next()) {
                id = res.getInt(1);
                return id;
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return id;
    }

    public static boolean demandeDejaRembourse(int demande) {
        connection = getConnection();
        String sql = "SELECT * FROM  rembourcement  where demande=?";
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

    public static boolean demandeDejaApprouve(int demande) {
        connection = getConnection();
        String sql = "SELECT * FROM  demande  where id=? and etat='Approuvée'";
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
    public static boolean clientDejaExiste(String numero) {
        connection = getConnection();
        String sql = "SELECT * FROM  client  where numero_compte=?";
        try {
            pst = connection.prepareStatement(sql);
            pst.setString(1, numero);
            res = pst.executeQuery();
            while (res.next()) {
                return true;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }
}
