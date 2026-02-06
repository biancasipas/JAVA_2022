import java.util.Scanner;

public class c12ex26 {
	public static void main(String[] args) {
		String frase;
		Scanner teclado = new Scanner(System.in);
		System.out.print("Digite uma frase: ");
		frase = teclado.nextLine();
		String palavras[] = frase.split(" ");
		for (int x = 0; x <= palavras.length - 1; x++) {
			String maiuscula = palavras[x].substring(0, 1).toUpperCase() + palavras[x].substring(1);
			System.out.println(maiuscula + " ");
			teclado.close();
		}

	}
}
