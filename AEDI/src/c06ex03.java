import java.text.DecimalFormat;
import java.util.Scanner;
public class c06ex03 {
   public static void main (String [] args) {
	   double mensal_vendido, comissao = 0f;
	   double salario = 240;
	   Scanner teclado = new Scanner(System.in);
	     System.out.print("Informe a valor de venda: ");
	     mensal_vendido = teclado.nextDouble();
	     if (  mensal_vendido<= 1000)
	        comissao = salario;
	     else if ( mensal_vendido > 1000 &&  mensal_vendido <= 10000)
	        comissao = (0.10 * mensal_vendido) + salario;
	     else
	     comissao = 1000 + salario;
	     String comissaoFormatada;
	     comissaoFormatada = new DecimalFormat("#,##0.00").format(comissao);
	     System.out.println("Valor do salário = "+comissaoFormatada);
	     teclado.close();
	   }

	}