import java.util.Scanner;

public class Prova2_CC1MA_2022_1_questao3 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		String nome, nomeMenor = "";
		double sal, salNovo, salNovoMenor = 999999999.0, soma = 0.0, media;
		int anosTrab, avaliacao, contTot = 0, contSem = 0;
		do {
			System.out.println("Informe nome do funcionário:");
			nome = teclado.nextLine();
			if (!nome.equalsIgnoreCase("X")) {
				System.out.println("Informe salário do funcionário:");
				sal = teclado.nextDouble();
				System.out.println("Informe anos trabalhados do funcionário:");
				anosTrab = teclado.nextInt();
				System.out.println("Informe avaliação do funcionário:");
				avaliacao = teclado.nextInt();
				teclado.nextLine();
				if (avaliacao <= 50) {
					salNovo = sal;
					if (anosTrab > 10)
						contSem++;
				} else if (avaliacao <= 70)
					salNovo = sal + sal * 5 / 100;
				else if (avaliacao <= 90)
					salNovo = sal + sal * 10 / 100 + 100;
				else
					salNovo = sal + sal * 15 / 100 + anosTrab * 100;
				System.out.printf("Funcionário: %s - Novo salário = R$%1.2f\n", nome, salNovo);
				contTot++;
				soma += salNovo;
				if (salNovo < salNovoMenor) {
					salNovoMenor = salNovo;
					nomeMenor = nome;
				}
			}
		} while (!nome.equalsIgnoreCase("X"));
		media = soma / contTot;
		System.out.printf("Nova média salarial dos funcionários da empresa = R$%1.2f\n", media);
		System.out.println(
				"Quantidade de funcionários com mais de 10 anos de trabalhados que não tiveram reajuste: " + contSem);
		System.out.println("Nome do funcionário que ficou com o menor salário: " + nomeMenor);
		teclado.close();
	}

}
