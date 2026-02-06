import java.util.Scanner;
import java.util.Arrays;
public class c12ex19 {
	public static void main(String[] args) {
		//Programadora: Bianca Maria Fernades Alves
	int numero [] = new int [10]; // os numers de  100 bilhetes e so teste 10 bilhetes
	Scanner teclado = new Scanner(System.in);
	for(int aux =0; aux <= numero.length-1;aux++) {
	System.out.print("Digite o numero de bilhete ");
	numero[aux] = teclado.nextInt();
	}
    System.out.print("Qual o número do blhete sorteado ");
    Arrays.sort(numero);
    int numero1 = teclado.nextInt();
    int pos = Arrays.binarySearch(numero, numero1);
    if (pos < 0)
       System.out.println("O número não encontrado");
    else
       System.out.println("A foi pessoa foi premiada "+(pos+1));
    teclado.close();

	}

}
