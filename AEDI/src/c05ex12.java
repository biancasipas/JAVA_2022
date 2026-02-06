import javax.swing.JOptionPane;
public class c05ex12 {
	public static void main (String[] args) {
	String segundo = JOptionPane.showInputDialog(null,
			"O tempo de duração de um evento expresso em segundos: ",
			"Calcular",
	JOptionPane.QUESTION_MESSAGE);
	int segundo1 = Integer.valueOf(segundo).intValue();
	int hora = segundo1/3600;
	int resto = segundo1 % 3600;
	int minutos = resto/60;
	int segundo2 = resto % 60;
	JOptionPane.showMessageDialog(null,
		"O Segundo é:" +segundo2+ "\n A horas é: " +hora+"\n O tempo é um minuto: " +minutos,
		"Calcular",
	JOptionPane.INFORMATION_MESSAGE);
				
	}

}
