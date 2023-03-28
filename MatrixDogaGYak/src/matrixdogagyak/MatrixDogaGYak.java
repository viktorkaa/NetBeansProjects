/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package matrixdogagyak;
import java.util.Random;
/**
 *
 * @author user3
 */
public class MatrixDogaGYak {

    /**
     * @param args the command line arguments
     */
    
    public static void kiirasMatrix(int[][] matrix) {
        int sor = matrix.length;
        int oszlop = matrix[0].length;

        for (int i = 0; i < sor; i++) {
            for (int j = 0; j < oszlop; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    //-kiírja a mátrixot visszafele
    public static void kiirasMatrixForditva(int[][] matrix) {
        int sor = matrix.length;
        int oszlop = matrix[0].length;

        for (int i = sor - 1; i >= 0; i--) {
            for (int j = oszlop - 1; j >= 0; j--) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    //-visszaadja a mátrix elemeinek összegét
    public static int matrixOsszege(int[][] matrix) {
        int sor = matrix.length;
        int oszlop = matrix[0].length;
        int szam = 0;

        for (int i = 0; i < sor; i++) {
            for (int j = 0; j < oszlop; j++) {
                szam += matrix[i][j];
            }
        }

        return szam;
    }

    //-eldönti, hogy több mint a fele páros szám e
    public static boolean matrixParosE(int[][] matrix) {
        int sor = matrix.length;
        int oszlop = matrix[0].length;

        for (int i = 0; i < sor; i++) {
            for (int j = 0; j < oszlop; j++) {
                if (matrix[i][j] % 2 != 0) {
                    return false;
                }
            }
        }
        return true;
    }
    
    //-megduplázza a mátrix minden elemét

    public static void duplaMatrix(int[][] matrix) {
        int sor = matrix.length;
        int oszlop = matrix[0].length;

        for (int i = 0; i < sor; i++) {
            for (int j = 0; j < oszlop; j++) {
                matrix[i][j] *= 2;
            }
        }
    }

    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        // Írj egy Java programot, 
        //ami létrehoz egy mátrixot (4 x 5), töltsd fel random számokkal.

        int j, i;
        int sor = 4;
        int oszlop = 5;
        int[][] matrix = new int[sor][oszlop];
        Random r = new Random();
        for (i = 0; i < 4; i++) {
            for (j = 0; j < 5; j++) {
                matrix[i][j] = r.nextInt(20);
                System.out.print(matrix[i][j] + "\t");
            }

            System.out.print("\n");
        }
        
        System.out.println("--------FELADAT-------");
        System.out.println("Matrix:");
        kiirasMatrix(matrix);
        
        System.out.println("--------FELADAT-------");
        System.out.println("Matrix fordítva:");
        kiirasMatrixForditva(matrix);
        
        System.out.println();
        System.out.println("--------FELADAT-------");
        System.out.println("Matrix összege:" + matrixOsszege(matrix));

        System.out.println();
        System.out.println("--------FELADAT-------");
        System.out.println("Van e benne páros szám::" + matrixParosE(matrix));

        System.out.println();
        System.out.println("--------FELADAT-------");
        System.out.println("Matrix elemek duplázva:");
        duplaMatrix(matrix);
        kiirasMatrix(matrix);
        
        System.out.println();
        System.out.println("--------VÉGE-------");
        
    }
}

