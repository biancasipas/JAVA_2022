import java.util.Scanner;

public class c13ex08 {
	public static void main(String[] args) {
		// Programadora: Bianca Maria
		String nome;
		String[] palavras;
		Scanner teclado = new Scanner(System.in);
		System.out.print("Nome do autor: ");
		nome = teclado.nextLine();
		palavras = nome.split(" ");
		System.out.print(palavras[palavras.length - 1]);
		for (int x = 0; x <= palavras.length - 2; x++) {
			System.out.print(", " + palavras[x].charAt(0));
			teclado.close();
		}

	}
}
