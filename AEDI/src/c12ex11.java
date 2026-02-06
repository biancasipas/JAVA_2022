import java.util.Scanner;
public class c12ex11 {
	public static void main(String[] args) {
		//Programadora: Bianca Maria Fernades Alves
Scanner teclado = new Scanner(System.in);
 String nome[] = new String[8];
 int nota[] = new int [nome.length];
 int maiornota=0;
 String maiornome = null;
 for(int aux=0;aux <= nome.length-1; aux++) {
 System.out.print("Qual seu nome: ");
 nome[aux] = teclado.next();
 System.out.print("Qual e a sua nota: ");
 nota[aux] = teclado.nextInt();
 }
 for(int aux = 0; aux<= nome.length-1;aux++){
 if(nota[aux]>maiornota) {
	 maiornota = nota[aux];
	 maiornome = nome[aux];
 }

	}
 System.out.println("Nota ficou acima : " +maiornome);
teclado.close();
}}
