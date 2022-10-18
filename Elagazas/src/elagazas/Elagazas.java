/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package elagazas;

/**
 *
 * @author user3
 */
public class Elagazas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // egyágú elágazás
        int szam = 20;
        if (szam > 20){
            System.out.println("Nagyobb");
            System.out.println("És a szám duplája:" +szam*2);
        }
       
        
        //kétágú elágazás
        if (szam > 20){
            System.out.println("Nagyobb");
            System.out.println("És a szám duplája:" +szam*2);
        }
        else {
            System.out.println("Nem nagyobb");
        }
        
        //többágú
       
            
        //sokágú
        int honap = 11;
        switch ( honap ) {
            case 1: System.out.println("Január"); break;
            case 2: System.out.println("Február");break;
            case 3: System.out.println("Március");break;
            case 4: System.out.println("Április");break;
            case 5: System.out.println("Május");break;
            case 6: System.out.println("Junius");break;
            case 7: System.out.println("Juliu");break;
            case 8: System.out.println("Augusztus");break;
            case 9: System.out.println("Szeptermber");break;
            case 10:System.out.println("Október");break;
            case 11:System.out.println("November");break;
            default:System.out.println("Nem meghatározható");
        }
        
        //Random karakter generálása
        //a-tól z-ig.Random r = new Random();
        int randomCharacterCode = (int)(Math.random() * 26) + 97; //97-122
        System.out.println(randomCharacterCode);
        System.out.println((char)randomCharacterCode);
      
       
       
}
        
    } 
   97 122
 
}
