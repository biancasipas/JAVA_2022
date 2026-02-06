import java.util.Scanner;
public class c08ex10 {
	public static void main(String[] args) {
    //Programadora Bianca Maria
	String nomeproduto,maiscaro = null;
	double preco1,custo_parcial,maiorpreco = 0,insumos_total=0;
	int somatotal = 0,quantidade;
	Scanner teclado = new Scanner(System.in);
    System.out.print("Qual a quantidade de insumos total: ");
    insumos_total = teclado.nextDouble();
    teclado.nextLine();
	for(int aux=1; aux <= insumos_total; aux++) {
		System.out.print("Digite qual produto: ");
		nomeproduto = teclado.nextLine();
		System.out.print("Digite a quantidade de produtos: ");
		quantidade = teclado.nextInt();
		System.out.print("Digite o preço do produto: ");
		preco1 = teclado.nextDouble();
       teclado.nextLine();
		custo_parcial = quantidade*preco1;
		somatotal += custo_parcial;
		if (aux == 1 || preco1>maiorpreco) {
			maiorpreco = preco1;
			maiscaro=nomeproduto;
		}
	  
		
		} double media = (double)somatotal/insumos_total;
	System.out.println("Custo total dos insumos: "+somatotal);
		   System.out.println("O insumo mais caro é: "+maiscaro);
		   System.out.println("A média dos custos parciais é: "+media);
      teclado.close();
	}
}
