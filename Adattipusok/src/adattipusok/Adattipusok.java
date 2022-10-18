/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package adattipusok;

/**
 *
 * @author user3
 */
public class Adattipusok {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // egész számok
        byte homerseklet = 19;
        short magassag = 165;
        int fizetes = 850000;
        long nyeremeny = 2500000000L;
        
        // valós számok
        float tomeg = 4333.569874521F;
        double ezEgyValosSzam = 22555447778.02569874;
        
        //karakter 
        char egyBetu = 'k';
        char masikBetu = '\u0041'; // a karakter Unicode-ja hexadecimálisan.
        
        //logikai
        boolean vane = false;
        
        //változó értékeinek kiiratása
     
        System.out.println(homerseklet);
        System.out.println(magassag);
        System.out.println(fizetes);
        System.out.println(nyeremeny);
        System.out.println(tomeg);
        System.out.println(ezEgyValosSzam);
        System.out.println(egyBetu);
        System.out.println((int)masikBetu);
        System.out.println(vane);
        
        //adattípusok tartománya
        int byteAlja = Byte.MIN_VALUE;
        int byteTeteje = Byte.MAX_VALUE;
        
        
        System.out.println("A Integer adattípus tartománya" + byteAlja + "értéktől" + byteTeteje + "értékig terjed.");
        System.out.println("A Intege adattípus tartománya" + Integer.MIN_VALUE+ "értéktől" + Integer.MAX_VALUE +  "értékig terjed.");
        System.out.println("A byte adattípus tartománya" + Byte.MIN_VALUE + "értéktől" + Byte.MAX_VALUE +  "értékig terjed.");
        System.out.println("A short adattípus tartománya" + Byte.MIN_VALUE + "értéktől" + Byte.MAX_VALUE +  "értékig terjed.");
        System.out.println("A short adattípus tartománya" + Byte.MIN_VALUE + "értéktől" + Byte.MAX_VALUE +  "értékig terjed.");
        System.out.println("A short adattípus tartománya" + Byte.MIN_VALUE + "értéktől" + Byte.MAX_VALUE +  "értékig terjed.");
        System.out.println("A short adattípus tartománya" + Byte.MIN_VALUE + "értéktől" + Byte.MAX_VALUE +  "értékig terjed.");
    }
}
