import java.util.Scanner;

public class EmailVetor {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		System.out.print("Digite email: ");
		String email = teclado.nextLine();
		System.out.println("Indice: " + email.indexOf('@'));
		System.out.println("Tamanho: " + email.length());
		String vetorConfere[] = email.split(email, '@');
		if (vetorConfere.length > 1) {//se isso der falso, ja e email invalido
			System.out.println(vetorConfere[1]);//presta atencao nas chaves
			if (vetorConfere[0].length() >= 1 && vetorConfere[1].length() >= 1) {  //vc vai fazer isso aqui só que la dentro
				System.out.println("Email valido: ");//se isso aqui der falso
			}else  
				System.out.println("Email ivalido: ");
			
			}else
				System.out.println("Email invalido");
	}
}

 