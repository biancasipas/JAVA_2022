import java.util.Scanner;

public class E07x04 {
	public static void main(String[] args) {
		String equipe;
		Scanner teclado = new Scanner(System.in);
		System.out.print("Digite o nome de uma equipe de futebol:");
		equipe = teclado.nextLine();
		switch (equipe) {
		case "América":
		case "Atlético":
		case "Cruzeiro":
		case "Villa Nova":
			System.out.println("Minas Gerais");
			break;
		case "Botafogo":
		case "Flamengo":
		case "Fluminense":
		case "Vasco":
			System.out.println("Rio de Janeiro");
			break;
		case "Corinthians":
		case "Palmeiras":
		case "Santos":
		case "São Paulo":
			System.out.println("Rio Grande do Sul");
			break;
		case "Grêmio":
		case "Internacional":
		case "Juventude":
			System.out.println("Rio Grande so Sul");
			break;
		case "Náutico":
		case "Santa Cruz":
		case "Sport":
			System.out.println("Pernambuco");
			break;

		}
		teclado.close();
	}

}
