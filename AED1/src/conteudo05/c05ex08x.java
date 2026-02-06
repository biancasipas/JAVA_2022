package conteudo05;

import javax.swing.JOptionPane;
public class c05ex08x {
	public static void main(String[] args) {
		// Programadora: Bianca Maria 
		// Qual e o valor de Raio ?
	String area_circular = JOptionPane.showInputDialog(null,
		"Qual e a �rea de um setor circular: ",
		"Calcular",
	JOptionPane.QUESTION_MESSAGE);
	String angulo = JOptionPane.showInputDialog(null,
		"Qual e o valor angulo: ",
		"Calcular",
	JOptionPane.QUESTION_MESSAGE);
	double area_circular1 = Double.valueOf(area_circular).doubleValue();
	double angulo1 = Double.valueOf(angulo).doubleValue();
	double pi = 3.1416;
	double raio = Math.sqrt((360*area_circular1)/(angulo1*pi));
	JOptionPane.showMessageDialog(null,
			"Raio � "+raio,
			"Calcular",
	JOptionPane.INFORMATION_MESSAGE);
	}

}
