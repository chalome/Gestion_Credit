package DAO;

import Modeles.Utilisateur;
import Services.ServiceDAO;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class UtilisateurDAO extends ServiceDAO<Utilisateur> {

    @Override
    protected int getId(Utilisateur utilisateur) {
        return utilisateur.getUtilisateurID();
    }

    @Override
    protected void setPreparedStatementValues(PreparedStatement pstmt, Utilisateur utilisateur) throws SQLException {
        pstmt.setString(1, utilisateur.getUtilisateurNom());
        pstmt.setString(2, utilisateur.getUtilisateurPrenom());
        pstmt.setString(3, utilisateur.getUtilisateurEmail());
        pstmt.setString(4, utilisateur.getUtilisateurTelephone());
        pstmt.setString(5, utilisateur.getUtilisateurMotDePasse());
        pstmt.setString(6, utilisateur.getUtilisateurCategorie());
    }

    @Override
    protected Utilisateur mapResultSetToEntity(ResultSet rs) throws SQLException {
        return new Utilisateur(
                rs.getInt("id"),
                rs.getString("n"),
                rs.getString("p"),
                rs.getString("em"),
                rs.getString("tl"),
                rs.getString("pwd"),
                rs.getString("cat")
        );
    }

    @Override
    protected String getInsertSQL() {
        return "INSERT INTO utilisateur (nom, prenom, email, tel, mot_de_passe, categorie) VALUES (?, ?, ?, ?, ?, (select id from categorie where nom=?))";
    }

    @Override
    protected String getSelectSQL() {
        return "SELECT * FROM utilisateur WHERE userID = ?";
    }

    @Override
    protected String getUpdateSQL() {
        return "UPDATE utilisateur SET nom = ?, prenom = ?, email = ?, tel = ?, mot_de_passe = ?, categorie = (select id from categorie where nom=?) WHERE userID = ?";
    }

    @Override
    protected String getDeleteSQL() {
        return "DELETE FROM utilisateur WHERE userID = ?";
    }

    @Override
    protected String getSelectAllSQL() {
        return "SELECT userid as id,utilisateur.nom as n,prenom as p,email as em,tel as tl,mot_de_passe as pwd,categorie.nom as cat FROM utilisateur,categorie where categorie.id=utilisateur.categorie";
    }

    @Override
    protected int getParameterIndexForId() {
        return 7; // Assuming the ID is the last parameter in the update statement
    }
    /*
    public class Main {
    public static void main(String[] args) {
        UtilisateurDAO utilisateurDAO = new UtilisateurDAO();

        // Create a new utilisateur
        Utilisateur newUser = new Utilisateur("John", "Doe", "john.doe@example.com", "1234567890", "password123", "admin");
        utilisateurDAO.create(newUser);

        // Read an utilisateur
        Utilisateur user = utilisateurDAO.read(1);
        System.out.println(user);

        // Update an utilisateur
        user.setUtilisateurNom("Jane");
        utilisateurDAO.update(user);

        // Delete an utilisateur
        utilisateurDAO.delete(1);

        // Get all utilisateurs
        List<Utilisateur> allUsers = utilisateurDAO.getAll();
        allUsers.forEach(System.out::println);
    }
}

    */
}
