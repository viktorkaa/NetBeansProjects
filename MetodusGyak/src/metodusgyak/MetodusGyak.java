/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package metodusgyak;

import java.util.Scanner;

/**
 *
 * @author user3
 */
public class MetodusGyak {

    static final int OUT = 0;
    static final int IN = 1;

    // returns number of words in str
    static int countWords(String str) {
        int state = OUT;
        int wc = 0;  // word count
        int i = 0;

        // Scan all characters one by one
        while (i < str.length()) {
            // If next character is a separator, set the
            // state as OUT
            if (str.charAt(i) == ' ' || str.charAt(i) == '\n'
                    || str.charAt(i) == '\t') {
                state = OUT;
            } // If next character is not a word separator
            // and state is OUT, then set the state as IN
            // and increment word count
            else if (state == OUT) {
                state = IN;
                ++wc;
            }

            // Move to next character
            ++i;
        }
        return wc;
    }

    // Driver program to test above functions
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Három szám közül visszaadja a legkissebbet.
        //Visszaadja egy string középső értékét (1 vagy 2 középső karakter lehet)
        int a = 20;
        int b = 10;
        int c = 30;

        int legkissebb;

        if (a < b) {
            if (c < a) {
                legkissebb = c;
            } else {
                legkissebb = a;
            }
        } else {
            if (b < c) {
                legkissebb = b;
            } else {
                legkissebb = c;
            }
        }

        System.out.println(legkissebb + " A legkissebb.");

//Visszaadja egy string magánhangzóinak számát.
        int szam = 0;
        String str = "Adjon meg egy mondatot";
        Scanner sc = new Scanner(System.in);
        String mondat = sc.nextLine();

        for (int i = 0; i < mondat.length(); i++) {
            char ch = mondat.charAt(i);
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' || ch == ' ') {
                szam++;

                System.out.println("Az ön mondatában található magánhangzók száma: " + szam);
                System.out.println("Az ön mondatában található magánhangzók száma: " + countWords(str));
            }

            //Visszaadja, hány szó van egy stringben
        }
    }
}

//visszaadja, hogy egy string érvényes jelszó-e
// min-10 hosszú
//betű és számjegy
//min2 számjegyet tartalmaz

