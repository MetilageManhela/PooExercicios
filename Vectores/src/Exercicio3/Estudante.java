/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exercicio3;




import java.util.Collection;
import java.util.Collections;
import java.util.Vector;
import javax.swing.JOptionPane;





public class Estudante extends Pessoa {
    
    
    static Vector<Pessoa> vect;
    static Pessoa v;
    public Estudante(String nome, double nota1, double nota2, double nota3) {
        super(nome, nota1, nota2, nota3);
    }

    
    
    
    
    
    
     public static void mediadaturma(){
        
        
        int numeroelementos=Integer.parseInt(JOptionPane.showInputDialog("intoduza a capacidade do vecttor"));
        vect= new Vector<Pessoa>(numeroelementos) ;
        
         
       for(int i=0;i< vect.size(); i++){
 
       }
    }
    
    
    
    
    
    
    
    
    
    
    public static void main(String[] args) {
        
      
         int soma = 0;
         boolean continua=true;
         while(continua==true){
             
         
      int opcao=Integer.parseInt(JOptionPane.showInputDialog("[1]-Registar alunos\n[2]-Total de alunos\n[3]-Calcular media das notas da turma\n[4]-Mostrar o estudante(s) com melhor media\n[5]-Sair\nescolha uma opcao"));
      
      switch(opcao){
          
          
          case 1: int numeroelementos=Integer.parseInt(JOptionPane.showInputDialog("intoduza a quantidade de alunos"));
        vect= new Vector<Pessoa>(numeroelementos) ;  
        for(int i =0;i<vect.capacity();i++){
            v = new Pessoa(JOptionPane.showInputDialog("informe o nome do "+i+"o aluno"),Double.parseDouble(JOptionPane.showInputDialog("introduza a nota1")),Double.parseDouble(JOptionPane.showInputDialog("introduza a nota2")),Double.parseDouble(JOptionPane.showInputDialog("introduza a nota3")));
            vect.add(v);
        } ; break;
              
              
              
          case 2: for(Pessoa o: vect){  
             soma +=o.getNota1()+o.getNota2()+o.getNota3();
        }
                
              
                double media=soma/3;
              for(Pessoa a : vect){
              JOptionPane.showMessageDialog(null,"A turma tem: "+vect.capacity()+" alunos\nNome: "+a.getNome()+"\nnota1: "+a.getNota1()+"\nnota2: "+a.getNota2()+"\nnota3: "+a.getNota3()+"\nMedia: "+media) ;
          }
         break;
 
          case 3:  for(Pessoa o: vect){  
             soma +=o.getNota1()+o.getNota2()+o.getNota3();
        }
              double media1=soma/vect.capacity();
              JOptionPane.showMessageDialog(null,"A media das notas turma e: "+media1);
              
              break;
              
          case 4: ; break;
          case 5: System.exit(0);    
          default: JOptionPane.showMessageDialog(null,"Escolha uma opcao");
              
      }
      
        
    }
        
    }
}
