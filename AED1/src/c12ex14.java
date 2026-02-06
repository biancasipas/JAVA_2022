import java.util.Scanner;

public class c12ex14 {
	public static void main(String[] args) {
		// Programadora: Bianca Maria Fernades Alves
		String nome[] = new String[100]; // 100cidades e so teste 20nomes!
		int temp;
		String tempNome;
		String estado[] = new String[nome.length];
		int populacao[] = new int[nome.length];
		int maiorpopulacao = 0;
		String maiorcidade;
		Scanner teclado = new Scanner(System.in);
		for (int aux = 0; aux <= nome.length - 1; aux++) {
			System.out.print("Qual seu nome: ");
			nome[aux] = teclado.next();
			System.out.print("Qual e o seu estado: ");
			estado[aux] = teclado.next();
			System.out.print("População: ");
			populacao[aux] = teclado.nextInt();
		}
		for (int aux = 0; aux < nome.length - 1; aux++)
			for (int x = 0; x < nome.length - 1; x++)
				if (populacao[x] < populacao[x + 1]) {
					temp = populacao[x];
					populacao[x] = populacao[x + 1];
					populacao[x + 1] = temp;
					tempNome = nome[x];
					nome[x] = nome[x + 1];
					nome[x + 1] = tempNome;
				}
		for (int aux = 0; aux < nome.length - 1; aux++)
			if (populacao[aux] > maiorpopulacao) {
				maiorpopulacao = populacao[aux];
				maiorcidade = nome[aux];
			}
		for (int aux = 0; aux < 10; aux++)
			System.out.println(aux + "Maiores cidades = " + nome[aux]);
		teclado.close();
	}

}
