import java.util.Scanner;
public class E06x14 {
	public static void main(String[] args) {
	Scanner teclado = new Scanner (System.in);
	int numero,d1,d2,d3,d4;
	System.out.print("Digite o número inteiro de 4: ");
	numero = teclado.nextInt();
    d1 = numero/1000;
    d2 = numero/100%10;
    d3 = numero/10%10;
    d4 = numero%10;
    System.out.println(+d4+""+d3+""+d2+""+d1);
    teclado.close();
	}

}
