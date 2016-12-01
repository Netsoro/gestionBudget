
import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

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
        
        /* version 1
        for (DotationGlobalService dotationGS : listeDotationService ){
             if(dotationGS.getAnnee() == annee) return dotationGS;
        }
        
        */
        
       
        int i = 0;
        DotationGlobalService dotationGS =null;
        while (i<listeDotationService.size()&& dotationGS == null){
           
            if(listeDotationService.get(i).getAnneeDS() == annee){
                dotationGS = listeDotationService.get(i);
            }
            else{
                i++;

            }
        }
        /*
        
        ListIterator<DotationGlobalService> it = listeDotationService.listIterator();
        DotationGlobalService dotationGS =null;
        DotationGlobalService dotationRecherche = null;
        while (it.hasNext() && dotationGS == null){
            
            dotationGS = it.next();
            if(dotationGS.getAnnee() == annee){
                dotationRecherche = dotationGS ;
            }    
        }
        */
        
        return dotationGS;
    }
    
    void afficher (){
        System.out.println("IdService : "+this.idserv+ "\nNom sevice : "+ this.nomServ);
        int i = 1;
        for (DotationGlobalService dotationGS : listeDotationService ){
            //System.out.println("Dotiaion n ° : " +i+ " => "+ dotationGS);
            dotationGS.afficher();
            i++;
        }
    }
    
}
