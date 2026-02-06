import java.util.Scanner;
public class c06ex02 {
	public static void main(String[] args) {
	     double poluente,multa = 0f;
	     Scanner teclado = new Scanner(System.in);
	     System.out.print("Informe a valor de poluente: ");
	     poluente = teclado.nextDouble();
	     if (poluente <= 1.500)
	        multa = 0;
	     if (poluente > 1.500 && poluente <= 3.500)
	        multa = poluente * 3.000;
	     if (poluente > 1000)
	        multa = poluente * 5.000* poluente;
	     System.out.println("Valor da Multa = "+multa);
	     teclado.close();
	   }

	}
	