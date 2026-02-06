import java.util.Scanner;

public class E08x01 {
	public static void main(String[] args) {
		double area, raio;
		Scanner teclado = new Scanner(System.in);
		for (int aux = 1; aux <= 3; aux++) {
			System.out.print("Digite qual é o Raio: ");
			raio = teclado.nextDouble();
			area = (3.1416 * Math.pow(raio, 2));
			System.out.println("Área é: " + area);

		}
		teclado.close();
	}

}
