import java.util.Scanner;

public class E06x15 {
	public static void main(String[] args) {
		double conta, valor, extra, imposto;
		String cidade, pacote;
		int dia;
		Scanner teclado = new Scanner(System.in);
		System.out.println("Qual voce quer o pacote(Basic,Advenced e Premium): ");
		pacote = teclado.nextLine();
		System.out.println("Quantidade de dias: ");
		dia = teclado.nextInt();
		System.out.println("Qual é o valor dos serviços extras: ");
		extra = teclado.nextDouble();
		teclado.nextLine();
		System.out.println("Qual é a sua cidade: ");
		cidade = teclado.nextLine();
		teclado.close();

		if (cidade.equalsIgnoreCase("Belo Horizonte"))
			imposto = 0;
		else if (cidade.equalsIgnoreCase("São Paulo"))
			imposto = 0.01;
		else if (cidade.equalsIgnoreCase("Rio de Janeiro"))
			imposto = 0.015;
		else
			imposto = 0.02;

		switch (pacote) {
		case "Basic":
			valor = 65;
			if (1.20 * dia > 65) {
				conta = valor + (65) + extra + imposto * (valor + (65) + extra);
				System.out.println("Conta = " + conta);
			} else
				conta = valor + (dia * 1.20) + extra + imposto * (valor + (1.20) + extra);
			System.out.println("Conta = " + conta);
			break;
		case "Advanced":
			valor = 104;
			conta = valor + (dia * 2.10) + extra + imposto * (valor + (2.10) + extra);
			System.out.println("Conta = " + conta);
			break;
		case "Preminum":
			valor = 137;
			conta = valor + extra + imposto * (valor + extra);
			System.out.println("Conta = " + conta);
			break;

		}

	}
}