package conteudo08;

import javax.swing.JOptionPane;
public class c08ex28 {
    //Programadora:Bianca Maria
    public static void main (String[]args){
        int numero1=1, numero2=2,numero3=3, total=0, contador=0;
        double media;
        for (int aux=1; aux<1001;aux++){
            if((numero1*numero2*numero3)==aux){
            	 JOptionPane.showMessageDialog(null,"Numero triangular: "+aux  );
                total += aux;
                numero1++;
                numero2++;
                numero3++;
                contador++;
            }
        }
        media = total/contador;
        JOptionPane.showMessageDialog(null,"Media dos numeros: "+media);
   }
}

