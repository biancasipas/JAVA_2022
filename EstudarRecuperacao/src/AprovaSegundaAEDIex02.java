import java.util.Scanner;

public class AprovaSegundaAEDIex02 {

	public static void main(String[] args) {
		double serie, numero, den, soma = 0;
		int termos;
		Scanner teclado = new Scanner(System.in);
		System.out.print("Informe quantidade de termos: ");
		termos = teclado.nextInt();
		for (int aux = 1; aux <= termos; aux++) {
			numero = (aux * 6 - 5) + Math.pow(aux * 4 + 1, 1.0 / (aux * 2 + 1));
			den = Math.pow(6, aux - 1);
			soma += numero / den;
		}
		serie = 53 + Math.pow(soma, 3);
		System.out.println("Série é: " + serie);
		teclado.close();
	}

}
