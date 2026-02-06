import java.util.Scanner;
public class c05ex07 {
	public static void main(String[] args) {
		double x;
		Scanner teclado = new Scanner (System.in);
		System.out.print("Qual o valor de x: ");
		x = teclado.nextDouble();
		double f = Math.sqrt(Math.pow(x/4+1,2)+ x/5);
		System.out.println("Qual e o valor da função: "+f);
		teclado.close();

	}

}
