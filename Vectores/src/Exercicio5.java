
import java.util.Collections;
import java.util.Stack;
import java.util.Vector;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Metila
 */
public class Exercicio5 {
             
    public static void main(String[] args) {
         Vector  <Integer> vetor =new Vector();
         Vector<Integer> v =new Vector();
         Stack <Integer> stack =new Stack();
         vetor.add(1);
         vetor.add(7);
         vetor.add(2);
         vetor.add(-1);
         vetor.add(3);
         
         
       Collections.sort(vetor);  ;  
       stack.addAll(vetor);
        System.out.println("vectores no stack"+stack);
            for (int i=0;i<vetor.size();i++) {
             // v.add(i, vetor.lastE());
           
                v.add(i,stack.pop());
                       
        }
          System.out.println(" ...Vector preenchido..."+v);
         
        
    


         
           }
         }
         
         
  
 

