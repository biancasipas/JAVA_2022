import java.util.Scanner;

public class E10x03 {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		System.out.println("Para finalizar digite -1");
		double raio, a, setorCircular;
		do {
			System.out.print("Digite o Raio: ");
			raio = teclado.nextDouble();
			System.out.print("Digite o ângulo: ");
			a = teclado.nextDouble();
			if (raio != -1) {
				setorCircular = a*3.1416*Math.pow(raio,2)/360;
				System.out.println("A área de um setor circular é: "+setorCircular);
			}

		} while (raio != -1);
      
      teclado.close();
	}

}
