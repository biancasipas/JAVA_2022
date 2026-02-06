import java.util.Scanner;
public class c04ex03 {
	public static void main(String[] args) {
		double multa1, multa2, multa3 ;
		long poluente1, poluente2, poluente3;
		Scanner teclado = new Scanner (System.in);
		System.out.print("Preenchar as informaçoes a seguir: ");
		System.out.println();
		System.out.print("Se  a quantidade de Poluente Emetido for até:");
		poluente1 = teclado.nextLong();
		System.out.print("Então, a multa será de: ");
		multa1 = teclado.nextDouble();
		System.out.print("Caso a quantidade de Poluente emetido seja entre: ");
		poluente2 = teclado.nextLong();
		System.out.print("Então, a multa será de: ");
		multa2 = teclado.nextDouble();
		System.out.print("Sendo a quantidade de Poluente Emetido for acima de: ");
		poluente3 = teclado.nextLong();
		System.out.print("Então, a multa será de: ");
		multa3 = teclado.nextDouble();
		
		System.out.println("______________________________________________________________________________________________________");
		System.out.println("                       *Qauntidade de Poluente Emitido X Valor da Multa*                              ");
		System.out.println("------------------------------------------------------------------------------------------------------");
		System.out.println("Até" + poluente1 + "multa de R$"+ multa1);
		System.out.println("------------------------------------------------------------------------------------------------------");
		System.out.println("Entre"+ poluente2 + "multa de R$"+ multa2);
		System.out.println("------------------------------------------------------------------------------------------------------");
		System.out.println("Acima de" +poluente3 +"multa de R$" +multa3 +"por poluente emitido");
		System.out.println("______________________________________________________________________________________________________");
		teclado.close();
	}

}
