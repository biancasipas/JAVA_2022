import java.util.Scanner;

public class E08x04 {
	public static void main(String[] args) {
		int idade, contadorA = 0, contadorB = 0;
		String nome;
		Scanner teclado = new Scanner(System.in);
		for (int aux = 1; aux <= 5; aux++) {
			System.out.print("Qual é o seu nome :");
			nome = teclado.nextLine();
			System.out.print("Qual é a sua idade: ");
			idade = teclado.nextInt();
			teclado.nextLine();

			if (idade <= 18) {
				System.out.println("Nome " + nome + " " + "Idade " + idade);
				contadorA++;
			} else {
				System.out.println("Nome " + nome + " " + "Idade " + idade);
				contadorB++;

			}
		}
		System.out.println("Quantos alunos tem até 18 anos: " + contadorA);
		System.out.println("Quantos alunos tem acima de 18 anos: " + contadorB);
		teclado.close();

	}

}
