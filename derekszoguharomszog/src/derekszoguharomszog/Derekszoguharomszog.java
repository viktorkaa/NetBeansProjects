/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package derekszoguharomszog;

import java.util.*;

/**
 *
 * @author user3
 */
public class Derekszoguharomszog {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a, b, c;
        System.out.println("Adja meg a háromszög első oldalát!");
        a = in.nextInt();
        System.out.println("Adja meg a háromszög második oldalát!");
        b = in.nextInt();
        System.out.println("Adja meg a háromszög harmadik oldalát!");
        c = in.nextInt();

        if (a * a == (b * b) + (c * c)) {
            System.out.println("Ez egy derékszögű háromszög.");
        } else {
            System.out.println("Ez nem egy derékszögű háromszög.");
        }

    }
}
