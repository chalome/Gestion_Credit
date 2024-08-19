
package DAO;

import Modeles.CategorieClient;
import Services.ServiceDAO;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class CategorieClientDAO extends ServiceDAO<CategorieClient> {

    @Override
    protected int getId(CategorieClient categorieClient) {
        return categorieClient.getCategorieClID();
    }

    @Override
    protected void setPreparedStatementValues(PreparedStatement pstmt, CategorieClient categorieClient) throws SQLException {
        pstmt.setString(1, categorieClient.getCategoeirClNom());
    }

    @Override
    protected CategorieClient mapResultSetToEntity(ResultSet rs) throws SQLException {
        return new CategorieClient(
                rs.getInt("id"),
                rs.getString("nom")
        );
    }

    @Override
    protected String getInsertSQL() {
        return "INSERT INTO type_client (nom) VALUES (?)";
    }

    @Override
    protected String getSelectSQL() {
        return "SELECT * FROM type_client WHERE id = ?";
    }

    @Override
    protected String getUpdateSQL() {
        return "UPDATE type_client SET nom = ? WHERE id = ?";
    }

    @Override
    protected String getDeleteSQL() {
        return "DELETE FROM type_client WHERE id = ?";
    }

    @Override
    protected String getSelectAllSQL() {
        return "SELECT * FROM type_client";
    }

    @Override
    protected int getParameterIndexForId() {
        return 2; // Assuming the ID is the last parameter in the update statement
    }
}
