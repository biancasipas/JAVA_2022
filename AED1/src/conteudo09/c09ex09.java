package conteudo09;

import javax.swing.JOptionPane;
public class c09ex09 {
	public static void main(String[] args) {
		// Programadora: Bianca Maria
	double num,den,serie=0;
     for(int aux=1; aux<=30; aux++) {
    num = (Math.pow(3, aux)	*3); 
    den = ((aux+9)*Math.sqrt(Math.pow(aux*aux,2)));
    serie += num/den;
     }
     double serie1 = 100 - Math.pow(serie,3);
     JOptionPane.showMessageDialog(null,"S�rie"+serie1);
 	}

 }