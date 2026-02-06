package conteudo09;

import javax.swing.JOptionPane;
public class c09ex12 {
	public static void main(String[] args) {
		//Programadora: Bianca Maria
	    double num,den,serie=0,cont=0,pi;  
		for(int aux =1;aux <=10000;aux++) {
		num = 1;
		den = ((aux*2)-1);
		if(cont%2==0) {
	    serie += num/den;
		}else {
	    serie -= num/den;

		}
		cont++;

		}
		pi = 4.0*(serie);
		JOptionPane.showMessageDialog(null,"Valor de PI; "+pi);
		
		
		
		
		
		}
			

	}


