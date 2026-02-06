import java.util.Scanner;

public class ProvaF_CC1MA_2022_1_questao1 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int num, pos1 = -1, pos2 = -1, temp;
		int vet1[] = new int[10];
		int vet2[] = new int[10];
		for (int aux = 0; aux < 10; aux++) {
			System.out.print("Informe um número inteiro: ");
			num = teclado.nextInt();
			if (num % 2 == 0) {
				pos1++;
				vet1[pos1] = num;
			} else {
				pos2++;
				vet2[pos2] = num;
			}
		}
		for (int aux = 0; aux < vet1.length - 1; aux++)
			for (int x = 0; x < vet1.length - 1; x++)
				if (vet1[x] < vet1[x + 1]) {
					temp = vet1[x];
					vet1[x] = vet1[x + 1];
					vet1[x + 1] = temp;
				}
		for (int aux = 0; aux < vet2.length - 1; aux++)
			for (int x = 0; x < vet2.length - 1; x++)
				if (vet2[x] < vet2[x + 1]) {
					temp = vet2[x];
					vet2[x] = vet2[x + 1];
					vet2[x + 1] = temp;
				}
		System.out.println("Vetor 1:");
		for (int aux = 0; aux <= pos1; aux++)
			System.out.println(vet1[aux]);
		System.out.println("Vetor 2:");
		for (int aux = 0; aux <= pos2; aux++)
			System.out.println(vet2[aux]);
		teclado.close();

	}
}
