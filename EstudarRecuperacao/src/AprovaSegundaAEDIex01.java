
//Bianca Maria Fernandes Alves
import java.util.Scanner;

public class AprovaSegundaAEDIex01 {

	public static void main(String[] args) {
		int capacidade, entrar, sairam = 0, capacidadeMax, cap;
		Scanner teclado = new Scanner(System.in);
		System.out.print("A capacidade máxima de pessoas que cabem no único elevador de um prédio: ");
		capacidade = teclado.nextInt();
		for (int aux = 1; aux <= 5; aux++) {
			System.out.print("O número de pessoas que entraram: ");
			entrar = teclado.nextInt();

			if (aux > 1) {
				System.out.print("O número de pessoas que saíram: ");
				sairam = teclado.nextInt();
			}
			System.out.println(
					"ANDAR " + aux + "\n" + "As pessoas entram: " + entrar + "\n" + "As pessoas sairma: " + sairam);
			capacidadeMax = entrar + sairam;
			if (capacidade <= capacidadeMax) {
				cap = capacidadeMax  - capacidade;
				capacidade = capacidadeMax;
				System.out.println("“EXCESSO DE PASSAGEIROS," + cap + " DEVEM SAIR\"");
			}
		}
		System.out.println("Quantidade de pessoas que chegaram ao último andar: " + capacidade);
		teclado.close();
	}

}
