
package Modeles;

public class TypeCredit {
    private int typeCreditID;
    private String typeCreditNom;

    public TypeCredit() {
    }

    public TypeCredit(int typeCreditID, String typeCreditNom) {
        this.typeCreditID = typeCreditID;
        this.typeCreditNom = typeCreditNom;
    }

    public TypeCredit(String typeCreditNom) {
        this.typeCreditNom = typeCreditNom;
    }

    public int getTypeCreditID() {
        return typeCreditID;
    }

    public void setTypeCreditID(int typeCreditID) {
        this.typeCreditID = typeCreditID;
    }

    public String getTypeCreditNom() {
        return typeCreditNom;
    }

    public void setTypeCreditNom(String typeCreditNom) {
        this.typeCreditNom = typeCreditNom;
    }

    @Override
    public String toString() {
        return  typeCreditNom ;
    }
    
}
