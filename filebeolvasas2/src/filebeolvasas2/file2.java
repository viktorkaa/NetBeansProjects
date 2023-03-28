/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package filebeolvasas2;

import java.io.IOException;
import java.io.RandomAccessFile;
/**
 *
 * @author user3
 */
public class file2 {

    public static void main(String[] args) {
        //Olvassa be a txt file-t
        //Ezutn irassa ki, de! for ciklussal a számokat.
        RandomAccessFile raf;
        String sor;
        Integer[] szamok = new Integer[5];
        try {
            raf = new RandomAccessFile("adat2.txt", "r");
            int db = 0;
            sor = raf.readLine();
            int elsoSor = Integer.parseInt(sor);
            sor = raf.readLine();
            for (int x = 0; x < elsoSor; x++) {
                szamok[db] = Integer.parseInt(sor);
                db++;
                sor = raf.readLine();
            }
            raf.close();
        } catch (IOException e) {
            System.err.println("HIBA! a fájl nem található.");
        }
        for (int i = 0; i < szamok.length; i++) {
            System.out.println(szamok[i]);
        }
    }
}
