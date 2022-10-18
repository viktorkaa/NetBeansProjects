/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


package szamok;
import java.util.Scanner;
import static java.lang.Math.sqrt;

/**
 *
 * @author user3
 */
public class Szamok {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      Scanner bill = new Scanner(System.in);
//kérjünk be a felhasználótól.
        System.out.print("Adjon meg egy 0-nál nagyobb páros számot: ");
        int szam = bill.nextInt();
        while (!(szam > 0 && szam % 2 ==0)){
        szam = bill.nextInt();
        }
        System.out.println("A szám értéke: " + szam);
        
        
        //2.feladat
        System.out.print("-----2.FELADAT----- ");
        do{
            szam = bill.nextInt();
        }
        while (!(szam > 0 && szam % 2 ==0));
        System.out.print("Az értéke" +szam);
        
        //Számkitalálós 1-10 között.
       Scanner sc = new Scanner(System.in);
 
       
        int number = 1 + (int)(100 * Math.random());
                             
        int K = 5;
 
        int i, kerdes;
 
        System.out.println("UTASÍTÁS:Egy számot kell eltalálnia"+"1 és 10 között tippelhet"+
        "Találd ki a számot"
         + "");
 
        for (i = 0; i < K; i++) {
 
            System.out.println("Találd ki a számot :D");
 
            kerdes = sc.nextInt();
 
            if (number == kerdes) {
                System.out.println("GRATULÁLOK!!!!"+ "Kitaláltad a számot.");
                break;
            }
            else if (number > kerdes
                     && i != K - 1) {
                System.out.println("A szám "+ "nagyobb mint" + kerdes);
            }
            else if (number < kerdes
                     && i != K - 1) {
                System.out.println("A szám"+ " kevesebb" + number);
            }
        }
 
        if (i == K) {
            System.out.println("Tippek kimerültek + K próbatétel.");
            System.out.println("A szám " + number);
    }
}
    

