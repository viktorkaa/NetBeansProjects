/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package filebeolvasas2;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author user3
 */
public class file4 {
    public static void main(String[] args) {
        ArrayList<String> adatok = new ArrayList<String>();
        
         ArrayList<String> dataList = new ArrayList<>();

        try {
            File file = new File("adat1.txt");
            Scanner scanner = new Scanner(file);

            while (scanner.hasNextLine()) {
                String data = scanner.nextLine();
                dataList.add(data);
            }

            scanner.close();
        } catch (IOException e) {
            System.out.println("HIBA! a fájl nem található.");
            e.printStackTrace();
        }

        System.out.println(dataList);
    }
}

