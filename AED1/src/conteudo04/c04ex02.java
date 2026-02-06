package conteudo04;

import java.util.Scanner;
public class c04ex02 {
	public static void main(String[] args) {
		String nome, cpf, idade, nome_empresa, titulo_eleitor;
		int salario;
		long cnh;
		Scanner teclado = new Scanner (System.in);
		System.out.print("Qual seu nome: ");
		nome = teclado.nextLine();
		System.out.print("Qual o seu CPF: ");
		cpf = teclado.nextLine();
		System.out.print("Qual � a seu idade: ");
		idade = teclado.nextLine();
		System.out.print("Qual o nome da sua empresa: ");
		nome_empresa = teclado.nextLine();
		System.out.print("Qual � o seu titulo eleitor: ");
		titulo_eleitor = teclado.nextLine();
		System.out.print("O valor do seu sal�rio mensal: ");
		salario = teclado.nextInt();
		System.out.print("O n�mero da sua CNH :");
		cnh = teclado.nextLong();
		
		System.out.println("FICHA FUNCIONAL DE"+ nome);
		System.out.println();
		System.out.println("Documentos: ");
		System.out.println("CPF....................."+ cpf);
		System.out.println("Identidade ............."+ idade);
		System.out.println("Empresa ................"+ nome_empresa);
		System.out.println("Titulo eleitor.........."+ titulo_eleitor);
		System.out.println("O Sal�rio..............."+ salario);
		System.out.println("Carteira de motorista..."+ cnh);
		teclado.close();
		
		
		
		
	}

}
