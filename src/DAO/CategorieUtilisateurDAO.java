
package DAO;

import Modeles.CategorieUtilisateur;
import Services.ServiceDAO;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class CategorieUtilisateurDAO extends ServiceDAO<CategorieUtilisateur> {

    @Override
    protected int getId(CategorieUtilisateur categorieUtilisateur) {
        return categorieUtilisateur.getCategorieID();
    }

    @Override
    protected void setPreparedStatementValues(PreparedStatement pstmt, CategorieUtilisateur categorieUtilisateur) throws SQLException {
        pstmt.setString(1, categorieUtilisateur.getCategorieNom());
    }

    @Override
    protected CategorieUtilisateur mapResultSetToEntity(ResultSet rs) throws SQLException {
        return new CategorieUtilisateur(
                rs.getInt("id"),
                rs.getString("nom")
        );
    }

    @Override
    protected String getInsertSQL() {
        return "INSERT INTO categorie (nom) VALUES (?)";
    }

    @Override
    protected String getSelectSQL() {
        return "SELECT * FROM categorie WHERE id = ?";
    }

    @Override
    protected String getUpdateSQL() {
        return "UPDATE categorie SET nom = ? WHERE id = ?";
    }

    @Override
    protected String getDeleteSQL() {
        return "DELETE FROM categorie WHERE id = ?";
    }

    @Override
    protected String getSelectAllSQL() {
        return "SELECT * FROM categorie";
    }

    @Override
    protected int getParameterIndexForId() {
        return 2; // Assuming the ID is the last parameter in the update statement
    }
}

