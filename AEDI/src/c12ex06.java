import java.util.Scanner;

public class c12ex06 {
	public static void main(String[] args) {
		//Programadora: Bianca Maria Fernades Alves
	String meses[] = new String [12];
	Scanner teclado = new Scanner(System.in);
	for(int aux = 0; aux <=meses.length-1;aux++) {
	System.out.print("Digite o nome do meses: ");
	meses[aux] = teclado.next();
	}
	for (int aux =meses.length-1; aux >=0;aux--) {
	System.out.println(meses[aux]);
teclado.close();
	
}}}