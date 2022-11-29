package metodusgyakorlas2;

import java.util.Scanner;

public class Metodusgyakorlas2 {
//1.Ellenőrzi, hogy egy egész szám minden számjegye páros e.

    static int szam_parosParatlan(int n) {
        int paros_szam = 0;
        int paratlan_szam = 0;
        while (n > 0) {
            int rem = n % 10;
            if (rem % 2 == 0) {
                paros_szam++;
            } else {
                paratlan_szam++;
            }
            n = n / 10;
        }

        if (paros_szam % 2 == 0
                && paratlan_szam % 2 != 0) {
            return 1;
        } else {
            return 0;
        }
    }
    //2.Három egész számot kér, és eldönti, 
    //hogy az egyik a másik kettő középpontja-e.

    public static boolean KozepsoSzamE(int x, int y, int z) {
        int max = Math.max(x, Math.max(y, z));
        int min = Math.min(x, Math.min(y, z));
        double kozepso_1 = (max + min) / 2.0;
        int kozepso_2 = x + y + z - max - min;
        return (kozepso_1 == kozepso_2);
    }
    //Ami egy n számot kap paraméterként, 
    //és kiír egy n x n-es mátrixot véletlen 0 ill. 1 számjegyekből.
    public static void matrix(int n) {
        for (int i = 0; i < n; i++) { //oszlop
            for (int j = 0; j < n; j++) { //sor
                System.out.print(Math.round(Math.random()) + "\t");
            }
            System.out.println();
        }
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //1.Ellenőrzi, hogy egy egész szám minden számjegye páros e.
        int n;
        n = 2335453;
        int t = szam_parosParatlan(n);

        if (t == 1) {
            System.out.println("A szám Páros. ");
        } else {
            System.out.println("A szám Páratlan. ");
        }

        //2.Három egész számot kér, és eldönti, 
        //hogy az egyik a másik kettő középpontja-e.
        Scanner in = new Scanner(System.in);
        System.out.print("Adja meg az első számot: ");
        int x = in.nextInt();
        System.out.print("Adja meg a második számot: ");
        int y = in.nextInt();
        System.out.print("Adja meg a harmadik számot: ");
        int z = in.nextInt();
        System.out.println(KozepsoSzamE(x, y, z));

        //Ami egy n számot kap paraméterként, 
        //és kiír egy n x n-es mátrixot véletlen 0 ill. 1 számjegyekből.
        int m = 5;
        matrix(m);
    }
}
