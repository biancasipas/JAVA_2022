import java.util.Scanner;

public class E08x09 {

	public static void main(String[] args) {
		String nome, sexo;
		int idade, somaM = 0, somaF = 0, contM = 0, contF = 0;
		double mediaM, mediaF;
		Scanner teclado = new Scanner(System.in);
		for (int aux = 1; aux <= 5; aux++) {
			System.out.print("Qual é o seu nome: ");
			nome = teclado.nextLine();
			
			System.out.print("Qual é a sua idade: ");
			idade = teclado.nextInt();
			teclado.nextLine();
			System.out.print("Digite o sexo Masculino(M)/Feminino(F): ");
			sexo = teclado.nextLine();
			

			if (sexo.equalsIgnoreCase("M")) {
				System.out.println(nome + " é masculino. ");
				somaM += idade;
				contM++;
			} else {
				System.out.println(nome + " é feminino. ");
				somaF += idade;
				contF++;
			}
		}
		mediaM = (float) somaM / contM;
		mediaF = (float) somaF / contF;
		System.out.println("Média das idades dos homens: " + mediaM);
		System.out.println("Média das idades das mulheres: " + mediaF);
		teclado.close();

	}

}
