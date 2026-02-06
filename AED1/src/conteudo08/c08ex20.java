package conteudo08;

import javax.swing.JOptionPane;
public class c08ex20 {
	public static void main(String[] args) {
		//Programadora: Bianca Maria
		// Programadora: Bianca Maria
		String n;
		int n1;
		double termo1=0, soma=0;
		n = JOptionPane.showInputDialog(null,
		 "O valor de n (quantidade de termos: ",
		 "Calcular",
		JOptionPane.QUESTION_MESSAGE);
		n1 = Integer.valueOf(n).intValue();
		for (int aux=1; aux<=n1; aux++) { 
		   termo1 = Math.pow(2,aux-1) ;
		   soma += termo1;
		}
		JOptionPane.showMessageDialog(null,
				"A soma deu "+soma,
				"Calcular",
		JOptionPane.INFORMATION_MESSAGE);


	}

}