import java.util.Scanner;
public class circulo {
	public static void goemetria04() {
		   Scanner teclado = new Scanner(System.in);
		    double area,raio;
		    System.out.print("Qual é a altura do retangulo: ");
		    raio = teclado.nextDouble();
		    area = Math.PI*Math.pow(raio,2);
		    System.out.println("Aréa é: "+area);
		    teclado.close();
	}

}
