package conteudo09;

import javax.swing.JOptionPane;
public class c09ex11A {
	public static void main(String[] args) {
		//Programadora: Bianca Maria
    double num,den,serie=0,serie1;  
	for(int aux =1;aux <=100;aux++) {
	num = aux +(aux*7-6);
	den = Math.pow(4,aux-1);
	serie += num/den;
		}
		serie1 = Math.cbrt(serie); 
	    JOptionPane.showMessageDialog(null,"S�rie "+serie1);
	}

}
