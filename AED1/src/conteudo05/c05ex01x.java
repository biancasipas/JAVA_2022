package conteudo05;

import javax.swing.JOptionPane;
public class c05ex01x {
	public static void main (String [] args) {
	 String x = JOptionPane.showInputDialog(null,
	 "Qual e o valor x: ",
	 "Calcula ",
	 JOptionPane.QUESTION_MESSAGE);
	 double x1 = Double.valueOf(x).doubleValue();
	 double funcao = Math.pow(x1,3) + 4*x1 + 10;
	 JOptionPane.showMessageDialog(null,
			 "Fun��o: " +funcao,
			 "Calcular",
	 JOptionPane.INFORMATION_MESSAGE);
	}

}
