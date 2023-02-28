/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package harmasoperator;

import java.util.Scanner;

/**
 *
 * @author user3
 */
public class HarmasOperator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int num = 10;
        String decide;
        if (num < 20) {
            decide = "Kisebb";

        } else {
            decide = "Nagyobb";

        }
        System.out.println(decide);

        decide = (num < 20) ? "Kisebb" : "Nagyobb";
        System.out.println(decide);

        // 2.feladat-Kérjünk be a felhasználótól egy db karaktert, 
        //és döntse el hogy nagybetűs-e
        Scanner scanner = new Scanner(System.in);
        System.out.print("Kérem, adjon meg egy karaktert: ");
        char karakter = scanner.next().charAt(0);
        if (Character.isUpperCase(karakter)) {
            System.out.println("A(z) " + karakter + " egy nagybetű.");
        } else {
            System.out.println("A(z) " + karakter + " nem nagybetű.");
        }
        //Ezt egy kiiratásban valósísd meg
        String uzenet = "A(z) "  + karakter + " "  + (Character.isUpperCase(karakter) ? "egy nagybetű." : "nem nagybetű.");
        System.out.println(uzenet);
        
        //Kérjen be a felhasználótól egy hónapnak a számát. 
        //A Switch használatával mondjuk meg, hogy hány napos ez a hónap.
        System.out.println("Kérem, adja meg a hónap számát (1-12): ");
        int honap = scanner.nextInt();
        int napok = 0;

        switch (honap) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                napok = 31;
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                napok = 30;
                break;
            case 2:
                System.out.println("Kérem, adja meg az évszámot: ");
                int ev = scanner.nextInt();
                if ((ev % 4 == 0 && ev % 100 != 0) || ev % 400 == 0) {
                    napok = 29;
                } else {
                    napok = 28;
                }
                break;
            default:
                System.out.println("Érvénytelen hónapszám!");
                System.exit(0);
        }

        System.out.println(honap + ". hónap " + napok + " napos.");
    }
}
  
