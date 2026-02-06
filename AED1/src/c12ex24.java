import java.util.Scanner;

public class c12ex24 {
	public static void main(String[] args) {
		int numero[] = new int[10];
		int numero2[] = new int[numero.length];
		Scanner teclado = new Scanner(System.in);
		for (int aux = 0; aux <= numero.length - 1; aux++) {
			System.out.print("Digite o número: ");
			numero[aux] = teclado.nextInt();
		}
		for (int aux = 0; aux <= numero.length - 1; aux++) {
			if (numero[aux] % 3 == 0) {
				numero2[aux] = numero[aux];
				System.out.println(numero2[aux]);
			}
		}
		teclado.close();

	}

}
