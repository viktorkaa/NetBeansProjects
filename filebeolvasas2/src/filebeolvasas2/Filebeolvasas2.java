/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package filebeolvasas2;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author user3
 */
public class Filebeolvasas2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Olvassa be a számokat a txt-ből.
        //Adja össze a számok összegét a txt fájlból.
        File file = new File("adat1.txt");
        try {
            Scanner scanner = new Scanner(file);
            int szam = 0;
            while (scanner.hasNextInt()) {
                szam += scanner.nextInt();
            }
            System.out.println("Az összeg: " + szam);
        } catch (IOException e) {
            System.out.println("HIBA! a fájl nem található.");
        }
        
    }
}
