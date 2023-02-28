/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gyakorlas1;

import java.util.Scanner;

/**
 *
 * @author user3
 */
public class Gyakorlas1 {

    public static double JovobeliBefektetesiErtek(double beruhazasosszege, double havikamatlab, int evek) {
        return beruhazasosszege * Math.pow(1 + havikamatlab, evek * 12);
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Adja meg a beruházás összegét(Ft): ");
        double beruházás = in.nextDouble();
        System.out.print("Adja meg a kamatlábat(%): ");
        double ertek = in.nextDouble();
        System.out.print("Írja be az évek számát: ");
        int ev = in.nextInt();

        ertek *= 0.01;
        System.out.println("Évek        JövőÉvek");
        for (int i = 1; i <= ev; i++) {
            int formazo = 19;
            if (i >= 10) {
                formazo = 18;
            }
            System.out.printf(i + "%" + formazo + ".2f\n", JovobeliBefektetesiErtek(beruházás, ertek / 12, i));
        }
    }
}
