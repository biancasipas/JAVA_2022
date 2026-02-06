import java.util.Arrays;
import java.util.Scanner;

public class c12ex25 {
	public static void main(String[] args) {
		String nome[] = new String[3];
		int posicao[] = new int[nome.length];
		int temp;
		String nometemp, nome_equipe;
		Scanner teclado = new Scanner(System.in);
		for (int aux = 0; aux <= posicao.length - 1; aux++) {
			System.out.print("Qual nome da equipe: ");
			nome[aux] = teclado.nextLine();
			System.out.println("Qual é a sua posição: ");
			posicao[aux] = teclado.nextInt();
			teclado.nextLine();
		}
		for (int aux = 0; aux <= posicao.length - 2; aux++) {
			for (int x = 0; x < posicao.length - 1; x++) {
				if (posicao[x] > posicao[x + 1]) {
					temp = posicao[x];
					posicao[x] = posicao[x + 1];
					posicao[x + 1] = temp;
					nometemp = nome[x + 1];
					nome[x] = nome[x + 1];
					nome[x + 1] = nometemp;
				}
			}}
			System.out.println("O nome de uma equipe: ");
			nome_equipe = teclado.nextLine();
			int pos = Arrays.binarySearch(nome, nome_equipe);
			if (pos < 0)
				System.out.println("Não encontrado:");
			else
				System.out.println("A equipe ficou no campeonato: " + (pos + 1));
			if (pos + 1 >= 1 && pos + 1 <= 4) {
				System.out.println("Copa Libertadores");
			} else if (pos + 1 <= 12) {
				System.out.println("Copa Sul-Americana");
			} else if (pos + 1 >= 17 && pos + 1 <= 20) {
				System.out.println("Rebaixada: ");
			}
		
		teclado.close();

	}
}
