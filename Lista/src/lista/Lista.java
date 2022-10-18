/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lista;
import java.util.*; 
/**
 *
 * @author user3
 */
public class Lista {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Hozz létre egy 10 elemű integer tömböt.
        //Generáld le random számokkal az elemeit (1-10 közötti szám).
        //-összegeztd az elemeit
        //-számláld meg a páros számokat
        //-számláld meg a páros számokat
         
     
    System.out.println("☷☷☷☷☷☷☷☷1.Feladat☷☷☷☷☷☷☷☷");
      
    int[] tomb = new int[10];
    int parosszam = 0, paratlan = 0;
     
    for( int i = 0; i < tomb.length; i++ )
    {
      tomb[i] = (int)(Math.random() * 10) +1;
    }
     
    for( int i = 0; i < tomb.length; i++ )
    {
      System.out.println("Az lista elemei:" + tomb[i]);
    }
      System.out.println("☷☷☷☷☷☷☷☷2.Feladat☷☷☷☷☷☷☷☷");
    int osszeg = 0;
 
    for( int i = 0; i < tomb.length; i++ )
{
    if( tomb[i] % 2 == 0 )
      {
  {
    osszeg = osszeg + tomb[i];
  }
  System.out.println("A számok összege:" + osszeg);
  }
}
    System.out.println("☷☷☷☷☷☷☷☷3.Feladat☷☷☷☷☷☷☷☷");
    int parosszamok =0;
    for(int i = 0; i < tomb.length; i++) 
    {
        if(tomb[i] % 2 == 0){
            parosszam += 1;
        }   
    System.out.println("Ennyi páros szám volt benne:" + parosszam);
}
    System.out.println("☷☷☷☷☷☷☷☷4.Feladat☷☷☷☷☷☷☷☷");
    int max = 0;
 
for( int i = 1; i < tomb.length; i++ )
{
  if( tomb[i] > tomb[max] ) max = i;
}
 
  System.out.println("A tombben levo legnagyobb szam: "+tomb[max]);
  
   int min=0;
 
for( int i = 1; i > tomb.length; i++ )
{
  if( tomb[i] < tomb[max] ) max = i;
}
 
  System.out.println("A tombben levo legkissebbszam:"+tomb[min]);
 System.out.println("☷☷☷☷☷☷☷☷5.Feladat☷☷☷☷☷☷☷☷");
 int negggyeloszthato =0;
    for(int i = 0; i < tomb.length; i++) 
    {
        if(tomb[i] % 4 == 0){
            negggyeloszthato += 1;
        }   
    System.out.println("Ennyi 4-el oszható szám van:" + negggyeloszthato);
}
    System.out.println("☷☷☷☷☷☷☷☷6.Feladat☷☷☷☷☷☷☷☷");
    int i = 0;
 
while( tomb[i] > 5 )
{
  i++;
}
 
System.out.println("A listában az első 5-nél kissebb szám.: "+i);
    }
}



    
    
 
   
        

