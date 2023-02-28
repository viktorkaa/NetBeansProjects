/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package togyeriskaviktor;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author user3
 */
public class TogyeriskaViktor {

    public static boolean helyesFormatum(String email) {
        return email.contains("@");
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Kérje be a program a felhasználótól az email címét addig, amíg formailag nem megfelelő címet ad meg
        //---Sikeresen újrakéri.
        //Az ellenőrzéshez készíts egy saját metódust, ami visszaadja, hogy helyes vagy nem helyes a formátum
        //---Ha nem helyes, akkor újra kéri hogy írj egy címet.
        //A formátum akkor helyes, ha van benne @ jel
        //---Működik
        Scanner input = new Scanner(System.in);
        String emailCim;
        do {
            System.out.println("Kérlek add meg az email címed: ");
            emailCim = input.nextLine();
        } while (!helyesFormatum(emailCim));
        System.out.println("Az ön email címe amit megadott, formailag helyes.");

        ArrayList<Integer> lista = new ArrayList<>(5);
        Random rand = new Random();
        int i;

        // Tömb feltöltése random számokkal 10 és 20 között
        for (i = 0; i < 5; i++) {
            lista.add(rand.nextInt(11) + 10);
        }

        // Hány olyan szám van a listában, melyet egy tőle nagyobb szám követ?
        int osszeg = 0;
        for (i = 0; i < lista.size() - 1; i++) {
            if (lista.get(i) < lista.get(i + 1)) {
                osszeg++;
            }
        }
        System.out.println("Hány olyan szám van a listában, melyet egy tőle nagyobb szám követ? " + osszeg);

        // Vizsgáld meg, hogy a lista elemei növekvő sorrendben állnak-e
        boolean eredmeny = true;
        for (i = 0; i < lista.size() - 1; i++) {
            if (lista.get(i) > lista.get(i + 1)) {
                eredmeny = false;
                break;
            }
        }
        if (eredmeny) {
            System.out.println("A lista elemei növekvő sorrendben állnak.");
        } else {
            System.out.println("A lista elemei nem állnak növekvő sorrendben.");
        }
    }

}


