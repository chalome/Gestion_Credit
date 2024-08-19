
package DAO;

import Modeles.Client;
import Services.ServiceDAO;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class ClientDAO extends ServiceDAO<Client> {

    @Override
    protected int getId(Client client) {
        return client.getClientID();
    }

    @Override
    protected void setPreparedStatementValues(PreparedStatement pstmt, Client client) throws SQLException {
        pstmt.setString(1, client.getClientNom());
        pstmt.setString(2, client.getClientPrenom());
        pstmt.setString(3, client.getClientDate());
        pstmt.setString(4, client.getClientCivilite());
        pstmt.setString(5, client.getClientGenre());
        pstmt.setString(6, client.getClientAdresse());
        pstmt.setString(7, client.getClientTelephone());
        pstmt.setString(8, client.getClientCNI());
        pstmt.setString(9, client.getClientNumCompte());
        pstmt.setString(10, client.getClientCategorie());
    }

    @Override
    protected Client mapResultSetToEntity(ResultSet rs) throws SQLException {
        return new Client(
                rs.getInt("i"),
                rs.getString("n"),
                rs.getString("p"),
                rs.getString("dt"),
                rs.getString("cv"),
                rs.getString("g"),
                rs.getString("adr"),
                rs.getString("tl"),
                rs.getString("cn"),
                rs.getString("com"),
                rs.getString("cat")
        );
    }

    @Override
    protected String getInsertSQL() {
        return "INSERT INTO client (nom, prenom, date, civilite, genre, adresse, tel, cni, numero_compte,categorie) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?,(select id from type_client where nom=?))";
    }

    @Override
    protected String getSelectSQL() {
        return "SELECT * FROM client WHERE id = ?";
    }

    @Override
    protected String getUpdateSQL() {
        return "UPDATE client SET nom = ?, prenom = ?, date = ?, civilite = ?, genre = ?, adresse = ?, tel = ?, cni = ?, numero_compte = ?,categorie=(select id from type_client where nom=?) WHERE id = ?";
    }

    @Override
    protected String getDeleteSQL() {
        return "DELETE FROM client WHERE id = ?";
    }

    @Override
    protected String getSelectAllSQL() {
        return "SELECT client.id as i,client.nom as n,prenom as p,date as dt,civilite as cv,genre as g,adresse as adr,tel as tl,cni as cn,numero_compte as com,type_client.nom as cat FROM client,type_client where categorie=type_client.id";
    }

    @Override
    protected int getParameterIndexForId() {
        return 11; // Assuming the ID is the last parameter in the update statement
    }
}
