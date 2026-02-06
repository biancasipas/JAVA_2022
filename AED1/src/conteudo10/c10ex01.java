package conteudo10;

import javax.swing.JOptionPane;
public class c10ex01 {
	public static void main(String[] args) {
		//Programdora: Bianca Maria
		String valor;
		double valor1,multa,soma=0,cont = 0;
		do {
		valor = JOptionPane.showInputDialog(null,
	    "Qual � o valor fincandeiro",
		"MULTA",
		JOptionPane.QUESTION_MESSAGE);
		valor1 = Double.valueOf(valor).doubleValue();
		
	 multa = 10/100*valor1;
	  soma += multa;
	  cont++;
	
		}while (valor1 != -1);
		double media = soma/cont;
		
	 JOptionPane.showMessageDialog(null,"A m�dia das multas calculadas " +media,
			 "Multar",
	JOptionPane.INFORMATION_MESSAGE);
	}

}//  clica primeiro > segura shift > clica ultimo (não segurar)
