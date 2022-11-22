/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package metodusgyak2;

import java.util.Scanner;

/**
 *
 * @author user3
 */
public class Metodusgyak2 {
//1. Három szám közül visszaadja a legkisebbet.

    public static double legkisebb(double a, double b, double c) {
        if (a <= b && a <= c) {
            return a;
        } else if (b <= a && b <= c) {
            return b;
        } else if (c <= a && c <= b) {
            return c;
        }
        return a;
    }

    //2. Visszaadja egy string középső karakterét. (1 vagy 2 középső karakter lehet)
    public static String kozep(String str) {
        int pozicio;
        int hossz;
        if (str.length() % 2 == 0) {
            pozicio = str.length() / 2 - 1;
            hossz = 2;
        } else {
            pozicio = str.length() / 2;
            hossz = 1;
        }
        return str.substring(pozicio, pozicio + hossz);

    }
//3. Visszaadja egy string angol magánhangzóinak számát

    public static int maganhang(String mon) {
        int count = 0;
        for (int i = 0; i < mon.length(); i++) {
            if (mon.charAt(i) == 'a' || mon.charAt(i) == 'e' || mon.charAt(i) == 'i'
                    || mon.charAt(i) == 'o' || mon.charAt(i) == 'u') {
                count++;
            }
        }
        return count;
    }
//4. Visszaadja hány szó van egy stringbnen
//5. Visszaadja hány szó van egy stringbnen
//6. A 3 kapott paraméterről eldönti, hogy növekvő sorban vannak-e.

    public static int novekvo(int szamok[], int n) {
        if (n == 1 || n == 0) {
            return 1;
        }
        if (szamok[n - 1] < szamok[n - 2]) {
            return 0;
        }
        return novekvo(szamok, n - 1);
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner bill = new Scanner(System.in);
        System.out.println("------Első feladat------");
        System.out.println("Adjon meg egy számot: ");
        int a = bill.nextInt();
        System.out.println("Adjon meg még egy számot: ");
        int b = bill.nextInt();
        System.out.println("Adja meg a harmadik számot: ");
        int c = bill.nextInt();

        System.out.println("A legkisebb szám: " + legkisebb(a, b, c));

        System.out.println("------Második feladat------");
        System.out.println("Adjon meg egy tetszőleges szót: ");
        String str = bill.next() + bill.nextLine();
        System.out.println("A középső karakter(ek): " + kozep(str));

        System.out.println("------Harmadik feladat------");
        System.out.println("Adjon meg egy tetszőleges mondatot: ");

        System.out.println("------Harmadik feladat------");
        System.out.println("Adjon meg egy tetszőleges szót: ");
        String mon = bill.next() + bill.nextLine();
        System.out.println("A mahánhangzóinak száma: " + maganhang(mon));

        System.out.println("------Negyedik feladat------");
        System.out.println("Adjon meg egy tetszőleges szót: ");

        int szamok[] = {2, 45, 3};
        int n = szamok.length;
        if (novekvo(szamok, n) != 0) {
         
            System.out.println("Igen");
        } else {
            System.out.println("Nem");
        }

    }
}
