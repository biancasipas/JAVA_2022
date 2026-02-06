package conteudo06;

import java.util.Scanner;
 public class c06ex14 {
	public static void main(String[] args) {
		// Programadora Bianca Maria
		      int numero, d1, d2, d3;
		      Scanner teclado = new Scanner(System.in);
		      System.out.print("Informe n�mero inteiro de 3 d�gitos: ");
		      numero = teclado.nextInt();
		      d1 = numero / 100;
		      d2 = numero / 10 % 10;
		      d3 = numero % 10;
		      System.out.println(d1+"-"+d2+"-"+d3);
		      teclado.close();

	}

}
