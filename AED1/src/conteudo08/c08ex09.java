package conteudo08;

import javax.swing.JOptionPane;

public class c08ex09 {
	public static void main(String[] args) {
		// Programadora Bianca Maria
		String nome, sexo, idade;
		int idade1;
		int feminino_contador = 0, masculino_contador = 0, soma2 = 0, soma1 = 0;
		double mediaM, mediaF;
		for (int repeticao = 1; repeticao <= 5; repeticao++) {
			nome = JOptionPane.showInputDialog(null, "Qual seu nome: ");
			idade = JOptionPane.showInputDialog(null, "Qual � a sua idade: ");
			idade1 = Integer.valueOf(idade).intValue();
			sexo = JOptionPane.showInputDialog(null, "Sexo(M ou F): ");
			if (sexo.equalsIgnoreCase("M")) {
				JOptionPane.showMessageDialog(null, "Masculino", "NOME DO MASCULINO: " + nome,
						JOptionPane.INFORMATION_MESSAGE);
				soma1 += idade1;
				masculino_contador++;
			} else if (sexo.equalsIgnoreCase("F")) {
				JOptionPane.showMessageDialog(null, "Feminino", "NOME DO FEMININO: " + nome,
						JOptionPane.INFORMATION_MESSAGE);
				soma2 += idade1;
				feminino_contador++;
			}
		}
		mediaM = (float) soma1 / (masculino_contador);
		mediaF = (float) soma2 / (feminino_contador);
		JOptionPane.showMessageDialog(null,
				"Os n�meros dos Masculinos: " + masculino_contador + "\n" + "Os n�meros dos Femininos: "
						+ feminino_contador + "\n" + "M�dia das idades dos homens: " + mediaM + "\n"
						+ "M�dia das idades das mulheres: " + mediaF + "\n",
				"Idade e Sexo", JOptionPane.INFORMATION_MESSAGE);
	}
}