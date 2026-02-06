import java.util.Scanner;

public class E06e07 {
	public static void main(String[] args) {
		double salario, imposto, bruto, liquido;
		Scanner teclado = new Scanner(System.in);
		System.out.print("Digite o salário: ");
		salario = teclado.nextDouble();
		if (salario <= 300) {
			bruto = 500 + 0.70 * salario;
		} else if (salario >= 300 && salario <= 1000) {
			bruto = 200 + 0.50 * salario;
		} else {
			bruto = 0.30 * salario;
		}
		imposto = 0.25 * bruto;
		liquido = bruto - imposto;
		System.out.println("PL Líquido é: " + liquido);
		teclado.close();
	}

}
