import java.util.Scanner;

public class E07x01 {
	public static void main(String[] args) {
		int acerto;
		Scanner teclado = new Scanner(System.in);
		System.out.print("A quantidade de acertos: ");
		acerto = teclado.nextInt();
		switch (acerto) {
		case 1:
		case 2:
		case 3:
		case 4:
		case 5:
			System.out.println("Nenhum prêmio");
			break;
		case 6:
		case 7:
		case 8:
		case 9:
		case 10:
			System.out.println("Ganha outro cartão");
			break;
		case 11:
			System.out.println("Prêmio de R$100,00");
			break;
		case 12:
			System.out.println("Prêmio de R$1.000,00");
			break;
		case 13:
			System.out.println("Prêmio de R$50.000,00");
		}
		teclado.close();
	}

}
