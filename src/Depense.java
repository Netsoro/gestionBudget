/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author 21611856
 */
public class Depense {
    private float depenseRS;

    public Depense(float depenseRS) {
        this.depenseRS = depenseRS;
    }
    
    
    
    public String toString(){
        return "Depense du Responsable Service : "+getDepenseRS();
    }


    /**
     * @return the depenseRS
     */
    public float getDepenseRS() {
        return depenseRS;
    }

    /**
     * @param depenseRS the depenseRS to set
     */
    public void setDepenseRS(float depenseRS) {
        this.depenseRS = depenseRS;
    }
}
