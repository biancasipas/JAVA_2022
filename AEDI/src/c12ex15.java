import java.util.Scanner;

public class c12ex15 {
	public static void main(String[] args) {
		// Programadora: Bianca Maria Fernandes Alves
		int numero[] = new int[10];
		int soma = 0, contador=0;
		float media = 0;
		Scanner teclado = new Scanner(System.in);
		for (int aux = 0; aux <= numero.length - 1; aux++) {
			System.out.print("Informado do valor: ");
			numero[aux] = teclado.nextInt();
		}
		System.out.print("Numeros pares: ");
		for (int aux = 0; aux <= numero.length - 1; aux++) {
			if (numero[aux] % 2 == 0) {
				System.out.print(numero[aux]+" ");
				soma += numero[aux];
				contador++;	
			}}
			System.out.println();
			media =(float) soma /contador;
				System.out.println("Média dos números pares : " +media);
			teclado.close();
		}}
