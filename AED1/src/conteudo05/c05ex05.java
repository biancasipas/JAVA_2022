package conteudo05;

import javax.swing.JOptionPane;
//Programadora: Bianca Maria
public class c05ex05 {
	public static void main(String[] args) {
		String celsius = JOptionPane.showInputDialog(null,
				"O valor de uma temperatura em Celsius: ", 
		        "Calcular",
		JOptionPane.QUESTION_MESSAGE);
		 double celsius1 = Integer.valueOf(celsius).intValue();
	     double fahrenheit = (celsius1*9 + 160)/5;
	     double kelvin = celsius1 + 273;
		 JOptionPane.showMessageDialog(null,
				  "Qual � o valor de uma temperatura em Fahrenheit :"+fahrenheit,
				  "Calcular: ",
				  JOptionPane.INFORMATION_MESSAGE);
		 JOptionPane.showMessageDialog(null,
				 "Qual � o valor de uma temperatura em Kelvin: "+kelvin,
				 "Calcular",
		JOptionPane.INFORMATION_MESSAGE);
	}

}