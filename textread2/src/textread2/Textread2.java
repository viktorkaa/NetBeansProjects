/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package textread2;
import java.io.*;
import java.io.RandomAccessFile;
/**
 *
 * @author user3
 */
public class Textread2 {

    /**
     * @param args the command line arguments
     */
    
    //Írjuk meg úgy, hogy a szám ne jelenjen meg.
    public static void main(String[] args) {
        RandomAccessFile raf;
        String sor;
        String[] nevek = new String[6];
        try {
            raf = new RandomAccessFile("szoveg.txt", "r");
            int db = 0;
            sor = raf.readLine();
            sor = raf.readLine();
            while (sor != null) {
                nevek[db] = sor;
                db++;
                sor = raf.readLine();
            }
            raf.close();
        } catch (IOException e) {
            System.err.println("HIBA");
        }
        for (int i = 0; i < nevek.length; i++) {
            System.out.println(nevek[i]);
        }
    }
}
    

