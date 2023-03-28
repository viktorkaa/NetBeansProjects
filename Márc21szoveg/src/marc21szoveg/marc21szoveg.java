/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package márc21szoveg;

import java.io.*;
import java.io.RandomAccessFile;

/**
 *
 * @author user3
 */
public class Márc21szoveg {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        RandomAccessFile raf;
        String sor;
        String[] nevek = new String[6];

        try {
            raf = new RandomAccessFile("nevek.txt", "r");
            int db = 0;                 //Számlálót indítok
            sor = raf.readLine();       //Számlálót indítok

            while (sor != null)         //addig fusson, amíg a sor nem null
            {      
                nevek[db] = sor;        //a neveket tartalmazó tömbbe teszi a kiolvas
                db++;                   //számláló növelése (a while NEM növeli)
                sor = raf.readLine();   //beolvasom a következő sort
            }

            raf.close();
        } catch (IOException e) {
            System.err.println("HIBA");
        }
        for (int i = 0; i < nevek.length; i++){
            System.out.println(nevek[i] + " ");
        }
        int[] tombb = { 1, 2, 3, 4, 5 };
    }
}
