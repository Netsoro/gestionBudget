
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
public class Service {
    //attribut propres 
    private int idserv;
    private String nomServ;
    private String descServ;
    private List<DotationGlobalService> listeDotationService;
    
    
    public Service (){
        listeDotationService = new ArrayList<DotationGlobalService> ();
    }
    
    public Service (int idserv, String nomServ, String descServ ){
        listeDotationService = new ArrayList<DotationGlobalService> ();
        this.idserv =idserv;
        this.nomServ = nomServ;
        this.descServ =descServ;
    }

    /**
     * @return the idserv
     */
    public int getIdserv() {
        return idserv;
    }

    /**
     * @param idserv the idserv to set
     */
    public void setIdserv(int idserv) {
        this.idserv = idserv;
    }

    /**
     * @return the nomServ
     */
    public String getNomServ() {
        return nomServ;
    }

    /**
     * @param nomServ the nomServ to set
     */
    public void setNomServ(String nomServ) {
        this.nomServ = nomServ;
    }

    /**
     * @return the descServ
     */
    public String getDescServ() {
        return descServ;
    }

    /**
     * @param descServ the descServ to set
     */
    public void setDescServ(String descServ) {
        this.descServ = descServ;
    }

    /**
     * @return the listeDotationService
     */
    public List<DotationGlobalService> getListeDotationService() {
        return listeDotationService;
    }

    /**
     * @param listeDotationService the listeDotationService to set
     */
    public void setListeDotationService(List<DotationGlobalService> listeDotationService) {
        this.listeDotationService = listeDotationService;
    }
    
    @Override
    public String toString(){
        return "Identifiant service : "+ idserv+ "\nNom service : "+ nomServ+
                "\nDescription service : "+ descServ;
    }
    
    public DotationGlobalService enregistrerNouvelleDotation(int annee, float montant){
        DotationGlobalService nvelleDot = new DotationGlobalService(annee, montant);
        this.getListeDotationService().add(nvelleDot);
        return nvelleDot;
    }
    
    
        
    public DotationGlobalService getDotationGlobalServiceByYear(int annee){
        
        for (DotationGlobalService dotationGS : listeDotationService ){
             if(dotationGS.getAnnee() == annee) return dotationGS;
        }
        return null;
    }
    
}
