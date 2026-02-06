import java.util.Scanner;
public class c12ex13 {
	public static void main(String[] args) {
		//Programadora: Bianca Maria Fernandes Alves
 String nome[] = new String[12];
 String temp;
 Scanner teclado = new Scanner(System.in);
 for(int aux=0; aux<=nome.length-1;aux++) {
 System.out.print("Digite o nome mês ");
 nome[aux] = teclado.next();
 }
 for (int aux=nome.length-1; aux>0; aux--)
     for (int x=0; x<nome.length-1; x++)
      if (nome[x].compareToIgnoreCase(nome[x+1])>0) {
     temp = nome[x];
       nome[x] = nome[x+1];
       nome[x+1] = temp;	 
	}
	for (int aux=0; aux<=nome.length-1;aux++)
		System.out.println(aux+" - "+nome[aux]);
 teclado.close();
}}
