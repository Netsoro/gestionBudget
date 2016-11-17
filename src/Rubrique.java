
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
public class Rubrique {
  private int codeR;
  private String  LibR;
  private String descR;
  private List<DotationGlobalService> listeDotationServ;
  private List<DotationRubriqueService> listeDotationRespServ;

    public Rubrique(int codeR, String LibR, String descR, List<DotationRubriqueService> listeDotationRespServ) {
        this.codeR = codeR;
        this.LibR = LibR;
        this.descR = descR;
        this.listeDotationServ =  new ArrayList<DotationGlobalService> ();
        this.listeDotationRespServ =  new ArrayList<DotationRubriqueService> ();
    }

    @Override
    public String toString() {
        return "Rubrique{" + "codeR=" + codeR + ", LibR=" + LibR + ", descR=" + descR + '}';
    }

    
  
    /**
     * @return the codeR
     */
    public int getCodeR() {
        return codeR;
    }

    /**
     * @param codeR the codeR to set
     */
    public void setCodeR(int codeR) {
        this.codeR = codeR;
    }

    /**
     * @return the LibR
     */
    public String getLibR() {
        return LibR;
    }

    /**
     * @param LibR the LibR to set
     */
    public void setLibR(String LibR) {
        this.LibR = LibR;
    }

    /**
     * @return the descR
     */
    public String getDescR() {
        return descR;
    }

    /**
     * @param descR the descR to set
     */
    public void setDescR(String descR) {
        this.descR = descR;
    }

    /**
     * @return the listeDotationServ
     */
    public List<DotationGlobalService> getListeDotationServ() {
        return listeDotationServ;
    }

    /**
     * @param listeDotationServ the listeDotationServ to set
     */
    public void setListeDotationServ(List<DotationGlobalService> listeDotationServ) {
        this.listeDotationServ = listeDotationServ;
    }
  
}
