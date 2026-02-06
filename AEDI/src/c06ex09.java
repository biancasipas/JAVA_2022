import javax.swing.JOptionPane;

public class c06ex09 {
	public static void main(String[] args) {
		String altura = JOptionPane.showInputDialog(null, "Qual altura: ", "Calcular: ", JOptionPane.QUESTION_MESSAGE);
		String sexo = JOptionPane.showInputDialog(null, "Qual seu sexo: ", "Teste", JOptionPane.QUESTION_MESSAGE);
		double altura1 = Double.valueOf(altura).doubleValue();
		double pesoIdeal = 0;
		if (sexo.equalsIgnoreCase("M")) {
			pesoIdeal = 72.7 * altura1 - 58;
		} else if (sexo.equalsIgnoreCase("F")) {
			pesoIdeal = 62.1 * altura1 - 44.8;
		}
		JOptionPane.showMessageDialog(null, "Informação o sexo do peso: " + pesoIdeal, "Teste",
				JOptionPane.INFORMATION_MESSAGE);

	}
}
