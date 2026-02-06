import javax.swing.JOptionPane;
public class Naocopiaaa {

	public static void main(String[] args) {
		// Vinicin
		String nome, idade, sexo, estadocivil, CorOlhos, CorCabelo = "", salario, escolaridade, maisganha="", menosganha="";
		int escolaridade2=0, mlsa=0;
		double maiorsalario = 0, menorsalario=0;
		for (int i=1; i<=3; i++) {
				nome = JOptionPane.showInputDialog(null, "Digite o nome:", "C08ex11: ",
						JOptionPane.QUESTION_MESSAGE);
				 idade = JOptionPane.showInputDialog(null, "Digite a idade:", "C08ex11: ",
						JOptionPane.QUESTION_MESSAGE);
				int idade1 = Integer.valueOf(idade);
					sexo = JOptionPane.showInputDialog(null, "Digite o sexo (F/M):", "C08ex11: ",
						JOptionPane.QUESTION_MESSAGE);
				if (sexo.equalsIgnoreCase("f")) {
				} else {
				}
					estadocivil = JOptionPane.showInputDialog(null, "Digite seu estado civil (Solteiro(a)/ Casada(o)/outro):", "C08ex11: ",
						JOptionPane.QUESTION_MESSAGE);
				if (estadocivil.equalsIgnoreCase("S")) {
				} else if (estadocivil.equalsIgnoreCase("C")) {
				}
					CorOlhos = JOptionPane.showInputDialog(null, "Digite a cor dos seus olhos(castanhos/azuis/outro)", "C08ex11: ",
						JOptionPane.QUESTION_MESSAGE);
				if (CorOlhos.equalsIgnoreCase("C")) {
				} else if (CorOlhos.equalsIgnoreCase("p")) {
				} else if (CorOlhos.equalsIgnoreCase("a")) {
				}
						
						CorCabelo = JOptionPane.showInputDialog(null, "Digite a cor dos seus cabelos(Preto/Loiro/Ruivo/ Castanho)", "C08ex11: ",
						JOptionPane.QUESTION_MESSAGE);
				if (CorCabelo.equalsIgnoreCase("P")) {
				} else if (CorCabelo.equalsIgnoreCase("l")) {
					} else if(CorCabelo.equalsIgnoreCase("R")) {
					} else {
					}
					salario = JOptionPane.showInputDialog(null, "Digite seu salário em R$:", "C08ex11: ",
						JOptionPane.QUESTION_MESSAGE);
				double salario1 = Double.valueOf(salario);
				if (i == 1 || salario1 > maiorsalario) {
				maiorsalario = salario1;
				maisganha = nome;
				}else
						if (i==1|| salario1<maiorsalario) {
							menorsalario = salario1;
							menosganha = nome;
								
					
				}escolaridade = JOptionPane.showInputDialog(null, "Digite a sua escolaridade: [1 - analfabeto], [2- ensino fundamental], [3- ensino médio"
							+ "], [4- ensino superior]:", "C08ex11: ",
						JOptionPane.QUESTION_MESSAGE);
				escolaridade2 = Integer.valueOf(escolaridade);		
				switch (escolaridade2) {
					case 1:
					break;
					case 2:
					break;
					case 3: 
					break;
						}
					if (sexo.equalsIgnoreCase("f") && estadocivil.equalsIgnoreCase("S") && CorOlhos.equalsIgnoreCase("a") && CorCabelo.equalsIgnoreCase("l") &&
							salario1 > 10000 && escolaridade2==4 && idade1 >=18 && idade1 <=25)
						mlsa++;
					
					
					
						
					
						
				
					
 } 		double diferenca = maiorsalario - menorsalario;      
		JOptionPane.showMessageDialog(null, "Quantidade de Mulheres loiras solteiras de olhos azuis com idadede entre 18 e \n 25 anos que recebem salário acima de R$10000 e tem curso superior completo \n="+
				mlsa+"\nPessoa com maior salário = "+ maisganha+"\nDiferença entre o maior e menor salário ="+String.format("%1.2f",diferenca), "C08ex11", JOptionPane.INFORMATION_MESSAGE);
						
						
						 
					
		
		}
}
