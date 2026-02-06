import javax.swing.JOptionPane;

public class c12ex03 {
	public static void main(String[] args) {
		// Programadora: Bianca Maria Fernandes Alves

		int vet[] = new int[10];
		String numero;
		for (int aux = 0; aux < 10; aux++) {
			numero = JOptionPane.showInputDialog(null, "Informe os valores:", "", JOptionPane.INFORMATION_MESSAGE);
			vet[aux] = Integer.valueOf(numero).intValue();
		}
		for (int aux = 0; aux < 10; aux++) {
			if (34 % vet[aux] == 0) {
				JOptionPane.showMessageDialog(null, "Numeros divisores de 34 = " + vet[aux]);
			}
			
		}
	}
}