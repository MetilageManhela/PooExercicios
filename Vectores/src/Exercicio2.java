
import java.util.Random;
import java.util.Vector;
import javax.swing.JOptionPane;

public class Exercicio2 {
    public static void main(String[] args) {
        
        int quat = Integer.parseInt((JOptionPane.showInputDialog("Introduza a quantidade de elementos do vector")));
        int elementos;
        Vector<Integer> numeros = new Vector<>(quat);
        
              for(int i = 0; i<numeros.capacity(); i++){
              elementos = Integer.parseInt(JOptionPane.showInputDialog("Introduza o elemento"));
              numeros.add(elementos);
        }
        
        Random r = new Random();
        int indice = r.nextInt(numeros.size());
        boolean acerto;
        int numero;
        int erros = 0;
        
            do{
            numero = Integer.parseInt(JOptionPane.showInputDialog("Introduza o numero \n" + numeros.toString()));
            if(numero == numeros.get(indice)){
                JOptionPane.showMessageDialog(null, "Acertou \n" + "Numero de erros: " + erros);
            }else{
                erros = erros + 1;
                JOptionPane.showMessageDialog(null, "Errou \n" + " Numero de erros: " + erros);
            }
        }while(numero!=numeros.get(indice));
        
    }
    
    
}
