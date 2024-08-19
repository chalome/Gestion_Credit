package DAO;

import Modeles.Demande;
import Services.ServiceDAO;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DemandeDAO extends ServiceDAO<Demande> {

    @Override
    protected int getId(Demande demande) {
        return demande.getDemandeID();
    }

    @Override
    protected void setPreparedStatementValues(PreparedStatement pstmt, Demande demande) throws SQLException {
        pstmt.setString(1, demande.getDemandeClient());
        pstmt.setString(2, demande.getDemandeTypeCredit());
        pstmt.setDate(3, new java.sql.Date(demande.getDemandeDate().getTime()));
        pstmt.setInt(4, demande.getDemandeMontant());
        pstmt.setDate(5, new java.sql.Date(demande.getDemandeDateRemboursement().getTime()));
    }

    @Override
    protected Demande mapResultSetToEntity(ResultSet rs) throws SQLException {
        return new Demande(
                rs.getInt("i"),
                rs.getString("nom_cl"),
                rs.getString("credit"),
                rs.getDate("dt"),
                rs.getInt("mon"),
                rs.getDate("dtr"),
                rs.getString("et")
        );
    }

    @Override
    protected String getInsertSQL() {
        return "INSERT INTO demande (client, type_credit,date, montant,date_remb) VALUES ((select id from client where concat(nom,' ',prenom)=?),(select id from type_credit where nom=?),?,?,?)";
    }

    @Override
    protected String getSelectSQL() {
        return "SELECT * FROM demande WHERE id = ?";
    }

    @Override
    protected String getUpdateSQL() {
        return "UPDATE demande SET client = (select id from client where concat(nom,' ',prenom)=?), type_credit =  (select id from type_credit where nom=?), date = ?, montant = ?,date_remb=? WHERE id = ?";
    }

    @Override
    protected String getDeleteSQL() {
        return "DELETE FROM demande WHERE id = ?";
    }

    @Override
    protected String getSelectAllSQL() {
        return "SELECT demande.id as i,concat(client.nom,' ',client.prenom) as nom_cl,type_credit.nom as credit,demande.date as dt,demande.date_remb as dtr,demande.montant as mon,demande.etat as et  FROM demande,client,type_credit where demande.client=client.id and demande.type_credit=type_credit.id";
    }

    @Override
    protected int getParameterIndexForId() {
        return 6; // Assuming the ID is the last parameter in the update statement
    }
}
