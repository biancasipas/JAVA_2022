import java.util.Scanner;

public class E06x08 {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		String nome;
		double altura;
		System.out.print("Digite o seu nome: ");
		nome = teclado.nextLine();
		System.out.print("Digite qual é a sua altura: ");
		altura = teclado.nextDouble();
		double IMC1 = 20;
		double IMC2 = 25;
		double pesomin = (IMC1) * (Math.pow(altura, 2));
		double pesomax = (IMC2) * (Math.pow(altura, 2));
		System.out.println(nome + "Peso minimo: " + pesomin + "Peso máximo: " + pesomax);
		teclado.close();
	}

}
