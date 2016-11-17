
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
public class DotationRubriqueService {
    private float dotationRS;
    private DotationGlobalService dotationGlobalSetv;
    private Rubrique rubrique;
    List<RallongeDotationServ> listeRallongeDotationS;

    public DotationRubriqueService(float dotationRS, DotationGlobalService dotationGlobalSetv, Rubrique rubrique) {
        this.dotationRS = dotationRS;
        this.dotationGlobalSetv = dotationGlobalSetv;
        this.rubrique = rubrique;
        this.listeRallongeDotationS =new ArrayList<RallongeDotationServ>();
    }



    @Override
    public String toString() {
        return "DotationRespService{" + "dotationRS=" + dotationRS + '}';
    }

    
    
    public float getDotationRS() {
        return dotationRS;
    }

    public void setDotationRS(float dotationRS) {
        this.dotationRS = dotationRS;
    }

    public List<RallongeDotationServ> getListeRallongeDotationS() {
        return listeRallongeDotationS;
    }

    public void setListeRallongeDotationS(List<RallongeDotationServ> listeRallongeDotationS) {
        this.listeRallongeDotationS = listeRallongeDotationS;
    }
    
    
}
