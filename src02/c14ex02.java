import java.util.Scanner;

public class c14ex02 {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int escolher = 0;
		while (escolher != 4) {
			System.out.println("Qual você quer geometrica: ");
			System.out.println("1 - Quadrado");
			System.out.println("2 - Retângulo");
			System.out.println("3 - Triângulo retângulo");
			System.out.println("4 - Circulo");
			escolher = teclado.nextInt();
		switch (escolher) {
		case 1:
			quadrado.geometria01();
			break;
		case 2:
			retangulo.geometria02();
			break;
		case 3:
			triangulo.geometria03();
			break;
		case 4:
			circulo.goemetria04();
			break;
		default:
			System.out.println("INVÁLIDA");
			break;
		}
		teclado.close();
	}
}}
