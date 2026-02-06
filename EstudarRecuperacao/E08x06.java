import java.util.Scanner;

public class E08x06 {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int numero, contador = 0, soma = 0;
		for (int aux = 1; aux <= 10; aux++) {
			System.out.print("Digite dez números inteiros: ");
			numero = teclado.nextInt();
			if (numero % 2 == 0) {
				System.out.println("Número Par ");
			} else {
				System.out.println("Número Impar ");
			}
			if (numero % 4 == 0) {
				soma += numero;
			}
			if (numero % 3 == 0) {
				contador++;
			}

		}

		System.out.println("Soma dos números divisíveis por 4: " + soma);
		System.out.println("Quantidade de números divisíveis por 3: " + contador);
		teclado.close();
	}

}
