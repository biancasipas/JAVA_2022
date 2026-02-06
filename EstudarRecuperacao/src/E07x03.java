import java.util.Scanner;

public class E07x03 {
	public static void main(String[] args) {
		int diaAtraso;
		double multa, imposto;
		Scanner teclado = new Scanner(System.in);
		System.out.print("Dias de atraso: ");
		diaAtraso = teclado.nextInt();
		System.out.print("Imposto: ");
		imposto = teclado.nextDouble();
		switch (diaAtraso) {
		case 1:
		case 2:
		case 3:
		case 4:
		case 5:
			multa = 0;
			System.out.println("Multa é: " + multa);
			break;
		case 6:
		case 7:
		case 8:
			multa = (0.02) * imposto;
			System.out.println("Multa é: " + multa);
			break;
		case 9:
		case 10:
			multa = (0.10 + (0.005 * diaAtraso)) * imposto;
			System.out.println("Multa é: " + multa);
			break;
		default:
			multa = (1.50*imposto) + (1*diaAtraso);
			System.out.println("Multa é: " + multa);
			break;

		}

		teclado.close();
	}

}
