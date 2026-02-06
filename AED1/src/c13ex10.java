import java.util.Scanner;
public class c13ex10 {
	public static void main(String[] args) {
	Scanner teclado = new Scanner(System.in);
	String nome_completo;
	System.out.print("Digite o nome completo: ");
	nome_completo = teclado.nextLine();
    nome(nome_completo);
    teclado.close();
	}
	public static String nome(String nome_completo) {
	String palavras[] = nome_completo.split("");
	for(int aux= 0; aux< palavras.length; aux++) {
	String nomes = palavras[aux].toUpperCase();
	System.out.println(nomes+" ");
	
}
	 return nome_completo;
}}
