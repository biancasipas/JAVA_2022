package conteudo05;

import java.util.Scanner;
  public class c05ex01 {
	public static void main(String[] args) {
		double x;
		Scanner teclado = new Scanner (System.in);
		System.out.print("Digite um n�mero Interio: ");
		x = teclado.nextDouble();
		double f = Math.pow(x,3) + 4*x + 10;
		System.out.println("o valor da fun��o �:" +f)
		;
		teclado.close();
	}

}
