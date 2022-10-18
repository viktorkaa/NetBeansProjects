/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package myfirst;

/**
 *
 * @author user3
 */
public class beolvasas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     //Random szám generálás:
     //(int)(Math.random() * intervallum_mérete) + alsó;
    
     int randomSzam = (int)(Math.random() * 21) + 10; //10-20 közötti szám.
     System.out.println(randomSzam);
     
     int randomSzam2 = (int)(Math.random() * -55) + 15; //10-20 közötti szám.
     System.out.println(randomSzam2);
     
     int randomSzam3 = (int)(Math.random() * -40) + 5; 
     System.out.println(randomSzam3);
     
     int randomSzam4 = (int)(Math.random() * 60) + 105; 
     System.out.println(randomSzam4);
    }
    
    
}
