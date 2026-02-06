package conteudo05;

import javax.swing.JOptionPane;
public class c05ex06x {
	public static void main(String[] args) {
		// Programadora: Bianca Maria Fernandes Alves
		// Qual e o valor da dis�ncia?
	String A = JOptionPane.showInputDialog(null,
			"Qual e o valor A: ",
			"Calcular",
	JOptionPane.QUESTION_MESSAGE);
	String B = JOptionPane.showInputDialog(null,
			"Qual e o valor B: ",
			"Calcular",
	JOptionPane.QUESTION_MESSAGE);
	String C = JOptionPane.showInputDialog(null,
			"Qual e o valor C:",
			"Calcular",
   JOptionPane.QUESTION_MESSAGE);
	String x = JOptionPane.showInputDialog(null,
			"Qual e o valor x: ",
			"Calcular",
	JOptionPane.QUESTION_MESSAGE);
	String y = JOptionPane.showInputDialog(null,
			"Qual e o valor y: ",
			"Calcular: ",
	JOptionPane.QUESTION_MESSAGE);
	double A1 = Double.valueOf(A).doubleValue();
	double B1 = Double.valueOf(B).doubleValue();
	double C1 = Double.valueOf(C).doubleValue();
	double x1 = Double.valueOf(x).doubleValue();
	double y1 = Double.valueOf(y).doubleValue();
	double distancia = (A1*x1+B1*y1+C1)/(Math.sqrt(Math.pow(A1,2)+Math.pow(B1,2)));
	JOptionPane.showMessageDialog(null,
			"A dist�nica �: "+distancia, 
			"Calcular",
	JOptionPane.INFORMATION_MESSAGE);
			
		

	}

}
