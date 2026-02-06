package conteudo06;

import javax.swing.JOptionPane;
public class c06ex08 {
	public static void main(String[] args) {
		// Programadora: Bianca
	String nome = JOptionPane.showInputDialog(null,
	"Qual seu nome: ",
	"�ndice de Massa Corporal:",
	JOptionPane.QUESTION_MESSAGE);
	String altura = JOptionPane.showInputDialog(null,
    "Qual e a sua altura: ",
    "Para calcular o IMC (), basta preencher os campos abaixo.",
    JOptionPane.QUESTION_MESSAGE);
	double altura1 = Double.valueOf(altura).doubleValue();
	double IMC1  = 20;
	double IMC2  = 25;
	double pmin = (IMC1)*(Math.pow(altura1,2));
	double pmax = (IMC2)*Math.pow(altura1,2);
	JOptionPane.showMessageDialog(null,
			"Peso minim: " +pmin+ "Peso m�ximo: "+pmax,	
			" Informa��o �ndice de Massa Corporal do(a): "+nome,
		JOptionPane.INFORMATION_MESSAGE);
	
	}

}
