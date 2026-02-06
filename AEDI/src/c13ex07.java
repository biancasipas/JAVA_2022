import java.util.Scanner;
public class c13ex07 {
	public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);
    String nome;
    String [] palavras;
    System.out.print("Digite o nome de família: ");
    nome = teclado.nextLine();
    palavras = nome.split(" ");
    System.out.println(palavras[palavras.length-1]);
    teclado.close();
    }

}
