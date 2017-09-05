
import java.util.Vector;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Metila
 */
public class Exercicio4 {



    
    
    
    public static void main(String[] args) {
       Vector<Boolean> vector1 = new Vector(Integer.parseInt(JOptionPane.showInputDialog(" Qual e o tamanho do vector")));
         Vector<Boolean> v2 = new Vector(Integer.parseInt(JOptionPane.showInputDialog("informe o tamanho do vector2")));
      
         for(int i=0;i<vector1.capacity();i++){
           boolean  num=Boolean.parseBoolean(JOptionPane.showInputDialog("introduza o "+i+"o valor do vector1"));
             vector1.addElement(num);
         }
         
          for(int i=0;i<v2.capacity();i++){
             boolean  num1=Boolean.parseBoolean(JOptionPane.showInputDialog("introduza o "+i+"o  valor do vector2"));  
             v2.addElement(num1);
         }
          
        for (int i=0;i< vector1.capacity();i++){
    for(int j=0;j<v2.capacity();j++){
 if ( vector1.capacity() ==  v2.capacity() &&  vector1.elementAt(i) ==  v2.elementAt(j)){
  JOptionPane.showMessageDialog(null," Os vectores sao \n  vector1"+vector1+"\n Vector 2"+v2+"\ntamanho do vector1: "+vector1.capacity()+"\ntamanho do vector2: "+v2.capacity());
  }else{JOptionPane.showMessageDialog(null," Sao diferentes diferentes\n  vector1: "+vector1+"\nvector 2: "+v2+"\ntamanho do vector1: "+vector1.capacity()+"\n tamanho do vector2: "+v2.capacity());}
}
        }    
    }
    
    
    
}
