/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arraylistpelda;

import java.util.ArrayList;

/**
 *
 * @author user3
 */
public class ArrayListPelda {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList<Integer> szamok = new ArrayList<>();
        int paros_szam = 0, paratlan_szam = 0;

        for (int i = 0; i < 10; i++) {
            szamok.add((int) (Math.random() * 20) + 1);
        }
        System.out.println("A generált számok: " + szamok.size());
        for (int i = 0; i < szamok.size(); i++) {
            System.out.print(szamok.get(i) + " ");
        }
        System.out.println();
        szamok.add(25);
        for (int i = 0; i < szamok.size(); i++) {
            System.out.print(szamok.get(i) + " ");

        }
        System.out.println();
    
System.out.println ("Páros: " +paros_szam +"Páratlan:" + paratlan_szam);

    }
}

    

    

// páros számok db száma
//add mit adok hozzá
//size:darbszám
//get hányadik elem
//irasd ki
