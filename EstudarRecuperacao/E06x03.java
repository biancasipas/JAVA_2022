import java.util.Scanner;

public class E06x03 {
	public static void main(String[] args) {
		double salario, vendido;
		double valor_fixo = 240;
		Scanner teclado = new Scanner(System.in);
		System.out.print("Digite o valor do Mensal Vendido: ");
		vendido = teclado.nextDouble();
		if (vendido <= 1000)
			salario = valor_fixo + 0;
		else if (vendido >= 1000 && vendido <= 10000)
			salario = (0.10 * vendido) + valor_fixo;
		else
			salario = valor_fixo + 1000;
		System.out.println("Salário é: " + salario);
		teclado.close();

	}

}
