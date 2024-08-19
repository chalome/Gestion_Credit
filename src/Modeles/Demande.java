
package Modeles;

import java.util.Date;

public class Demande {
    private int demandeID;
    private String demandeClient;
    private String demandeTypeCredit;
    private Date demandeDate;
    private int demandeMontant;
    private Date demandeDateRemboursement;
    private String demandeEtat;

    public Date getDemandeDateRemboursement() {
        return demandeDateRemboursement;
    }

    public String getDemandeEtat() {
        return demandeEtat;
    }

    public void setDemandeEtat(String demandeEtat) {
        this.demandeEtat = demandeEtat;
    }

    public Demande(int demandeID, String demandeClient, String demandeTypeCredit, Date demandeDate, int demandeMontant, Date demandeDateRemboursement, String demandeEtat) {
        this.demandeID = demandeID;
        this.demandeClient = demandeClient;
        this.demandeTypeCredit = demandeTypeCredit;
        this.demandeDate = demandeDate;
        this.demandeMontant = demandeMontant;
        this.demandeDateRemboursement = demandeDateRemboursement;
        this.demandeEtat = demandeEtat;
    }

    public void setDemandeDateRemboursement(Date demandeDateRemboursement) {
        this.demandeDateRemboursement = demandeDateRemboursement;
    }
    public Demande() {
    }

    public Demande(int demandeID, String demandeClient, String demandeTypeCredit, Date demandeDate, int demandeMontant,Date demandeDateRemboursement) {
        this.demandeID = demandeID;
        this.demandeClient = demandeClient;
        this.demandeTypeCredit = demandeTypeCredit;
        this.demandeDate = demandeDate;
        this.demandeMontant = demandeMontant;
        this.demandeDateRemboursement=demandeDateRemboursement;
    }

    public Demande(String demandeClient, String demandeTypeCredit, int demandeMontant,Date demandeDateRemboursement) {
        this.demandeClient = demandeClient;
        this.demandeTypeCredit = demandeTypeCredit;
        this.demandeMontant = demandeMontant;
        this.demandeDateRemboursement=demandeDateRemboursement;
    }

    public Demande(String demandeClient, String demandeTypeCredit, Date demandeDate, int demandeMontant,Date demandeDateRemboursement) {
        this.demandeClient = demandeClient;
        this.demandeTypeCredit = demandeTypeCredit;
        this.demandeDate = demandeDate;
        this.demandeMontant = demandeMontant;
        this.demandeDateRemboursement=demandeDateRemboursement;
    }

    public int getDemandeID() {
        return demandeID;
    }

    public void setDemandeID(int demandeID) {
        this.demandeID = demandeID;
    }

    public String getDemandeClient() {
        return demandeClient;
    }

    public void setDemandeClient(String demandeClient) {
        this.demandeClient = demandeClient;
    }

    public String getDemandeTypeCredit() {
        return demandeTypeCredit;
    }

    public void setDemandeTypeCredit(String demandeTypeCredit) {
        this.demandeTypeCredit = demandeTypeCredit;
    }

    public Date getDemandeDate() {
        return demandeDate;
    }

    public void setDemandeDate(Date demandeDate) {
        this.demandeDate = demandeDate;
    }

    public int getDemandeMontant() {
        return demandeMontant;
    }

    public void setDemandeMontant(int demandeMontant) {
        this.demandeMontant = demandeMontant;
    }
    
}
