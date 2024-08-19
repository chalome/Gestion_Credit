
package Modeles;

public class CategorieUtilisateur {
    private int CategorieID;
    private String CategorieNom;

    public CategorieUtilisateur() {
    }

    public CategorieUtilisateur(int CategorieID, String CategorieNom) {
        this.CategorieID = CategorieID;
        this.CategorieNom = CategorieNom;
    }

    public CategorieUtilisateur(String CategorieNom) {
        this.CategorieNom = CategorieNom;
    }

    public int getCategorieID() {
        return CategorieID;
    }

    public void setCategorieID(int CategorieID) {
        this.CategorieID = CategorieID;
    }

    public String getCategorieNom() {
        return CategorieNom;
    }

    public void setCategorieNom(String CategorieNom) {
        this.CategorieNom = CategorieNom;
    }

    @Override
    public String toString() {
        return CategorieNom;
    }
    
    
}
