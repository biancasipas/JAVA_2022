import java.text.DecimalFormat;
import java.util.Scanner;

public class prova0c {
	public static void main(String[] args) {
		// Programadora Bianca Maria Fernades Alves
		// CONSTRUTORA É ESPECIALIZADA EM CONSTRUIR PRÉDIOS EXCLUSICOS PARA
		// ESTACIONAMENTO DE CARROS.
		Scanner arquivo = new Scanner(E01825C.class.getResourceAsStream("prova.txt"));
		int andares = arquivo.nextInt();
		int metros = arquivo.nextInt();
		double per_lucro = arquivo.nextDouble();

		int tamanho = andares * metros;
		int dia = tamanho / 10;
		double imposto = (dia / 5) * 1000;
		double materiais = 125.50 * tamanho;
		double mestres_obra = 260.23 * dia;
		double engenheiro = 5000.0;
		double pedreiro = 56.30 * tamanho;
		double mao_obra = engenheiro + mestres_obra + pedreiro;
		double preco_bruto = materiais + mao_obra + imposto;
		double preco_final = ((per_lucro / 100) * preco_bruto) + preco_bruto;
		String preco_final1;
		preco_final1 = new DecimalFormat("#,##0.00").format(preco_final);
		System.out.println("O preço final: R$" + preco_final1);
		arquivo.close();

	}

}
