
//Bianca Maria Fernandes Alves
import java.util.Scanner;

public class AprovaSegundaAEDIex03 {

	public static void main(String[] args) {
		int anos, avaliacao, contador = 0;
		String nome, nomeMenor = " ";
		double salario, novoSalario, soma = 0, salarioMenor = 0, contadorA = 0, media;
		Scanner teclado = new Scanner(System.in);
		do {
			System.out.print("Qual é o seu nome: ");
			nome = teclado.nextLine();
			System.out.print("Qual é a quantidade de anos trabalhos na empresa: ");
			if (!nome.equalsIgnoreCase("X")) {
				anos = teclado.nextInt();
				System.out.print("Qual é o seu salário: ");
				salario = teclado.nextDouble();
				System.out.print("Qual é o valor da avaliação: ");
				avaliacao = teclado.nextInt();
				teclado.nextLine();

				if (avaliacao <= 50) {
					novoSalario = salario;
					if (anos > 10)
						contadorA++;
				} else if (avaliacao >= 50 && avaliacao <= 70)
					novoSalario = salario + (0.05 * salario);
				else if (avaliacao >= 70 && avaliacao <= 90)
					novoSalario = salario + ((0.10 * salario) + 100);
				else
					novoSalario = salario + (salario * 0.15 + 100 * anos);

				System.out.println("Novo salário: " + novoSalario);
				contador++;
				soma += novoSalario;
				
				if (novoSalario < salarioMenor) {
					salarioMenor = novoSalario;
					nomeMenor = nome;
				}

			}
		} while (!nome.equalsIgnoreCase("X"));

		media = soma / contador;
		System.out.println("Nova média salarial dos funcionários da empresa: " + media);
		System.out.println(
				"Quantidade de funcionários com mais de 10 anos de trabalhados que não tiveram reajuste: " + contadorA);
		System.out.println("Nome do funcionário que ficou com o menor salário: " + nomeMenor);
		teclado.close();
	}

}
