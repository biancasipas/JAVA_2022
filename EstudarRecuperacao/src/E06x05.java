import java.util.Scanner;

public class E06x05 {
	public static void main(String[] args) {
		int numero;
		Scanner teclado = new Scanner(System.in);
		System.out.print("Digite um número inteiro: ");
		numero = teclado.nextInt();
		if (numero % 5 == 0 && numero % 7 == 0)
			System.out.println(numero + " é divisível, simultaneamente,por 5 e 7");
		else
			System.out.println(numero + " não é divisível, simultaneamanete,po 5 e 7");
		teclado.close();

	}

}
