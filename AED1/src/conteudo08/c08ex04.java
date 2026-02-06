package conteudo08;

import javax.swing.JOptionPane;

public class c08ex04 {
	public static void main(String[] args) {
		// Programadora Bianca Maria
		String nome = null, idade;
		int  idade1;
		int contador1 = 0, contador2 = 0;
		 for (int repeticao = 1; repeticao <= 50; repeticao++) {
			nome = JOptionPane.showInputDialog(null, "Qual seu nome: ", "ALUNOS DE UMA TURMA",
					JOptionPane.QUESTION_MESSAGE);
			idade = JOptionPane.showInputDialog(null, "Qual e a sua idade: ", "ALUNOS DE UMA TURMA",
					JOptionPane.QUESTION_MESSAGE);
			idade1 = Integer.valueOf(idade).intValue();
			if (idade1 <= 18) {
				JOptionPane.showMessageDialog(null, "O aluno tem at� 18 anos: ", "NOME DO ALUNO �: " +nome,
						JOptionPane.INFORMATION_MESSAGE);
				contador1++;
			} else if (idade1 >= 18) {
				JOptionPane.showMessageDialog(null, "O aluno tem acima de 18 anos: ", "NOME DO ALUNO �:"+nome,
						JOptionPane.INFORMATION_MESSAGE);
				contador2++;
			}
		}
		JOptionPane.showMessageDialog(null,
				"Quantidade de n�meros dos alunos tem at� 18 anos: " + contador1 + "\n"
						+ "Quantidade de n�meros dos alunos tem acima de 18 anos: " + contador2,
				"ALUNOS DE UMA TURMA", JOptionPane.INFORMATION_MESSAGE);

	}

}