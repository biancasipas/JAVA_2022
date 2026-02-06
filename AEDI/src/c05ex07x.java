import java.text.DecimalFormat;

import javax.swing.JOptionPane;
public class c05ex07x {
	public static void main(String[] args) {
		// Programadora: Bianca Maria 
		// Qual e o valor de x ?
  String x = JOptionPane.showInputDialog(null,
		 "Qual e o valor de x: ",
		 "Calcular: ",
  JOptionPane.QUESTION_MESSAGE);
  double x1 = Double.valueOf(x).doubleValue();
  double funcao = Math.sqrt(Math.pow((x1/4)+1,2)+(x1/5));
  String nfuncao;
  nfuncao = new DecimalFormat("#,##0.0000").format(funcao);
  JOptionPane.showMessageDialog(null,
		 "Função é: "+nfuncao,
		 "Calcular",
  JOptionPane.INFORMATION_MESSAGE);
		  
	}

}
