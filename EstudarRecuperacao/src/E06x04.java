import java.util.Scanner;

public class E06x04 {
	public static void main(String[] args) {
		String nome;
		double peso,altura;
		Scanner teclado = new Scanner(System.in);
		System.out.print("Qual seu nome: ");
		nome = teclado.nextLine();
		System.out.print("Digite qual é o seu peso: ");
		peso = teclado.nextDouble();
		System.out.print("Digite qual é a sua altura: ");
		altura = teclado.nextDouble();
		double IMC = peso/Math.pow(altura,2);
		if (IMC <= 18)
			System.out.println(nome+" está desnutrida");
		else if (IMC >= 18 && IMC <= 20)
			System.out.println(nome+" está abaixo do peso");
		else if (IMC >= 20 && IMC <= 25)
			System.out.println(nome+" está no peso ideal");
		else if (IMC >= 25)
			System.out.println(nome+" está acima do peso");
		else
			System.out.println(nome+" está obesa");
		teclado.close();
	}

}
