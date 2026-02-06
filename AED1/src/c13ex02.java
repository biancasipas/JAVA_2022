import java.util.Scanner;

public class c13ex02 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int x;
		do {
			System.out.println("Digite o valor de x: ");
			x = teclado.nextInt();
			if (x != -1) {
				System.out.println("Função = " + calcular(x));
			}
		} while (x != -1);
		teclado.close();
	}

	public static double calcular(int x) {
		double resultado = 0;
		if (x < 4) {
			resultado = (5 * x + 3) / Math.sqrt(16 - Math.pow(x, 2));
		} else if (x > 4) {
			resultado = (5 * x + 3) / Math.sqrt(Math.pow(x, 2) - 16);
		}
		return resultado;
	}
}
