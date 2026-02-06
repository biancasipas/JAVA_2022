package conteudo10;

import javax.swing.JOptionPane;

public class c10ex02 {
	public static void main(String[] args) {
		// Programadora: Bianca Maria
		double valor_recebido1,soma=0,cont=0,maior_valor=0;
		do {
		String valor_recebido = JOptionPane.showInputDialog(null,
			"Qual � o valor recebido",
			"Calcular",
	   JOptionPane.QUESTION_MESSAGE);
		
	  valor_recebido1 = Double.valueOf(valor_recebido).doubleValue();
	  if (valor_recebido1 == 0)
		  break;
	  soma+=valor_recebido1;
	  cont++;
		}while (valor_recebido1 != 0);
		double media = (float)soma/cont;
		
		if (valor_recebido1 <= 1000) {
			maior_valor =valor_recebido1;
					
		
	 JOptionPane.showMessageDialog(null,"M�dia dos valores recebidos  " +media+ "\n"+"Valor total recebido "+soma+"\n"+"Quantidade de valores acima "+ maior_valor);


		}
		}
}