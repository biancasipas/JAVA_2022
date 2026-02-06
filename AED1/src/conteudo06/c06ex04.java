package conteudo06;

import javax.swing.JOptionPane;
public class c06ex04 {
	public static void main (String [] args) {
	String nome = JOptionPane.showInputDialog(null,
	"Qual seu nome:",
	"�ndice de Massa Corporal: ",
	JOptionPane.QUESTION_MESSAGE);
	String altura = JOptionPane.showInputDialog(null,
	"Qual e sua altura:",
	"Para calcular o IMC (), basta preencher os campos abaixo.",
	JOptionPane.QUESTION_MESSAGE);
	String peso = JOptionPane.showInputDialog(null,	
	"Qual � o seu peso:",
    "Para calcular o IMC (�ndice de Massa Corporal), basta preencher os campos abaixo.",
	JOptionPane.QUESTION_MESSAGE);
	double altura1 = Double.valueOf(altura).doubleValue();
	double peso1 = Double.valueOf(peso).doubleValue();
	double IMC = (peso1)/(Math.pow(altura1,2));
	if (IMC <18)
		nome+= "  est� desnutrida ";
	else if (IMC > 18 && IMC < 20)
		nome+= " est� abaixo do peso. ";
	else if (IMC > 20 && IMC < 25)
		nome+= " est� no peso ideal. ";
	else if (IMC > 25 && IMC < 27)
		nome+="  est� acima do peso.";
	else
		nome+= "est� obesa (o).";
	JOptionPane.showMessageDialog(null,
		"Seu �ndice de Massa Corporal �:" +IMC,	
		" Informa��o �ndice de Massa Corporal do(a): "+nome,
	JOptionPane.INFORMATION_MESSAGE);
	}
}	
	