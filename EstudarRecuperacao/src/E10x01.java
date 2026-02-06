import java.util.Scanner;

public class E10x01 {

	public static void main(String[] args) {
		double valor, multa, media, soma = 0;
		int contador = 0;
		Scanner teclado = new Scanner(System.in);
		System.out.println("Para finalizar digite -1");
		do {

			System.out.print("Digite o valor: ");
			valor = teclado.nextDouble();
			if (valor != -1) {
				multa = (0.10 * valor);
				soma += multa;
				contador++;
				System.out.println("Multa é: " + multa);

			}
		} while (valor != -1);
		media = (float) soma / contador;
		System.out.println("Média é: " + media);
		teclado.close();

	}

}
