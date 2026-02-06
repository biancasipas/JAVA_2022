import java.util.Scanner;

public class c14ex02estudar {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		double area, lado, raio, altura, base;
		int opcao = 0;
		while (opcao != 4) {
			System.out.println("1 - Calcula área do Quadrado   ");
			System.out.println("2 - Calcula área do Retangulo   ");
			System.out.println("3 - Calcula área do Triãngulo   ");
			System.out.println("4 - Calcula área do Circulo     ");
			opcao = teclado.nextInt();

			switch (opcao) {
			case 1:
				System.out.print("Digite qual é o valor do lado: ");
				lado = teclado.nextDouble();
				area = areageometrica.areaquadrado(lado);
				System.out.println("Aréa do Quadrado = " + area);
				break;
			case 2:
				System.out.print("Digite qual é o valor da altura: ");
				altura = teclado.nextDouble();
				System.out.print("Digite qual é o valor da base: ");
				base = teclado.nextDouble();
				area = areageometrica.arearetangulo(altura, base);
				System.out.println("Aréa do Triângulo: " + area);
				break;
			case 3:
				System.out.print("Digite qual é o valor da altura");
				altura = teclado.nextDouble();
				System.out.print("Digite qual é o valor do lado");
				lado = teclado.nextDouble();
				area = areageometrica.areatriangulo(lado, altura);
				System.out.println("Aréa do Triângulo: " + area);
				break;
			case 4:
				System.out.print("Qual é o valor do raio: ");
				raio = teclado.nextDouble();
				area = areageometrica.areacirculo(raio);
				System.out.println("Aréa do Circulo: " + area);
				break;
			}
			teclado.close();
		}
	}
}
