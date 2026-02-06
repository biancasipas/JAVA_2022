import java.util.Scanner;
public class c12ex22 {
	public static void main(String[] args) {
		// Programadora: Bianca Maria Fernades Alves
		int numero[] = new int[20];
		Scanner teclado = new Scanner(System.in);
		for (int aux = 0; aux <= numero.length - 1; aux++) {
        System.out.print("Digite o número: ");
        numero[aux] = teclado.nextInt();
        }
		for(int aux=0; aux<=numero.length-1;aux+=2) {
			System.out.println(numero[aux]);
		}
		for(int aux=1; aux<=numero.length-1;aux+=2) {
			System.out.println(numero[aux]);
		}
		teclado.close();

	}

}
