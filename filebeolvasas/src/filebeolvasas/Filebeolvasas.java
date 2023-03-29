/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package filebeolvasas;

import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.ArrayList;

/**
 *
 * @author user3
 */
public class Filebeolvasas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Olvasd be a szövegfile-ból, a tartalmat
        //Az általad választott módon olvasd be a txt-t.
        RandomAccessFile raf;
        String sor;
        ArrayList<String> cars = new ArrayList<>();
        try {
            raf = new RandomAccessFile("cars.txt", "r");
            int db = 0;
            sor = raf.readLine();
            while (sor != null) {
                cars.add(sor);
                db++;
                sor = raf.readLine();
            }
            raf.close();
        } catch (IOException e) {
            System.err.println("HIBA");
        }
        for (int i = 0; i < cars.size(); i++) {
            System.out.println(cars.get(i));
        }

         try{
            raf = new RandomAccessFile("carsout.txt","rw");
                   
            for( String i : cars ){
                if(i.startsWith("F")){
                    raf.writeBytes(i+"\n");
                }
            }
        }
        catch( IOException e ){
          System.err.println("HIBA");
        }
    }
}



