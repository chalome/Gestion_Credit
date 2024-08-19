
package Modeles;

public class Client {
    private int clientID;
    private String clientNom;
    private String clientPrenom;
    private String clientDate;
    private String clientCivilite;
    private String clientGenre;
    private String clientAdresse;
    private String clientTelephone;
    private String clientCNI;
    private String clientNumCompte;
    private String clientCategorie;

    public String getClientCategorie() {
        return clientCategorie;
    }

    public void setClientCategorie(String clientCategorie) {
        this.clientCategorie = clientCategorie;
    }

    public Client() {
    }

    public Client(int clientID, String clientNom, String clientPrenom, String clientDate, String clientCivilite, String clientGenre, String clientAdresse, String clientTelephone, String clientCNI, String clientNumCompte,String clientCategorie) {
        this.clientID = clientID;
        this.clientNom = clientNom;
        this.clientPrenom = clientPrenom;
        this.clientDate = clientDate;
        this.clientCivilite = clientCivilite;
        this.clientGenre = clientGenre;
        this.clientAdresse = clientAdresse;
        this.clientTelephone = clientTelephone;
        this.clientCNI = clientCNI;
        this.clientNumCompte = clientNumCompte;
        this.clientCategorie= clientCategorie;
    }

    public Client(String clientNom, String clientPrenom, String clientDate, String clientCivilite, String clientGenre, String clientAdresse, String clientTelephone, String clientCNI, String clientNumCompte,String clientCategorie) {
        this.clientNom = clientNom;
        this.clientPrenom = clientPrenom;
        this.clientDate = clientDate;
        this.clientCivilite = clientCivilite;
        this.clientGenre = clientGenre;
        this.clientAdresse = clientAdresse;
        this.clientTelephone = clientTelephone;
        this.clientCNI = clientCNI;
        this.clientNumCompte = clientNumCompte;
        this.clientCategorie= clientCategorie;
    }

    public Client(String clientNom, String clientPrenom, String clientCivilite, String clientGenre, String clientAdresse, String clientTelephone, String clientCNI, String clientNumCompte,String clientCategorie) {
        this.clientNom = clientNom;
        this.clientPrenom = clientPrenom;
        this.clientCivilite = clientCivilite;
        this.clientGenre = clientGenre;
        this.clientAdresse = clientAdresse;
        this.clientTelephone = clientTelephone;
        this.clientCNI = clientCNI;
        this.clientNumCompte = clientNumCompte;
        this.clientCategorie= clientCategorie;
    }

    public int getClientID() {
        return clientID;
    }

    public void setClientID(int clientID) {
        this.clientID = clientID;
    }

    public String getClientNom() {
        return clientNom;
    }

    public void setClientNom(String clientNom) {
        this.clientNom = clientNom;
    }

    public String getClientPrenom() {
        return clientPrenom;
    }

    public void setClientPrenom(String clientPrenom) {
        this.clientPrenom = clientPrenom;
    }

    public String getClientDate() {
        return clientDate;
    }

    public void setClientDate(String clientDate) {
        this.clientDate = clientDate;
    }

    public String getClientCivilite() {
        return clientCivilite;
    }

    public void setClientCivilite(String clientCivilite) {
        this.clientCivilite = clientCivilite;
    }

    public String getClientGenre() {
        return clientGenre;
    }

    public void setClientGenre(String clientGenre) {
        this.clientGenre = clientGenre;
    }

    public String getClientAdresse() {
        return clientAdresse;
    }

    public void setClientAdresse(String clientAdresse) {
        this.clientAdresse = clientAdresse;
    }

    public String getClientTelephone() {
        return clientTelephone;
    }

    public void setClientTelephone(String clientTelephone) {
        this.clientTelephone = clientTelephone;
    }

    public String getClientCNI() {
        return clientCNI;
    }

    public void setClientCNI(String clientCNI) {
        this.clientCNI = clientCNI;
    }

    public String getClientNumCompte() {
        return clientNumCompte;
    }

    public void setClientNumCompte(String clientNumCompte) {
        this.clientNumCompte = clientNumCompte;
    }

    @Override
    public String toString() {
        return clientNom + " " + clientPrenom;
    }
    
    
}
