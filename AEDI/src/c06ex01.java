import java.util.Scanner;

public class c06ex01 {
	public static void main(String[] args) {
		// Programadora Bianca Maria
		double x, funcao;
		Scanner teclado = new Scanner(System.in);
		System.out.print("Qual é o número de x: ");
		x = teclado.nextDouble();
		if (x < 4)
			funcao = (5 * x + 3) / Math.sqrt(16 - Math.pow(x, 2));
		else if (x == 4)
			funcao = 0;
		else
			funcao = (5 * x + 3) / Math.sqrt(Math.pow(x, 2) - 16);
		System.out.println("Função tem o valor de:" + funcao);
		teclado.close();

	}

}
