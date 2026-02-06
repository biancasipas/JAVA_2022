package conteudo09;

import javax.swing.JOptionPane;
public class c09ex10A {
	public static void main(String[] args) {
		//Programadora: Bianca Maria
    double num,den,serie=0;  
	for(int aux =1;aux <=100;aux++) {
	num = aux;
	den = Math.sqrt(aux*2);
	serie += num/den;
	}
    JOptionPane.showMessageDialog(null,"S�rie"+serie);
	}

}
