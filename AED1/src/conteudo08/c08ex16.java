package conteudo08;

import javax.swing.JOptionPane;
public class c08ex16 {
	public static void main(String[] args) {
		// Programadora: Bianca Maria
			     int cont = 0;
			     for (int divisor=1000; divisor<=2000; divisor++)
			        if (divisor % 2 == 1)
			           cont++;
			     JOptionPane.showMessageDialog(null,
			     "A m�dia dos n�meros �mpares: "+cont,
			     "�mpares",
			     JOptionPane.INFORMATION_MESSAGE);
			   }
			}