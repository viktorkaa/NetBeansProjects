/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gyakorlásfeb21;

import java.util.Scanner;

/**
 *
 * @author user3
 */
public class GyakorlásFeb21 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Kérj be a felhasználótól egész számokat addig, amíg 0-t nem ír be.  
        Scanner scanner = new Scanner(System.in);
        int number;
        do {
            System.out.print("Kérlek, írj be egy egész számot (vagy 0-t a kilépéshez): ");
            number = scanner.nextInt();
            if (number != 0) {
                if (paratlan(number)) {
                    System.out.println(number + " prímszám.");
                } else {
                    System.out.println(number + " nem prímszám.");
                }
            }
        } while (number != 0);
    }

    //Írj egy metódust, ami eldönti, hogy prímszám-e.  
    public static boolean paratlan(int number) {
        if (number <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
}
