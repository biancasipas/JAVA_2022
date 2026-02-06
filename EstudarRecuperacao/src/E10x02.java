import java.util.Scanner;

public class E10x02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double media, valorTotal, contador = 0, soma = 0, contadorA = 0;
		System.out.println("O último valor, que não entrará nos cálculos = 0 ");
		Scanner teclado = new Scanner(System.in);
		do {
			System.out.print("Digite o valor recebido: ");
			valorTotal = teclado.nextDouble();
			if (valorTotal != 0) {
				soma += valorTotal;
				contador++;
				if (valorTotal >= 1000) {
					contadorA++;
				}
			}

		} while (valorTotal != 0);
		media = soma / contador;
		System.out.println("Valor total recebido: " + soma);
		System.out.println("Média dos valores recebidos: " + media);
		System.out.println("Quantidade de valores acima de R$1000: " + contadorA);
		teclado.close();
	}
}
