import java.util.Scanner;

public class c13ex11 {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		String nome_completo;
		System.out.print("Digite o nome completo: ");
		nome_completo = teclado.nextLine();
		nome(nome_completo);
		teclado.close();
	}

	public static String nome(String nome_completo) {
		String palavras[] = nome_completo.split(" ");
		String nome_maiusculo = palavras[palavras.length - 2].toUpperCase();
		System.out.println(nome_maiusculo + " ");
	
	return nome_completo;
	}
}
