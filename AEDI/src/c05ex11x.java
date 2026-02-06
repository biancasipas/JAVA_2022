import javax.swing.JOptionPane;
public class c05ex11x {
	public static void main(String[] args) {
		// Programadora: Bianca Maria
	String numero_cheque = JOptionPane.showInputDialog(null,
			"Digite o numero do cheque: ",
			"Calcular",
	JOptionPane.QUESTION_MESSAGE);
	int numero_cheque1 = Integer.valueOf(numero_cheque).intValue();
	int banco = numero_cheque1/1000000;
	int agencia = numero_cheque1/1000%1000;
	int sequencial = numero_cheque1 % 1000;
	JOptionPane.showMessageDialog(null,
			"Número do banco: " +banco +"\nNúmero Agencia: " +agencia+"\nNúmero Sequncial: "+sequencial,
			"Calcular",
	JOptionPane.QUESTION_MESSAGE);
	}

}
