import java.util.Scanner;

public class E08x03 {
	public static void main(String[] args) {
		int contadorA = 0, contadorB = 0, notaFinal, falta;
		Scanner teclado = new Scanner(System.in);
		for (int aux = 0; aux <= 3; aux++) {
			System.out.print("Qual é a sua nota final : ");
			notaFinal = teclado.nextInt();
			System.out.print("Quanto falta: ");
			falta = teclado.nextInt();
			if (notaFinal >= 65 && falta <= 16) {
				System.out.println("ALUNO APROVADO");
				contadorA++;

			} else {
				System.out.println("ALUNO REPROVADO");
				contadorB++;
			}
			System.out.println("APROVADOS: " + contadorA);
			System.out.println("REPORVADOS: " + contadorB);

		}
		teclado.close();
	}
}
