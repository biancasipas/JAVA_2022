package conteudo05;

import java.util.Scanner;
public class c05ex10 {
	public static void main(String[] args) {
		// Programadora Bianca Maria
		int numero, d1, d2, d3, d4, d5;
		System.out.print("Informe n�mero inteiro de 5 d�gitos: ");
		Scanner teclado = new Scanner (System.in);
		numero = teclado.nextInt();
		d1 = numero / 10000;
		d2 = numero / 1000 % 10;
		d3 = numero / 100 % 10;
		d4 = numero / 10 % 10;
		d5 = numero % 10;
		System.out.println(d1+"-"+d2+"-"+d3+"-" +d4+"-"+d5);	
        teclado.close();
	}

}
