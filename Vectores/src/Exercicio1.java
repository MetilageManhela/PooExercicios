

import java.util.Collections;
import java.util.Scanner;
import java.util.Vector;



public class Exercicio1 {
         
         
            public   static class  Estatistica{
                
              
             
           public static void receber (Vector <Integer>m, int elementos){
               int med =0,i;
               Scanner met =new Scanner(System.in);
               for (i=0;i<elementos;i++) {
                   System.out.println("Introduz o  "  +   i + "  elemento");
                   int n=met.nextInt();
                   m.add(n); }
                 
                   
                   for (i=0;i<elementos;i++) {
                       System.out.println(""  +m);
                       
                     
                       med+=m.get(i);}
                       int media=med/i;
                       System.out.println("A media e  "+media);
                       
                       Collections.sort(m);
                     
                       System.out.println("A mediana e  "+ m.get(elementos/2));
                       
                       
                       
           }  
    }
    public static void main(String[] args) {
        Scanner met =new Scanner(System.in); 
        Vector <Integer> v= new Vector();
        
        System.out.println(" Introduz o tamanho do vector");
        int tam=met.nextByte();
        Estatistica.receber(v, tam);
       
    }
   
}
