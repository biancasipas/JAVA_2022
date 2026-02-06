package conteudo08;

import javax.swing.JOptionPane;
public class c08ex19 {
	public static void main(String[] args) {
		// Programadora: Bianca Maria
		int soma= 0,termo;
		for (int aux=1; aux<=100; aux++) { 
		   termo = (int) Math.pow(aux,2) ;
		   soma += termo;
		}
		JOptionPane.showMessageDialog(null,
				"A soma deu "+soma,
				"Calcular",
		JOptionPane.INFORMATION_MESSAGE);


	}

}