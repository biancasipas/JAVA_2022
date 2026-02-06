import java.util.Scanner;

public class E06x02 {
	public static void main(String[] args) {
		double poluente, multa;
		Scanner teclado = new Scanner(System.in);
		System.out.print("Digite a Quantidade de Poluente: ");
		poluente = teclado.nextDouble();
		if (poluente <= 1500)
			multa = 0;
		else if (poluente >= 1500 && poluente <= 3500)
			multa = 3000;
		else
			multa = (5000 * poluente);
		System.out.println("Multa é: " + multa);
		teclado.close();
	}

}
