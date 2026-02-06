package conteudo05;

import java.util.Scanner;
public class c05ex06 {
	public static void main(String[] args) {
		// Programadora Bianca Maria
		double A, B, C, X, Y;
		Scanner teclado = new Scanner (System.in);
		System.out.print("Qual � o valor A: ");
		A = teclado.nextDouble();
		System.out.print("Qual � o valor B: ");
		B = teclado.nextDouble();
		System.out.print("Qual � o valor C: ");
		C = teclado.nextDouble();
		System.out.print("Qual � o valor X: ");
		X = teclado.nextDouble();
		System.out.print("Qual � o valor Y : ");
		Y = teclado.nextDouble();
		double R = A*X + B*Y + C;
		double distancia = (A*X + B*Y + C)/Math.sqrt(Math.pow(A,2)+ Math.pow(B,2));
		System.out.println("Qual n�mero da reta: "+R);
		System.out.println("Qual e a dist�ncia: "+distancia);
		teclado.close();	

	}

	
}
