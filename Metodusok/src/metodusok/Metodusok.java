/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package metodusok;

/**
 *
 * @author user3
 */
public class Metodusok {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String szoveg = "Ez egy tetszőleges szöveg";
        
        //szöveg hossza
        System.out.println(szoveg.length());
        
        //adott pozíción lévő karakter
        System.out.println(szoveg.charAt(5));
        
        //minden kisbetűs
        System.out.println(szoveg.toLowerCase());
        
        //minden nagybetűs
        System.out.println(szoveg.toUpperCase());
        
        //sor eleji és sorvégi szóköz levágása
        System.out.println(szoveg.trim());
        
        //összehasonlítás
        System.out.println(szoveg.compareTo("Ez egy tetszőleges szöveg."));
        System.out.println(szoveg.compareToIgnoreCase("ez egy tetszőleges szöveg."));
        System.out.println(szoveg.equals("Ez egy ..."));
        System.out.println(szoveg.equalsIgnoreCase("ez egy tetszőleges szöveg."));
        
        //összefűzés
        System.out.println(szoveg.concat("ez egy hozzáfűzött szöveg."));
        
        //tartalmazza-e 
        System.out.println(szoveg.contains("tetszőleges"));
        
        //végződik e
        System.out.println(szoveg.endsWith(" "));
    }
    
}
