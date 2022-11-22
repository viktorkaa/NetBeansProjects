/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package metodusgyak;

import java.util.Scanner;

/**
 *
 * @author user3
 */
public class MetodusGyak {

    static int wordcount(String string)  
        {  
          int count=0;  
      
            char ch[]= new char[string.length()];     
            for(int i=0;i<string.length();i++)  
            {  
                ch[i]= string.charAt(i);  
                if( ((i>0)&&(ch[i]!=' ')&&(ch[i-1]==' ')) || ((ch[0]!=' ')&&(i==0)) )  
                    count++;  
            }  
            return count;  
        }  
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    
        int a = 20;
        int b = 10;
        int c = 30;

        int legkissebb;

        if (a < b) {
            if (c < a) {
                legkissebb = c;
            } else {
                legkissebb = a;
            }
        } else {
            if (b < c) {
                legkissebb = b;
            } else {
                legkissebb = c;
            }
        }

        System.out.println(legkissebb + " A legkissebb.");


        int szam = 0;
        System.out.println ("Adjon meg egy mondatot");
        Scanner sc = new Scanner(System.in);
        String mondat = sc.nextLine();

        for (int i = 0; i < mondat.length(); i++) {
            char ch = mondat.charAt(i);
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' || ch == ' ') {
                szam++;

                System.out.println("Az ön mondatában található magánhangzók száma: " + szam);
                
            }
           

            
        }
    }
}

//visszaadja, hogy egy string érvényes jelszó-e
// min-10 hosszú
//betű és számjegy
//min2 számjegyet tartalmaz

