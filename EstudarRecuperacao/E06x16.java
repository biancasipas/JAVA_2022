import java.util.Scanner;

public class E06x16 {
	public static void main(String[] args) {
		String resultadoFinal;
		int falta, idade, peso1, peso2;
		double notaProva1, notaProva2, notaProva3, notaTrabalho, notaFinal;
		Scanner teclado = new Scanner(System.in);
		System.out.print("Faltas: ");
		falta = teclado.nextInt();
		System.out.print("Nota primeiro de prova: ");
		notaProva1 = teclado.nextDouble();
		System.out.print("Notas segunda de prova: ");
		notaProva2 = teclado.nextDouble();
		System.out.print("Notas tercerio de prova: ");
		notaProva3 = teclado.nextDouble();
		System.out.print("Nota trabalho de final: ");
		notaTrabalho = teclado.nextDouble();
		System.out.print("Idade: ");
		idade = teclado.nextInt();

		if (falta <= 5)
			peso1 = 3;
		else if (falta >= 5 && falta <= 10)
			peso1 = 2;
		else
			peso1 = 1;

		if (idade <= 17)
			peso2 = 1;
		else if (idade >= 18 && idade <= 50)
			peso2 = 2;
		else
			peso2 = 3;

		if (notaProva1 < notaProva2 && notaProva1 < notaProva3) {
			notaFinal = (notaProva2 + notaProva3 / 2) * peso1 + notaTrabalho * peso2;
		} else if (notaProva2 < notaProva1 && notaProva2 < notaProva3) {
			notaFinal = (notaProva1 + notaProva3 / 2) * peso1 + notaTrabalho * peso2;
		} else {
			notaFinal = (notaProva1 + notaProva2 / 2) * peso1 + notaTrabalho * peso2;
		}
		if (notaFinal <= 50)
			resultadoFinal = "Reprovado";
		else if (notaFinal >= 50 && notaFinal <= 70)
			resultadoFinal = "Regular";
		else if (notaFinal >= 70 && notaFinal <= 80)
			resultadoFinal = "Bom";
		else if (notaFinal >= 80 && notaFinal <= 90)
			resultadoFinal = "Muito Bom";
		else
			resultadoFinal = "Excelente";
		System.out.println("Resultado: " + resultadoFinal);
		teclado.close();

	}
}
