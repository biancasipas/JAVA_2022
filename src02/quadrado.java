import java.util.Scanner;

public class quadrado {
	public static void geometria01() {
		double area, lado;
		Scanner teclado = new Scanner(System.in);
		System.out.print("Qual numero de lado: ");
		lado = teclado.nextDouble();
		area = Math.pow(lado, 2);
		System.out.println("Aréa é: " + area);
		teclado.close();

	}

}
