import javax.swing.JOptionPane;;
public class c08ex29 {
	public static void main(String[] args) {
		// Programadora: Bianca Maria 
		//Potencia
	String x,y;
	double pontencia=1;
	 x = JOptionPane.showInputDialog(null,
	"O valor de x : ",
	"Calcular",
	JOptionPane.QUESTION_MESSAGE);
	 y = JOptionPane.showInputDialog(null,
	"O valor de y: ",
	"Calcular",
	JOptionPane.QUESTION_MESSAGE);
	double x1 = Double.valueOf(x);
	double y1 = Double.valueOf(y);
    for (int aux = 1; aux <= y1; aux++) {
	 pontencia *= x1 ;}
	JOptionPane.showMessageDialog(null,
	"Potência"+pontencia,
	"X e Y",
	JOptionPane.INFORMATION_MESSAGE);

	}
	
}

