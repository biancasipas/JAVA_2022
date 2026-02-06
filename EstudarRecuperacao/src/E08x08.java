import java.util.Scanner;

public class E08x08 {

	public static void main(String[] args) {
		int nota, falta, cont = 0, contador = 0, soma = 0;
		Scanner teclado = new Scanner(System.in);
		for (int aux = 1; aux <= 3; aux++) {
			System.out.print("Qual é a sua notal final: ");
			nota = teclado.nextInt();
			System.out.print("Falta: ");
			falta = teclado.nextInt();
			

			if (nota >= 65 && falta <= 16) {
				System.out.println("ALUNO APROVADO");
				soma += nota;
				cont++;
			} else if (falta < 16) {
				System.out.println("ALUNO REPROVADO");
				contador++;
			} else {
				System.out.println("ALUNO REPROVADO");
			}
		}
		double media = soma / cont;
		System.out.println("Média das notas dos aprovados: " + media);
		System.out.println("Quantidade de alunos com mais de 16 faltas: " + contador);

		teclado.close();
	}
}
