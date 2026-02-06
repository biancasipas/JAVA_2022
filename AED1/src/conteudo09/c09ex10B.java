package conteudo09;

import javax.swing.JOptionPane;
public class c09ex10B {
	public static void main(String[] args) {
		//Programadora: Bianca Maria
    double num,den,serie=0,serie1;  
	for(int aux =1;aux <=100;aux++) {
	num = (aux*2);
	den = (aux*3);
	serie += num/den;
	}
	serie1 = (1+ Math.sqrt(serie)); 
    JOptionPane.showMessageDialog(null,"S�rie "+serie1);
	}

}
