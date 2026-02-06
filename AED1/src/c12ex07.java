import java.util.Scanner;

import javax.swing.JOptionPane;
public class c12ex07 {
	public static void main(String[] args) {
		//Programadora: Bianca Maria
 int nota[] = new int [3];
 String nome[] = new String[nota.length];
Scanner teclado = new Scanner(System.in);
for(int aux=0; aux<= nota.length-1; aux++ ) {
	System.out.print("Qual seu nome");
	nome[aux] = teclado.next();
	System.out.print("Qual e a sua nota : ");
	nota[aux] = teclado.nextInt();
}
for(int aux= 0; aux<= nota.length-1;aux++) {
if(nota[aux] <= 30) {
System.out.println("Conceito D e nome "+nome[aux]);
}
else if(nota[aux] >= 31 && nota[aux]<= 60) {
System.out.println("Conceito C e nome "+nome[aux]);
}
else if(nota[aux] >= 61 && nota[aux]<= 80) {
System.out.println("Conceito B e nome "+nome[aux]);
}
else {
System.out.println("Conceito A e nome "+nome[aux]);
}
teclado.close();

}}}
	// sempre usar o NOME dado ao vetor, no caso nota