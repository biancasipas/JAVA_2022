import java.util.Scanner;
public class c12ex09 {
	public static void main(String[] args) {
 int numero[] = new int [10];
 int soma=0;
 Scanner teclado = new Scanner(System.in);
 for(int aux=0 ;aux <=numero.length-1;aux++) {
	 System.out.print("Digite o numero: ");
	 numero[aux] = teclado.nextInt();
	soma+=numero[aux];
 }
 for(int aux=0; aux <= numero.length-1;aux++) {
 if(soma % numero[aux]==0) {
System.out.println("Numero impressos: "+numero[aux]);
teclado.close();
 }
	 
	 

	}

}}
