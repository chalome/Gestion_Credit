
package Modeles;

public class CategorieClient {
    private int categorieClID;
    private String categoeirClNom;

    public CategorieClient() {
    }

    public CategorieClient(int categorieClID, String categoeirClNom) {
        this.categorieClID = categorieClID;
        this.categoeirClNom = categoeirClNom;
    }

    public CategorieClient(String categoeirClNom) {
        this.categoeirClNom = categoeirClNom;
    }

    public int getCategorieClID() {
        return categorieClID;
    }

    public void setCategorieClID(int categorieClID) {
        this.categorieClID = categorieClID;
    }

    public String getCategoeirClNom() {
        return categoeirClNom;
    }

    public void setCategoeirClNom(String categoeirClNom) {
        this.categoeirClNom = categoeirClNom;
    }

    @Override
    public String toString() {
        return  categoeirClNom;
    }
    
    
}
