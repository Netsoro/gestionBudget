
import java.util.Date;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author 21611856
 */
public class RallongeDotationServ {
    float montantRallongeDS;
    private Date dateRallonge;
    private boolean etatRallonge;

    public RallongeDotationServ(float rallongeDS, Date dateRallonge) {
        this.montantRallongeDS = rallongeDS;
        this.dateRallonge = dateRallonge;
    }

    public float getMontantRallongeDS() {
        return montantRallongeDS;
    }

    public void setMontantRallongeDS(float montantRallongeDS) {
        this.montantRallongeDS = montantRallongeDS;
    }

    public Date getDateRallonge() {
        return dateRallonge;
    }

    public void setDateRallonge(Date dateRallonge) {
        this.dateRallonge = dateRallonge;
    }

    @Override
    public String toString() {
        return "RallongeDotationServ{" + "rallongeDS=" + montantRallongeDS + ", dateRallonge=" + dateRallonge + '}';
    }
    
    /**
     * Get the value of etatRallonge
     *
     * @return the value of etatRallonge
     */
    public boolean isEtatRallonge() {
        return etatRallonge;
    }

    /**
     * Set the value of etatRallonge
     *
     * @param etatRallonge new value of etatRallonge
     */
    public void setEtatRallonge(boolean etatRallonge) {
        this.etatRallonge = etatRallonge;
    }
    
    
}
