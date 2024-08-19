package DAO;

import Modeles.TypeCredit;
import Services.ServiceDAO;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class TypeCreditDAO extends ServiceDAO<TypeCredit> {

    @Override
    protected int getId(TypeCredit typeCredit) {
        return typeCredit.getTypeCreditID();
    }

    @Override
    protected void setPreparedStatementValues(PreparedStatement pstmt, TypeCredit typeCredit) throws SQLException {
        pstmt.setString(1, typeCredit.getTypeCreditNom());
    }

    @Override
    protected TypeCredit mapResultSetToEntity(ResultSet rs) throws SQLException {
        return new TypeCredit(
                rs.getInt("id"),
                rs.getString("nom")
        );
    }

    @Override
    protected String getInsertSQL() {
        return "INSERT INTO type_credit (nom) VALUES (?)";
    }

    @Override
    protected String getSelectSQL() {
        return "SELECT * FROM type_credit WHERE id = ?";
    }

    @Override
    protected String getUpdateSQL() {
        return "UPDATE type_credit SET nom = ? WHERE id = ?";
    }

    @Override
    protected String getDeleteSQL() {
        return "DELETE FROM type_credit WHERE id = ?";
    }

    @Override
    protected String getSelectAllSQL() {
        return "SELECT * FROM type_credit";
    }

    @Override
    protected int getParameterIndexForId() {
        return 2; // Assuming the ID is the last parameter in the update statement
    }
}
