import java.util.Scanner;

public class c12ex17 {
	public static void main(String[] args) {
		// Programadora: Bianca Maria Fernades Alves
		int numero[] = new int[10];
		int numero2[] = new int[10];
		Scanner teclado = new Scanner(System.in);
		for (int aux = 0; aux <= numero.length - 1; aux++) {
			System.out.print("Digite um numero: ");
			numero[aux] = teclado.nextInt();
		}
		for (int aux = numero.length - 1; aux >= 0; aux--) {
			for(int aux2=0;aux<=numero.length-1;aux2++) {
				numero2[aux2]=numero[9-aux2];
			System.out.println(numero2[aux2]);
		teclado.close();
		}}}
		
		
	}
