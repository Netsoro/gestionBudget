
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
    float rallongeDS;
    Date dateRallonge;

    public RallongeDotationServ(float rallongeDS, Date dateRallonge) {
        this.rallongeDS = rallongeDS;
        this.dateRallonge = dateRallonge;
    }

    public float getRallongeDS() {
        return rallongeDS;
    }

    public void setRallongeDS(float rallongeDS) {
        this.rallongeDS = rallongeDS;
    }

    public Date getDateRallonge() {
        return dateRallonge;
    }

    public void setDateRallonge(Date dateRallonge) {
        this.dateRallonge = dateRallonge;
    }

    @Override
    public String toString() {
        return "RallongeDotationServ{" + "rallongeDS=" + rallongeDS + ", dateRallonge=" + dateRallonge + '}';
    }
    
    
}
