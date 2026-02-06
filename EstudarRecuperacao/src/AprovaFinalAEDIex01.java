
//Bianca Maria Fernandes Alves
import java.util.Scanner;

public class AprovaFinalAEDIex01 {

	public static void main(String[] args) {
		int numero, pos1 = -1, pos2 = -1, temp;
		int vetPar[] = new int[10];
		int vetImpar[] = new int[10];
		Scanner teclado = new Scanner(System.in);
		for (int aux = 0; aux < 10; aux++) {
			System.out.print("Digite o valor informação: ");
			numero = teclado.nextInt();
			if (numero % 2 == 0) {
				pos1++;
				vetPar[pos1] = numero;
			} else {
				pos2++;
				vetImpar[pos2] = numero;
			}
		}
		for (int aux = 0; aux < vetPar.length - 1; aux++)
			for (int x = 0; x < vetPar.length - 1; x++)
				if (vetPar[x] < vetPar[x + 1]) {
					temp = vetPar[x];
					vetPar[x] = vetPar[x + 1];
					vetPar[x + 1] = temp;
				}
		for (int aux = 0; aux < vetImpar.length - 1; aux++)
			for (int x = 0; x < vetImpar.length - 1; x++)
				if (vetImpar[x] < vetImpar[x + 1]) {
					temp = vetImpar[x];
					vetImpar[x] = vetImpar[x + 1];
					vetImpar[x + 1] = temp;
				}
		System.out.println("Vetor 1:");
		for (int aux = 0; aux <= pos1; aux++)
			System.out.println(vetPar[aux]);
		System.out.println("Vetor 2:");
		for (int aux = 0; aux <= pos2; aux++)
			System.out.println(vetImpar[aux]);
		teclado.close();
	}
}
