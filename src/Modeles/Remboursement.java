
package Modeles;

import java.util.Date;

public class Remboursement {
    private int id;
    private int demande;
    private Date date;
    private int montant;

    public Remboursement() {
    }

    public Remboursement(int id, int demande, Date date, int montant) {
        this.id = id;
        this.demande = demande;
        this.date = date;
        this.montant = montant;
    }

    public Remboursement(int demande, Date date, int montant) {
        this.demande = demande;
        this.date = date;
        this.montant = montant;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getDemande() {
        return demande;
    }

    public void setDemande(int demande) {
        this.demande = demande;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public int getMontant() {
        return montant;
    }

    public void setMontant(int montant) {
        this.montant = montant;
    }
    
    
}
