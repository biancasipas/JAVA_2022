import java.util.Scanner;

public class triangulo {
	public static void geometria03() {
		Scanner teclado = new Scanner(System.in);
		double area, base, altura;
		System.out.print("Qual é a base do triangulo: ");
		base = teclado.nextDouble();
		System.out.print("Qual é a altura do triangulo: ");
		altura = teclado.nextDouble();
		area = (base * altura / 2);
		System.out.println("Aréa do triângulo é: " + area);
		teclado.close();

	}

}
