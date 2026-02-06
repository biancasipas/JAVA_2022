import java.util.Scanner;

public class chamado02 {
	public static void programar() {
	String nome, nomeMeio, sobrenome;
	int idade;
	Scanner teclado = new Scanner(System.in);
	System.out.print("Qual seu nome ?");
	nome = teclado.nextLine();
	System.out.print("Qual seu nome do meio ? ");
	nomeMeio = teclado.nextLine();
	System.out.print("Qual seu sobrenome");
	sobrenome = teclado.nextLine();
	System.out.print("Informe sua idade: ");
	idade = teclado.nextInt();
	System.out.print(sobrenome+ ','+nome+ ','+nomeMeio);
	System.out.print("Idade: "+idade+ "anos");
	teclado.close();		
	}
}
