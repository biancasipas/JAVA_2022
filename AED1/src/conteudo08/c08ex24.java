package conteudo08;

import javax.swing.JOptionPane;
public class c08ex24 {
	public static void main(String[] args) {
		// Programadora: Bianca Maria
			   double num, serie=1,serie1;
			   for (int aux=1; aux<=99; aux+=2) {
			     num = Math.pow(2, aux);
			     serie += num;
			   }
			   serie1 = (1.0/3)*serie;
			   JOptionPane.showMessageDialog(null,
			   "Valor da S�rie = "+serie1,
			   "Serie",
			   JOptionPane.INFORMATION_MESSAGE);
			 }

	}