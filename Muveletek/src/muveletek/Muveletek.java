/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package muveletek;

/**
 *
 * @author user3
 */
public class Muveletek {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Matematikai műveletek
        //két operandusú
        int a = 43;
        int b = 35;
        
        int osszeg = a + b;
        int kulonbseg =  a - b;
        int szorzat =   a * b;
        double hanyados = (double)a /(double)b;
        int maradek = a % b; // az/b osztás maradékát adja
        
        System.out.println(osszeg);
        System.out.println(kulonbseg);
        System.out.println(szorzat);
        System.out.println(hanyados);
        System.out.println(maradek);
        
        
        // egy operandusó
        int c = 5;
        c++; //c értékének növelése 1-gyel poftix formában
        
        
        System.out.println(c); // c értéke 6
        System.out.println(c++); //c értéke 6 majd növeli 1-gyel ->
        System.out.println(++c); 
        
        
        int d = 3;
        d--; //2 
         System.out.println(--d); //1
         
        //relációs műveletek
        int x = 9;
        int y = 14;
        
        System.out.println(x > y); //false
        System.out.println(x >= y); //true
        System.out.println(x < y);// false
        System.out.println(x <= y);//true
        System.out.println(x == y);//false
        System.out.println(x != y);//true
        
        //logikai
        
        boolean t = true;
        boolean f = false;
        
        System.out.println(t && f);//ÉS művelet
        System.out.println(t || f);//VAGY művelet
        System.out.println(!t);//negáció (tagadás) művelet
        
        //értéktagadó műveletek
        int k;
        
        k = 3;
        k = k + 1;
        k  += 1; //összevontuk a műveleteket
        
        k -= 1;
        k *= 2;
        k /= 4;
        k %= 2;
        
        System.out.println(k);
        
        //összetett műveletek
        int z = 12;
        //3-mal és 4 el IS osztható-e
        System.out.println((z % 3 == 0) && (z % 4 == 0)); //true
        //3-mal vagy 4 osztható-e
        System.out.println((z % 3 == 0) || (z % 4 == 0)); //true
        //3-mal és 5-el osztható-e
        System.out.println((z % 3 == 0) && !(z % 5 == 0)); //false
        //5-tel osztható nem negatív szám-e
        System.out.println((z % 5 == 0) && !(z > 0)); //true
        
        
    }
    
}
