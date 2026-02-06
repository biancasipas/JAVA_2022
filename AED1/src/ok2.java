import javax.swing.JOptionPane;
public class ok2 {
	//programadora: Bianca Maria
	public static void main(String[] args) {
	  String r = JOptionPane.showInputDialog(null,
	   "Digite um número do Raio: ",
		"Calcular",
		JOptionPane.QUESTION_MESSAGE);
	  double r1 = Integer.valueOf(r).intValue();
	  double area = 3.1416 * Math.pow(r1,4);
	  JOptionPane.showMessageDialog(null,
			  "Qual é o valor da área: " + area,
			  "Calcular",
			  JOptionPane.INFORMATION_MESSAGE);
	}

}
