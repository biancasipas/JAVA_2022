import javax.swing.JOptionPane;
public class c08ex18 {
	public static void main(String[] args) {
		// Programadora: Bianca Maria
		String x;
		int x1;
		x = JOptionPane.showInputDialog(null,
				"Digite o numero: ",
				"Calcular",
		JOptionPane.QUESTION_MESSAGE);
		x1 = Integer.valueOf(x).intValue();
	     for (int aux=1; aux<=9; aux++) {
	    JOptionPane.showMessageDialog(null,
	    aux +"x"+"3"+ "="+ aux*3,
	    "Calcular",
	    JOptionPane.INFORMATION_MESSAGE);
	        
	     }

	   }
	}