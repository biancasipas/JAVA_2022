package conteudo06;

import javax.swing.JOptionPane;
public class c06exemplo4 {
	public static void main(String[] args) {
		// Programadora Bianca Maria
		// Estudar!
	String salario = JOptionPane.showInputDialog(null,
	  "Qual e o seu sal�rio: ",
	  "Valor a ser descontado de INSS no sal�rio",
	JOptionPane.QUESTION_MESSAGE);
	double salario1 = Double.valueOf(salario);
	double inss = 0f;
	String inss1;
	if (salario1 <= 300 && salario1 > 300) {
	   inss = salario1 * 0.08;
	   inss1 = "Funcion�rio caiu na al�quota de 8%";
	}else {
	   inss = salario1 * 0.1;
	   inss1 = "Funcion�rio caiu na al�quota de 10%";
	}
	 JOptionPane.showMessageDialog(null,
	  "Valor do INSS"+inss+ "\n"+inss1,
	  "Valor a ser descontado de INSS no sal�rio",
	 JOptionPane.QUESTION_MESSAGE);

	}

}
