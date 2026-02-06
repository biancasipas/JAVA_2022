import java.util.Scanner;

public class chamado03 {
	public static void programar02() {
		String nome, cpf, idade, nome_empresa, titulo_eleitor;
		int salario;
		long cnh;
		Scanner teclado = new Scanner (System.in);
		System.out.print("Qual seu nome: ");
		nome = teclado.nextLine();
		System.out.print("Qual o seu CPF: ");
		cpf = teclado.nextLine();
		System.out.print("Qual é a seu idade: ");
		idade = teclado.nextLine();
		System.out.print("Qual o nome da sua empresa: ");
		nome_empresa = teclado.nextLine();
		System.out.print("Qual é o seu titulo eleitor: ");
		titulo_eleitor = teclado.nextLine();
		System.out.print("O valor do seu salário mensal: ");
		salario = teclado.nextInt();
		System.out.print("O número da sua CNH :");
		cnh = teclado.nextLong();
		
		System.out.println("FICHA FUNCIONAL DE"+ nome);
		System.out.println();
		System.out.println("Documentos: ");
		System.out.println("CPF....................."+ cpf);
		System.out.println("Identidade ............."+ idade);
		System.out.println("Empresa ................"+ nome_empresa);
		System.out.println("Titulo eleitor.........."+ titulo_eleitor);
		System.out.println("O Salário..............."+ salario);
		System.out.println("Carteira de motorista..."+ cnh);
		teclado.close();
		
	}

}
