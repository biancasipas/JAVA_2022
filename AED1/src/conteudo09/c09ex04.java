package conteudo09;

import javax.swing.JOptionPane;
public class c09ex04 {
	public static void main(String[] args) {
		// Programadora: Bianca Maria
	double num,den,serie=0;
	for(int aux=1; aux <=10;aux++) {
	 num = ((aux*4)-3)*((aux*4)-2);
	 den= ((aux*4)-1)*(aux*4);
	 serie +=num/den;
	}
	double total = Math.sqrt(serie);
  JOptionPane.showMessageDialog(null,"Seire "+total);
	}

}
