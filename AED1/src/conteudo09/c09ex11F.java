package conteudo09;

import javax.swing.JOptionPane;
public class c09ex11F {
	public static void main(String[] args) {
		//Programadora: Bianca Maria
    double num,den,serie=0,serie1;  
	for(int aux =1;aux <=100;aux++) {
	num = ((aux*2-1)*(2*Math.pow(2, aux)));
	den = Math.pow(aux*5-3,2);
	serie += num/den;
		}
		serie1 = (5*(Math.sqrt(serie))); 
	    JOptionPane.showMessageDialog(null,"S�rie "+serie1);
	}

}

