package conteudo05;

import java.text.DecimalFormat;
import javax.swing.JOptionPane;
public class c05exemplo5 {
	public static void main(String[] args) {
		// Programadora: Bianca Maria
	String produto = JOptionPane.showInputDialog(null,
		"Qual e a quantidade de produtos produzidos: ",
		"Calcular:",
	JOptionPane.QUESTION_MESSAGE);
	int produto1 = Integer.valueOf(produto).intValue();
	int caixa = produto1/20;
	int sobra = produto1 % 20;
	int container = caixa/80;
	int navio = container/150;
	String caixa1, sobra1, container1,navio1;
	caixa1 = new DecimalFormat("#,##0").format(caixa);
	sobra1 = new DecimalFormat("#,##0").format(sobra);
	container1 = new DecimalFormat("#,##0").format(container);
	navio1 = new DecimalFormat("#,##0").format(navio);
	JOptionPane.showMessageDialog(null,
	 "As caixas forma lacradas "+caixa1+ "\n Os caminh�es foram despachados para o porto "+container1+ "\n Os navios partiram do porto com produto "+navio1+ "\n Os produtos sobraram na caixa que aina n�o foi lacrada "+sobra1,
	 "Calcular",
	JOptionPane.INFORMATION_MESSAGE);
	}

}
