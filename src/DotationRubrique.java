
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author 21612584
 */
public class DotationRubrique {
    private float montantDotR;
    private Rubrique rubriqueConcerner;
    private RallongeDotationServ rallongeCouvrir;

    private final List<RallongeDotationServ> listRallongeDs;
    private final List<DepenseRubrique> listeDepenseRubrique;

    public DotationRubrique(float dotationRS, Rubrique rubrique, RallongeDotationServ rallongeCouvrir) {
        this.montantDotR = dotationRS;
        this.rubriqueConcerner = rubrique;
        this.rallongeCouvrir = rallongeCouvrir;
        this.listeDepenseRubrique =new ArrayList<DepenseRubrique>();
        this.listRallongeDs = new ArrayList<RallongeDotationServ>();

    }



    @Override
    public String toString() {
        return "DotationRespService{" + "dotationRS=" + montantDotR + '}';
    }

    
    
    public float getMontantDotR() {
        return montantDotR;
    }

    public void setMontantDotR(float montantDotR) {
        this.montantDotR = montantDotR;
    }

    public Rubrique getRubriqueConcerner() {
        return rubriqueConcerner;
    }

    public void setRubriqueConcerner(Rubrique rubriqueConcerner) {
        this.rubriqueConcerner = rubriqueConcerner;
    }

    public List<DepenseRubrique> getListeDepenseRubrique() {
        return listeDepenseRubrique;
    }
    
    public RallongeDotationServ getRallongeCouvrir() {
        return rallongeCouvrir;
    }

    public void setRallongeCouvrir(RallongeDotationServ rallongeCouvrir) {
        this.rallongeCouvrir = rallongeCouvrir;
    }
    
    
    public float calculDispoRubrique(){
        float montant = 0;
        for(DepenseRubrique depenseRubrique :listeDepenseRubrique ){
            montant+=depenseRubrique.getMontantDepR();
        }
        
        return montantDotR - montant;
    }
    
    public DepenseRubrique enregistrerDepense(float montatDep){
        DepenseRubrique depenseR= new DepenseRubrique(montatDep, new Date());
        listeDepenseRubrique.add(depenseR);
        return depenseR;
    }
    
    /**
     * @return the listRallongeDs
     */
    public List<RallongeDotationServ> getListRallongeDs() {
        return listRallongeDs;
    }
    
    public RallongeDotationServ addNewRallonge(float montant){
        RallongeDotationServ rallonge = new RallongeDotationServ(montant, new Date());
        this.getListRallongeDs().add(rallonge);
        return rallonge;
    }



    
}
