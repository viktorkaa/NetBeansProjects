/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dolgozat0301;

/**
 *
 * @author user3
 */
public class Dolgozat0301 {

    /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
     */

        public static void feltolt(int[][] matrix) {
            int randomSzam;

            for (int i = 0; i < matrix.length; i++) {
                for (int j = 0; j < matrix[0].length; j++) {
                    matrix[i][j] = randomSzam = (int) (Math.random() * 21) + 10;
                    System.out.print(matrix[i][j] + ", ");
                }
                System.out.println();
            }
        }

        public static void kivon(int[][] matrix) {
            int min = 31;
            int max = 0;

            for (int i = 0; i < matrix.length; i++) {
                max = 0;
                min = 31;

                for (int j = 0; j < matrix[0].length; j++) {
                    if (matrix[i][j] > max) {
                        max = matrix[i][j];
                    }
                    if (matrix[i][j] < min) {
                        min = matrix[i][j];
                    }

                }
                System.out.println((i + 1) + ". sor: " + (max - min));
            }
        }
        
        //public static boolean isPrime(int number) {
        //for (int i = 0; i < matrix.length; i++) {
                //for (int j = 0; j < matrix[0].length; j++) {

        
        //public static boolean prim(int[][] matrix) {
            //for (int i = 0; i < matrix.length; i++) {
                //for (int j = 0; j < matrix[0].length; j++) {
                        //if (isPrime(matrix[i][j] % k == 0)) {
                            //return true;
                        //}
                    //}
                    //return true;
        
        
        public static boolean prim(int[][] matrix) {
            int count = 0;
            int count2 = 0;

            for (int i = 0; i < matrix.length; i++) {
                for (int j = 0; j < matrix[0].length; j++) {
                    count = 0;
                    for (int k = 1; k < 30; k++) {
                        if (matrix[i][j] % k == 0) {
                            count++;
                        }
                    }
                    if (count == 2) {
                        count2++;
                    }

                }

            }
            if (count2 == 0) {
                return false;
            } else {
                return true;
            }
        }

        public static void holvan(int[][] matrix) {
            int count = 0;
            int count2 = 0;
            int count3 = 0;

            for (int i = 0; i < matrix.length; i++) {
                for (int j = 0; j < matrix[0].length; j++) {
                    count = 0;
                    for (int k = 1; k < 30; k++) {
                        if (matrix[i][j] % k == 0) {
                            count++;
                        }
                    }
                    if (count == 2) {
                        System.out.println((i + 1) + ". sor " + (j + 1) + ". oszlop");
                        System.out.println("(A szám: " + matrix[i][j] + " )");

                    }
                    break;

                }

            }
        }

        public static void main(String[] args) {
            int[][] matrix = new int[4][4];
            System.out.println("A mátrix: ");
            feltolt(matrix);
            System.out.println("Soronként a legkisebb és a legnagyobb szám külömbsége: ");
            kivon(matrix);
            System.out.println("Van a mátrixban prímszám?: ");

            if (prim(matrix) == true) {
                System.out.println("A mátrixban VAN prímszám");
            } else {
                System.out.println("A mátrixban NINCS prímszám");
            }
            System.out.println("Az első prímszám helye: ");
            holvan(matrix);

        }

    
}
