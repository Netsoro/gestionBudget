/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author 21611856
 */
public class ExecutesMethode {
    
    public static void main(String [] args){
        
            
        Service s1;
        s1 = new Service();
                s1.setIdserv(304);
       // s1.nomServ = "DRH";
        s1.setNomServ("DRH");
        s1.setDescServ("Direction des ressources humaines");
        
        s1.enregistrerNouvelleDotation(2016,1000);
        s1.enregistrerNouvelleDotation(2017,1100);
                
       // System.out.println(s1.getListeDotationService().get(0));
        
        System.out.println(s1.getDotationGlobalServiceByYear(2018));

    }
}
