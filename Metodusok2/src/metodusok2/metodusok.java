/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package metodusok2;

import java.util.*;

/**
 *
 * @author user3
 */
public class metodusok {

    //---------1.Feladat---------
    //Metódusok és osztályok helye
    public static double atlag(int szam1, int szam2) {
        double atl = (szam1 + szam2) / 2.0;
        return atl;
    }

    public static void main(String[] args) {
        System.out.println(atlag(4, 5));
    }
    //---------2.Feladat---------
    //Irassa ki ezt:
    //*****************
    //*   Feladat     *
    //*****************

    
        
            public static void abra() {

    {
        System.out.println("*****************");
            System.out.println("*    Feladat    *");
            System.out.println("*****************");

        }
        //---------3.Feladat---------
        //Kérjünk be a felhasználótól 2 számot. A kissebbik legyen egy 
        //tartomány alsó határa,a nagyobbik a felső.
        //a) Generáltassuk a tartományból egy random számot.
        //b) Hozzunk létre a függvény segítségével egy 20 elemű tömböt.
        {
            Scanner in = new Scanner(System.in);
            System.out.print("Adja meg az első számot : ");
            int max = 20;
            System.out.print("Adja meg a második számot : ");
            int min = 1;
        }
        Random randomNum = new Random();
        int showMe = min + randomNum.nextInt(max);
        System.out.println(showMe);
    }
