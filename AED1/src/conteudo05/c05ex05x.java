package conteudo05;

import javax.swing.JOptionPane;
public class c05ex05x {
 public static void main (String[] args) {
	String celsius = JOptionPane.showInputDialog(null,
			"Qual o valor de uma temperatura em Celsius: ",
			"Calcular",
	JOptionPane.QUESTION_MESSAGE);
	double celsius1 = Double.valueOf(celsius).doubleValue();
	double kelvin = celsius1 + 273;
	double fahrenheit = (celsius1*9 + 160)/5;
	JOptionPane.showMessageDialog(null,
	 "A temperatura em Kelvin �: "+kelvin+ "\n A temperatura em Fahrenheit "+fahrenheit,
	 "Calcular",
	JOptionPane.INFORMATION_MESSAGE);
 }
}
