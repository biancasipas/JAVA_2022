package conteudo06;

import java.util.Scanner;
public class c06ex06 {
	public static void main(String[] args) {
		// Programadora:Bianca Maria
		double A, B, C;
		Scanner teclado = new Scanner (System.in);
		System.out.print("Qual � o valor A: ");
		A = teclado.nextDouble();
		System.out.print("Qual � o valor B: ");
		B = teclado.nextDouble();
		System.out.print("Qual � o valor C: ");
		C = teclado.nextDouble();
		double delta = Math.pow(B,2) -(4*A*C);
		double delta1 = Math.sqrt(delta);
		double r0 = (-B ) / (2*A);
        double r1 = (-B + delta1)/ (2*A);
        double r2 = (-B - delta1)/ (2*A);
		if (delta == 0)
		System.out.print("Teremos uma ra�z com valor de:" +r0);
		else
		if (delta > 0)
		System.out.print("teremos 2 ra�zes: "+r1+ "para a primeira ra�z e" +r2+ "para a segunda ra�z");
		else
		if (delta<0)
		System.out.print("N�o termos ra�zes, com os valores de A: = " +A + ",B=" +B +" e C =" +C);
		teclado.close();
	}

}
