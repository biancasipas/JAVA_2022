package conteudo06;

import java.util.Scanner;
public class c06ex05 {
	public static void main(String[] args) {
		// Programadora: Bianca
	int numero;
	Scanner teclado = new Scanner (System.in);
	System.out.print( "Digite um n�mero inteiro: ");
	numero = teclado.nextInt();
	if(numero % 5 == 0 && numero % 7 == 0)
	System.out.println(numero+ " � divis�vel, simultaneamente,por 5 e 7");
	else
    System.out.println(numero+ " n�o � divis�vel, simultaneamanete,po 5 e 7");
	teclado.close(); 
	}
}
