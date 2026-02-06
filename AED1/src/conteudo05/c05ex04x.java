package conteudo05;

import javax.swing.JOptionPane;
public class c05ex04x {
	public static void main(String[] args) {
		// Programadora: Bianca Maria Fernandes Alves
		// Qual e o valor da dist�ncia ?
	String Xprimeiro = JOptionPane.showInputDialog(null,
		"Qual e o valor do X1: ",
		"Calcular",
	JOptionPane.QUESTION_MESSAGE);
	String Yprimeiro = JOptionPane.showInputDialog(null,
		"Qual e o valor do Y1: ",
		"Calcular",
	JOptionPane.QUESTION_MESSAGE);
	String Xsegundo = JOptionPane.showInputDialog(null,
		"Qual e o valor do X2: ",
		"Calcular",
   JOptionPane.QUESTION_MESSAGE);
   String Ysegundo = JOptionPane.showInputDialog(null,
		"Qual e o valor do Y2: ",
		"Calcular",
	JOptionPane.QUESTION_MESSAGE);
   double Xprimeiro1 = Double.valueOf(Xprimeiro).doubleValue();
   double Yprimeiro1 = Double.valueOf(Yprimeiro).doubleValue();
   double Xsegundo1 = Double.valueOf(Xsegundo).doubleValue();
   double Ysegundo1 = Double.valueOf(Ysegundo).doubleValue();
   double distancia = Math.sqrt(Math.pow(Xprimeiro1-Xsegundo1,2)+Math.pow(Yprimeiro1-Ysegundo1,2));
   JOptionPane.showMessageDialog(null,
		   "Dist�ncia �: "+distancia,
		   "Calcular",
  JOptionPane.INFORMATION_MESSAGE);
   
		

	}

}
