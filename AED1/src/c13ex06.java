import java.util.Scanner;

public class c13ex06 {
	public static void main(String[] args) {
		String nome[] = new String[5];// teste 5
		String palavras[];
		Scanner teclado = new Scanner(System.in);
		for (int aux = 0; aux <= nome.length; aux++) {
			System.out.print("Digite o seu nome completo: ");
			nome[aux] = teclado.nextLine();
			palavras = nome[aux].split(" ");
			if (palavras[palavras.length - 1].equalsIgnoreCase("Silva")) {
				System.out.println("Pertence");
			} else {
				System.out.println("Não pertence");
				teclado.close();
			}

		}
	}
}
