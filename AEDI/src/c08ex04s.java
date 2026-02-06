import java.util.Scanner;

public class c08ex04s {

	public static void main(String[] args) {
		String nome;
		int contator = 0,contator1 = 0, idade;
		Scanner teclado = new Scanner(System.in);
		for (int aux = 1; aux <= 5; aux++) {
		System.out.print("Qual seu nome: ");
		nome = teclado.nextLine();
		System.out.print("Qual sua idade: ");
		idade = teclado.nextInt();
		teclado.nextLine();
		System.out.println("Nome: "+nome+ "\n"+"Idade: "+idade);
		if(idade <= 18) {
		 contator++;
		}else{
		contator1++;
		}
		}
		System.out.println("Até 18 --> "+contator+"\n"+"Acima de 18 --> "+contator1);
		teclado.close();
	}
}
