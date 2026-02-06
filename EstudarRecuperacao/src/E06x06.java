import java.util.Scanner;

public class E06x06 {
	public static void main(String[] args) {
		int A, B, C;
		double delta, x1, x2;
		Scanner teclado = new Scanner(System.in);
		System.out.print("Digite o valor de A: ");
		A = teclado.nextInt();
		System.out.print("Digite o valor de B: ");
		B = teclado.nextInt();
		System.out.print("Digite o valor de C: ");
		C = teclado.nextInt();
		delta = (Math.pow(B, 2) - (4 * A * C));
		x1 =( -B + Math.sqrt(delta)) / (2 * A);
		x2 = (-B - Math.sqrt(delta)) /(2 * A);
		if (delta < 0)
			System.out.println("Não teremos raízes");
		else if (delta == 0)
			System.out.println("Teremos 1 raiz = " + x1);
		else
			System.out.println("Termos 2 raízes reais = " + x1 + " e " + x2);
		teclado.close();

	}

}
