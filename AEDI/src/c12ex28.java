
import java.util.Arrays;
import java.util.Scanner;

public class c12ex28 {
	
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		String nome[] = new String[5];
		String RA[] = new String[5];
		String nome1,RA1;
		for(int aux=0; aux<=nome.length-1;aux++) {
		 System.out.print("Digite o nome do aluno: ");
		 nome[aux] = teclado.nextLine();
		 System.out.print("Digite registro acadêmico");
		 RA[aux] = teclado.nextLine();
		}
		for (int aux=nome.length-1; aux>0; aux--)
		     for (int x=0; x<nome.length-1; x++)
		         if (nome[x].compareToIgnoreCase(nome[x+1])>0) {
		        nome1 = nome[x];
		          nome[x] = nome[x+1];
		          nome[x+1] = nome1;	 

		          RA1 = RA[x];
		            RA[x] = RA[x+1];
		            RA[x+1] = RA1;
		         }
	
		for (int aux=0; aux<=nome.length-1;aux++)
			System.out.println(aux+" - "+nome[aux]);

		System.out.print("Achar a lista do aluno");
	    Arrays.sort(nome);
	    String nome01 = teclado.nextLine();
	    int pos = Arrays.binarySearch(nome,nome01);
	    if (pos <= 0)
	       System.out.println("NOME NÃO ENCONTRADO");
	    else
	       System.out.println("A foi pessoa foi premiada "+(pos+1));
	    teclado.close();
	}

}
