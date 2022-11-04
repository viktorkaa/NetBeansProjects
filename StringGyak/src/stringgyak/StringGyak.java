/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stringgyak;

import static java.lang.Integer.parseInt;
import java.util.Scanner;
/**
 *
 * @author user3
 */
public class StringGyak {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    
    //FELADAT: Vad Alma nevét szedjük ki a szövegből, 
    //és csupa nagybetűs formátumban tároljuk el a nev nevű változóban
    
    String nev, szoveg, email;
        int i, nevKezd = 0, nevVeg = 0;
        
        szoveg = "A Diak osztaly objektuma (Vad Alma Korte) peldanyositas utjan jon letre.";
        
        nevKezd = szoveg.indexOf('(');
        nevVeg = szoveg.indexOf(')');
        nev = szoveg.substring(nevKezd + 1, nevVeg).trim().toUpperCase();
        
        System.out.println(nev);
        System.out.println(nev.replace("ALMA", "KORTE"));
        
        email = nev.toLowerCase().replace(" ", ".").concat(".2022i@bankitatabanya.hu");
        System.out.println(email);
        
    }
}

//1 szoveg.lenght
//2 szoveg.startsWith / indexOf
//3 
//4 szoveg.contains("lúd")
//5 szoveg.indexOf
//6 szoveg.repclace("lúd", "veréb")
//7

