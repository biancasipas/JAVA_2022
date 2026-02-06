import java.util.Scanner;

public class Prova2_CC1MA_2022_1_questao1 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int capac, entraram, sairam = 0, quant = 0, sair;
		System.out.println("Informe capacidade máxima de pessoas no elevador:");
		capac = teclado.nextInt();
		for (int aux = 1; aux <= 5; aux++) {

			System.out.println("Quantas pessoas entraram no elevador?");
			entraram = teclado.nextInt();

			if (aux > 1) {
				System.out.println("Quantas pessoas saíram do elevador?");
				sairam = teclado.nextInt();
			}
			System.out.println("Andar " + aux + " (" + quant + " pessoas)");
			quant += entraram - sairam;
			if (quant > capac) {
				sair = quant - capac;
				quant = capac;
				System.out.println("EXCESSO DE PASSAGEIROS, " + sair + " DEVE(M) SAIR");
			}
		}
		System.out.println("Quantidade de pessoas que chegaram ao último andar: " + quant);
		teclado.close();
	}

}