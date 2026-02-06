import java.util.Scanner;

public class ok6 {
	// Programadora: Bianca Maria
	// Este programa lê o nome, a altura (em metros) e o peso (em kg) de
	// uma pessoa e informa ela a sua situação corporal de acordo com o seu
	// IMC (Índice de Massa Corporal).
	public static void main(String[] args) {
		double altura, peso;
		String nome;
		Scanner teclado = new Scanner(System.in);
		System.out.print(" Digite o seu nome: ");
		nome = teclado.nextLine();
		System.out.print(nome + " digite seu peso:");
		peso = teclado.nextDouble();
		System.out.print(nome + " digite sua altura:");
		altura = teclado.nextDouble();
		double imc = (peso) / (Math.pow(altura, 2));

		if (imc < 18)
			System.out.print(nome + " está desnutrida (o). ");
		else if (imc > 18 && imc < 20)
			System.out.print(nome + " está abaixo do peso. ");
		else if (imc > 20 && imc < 25)
			System.out.print(nome + " está no peso ideal. ");
		else if (imc > 25 && imc < 27)
			System.out.print(nome + " está acima do peso.");
		else
			System.out.print(nome + "está obesa (o).");
		teclado.close();
	}
}