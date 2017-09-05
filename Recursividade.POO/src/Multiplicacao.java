/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import javax.swing.JOptionPane;

/**
 *
 * @author Metila
 */
public class Multiplicacao {
    public static int multplicacao(int numero1,int numero2){
    if(numero1==0){
    return numero1;}
    return multplicacao(numero1-1, numero2)+numero2;
   }
    
    public static void main(String[] args) {
        int num1=Integer.parseInt(JOptionPane.showInputDialog("Introduza o numero"));
        int num2=Integer.parseInt(JOptionPane.showInputDialog("Introduza o numero"));
        JOptionPane.showMessageDialog(null,multplicacao(num1, num2));
    }
}
