package conteudo08;

import javax.swing.JOptionPane;
public class c08ex15 {
	public static void main(String[] args) {
		// Programadora: Bianca Maria
	String nome,cargo_funcianario,idade,salario,maiornome,maiorcargo ;
	int idade1,idadeate=0;
	double cargo_funcionario1,salario1,maiorsalario = 0;
	for(int aux=1; aux <=1000; aux++) {
	nome = JOptionPane.showInputDialog(null,
	"Qual seu nome? ",
	"Informa��o",
	JOptionPane.QUESTION_MESSAGE);
	idade = JOptionPane.showInputDialog(null,
	"Qual e a sua idade? ",
	"Informa��o",
	JOptionPane.QUESTION_MESSAGE);
	cargo_funcianario = JOptionPane.showInputDialog(null,
	"Quanto o cardo dos funcion�rios",
	"Informa��o",
	JOptionPane.QUESTION_MESSAGE);
	salario = JOptionPane.showInputDialog(null,
	"Qual seu � o seu sal�rio",
	"Informa��o",
	JOptionPane.QUESTION_MESSAGE);
	idade1 = Integer.valueOf(idade).intValue();
	salario1 = Double.valueOf(salario).doubleValue();
	if(idade1 <= 18) {
		JOptionPane.showMessageDialog(null, "O aluno tem at� 18 anos: ", "ALUNOS DE UMA TURMA",
				JOptionPane.INFORMATION_MESSAGE);
		idadeate++;
	}
	if(cargo_funcianario.equalsIgnoreCase("SENIO") && salario1>=10000 && idade1>= 50);
	
	if (aux == 1 ||salario1>maiorsalario) {
		maiorsalario=salario1;
		maiornome=nome;
		maiorcargo=cargo_funcianario;
	}
	JOptionPane.showMessageDialog(null,
	"Nome:"+nome+"\n"+"Idade:"+idade+"\n"+"Salario:"+salario1+"\n"+cargo_funcianario,
	"FUNCION�RIO DE UMA EMPRESA",
	JOptionPane.QUESTION_MESSAGE);
	
	}
	}
}

