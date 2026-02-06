import javax.swing.JOptionPane;
public class c08ex17 {
	public static void main(String[] args) {
		// Programadora: Bianca Maria
		String x;
		int x1;
	     double fx;
	     for (int aux=3; aux<=12; aux++) {
	        x = JOptionPane.showInputDialog(null,
	        "Informe o valor de x:",
	        "FUNÇÃO",
	        JOptionPane.QUESTION_MESSAGE);
	        x1 = Integer.valueOf(x).intValue();
	        fx = Math.sqrt(Math.pow(x1,2)-3);
	        JOptionPane.showMessageDialog(null,
	        "x = "+x+" f(x) = "+fx,
	        "FUNÇÃO",
	        JOptionPane.INFORMATION_MESSAGE);
	     }

	   }
	}