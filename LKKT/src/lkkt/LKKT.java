/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lkkt;
import java.util.Scanner;
import java. util. *;

/**
 *
 * @author user3
 */
public class LKKT {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("/-/-/-/-/1.FELADAT/-/-/-/-/");
    int a, b, max, step, lcm = 0;
      Scanner sc = new Scanner(System.in);
      System.out.println("Adja meg az első számot :");
      a = sc.nextInt();
      System.out.println("Adja meg a második számot :");
      b = sc.nextInt();

      if(a > b){
         max = step = a;
      }
      else{
         max = step = b;
      }

      while(a!= 0) {
         if(max % a == 0 && max % b == 0) {
            lcm = max;
            break;
         }
         max += step;
      }
      System.out.println("A legkissebb közös többszörösük:: "+lcm);
      
      
      //Kérjünk be egy diák teljes nevét a fullName változóba!
      System.out.println("/-/-/-/-/2.FELADAT/-/-/-/-/");
      System.out.println("Kérem adja meg teljes nevét:");
      Scanner bill = new Scanner (System.in);
      String fullName = bill.nextLine();
      System.out.println(fullName);
      
      //Szedjük szét a nevet firstName és lastName változóba!
      System.out.println("/-/-/-/-/3.FELADAT/-/-/-/-/");
      Scanner scan = new Scanner(System.in);
        System.out.println("Kérem adja meg a Keresztnevét: ");
        String lastName = scan.nextLine();
        System.out.println("Kérem adja meg a vezetéknevét: ");
        String firstName = scan.nextLine();
        System.out.println("A tanuló teljes neve" + firstName + " " + lastName);

      //Kérjük be az osztály azonosítóját a classId változóba.
      System.out.println("/-/-/-/-/4.FELADAT/-/-/-/-/");
      String classId;
      System.out.println("Kérem adja meg az azonosítóját:");
      classId = bill.nextLine();
      if (classId.charAt (4) =='e')
          //Ha a betűjele "e"-vel kezdődik, alakítsuk "E"-re
        classId = classId.replaceFirst("e","E")
      System.out.println(classId);
      
      System.out.println("/-/-/-/-/5.FELADAT/-/-/-/-/");
      //Ha az évfolyam száma 2022-nél kissebb, akkor az osztályazonosító minden betűjele nagy.
      int evfolyam = Integer.parseInt(.substring(0,4));
      if (evfolyam < 2022) classId = classId.toUpperCase();
      System.out.println(classId);
      }  
      
   }


