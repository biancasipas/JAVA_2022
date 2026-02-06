import java.util.Scanner;

public class c12ex10 {
	public static void main(String[] args) {
		String nome[] = new String[8];
		int nota[] = new int[nome.length];
		Scanner teclado = new Scanner(System.in);
		int media = 0, soma = 0;

		for (int aux = 0; aux <= nome.length - 1; aux++) {
			System.out.print("Qual seu nome: ");
			nome[aux] = teclado.next();
			System.out.print("Qual é a sua nota: ");
			nota[aux] = teclado.nextInt();
			soma += nota[aux];

		}
		media = soma / nota.length;
		for (int aux = 0; aux <= nome.length - 1; aux++) {
			if (nota[aux] > media) {
				System.out.println("Noata ficou acima da média : " + nome[aux]);
				teclado.close();
			}
		}

	}
}
