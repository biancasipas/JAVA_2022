import java.util.Scanner;

public class E06x09 {
	public static void main(String[] args) {
		String sexo;
		double altura, pesoIdeal;
		Scanner teclado = new Scanner(System.in);
		System.out.print("Digite o sexo: ");
		sexo = teclado.nextLine();
		System.out.print("Digite altura: ");
		altura = teclado.nextDouble();
		if (sexo.equalsIgnoreCase("F")) {
			pesoIdeal = 62.1*altura-44.7;
			System.out.println("Peso Feminino: "+pesoIdeal);
		}
		else if(sexo.equalsIgnoreCase("M")) {
			pesoIdeal = 72.7*altura-58;
			System.out.println("Peso Maculino: "+pesoIdeal);
		}
		teclado.close();
	}

}
