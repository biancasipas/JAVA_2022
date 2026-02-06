import javax.swing.JOptionPane;

public class c08ex06 {
	public static void main(String[] args) {
		// Programadora: Bianca Maria
		String numero;
		int numero1;
		int divisivel = 0, soma = 0;
		for (int repeticao = 1; repeticao <= 10; repeticao++) {
			numero = JOptionPane.showInputDialog(null, "Ditige o número :", "CALCULAR",
					JOptionPane.QUESTION_MESSAGE);
			numero1 = Integer.valueOf(numero).intValue();
			if (numero1 % 2 == 0) {
				JOptionPane.showMessageDialog(null, "Numero Par", "CALCULAR", JOptionPane.INFORMATION_MESSAGE);
			} else {
				JOptionPane.showMessageDialog(null, "Número Impar", "CALCULAR", JOptionPane.INFORMATION_MESSAGE);
			}
			if (numero1 % 4 == 0) {
				soma += numero1;
			if (numero1 % 3 == 0)
				divisivel++;
			}

			}
			
			JOptionPane.showMessageDialog(null,
					"A soma dos números divisíveis por 4  :" + soma + "\n"
							+ "A quantidade de números divisíveis por 3:  " + divisivel,
					"CALCULAR", JOptionPane.INFORMATION_MESSAGE);

	}

}
