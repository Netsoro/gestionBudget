
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
    private int annee;
    private float dotationGS;
    private List<RallongeDotationServ> listRallongeDs;
    private List<Rubrique> listeRubrique;
    private List<DotationRubriqueService> listeDotationRS;
    
    public DotationGlobalService(){
        listRallongeDs = new ArrayList<RallongeDotationServ>();
        listeRubrique = new ArrayList<Rubrique>();
        listeDotationRS = new ArrayList<DotationRubriqueService>();
    }

    public DotationGlobalService(int annee ,float dotationGS ){
        this.annee = annee;
        this.dotationGS = dotationGS;
        listRallongeDs = new ArrayList<RallongeDotationServ>();
        listeRubrique = new ArrayList<Rubrique>();
        listeDotationRS = new ArrayList<DotationRubriqueService>();
    }

    @Override
    public String toString() {
        return "DotationGlobalService{" + "annee=" + annee + ", dotationGS=" + dotationGS + '}';
    }

    
  
    /**
     * @return the annee
     */
    public int getAnnee() {
        return annee;
    }

    /**
     * @param annee the annee to set
     */
    public void setAnnee(int annee) {
        this.annee = annee;
    }

    /**
     * @return the dotationGS
     */
    public float getDotationGS() {
        return dotationGS;
    }

    /**
     * @param dotationGS the dotationGS to set
     */
    public void setDotationGS(float dotationGS) {
        this.dotationGS = dotationGS;
    }

    /**
     * @return the listRallongeDs
     */
    public List<RallongeDotationServ> getListRallongeDs() {
        return listRallongeDs;
    }

    /**
     * @param listRallongeDs the listRallongeDs to set
     */
    public void setListRallongeDs(List<RallongeDotationServ> listRallongeDs) {
        this.listRallongeDs = listRallongeDs;
    }

    /**
     * @return the listeRubrique
     */
    public List<Rubrique> getListeRubrique() {
        return listeRubrique;
    }

    /**
     * @param listeRubrique the listeRubrique to set
     */
    public void setListeRubrique(List<Rubrique> listeRubrique) {
        this.listeRubrique = listeRubrique;
    }
    
}
