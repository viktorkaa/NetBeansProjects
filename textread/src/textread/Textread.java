package textread;

import java.io.*;
import java.io.RandomAccessFile;

public class Textread {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        RandomAccessFile raf;
        String sor;
        String[] nevek = new String[6];
        try {
            raf = new RandomAccessFile("nevek.txt", "r");
            int db = 0;
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
