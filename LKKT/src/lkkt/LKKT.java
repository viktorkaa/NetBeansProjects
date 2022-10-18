/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lkkt;
import java.util.Scanner;
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
   }
}

