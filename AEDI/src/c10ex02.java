import javax.swing.JOptionPane;

public class c10ex02 {
	public static void main(String[] args) {
		// Programadora: Bianca Maria
		double valor_recebido1, soma = 0, cont = 0, contador = 0;
		do {
			String valor_recebido = JOptionPane.showInputDialog(null, "Qual é o valor recebido", "Calcular",
					JOptionPane.QUESTION_MESSAGE);

			valor_recebido1 = Double.valueOf(valor_recebido).doubleValue();
			if (valor_recebido1 == 0)
				break;
			soma += valor_recebido1;
			cont++;
			if (valor_recebido1 >= 1000) {
				contador++;

			}
		} while (valor_recebido1 != 0);
		double media = (float) soma / cont;

		JOptionPane.showMessageDialog(null, "Média dos valores recebidos  " + media + "\n" + "Valor total recebido "
				+ soma + "\n" + "Quantidade de valores acima " + contador);

	}
}