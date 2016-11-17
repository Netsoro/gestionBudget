/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author 21611856
 */
public class Executer {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        // Creer des services 
        
        Service s1;
     
        s1 = new Service();
        s1.setIdserv(304);
       // s1.nomServ = "DRH";
        s1.setNomServ("DRH");
        s1.setDescServ("Direction des ressources humaines");
        
        DotationGlobalService d1,d2;
        
        d1 = new DotationGlobalService();
        d2 = new DotationGlobalService();
        
        d1.setAnnee(2016);

     //   d1.annee = 2016;
        d1.setDotationGS(1000);
        
         
        d2.setAnnee(2017);
        d2.setDotationGS(1100);
        
        s1.getListeDotationService().add(d1);
        s1.getListeDotationService().add(d2);
        s1.enregistrerNouvelleDotation(2018,50000);
        //System.out.println(s1.getListeDotationService().get(0));
        System.out.println(s1);
        
        
    }
    
}
