package DAO;

import Modeles.Demande;
import Modeles.Remboursement;
import Services.ServiceDAO;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class RemboursementDAO extends ServiceDAO<Remboursement> {

    @Override
    protected int getId(Remboursement remboursement) {
        return remboursement.getId();
    }

    @Override
    protected void setPreparedStatementValues(PreparedStatement pstmt, Remboursement remboursement) throws SQLException {
        pstmt.setInt(1, remboursement.getDemande());
        pstmt.setDate(2, new java.sql.Date(remboursement.getDate().getTime()));
        pstmt.setInt(3, remboursement.getMontant());
        
    }

    @Override
    protected Remboursement mapResultSetToEntity(ResultSet rs) throws SQLException {
        return new Remboursement(
                rs.getInt("i"),
                rs.getInt("dem"),
                rs.getDate("dt"),
                rs.getInt("mon")
        );
    }

    @Override
    protected String getInsertSQL() {
        return "INSERT INTO rembourcement (demande, date, montant) VALUES (?,?,?)";
    }

    @Override
    protected String getSelectSQL() {
        return "SELECT * FROM rembourcement WHERE id = ?";
    }

    @Override
    protected String getUpdateSQL() {
        return "UPDATE rembourcement SET demande = ?,  date = ?, montant = ? WHERE id = ?";
    }

    @Override
    protected String getDeleteSQL() {
        return "DELETE FROM rembourcement WHERE id = ?";
    }

    @Override
    protected String getSelectAllSQL() {
        return "SELECT rembourcement.id as i,rembourcement.demande as dem,concat(client.nom,' ',client.prenom) as nom_cl,rembourcement.date as dt,rembourcement.montant as mon FROM demande,client,rembourcement where demande.client=client.id and rembourcement.demande=demande.id";
    }

    @Override
    protected int getParameterIndexForId() {
        return 4; // Assuming the ID is the last parameter in the update statement
    }
  
}
