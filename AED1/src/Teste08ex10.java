import java.util.Scanner;
public class Teste08ex10 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);
		String nomeproduto;
		double somapreco=0, maiorpreco=0, precopt, preco1;
		int quantidade;
		System.out.print("Quantidade de insumos total:");
		int insumos = teclado.nextInt();
		String maiscaro = "";
		for(int i=1; i <= insumos; i++) {
			System.out.print("Digite qual produto: ");
			teclado.nextLine();
			nomeproduto = teclado.nextLine();
			System.out.print("Digite o preço do produto: ");
			preco1 = teclado.nextDouble();
			System.out.print("Digite a quantidade de produtos: ");
			quantidade = teclado.nextInt();
			precopt = quantidade*preco1;
			somapreco += precopt;
			if (i == 1 || preco1>maiorpreco) {
				maiorpreco = preco1;
				maiscaro=nomeproduto;
			}
		}double media = somapreco/insumos;
		System.out.println("Custo total dos insumos: "+somapreco);
		System.out.println("O insumo mais caro é: "+maiscaro);
		System.out.println("A média dos custos parciais é: "+media);
		
		}

	}



