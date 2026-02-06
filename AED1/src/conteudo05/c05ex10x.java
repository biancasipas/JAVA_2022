package conteudo05;

import javax.swing.JOptionPane;
public class c05ex10x {
	public static void main(String[] args) {
		// Programadora: Bianca Maria 
		//Um n�mero inteiro de 5 d�gitos 
	String numero = JOptionPane.showInputDialog(null,
		"Informe n�mero inteiro de 5 d�gitos:",
		"Calcular",
	JOptionPane.QUESTION_MESSAGE);
	int numero1 = Integer.valueOf(numero).intValue();
	int d1 = numero1 / 10000;
	int d2 = numero1 / 1000 % 10;
	int d3 = numero1 / 100 % 10;
	int d4 = numero1 / 10 % 10;
	int d5 = numero1 % 10;
	JOptionPane.showMessageDialog(null,
	d1+"\n"+d2+"\n"+d3+"\n"+d4+"\n"+d5,
	"Decomposi��o",
	JOptionPane.INFORMATION_MESSAGE);
	}

}
