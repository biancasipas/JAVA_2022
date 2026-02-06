import java.text.DecimalFormat;
import javax.swing.JOptionPane;

public class prova00b{
	public static void main(String[] args) {
		// Programadora Bianca Maria Fernandes Alves
		// Faça o calcular os valores de Y,W e Z
		String x = JOptionPane.showInputDialog(null, "Qual e o valor de x: ", "Calcular ",
				JOptionPane.QUESTION_MESSAGE); 
		double x1 = Double.valueOf(x).doubleValue();
		double y = 4 * Math.pow(x1, 3) - ((13 / 3.0) * x1) + 2;
		double w = (10 * y) - Math.pow(6 * x1 - 1, 1f / 7);
		double z = Math.sqrt(5 + Math.pow(3 * y + 4 * w + Math.pow(x1, 4), 1f / 3));
		String valorFormatadoY, valorFormatadoW, valorFormatadoZ;
		valorFormatadoY = new DecimalFormat("#,##0.0").format(y);
		valorFormatadoW = new DecimalFormat("#,##0.0").format(w);
		valorFormatadoZ = new DecimalFormat("#,##0.0").format(z);
		JOptionPane.showMessageDialog(null, "O valor Y :" + valorFormatadoY + "\n O valor W: " + valorFormatadoW
				+ "\n O valor Z: " + valorFormatadoZ, "Calcular", JOptionPane.INFORMATION_MESSAGE);

	}

}
