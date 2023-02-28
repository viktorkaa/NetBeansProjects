/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package feb.pkg28.gyakorlás.dolgozatra;

import java.util.Random;

/**
 *
 * @author user3
 */
public class FEB28GyakorlásDolgozatra {

    private int[][] matrix;
    int sor = 4;
    int oszlop = 5;

    // metódus, amely feltölti a mátrixot random számokkal 65 és 69 között
    public void randomSzámokFeltöltése() {
        Random random = new Random();
        for (int i = 0; i < sor; i++) {
            for (int j = 0; j < oszlop; j++) {
                matrix[i][j] = random.nextInt(5) + 65;
            }
        }
    }

    // metódus, amely kiszámolja a sorok maximumát és visszaadja egy tömbben
    public int[] SorMaxKiszámítása() {
        int[] sorMax = new int[sor];
        for (int i = 0; i < sor; i++) {
            int max = Integer.MIN_VALUE;
            for (int j = 0; j < oszlop; j++) {
                if (matrix[i][j] > max) {
                    max = matrix[i][j];
                }
            }
            sorMax[i] = max;
        }
        return sorMax;
    }

    // metódus, amely kiszámolja az oszlopok minimumát és visszaadja egy tömbben
    public int[] OszlopMinKiszámítása() {
        int[] oszlopMin = new int[oszlop];
        for (int i = 0; i < oszlop; i++) {
            int min = Integer.MAX_VALUE;
            for (int j = 0; j < sor; j++) {
                if (matrix[j][i] < min) {
                    min = matrix[j][i];
                }
            }
            oszlopMin[i] = min;
        }
        return oszlopMin;
    }

    //Mátrixok összege
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

    //Random mátrix létrhozása (random számok generálása)
    public static void GeneralasMatrix(int[][] matrix) {
        int sor = matrix.length;
        int oszlop = matrix[0].length;

        for (int i = 0; i < sor; i++) {
            for (int j = 0; j < oszlop; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    //Hányados létrhozása
    public static double[][] matrixOsztas(int tombMatrix[][], int tombMatrix2[][], double tombEredmeny[][]) {
        for (int i = 0; i <= 3; i++) {
            for (int j = 0; j <= 3; j++) {
                tombEredmeny[i][j] = (double) tombMatrix[i][j] / tombMatrix2[i][j];
            }
        }
        return tombEredmeny;
    }

    //Van e soronként egymás melleti szám.
    public static boolean egyformaszam(int[][] matrix) {
        int i = 0;
        int j = 0;
        boolean egyforma = false;
        while (!egyforma || i < matrix.length) {
            while (!egyforma || j < matrix.length - 1) {
                if (matrix[i][j] == matrix[i][j + 1]) {
                    egyforma = true;
                    System.out.println("Igen");
                } else {
                    System.out.println("Nem");
                }
                j++;
            }
            i++;
        }
        return egyforma;
    }

    //Készíts stasztikát, hogy hány darab 65, 66 67, 68, 69 szám van a mátrixban.
    public static int[] statistic(int[][] matrix) {
        int [] stat = new int[256];
        for (int i = 0; i< matrix.length; i++){
            for (int j = 0; j<matrix.length; j++){
                int item = matrix [i][j];
                stat[item]++;
            }
        }
        return stat;
    }
    /**
     * @param args the command line arguments
     */
    // main metódus a teszteléshez
    public static void main(String[] args) {
        Matrix matrix = new Matrix();
        matrix.randomSzámokFeltöltése();
        int[][] matrixArray = matrix.getMatrix();

        // mátrix kiírása
        System.out.println("Matrix:");
        for (int[] sor : matrixArray) {
            for (int szam : sor) {
                System.out.print(szam + " ");
            }
            System.out.println();
        }

        // sorok maximumának kiírása
        int[] sorMax = matrix.SorMaxKiszámítása();
        System.out.println("Sorok minimumának kiiratása:");
        for (int szam : sorMax) {
            System.out.print(szam + " ");
        }
        System.out.println();

        // oszlopok minimumának kiírása
        int[] oszlopMin = matrix.OszlopMinKiszámítása();
        System.out.println("Oszlopok minimumának kiiratása:");
        for (int szam : oszlopMin) {
            System.out.print(szam + " ");
        }
        System.out.println();
        System.out.println("Matrix összege:" + matrixOsszege(matrix));
        // Szorgalmi:Mátrixok hányadosa
        System.out.println("Hányados");
    }

    for (int i = 0; i < statResult.length; i++){
    System.out.println(i+1 + ":" + statResult[i] + '');
    
    
}
    //Szorgalmi:Jelenísd meg 2 tizedessel.
    //Készíts stasztikát, hogy hány darab 65, 66 67, 68, 69 szám van a mátrixban.
    
}
