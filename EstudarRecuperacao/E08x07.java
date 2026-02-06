import java.util.Scanner;

public class E08x07 {

	public static void main(String[] args) {
		int idade;
		double contadorA = 0, contadorB = 0, soma = 0, cont = 0;
		String nome;
		Scanner teclado = new Scanner(System.in);
		for (int aux = 1; aux <= 5; aux++) {
			System.out.print("Qual é o seu nome: ");
			nome = teclado.nextLine();
			System.out.print("Quanto ano o aluno tem: ");
			idade = teclado.nextInt();
			teclado.nextLine();
			soma += idade;

			if (idade <= 12) {
				System.out.println(nome + " tem até 12 anos");
				contadorA++;
			} else if (idade >= 30) {
				System.out.println(nome + " tem acima de 30 anos");
				contadorB++;

			}
			cont = aux;
		}
		double media = soma /cont;
		System.out.println("Média das idades informadas: " + media);
		System.out.println("Os alunos tem acima de 30 anos: " + contadorB);
		System.out.println("Os alunos tem até 12 anos: " + contadorA);
		teclado.close();

	}
}
