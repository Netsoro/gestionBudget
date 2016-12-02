
import java.util.ArrayList;
import java.util.List;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author 21611856
 */
public class DotationGlobalService {
    private int anneeDS;
    private float montantDS;
    private boolean etatDS;

 
    private final List<DotationRubrique> listeDotationRS;
    
    public DotationGlobalService(){
        listeDotationRS = new ArrayList<DotationRubrique>();
    }

    public DotationGlobalService(int annee ,float dotationGS ){
        this.anneeDS = annee;
        this.montantDS = dotationGS;
        listeDotationRS = new ArrayList<DotationRubrique>();
    }
    
    public void augmentMontantDotGS(float supp){
        if(supp > 0) this.montantDS+= supp;
    }
    
    public void diminuerMontantDotGS(float malus){
        if(this.montantDS >= malus) this.montantDS-=malus;
    }

    @Override
    public String toString() {
        return "DotationGlobalService{" + "annee=" + anneeDS + ", dotationGS=" + montantDS + '}';
    }

    
  
    /**
     * @return the anneeDS
     */
    public int getAnneeDS() {
        return anneeDS;
    }

    /**
     * @param anneeDS the anneeDS to set
     */
    public void setAnneeDS(int anneeDS) {
        this.anneeDS = anneeDS;
    }

    /**
     * @return the montantDS
     */
    public float getMontantDS() {
        return montantDS;
    }

    /**
     * @param montantDS the montantDS to set
     */
    public void setMontantDS(float montantDS) {
        this.montantDS = montantDS;
    }


    public List<DotationRubrique> getListeDotationRS() {
        return listeDotationRS;
    }
    
    public void afficher(){
        System.out.println("  "+ this.anneeDS + " - " + this.getMontantDS()+ " ");
    }
    
    public boolean isEtatDS() {
        return etatDS;
    }

    public void setEtatDS(boolean etatDS) {
        this.etatDS = etatDS;
    }
    
    public boolean enregistrerDotation(float montant, Rubrique rubrique, RallongeDotationServ rallonge){
        
        float mt = 0;
        
        for (DotationRubrique dotationRub : listeDotationRS ){
            mt += dotationRub.getMontantDotR();
        }
        
        if(montantDS - mt>=montant){
             listeDotationRS.add(new DotationRubrique(montant,rubrique,rallonge));
             return true;
        }else{
            return false;
        }
        
    }
    
}
