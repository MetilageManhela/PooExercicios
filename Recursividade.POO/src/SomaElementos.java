/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import javax.swing.JOptionPane;


public class SomaElementos {
     public static int Soma(String numero){
      if(numero.length()==0)
      return numero.length();
      return Soma(numero.substring(1))+((int)Character.getNumericValue(numero.charAt(0)));}
   
    public static void main(String[] args) {
        String n=JOptionPane.showInputDialog(null,"Introduza o numero?");
        JOptionPane.showMessageDialog(null, Soma(n));
    }
}
