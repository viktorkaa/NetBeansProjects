/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package matrix0207;

/**
 *
 * @author user3
 */
public class Matrix0207 {

    public static void main(String[] args) {
        int[][] matrix = {{2, 9, 0, 7, 12}, {1, 0, 10, 9, 9}, {8, 9, 6, 5, 4}, {11, 2, 4, 5, 7}, {4, 1, 1, 1, 2}};
        System.out.println("Főátló összege: " + FoAtloOsszege(matrix));
        int[] ForditottElemek = {0, 0, 4, 4};
        ElemekFelcserelese(matrix, ForditottElemek);
        System.out.println("Mátrix elemcsere után: ");
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
        int[][] matrix2 = {{2, 9, 0, 7, 12}, {1, 0, 10, 9, 9}, {8, 9, 6, 5, 4}, {11, 2, 4, 5, 7}, {4, 1, 1, 1, 2}};
        System.out.println("A mátrixok egyenlőek: " + MatrixokEgyenloek(matrix, matrix2));
    }

    public static int FoAtloOsszege(int[][] matrix) {
        int sum = 0;
        for (int i = 0; i < matrix.length; i++) {
            sum += matrix[i][i];
        }
        return sum;
    }

    public static void ElemekFelcserelese(int[][] matrix, int[] indices) {
        int k = matrix[indices[0]][indices[1]];
        matrix[indices[0]][indices[1]] = matrix[indices[2]][indices[3]];
        matrix[indices[2]][indices[3]] = k;
    }

    public static boolean MatrixokEgyenloek(int[][] matrix1, int[][] matrix2) {
        if (matrix1.length != matrix2.length) {
            return false;
        }
        for (int i = 0; i < matrix1.length; i++) {
            if (matrix1[i].length != matrix2[i].length) {
                return false;
            }
            for (int j = 0; j < matrix1[i].length; j++) {
                if (matrix1[i][j] != matrix2[i][j]) {
                    return false;
                }
            }
        }
        return true;
    }

    //public static int[][] MatrixForditva(int[][] inputMatrix) {
        //int sor = inputMatrix.length;
        //int oszlop = inputMatrix[0].length;
        //int[][] forditottMatrix = new int[sor][oszlop];
        //return forditottMatrix;
    //}
}
