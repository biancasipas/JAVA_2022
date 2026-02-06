import javax.swing.JOptionPane;

public class c12ex04 {
	public static void main(String[] args) {
		// Programadora:Bianca MariaFernades Alves
		int vet[] = new int[10];
		String numero;
		double numero_impressos;
		for (int aux = 0; aux < 10; aux++) {
			numero = JOptionPane.showInputDialog(null, "Infomer os valores", "Calcular", JOptionPane.QUESTION_MESSAGE);
			vet[aux] = Integer.valueOf(numero).intValue();
		}
		for (int aux = 0; aux < 10; aux++) {

			numero_impressos = Math.pow(vet[aux], 2);

			JOptionPane.showMessageDialog(null, "Números impressos :" + numero_impressos, "Numéricos interios ",
					JOptionPane.INFORMATION_MESSAGE);
		}
	}
}