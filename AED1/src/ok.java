import java.util.Scanner;
    public class ok{
    	public static void main(String[] args) {
    		String nome, nomeMeio ,sobrenome,cpf ;
    		int idade;
    		long carteira;
    		Scanner teclado = new Scanner (System.in);
    		System.out.print("Qual é o seu nome?");
    		nome = teclado.nextLine();
    		System.out.print("Qual é o nome do meio ?");
    		nomeMeio = teclado.nextLine();
    		System.out.println();
    		System.out.print("Qual é o seu sobrenome ?");
    		sobrenome = teclado.nextLine();
    		System.out.print("Qual é o seu CPF?");
    		cpf = teclado.nextLine();
    		System.out.print("Qual é a sua CNH ? ");
    		carteira = teclado.nextLong ();
    		System.out.print("Qual é a sua idade ?");
    		idade = teclado.nextInt();
    		
    		System.out.println("FICHA FUNCIONAL: "+nome);
    		System.out.println("DOCUMENTOS:");
    		System.out.println("IDENTIDADE: "+idade);
    		System.out.println("NOME DO MEIO: "+nome);
    		System.out.println("SOBRENOME: "+sobrenome);
    		System.out.println("CPF: "+cpf);
    		System.out.println("QUAL SEU NOME DO MEIO: " + nomeMeio);
    		System.out.println("Carteira de motorista: "+carteira);
    	    teclado.close();
    	
    	}

    }

    		

    