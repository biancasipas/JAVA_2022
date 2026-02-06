import java.util.Scanner;
public class c14ex01 {
	public static void main(String[] args) {
		int usuario;
		Scanner teclado = new Scanner(System.in);
		System.out.println("Qual voce quer numero 1 a 5: ");
		System.out.println("1---Voce quer saber o imposto de renda: ");
		System.out.println("2---Voce quer saber a informação da idade: ");
		System.out.println("3---Voce quer saber a ficha funcional de");
		System.out.println("4---Voce quer saber a quantidade de Poluente Emitido e Valor da Multa");
		System.out.println("5--Voce quer ver o calculo: ");
		usuario = teclado.nextInt();
		if (usuario==1) {
			chamado01.calculo();
		}
		else if (usuario==2) {
			chamado02.programar();
		}
		else if (usuario==3) {
			chamado03.programar02();
		}
		else if(usuario==4) {
			chamado04.programar04();
		}
		else if(usuario==5) {
			chamado05.programar05();
		}
		teclado.close();
	}
}