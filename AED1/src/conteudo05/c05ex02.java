package conteudo05;

import java.util.Scanner;
public class c05ex02 {
	public static void main(String[] args) {
		double r;
		Scanner teclado = new Scanner(System.in);
		System.out.print("Digite um n�mero do Raio: ");
		r = teclado.nextDouble();
		double area = 3.1416 * Math.pow(r,3);
		System.out.print("o valor da area � :"+area);
		teclado.close();
	}

}
