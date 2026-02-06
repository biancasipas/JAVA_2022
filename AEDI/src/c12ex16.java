import java.util.Scanner;

public class c12ex16 {
	public static void main(String[] args) {
		// Programadora: Bianca Maria
		int numero[] = new int[10];
	  double real;
		Scanner teclado = new Scanner(System.in);
		for (int aux = 0; aux <= numero.length - 1; aux++) {
			System.out.print("Digite um numero: ");
			numero[aux] = teclado.nextInt();
		}
		System.out.print("Digite um numero real: ");
		real = teclado.nextDouble();
		for (int aux = 0; aux < numero.length - 1; aux++)
			System.out.println(numero[aux] * real);
		teclado.close();
	}
}
