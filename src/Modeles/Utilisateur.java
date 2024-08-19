
package Modeles;

public class Utilisateur {
    private int utilisateurID;
    private String utilisateurNom;
    private String utilisateurPrenom;
    private String utilisateurEmail;
    private String utilisateurTelephone;
    private String utilisateurMotDePasse;
    private String utilisateurCategorie;

    public Utilisateur() {
    }

    public Utilisateur(String utilisateurPrenom, String utilisateurMotDePasse) {
        this.utilisateurPrenom = utilisateurPrenom;
        this.utilisateurMotDePasse = utilisateurMotDePasse;
    }

   

    public Utilisateur(int utilisateurID, String utilisateurNom, String utilisateurPrenom, String utilisateurEmail, String utilisateurTelephone, String utilisateurMotDePasse, String utilisateurCategorie) {
        this.utilisateurID = utilisateurID;
        this.utilisateurNom = utilisateurNom;
        this.utilisateurPrenom = utilisateurPrenom;
        this.utilisateurEmail = utilisateurEmail;
        this.utilisateurTelephone = utilisateurTelephone;
        this.utilisateurMotDePasse = utilisateurMotDePasse;
        this.utilisateurCategorie = utilisateurCategorie;
    }

    public Utilisateur(String utilisateurNom, String utilisateurPrenom, String utilisateurEmail, String utilisateurTelephone, String utilisateurMotDePasse, String utilisateurCategorie) {
        this.utilisateurNom = utilisateurNom;
        this.utilisateurPrenom = utilisateurPrenom;
        this.utilisateurEmail = utilisateurEmail;
        this.utilisateurTelephone = utilisateurTelephone;
        this.utilisateurMotDePasse = utilisateurMotDePasse;
        this.utilisateurCategorie = utilisateurCategorie;
    }

    public int getUtilisateurID() {
        return utilisateurID;
    }

    public void setUtilisateurID(int utilisateurID) {
        this.utilisateurID = utilisateurID;
    }

    public String getUtilisateurNom() {
        return utilisateurNom;
    }

    public void setUtilisateurNom(String utilisateurNom) {
        this.utilisateurNom = utilisateurNom;
    }

    public String getUtilisateurPrenom() {
        return utilisateurPrenom;
    }

    public void setUtilisateurPrenom(String utilisateurPrenom) {
        this.utilisateurPrenom = utilisateurPrenom;
    }

    public String getUtilisateurEmail() {
        return utilisateurEmail;
    }

    public void setUtilisateurEmail(String utilisateurEmail) {
        this.utilisateurEmail = utilisateurEmail;
    }

    public String getUtilisateurTelephone() {
        return utilisateurTelephone;
    }

    public void setUtilisateurTelephone(String utilisateurTelephone) {
        this.utilisateurTelephone = utilisateurTelephone;
    }

    public String getUtilisateurMotDePasse() {
        return utilisateurMotDePasse;
    }

    public void setUtilisateurMotDePasse(String utilisateurMotDePasse) {
        this.utilisateurMotDePasse = utilisateurMotDePasse;
    }

    public String getUtilisateurCategorie() {
        return utilisateurCategorie;
    }

    public void setUtilisateurCategorie(String utilisateurCategorie) {
        this.utilisateurCategorie = utilisateurCategorie;
    }

    @Override
    public String toString() {
        return utilisateurNom + " " + utilisateurPrenom;
    }
    
}
