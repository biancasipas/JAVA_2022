package conteudo06;

import java.util.Scanner;

public class C06ex15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);
		double imposto, valorfixo, conta;
		System.out.println("Digite o c�digo do pacote: ");
		int codigo = teclado.nextInt();
		System.out.println("Digite por quantos dias ir� utilizar o pacote: ");
		int dias = teclado.nextInt();
		System.out.println("Digite o valor dos servi�os extras: ");
		double extra = teclado.nextDouble();
		teclado.nextLine();
		System.out.println("Digite sua cidade: ");
		String cidade = teclado.nextLine();
		teclado.close();

		if (cidade.equalsIgnoreCase("Belo Horizonte"))
			imposto = 0;
		else if (cidade.equalsIgnoreCase("S�o Paulo"))
			imposto = 0.01;
		else if (cidade.equalsIgnoreCase("Rio de Janeiro"))
			imposto = 0.015;
		else
			imposto = 0.02;

		switch (codigo) {
		case 1:
			valorfixo = 65;
			if (1.20 * dias > 65) {
				conta = valorfixo + (65) + extra + imposto * (valorfixo + 65 + extra);
				System.out.println("Conta = " + conta);
			} else
				conta = valorfixo + (1.20 * dias) + extra + imposto * (valorfixo + (1.20) + extra);
			System.out.println("Conta = " + conta);

			break;
		case 2:
			valorfixo = 104;
			conta = valorfixo + (2.10 * dias) + extra + imposto * (valorfixo + (2.10 * dias) + extra);
			System.out.println("Conta = " + conta);
			break;
		case 3:
			valorfixo = 137;
			conta = valorfixo + extra + imposto * (valorfixo + extra);
			System.out.println("Conta = " + conta);
			break;

		}

	}

}