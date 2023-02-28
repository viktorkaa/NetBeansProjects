/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sziget;

import java.util.Arrays;

/**
 *
 * @author user3
 */
public class Sziget {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //--------Első feladat--------
        //Hány sziget van
        int[] magassagok = {0, 0, 200, 548, 20, 0, 0, 0, 310, 980, 1280, 650, 102, 0, 0, 45, 0, 21, 65, 0, 0};
        int szigetSzam = 0;
        boolean elozoEltavolodas = false;
        for (int i = 0; i < magassagok.length; i++) {
            if (magassagok[i] > 0) {
                if (elozoEltavolodas) {
                    szigetSzam++;
                }
                elozoEltavolodas = false;
            } else {
                elozoEltavolodas = true;
            }
        }
        System.out.println("Szigetek száma: " + szigetSzam);

        //--------Második feladat--------
        //Melyik a legmagasabb pont
        int max = Arrays.stream(magassagok).max().getAsInt();
        System.out.println("A legmagasabb pont: " + max + " méter a szigetek közül.");

        //--------Ötödik feladat--------
        //Hol kezdődik az első sziget (hányadik egységnél)
        for (int i = 0; i < magassagok.length; i++) {
            if (magassagok[i] > 0) {
                System.out.println("Az első sziget a " + i + ". egységnél kezdődik.");
                break;
            }
        }
        //--------Harmadik feladat--------
        //Hol van a legmeredekebb emelkedő
        
        
        
        //--------Negyedik feladat--------
        //Van-e valamelyik szigeten völgy
    }
}
