import java.util.Scanner;

public class c13ex01 {
	static int x1, x2, y1, y2;
	static double raiz;

	public static void main(String[] args) {
		// Programadora: Bianca Maria
		Scanner teclado = new Scanner(System.in);
		System.out.print("Digite o ponto primeiro x: ");
		x1 = teclado.nextInt();
		System.out.print("Digite o ponto primeiro y: ");
		y1 = teclado.nextInt();
		System.out.print("Digite o ponto segundo x: ");
		x2 = teclado.nextInt();
		System.out.print("Digite o ponto segundo y: ");
		y2 = teclado.nextInt();
		raiz(x1, y1, x2, y2);
		System.out.print("Raiz quadrada = " +raiz);
		teclado.close();
	}

	static void raiz(int x1, int y1, int x2, int y2) {
		raiz = Math.sqrt(Math.pow(x1 - x2, 2) + Math.pow(y1 - y2, 2));
	}

}
