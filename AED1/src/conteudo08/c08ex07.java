package conteudo08;

import javax.swing.JOptionPane;
public class c08ex07 {
	public static void main(String[] args) {
		// Programadora Bianca Maria
	String nome;
	String idade;
	int contador1=0,contador2=0,soma=0;
	double media;
	for (int repeticao = 1; repeticao <= 5; repeticao++) {
	nome = JOptionPane.showInputDialog(null,"Qual seu nome: ");
	idade = JOptionPane.showInputDialog(null,"Qual � a sua idade: ");
	int idade1 = Integer.valueOf(idade).intValue();
	if (idade1 <= 12) {
		JOptionPane.showMessageDialog(null, "O aluno tem at� 12 anos: ", "Nome do aluno � "+nome,
		JOptionPane.INFORMATION_MESSAGE);
		soma += idade1;
		contador1++;
	} else if (idade1 >= 30) {
		JOptionPane.showMessageDialog(null, "O aluno tem acima de 30 anos: ", "Nome do aluno � "+nome,
		JOptionPane.INFORMATION_MESSAGE);
		soma += idade1;
		contador2++;
	}
}
	   media = (float) soma/(contador1+contador2);
       JOptionPane.showMessageDialog(null,
	   "Quantidade de n�meros dos alunos tem at� 18 anos: " + contador1 + "\n"
	   + "Quantidade de n�meros dos alunos tem acima de 18 anos: " + contador2+ "\n"+ "Media �: "+media,
	   "ALUNOS DE UMA TURMA", JOptionPane.INFORMATION_MESSAGE);



	}

}
