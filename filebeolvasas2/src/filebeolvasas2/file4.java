/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package filebeolvasas2;


import java.io.IOException;
import java.util.ArrayList;
import java.io.RandomAccessFile;

/**
 *
 * @author user3
 */
public class file4 {
    public static void main(String[] args) {
        RandomAccessFile raf;
        String sor;
        String[] nevek = new String[5];
        int osszeg = 0;
        ArrayList<Integer> szamok = new ArrayList<>();
        try {
            raf = new RandomAccessFile("adat1.txt", "r");
            sor = raf.readLine();  
            while (sor != null) {  
                szamok.add(Integer.parseInt(sor.strip()));
                             
                sor = raf.readLine();
            }

            raf.close();

        } catch (IOException e) {
            System.err.println("HIBA! a fájl nem található.");
        }
        for (int i = 0; i < szamok.size(); i++) {
            System.out.println(szamok.get(i) + " ");

        }
       
    }
   
}

