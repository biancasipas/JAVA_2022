import javax.swing.JOptionPane;

public class c09ex13 {
	public static void main(String[] args) {
		// Programadora: Bianca Maria
		double num, den, serie = 0, fatorial = 1;
		for (int aux = 1; aux <= 10; aux++) {
			num = aux;
			fatorial *= num;

			den = (Math.pow(2, aux) - 1);

			if (aux % 2 == 0) {
				serie -= fatorial / den;
			} else {
				serie += fatorial / den;

			}
		}
		JOptionPane.showMessageDialog(null, "Valor da série " + serie);
	}
}