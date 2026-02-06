package conteudo08;

import javax.swing.JOptionPane;

public class c08ex04xi {
	public static void main(String[] args) {
		// Programadora Bianca Maria
		int contador1 = 0, contador2 = 0;
		for (int repeticao = 1; repeticao <= 5; repeticao++) {
			String nome = JOptionPane.showInputDialog(null, "Qual seu nome: ", "ALUNOS DE UMA TURMA",
					JOptionPane.QUESTION_MESSAGE);
			String idade = JOptionPane.showInputDialog(null, "Qual e a sua idade: ", "ALUNOS DE UMA TURMA",
					JOptionPane.QUESTION_MESSAGE);
			double idade1 = Double.valueOf(idade).doubleValue();
			if (idade1 <= 18)
				contador1++;
			else
				contador2++;
		}
		JOptionPane.showMessageDialog(null,
				"Quantidade de n�meros dos alunos tem at� 18 anos: " + contador1 + "\n"
						+ "Qauntidade de n�meros dos alunos tem acima de 18 anos: " + contador2,
				"ALUNOS DE UMA TURMA", JOptionPane.INFORMATION_MESSAGE);
	}

}
