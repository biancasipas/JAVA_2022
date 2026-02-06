import javax.swing.JOptionPane;

public class c12ex02 {
	public static void main(String[] args) {
		// Programadora: Bianca Maria
		int vet[] = new int[10];
		String numero;
		for (int aux = 0; aux < 10; aux++) {
			numero = JOptionPane.showInputDialog(null, "Informe os valores:", "", JOptionPane.INFORMATION_MESSAGE);
			vet[aux] = Integer.valueOf(numero).intValue();
		}
		for (int aux = 0; aux < 10; aux++) {
			if (vet[aux] > 5 && vet[aux] < 10) {

				JOptionPane.showMessageDialog(null, "Numeros impressos = " + vet[aux]);
			}

		}
	}
}