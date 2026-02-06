import java.util.Scanner;

public class E06x10 {
	public static void main(String[] args) {
		double capital, taxa_diaria, numero_dia, rendimento, imposto, valor;
		double taxa_administracao = 10;
		Scanner teclado = new Scanner(System.in);
		System.out.print("Capital Aplicado: ");
		capital = teclado.nextDouble();
		System.out.print("Número de dias: ");
		numero_dia = teclado.nextDouble();
		System.out.print("Taxa Diaria: ");
		taxa_diaria = teclado.nextDouble();
		rendimento = capital * taxa_diaria/100 * numero_dia;
		imposto = 0.15 * rendimento;
		valor = capital + rendimento - imposto - taxa_administracao;
		System.out.println("Rendimento é: " + rendimento + "\n" + "Imposro de renda é: " + imposto + "\n"
				+ "Valor Resgatado " + valor);
		teclado.close();
	}

}
