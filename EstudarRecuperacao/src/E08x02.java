import java.util.Scanner;

public class E08x02 {
	public static void main(String[] args) {
		int nota, falta;
		Scanner teclado = new Scanner(System.in);
		for (int aux = 1; aux <= 6; aux++) {
			System.out.print("Qual é a sua nota final: ");
			nota = teclado.nextInt();
			System.out.print("Falta: ");
			falta = teclado.nextInt();
			if (nota == -1)
				break;
			if (nota >= 65 && falta <= 16)
				System.out.println("ALUNO APROVADO");
			else
				System.out.println("ALUNO REPROVADO");

		}
		teclado.close();

	}

}
