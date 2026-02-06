import java.util.Scanner;
public class Testearquivo {
	public static void main(String[] args) {
		String nome, cpf, titulo_eleitor,nome_empresa, idade, carteira;
	      double salario;
	      Scanner arquivo = new Scanner(
	              Testearquivo.class.getResourceAsStream("teste.txt"));
	      nome = arquivo.nextLine();
	      cpf = arquivo.nextLine();
	      titulo_eleitor = arquivo.nextLine();
	      idade = arquivo.nextLine();
	      salario = arquivo.nextDouble();
	      arquivo.nextLine();
	      carteira = arquivo.nextLine();
	      nome_empresa = arquivo.nextLine();
	      System.out.println("Nome: "+nome);
	      System.out.println("CPF: "+cpf);
	      System.out.println("Título de eleitor: "+titulo_eleitor); 
	      System.out.println("identidade: "+idade); 
	      System.out.println("Carteira de motorista: "+carteira);
	      System.out.println("Nome da empresa: "+nome_empresa);
	      System.out.println("Salário: "+salario);
	      arquivo.close();
	   }
	}

