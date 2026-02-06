package conteudo08;

import javax.swing.JOptionPane;
public class c08ex01 {
	public static void main(String[] args) {
		// Programadora: Bianca Maria
		for (int repeticao = 1; repeticao <= 3; repeticao++) {
			String raio = JOptionPane.showInputDialog(null, "Qual valor de area: ", "Calcular",
					JOptionPane.QUESTION_MESSAGE);
			double raio1 = Double.valueOf(raio).doubleValue();
			double area = (3.1416 * Math.pow(raio1, 2));
			JOptionPane.showMessageDialog(null, "�rea �: " + area, "Calcular", JOptionPane.INFORMATION_MESSAGE);
		}

	}

}
