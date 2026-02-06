import java.util.Scanner;
public class retangulo {
	public static void geometria02() {
    Scanner teclado = new Scanner(System.in);
    double lado,area,base,altura;
    System.out.print("Qual é o lado do retangulo: ");
    lado=teclado.nextDouble();
    System.out.print("Qual é a base do retangulo: ");
    base = teclado.nextDouble();
    System.out.print("Qual é a altura do retangulo: ");
    altura = teclado.nextDouble();
    area = base*altura;
    System.out.println("Aréa é: "+area);
    System.out.println("Lado é : "+lado);
    teclado.close();
	}

}
