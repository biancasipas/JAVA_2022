package conteudo06;

import javax.swing.JOptionPane;
public class c06exemplo5 {
	public static void main(String[] args) {
		// Programadora Bianca Maria
		// EXEMPLO !
	String salario = JOptionPane.showInputDialog(null,
	"Qual e o seu sal�rio: ",
	"Valor a ser descontado de INSS no sal�rio",
	JOptionPane.QUESTION_MESSAGE);
	double salario1 = Double.valueOf(salario);
	double inss1 = 0f;
	String inss;
	if (salario1 <= 300 && salario1 <= 1000 && salario1 > 1000) {
	inss1 = salario1* 0.08;
    inss = "Funcion�rio caiu na al�quota de 8%";
	} else if ( salario1 <=1000) {
	inss1 = salario1* 0.09;
	inss ="Funcion�rio caiu na al�quota de 9%";
	} else {
	inss1 = salario1* 0.1;
	inss = "Funcion�rio caiu na al�quota de 9%";
	}
	JOptionPane.showMessageDialog(null,
			"Valor do INSS"+inss+ "\n"+inss1,
			  "Valor a ser descontado de INSS no sal�rio",
			 JOptionPane.QUESTION_MESSAGE);
	

	}

}
