
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
public class DepenseRubrique {
    private float montantDepR;
    private Date dateDepR;

    public DepenseRubrique(float depenseRS, Date dateDepR) {
        this.montantDepR = depenseRS;
        this.dateDepR = dateDepR;
    }

    @Override
    public String toString() {
        return "DepenseRubrique{" + "montantDepR=" + montantDepR + ", dateDepR=" + dateDepR + '}';
    }
    
    
    
    


    /**
     * @return the montantDepR
     */
    public float getMontantDepR() {
        return montantDepR;
    }

    /**
     * @param montantDepR the montantDepR to set
     */
    public void setMontantDepR(float montantDepR) {
        this.montantDepR = montantDepR;
    }
}
