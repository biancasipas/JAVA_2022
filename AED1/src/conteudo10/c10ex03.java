package conteudo10;

import javax.swing.JOptionPane;

public class c10ex03 {
	public static void main(String[] args) {
		// Progrmadora: Bianca Maria
		String a, raio;
		double a1, raio1 = 0, setor;
		a = JOptionPane.showInputDialog(null, "Qual � o valor do �ngulo", "Setor circular",
				JOptionPane.QUESTION_MESSAGE);
		a1 = Double.valueOf(a).doubleValue();
		do {
	if(raio1 != -1) {
			raio = JOptionPane.showInputDialog(null, "Qual � o valor do raio", "Setor circular",
					JOptionPane.QUESTION_MESSAGE);
			raio1 = Double.valueOf(raio).doubleValue();
			setor = (a1 * 3.1416 * Math.pow(raio1, 2))/360;
			
			JOptionPane.showMessageDialog(null, "O setor circular �: " + setor);
	}} while (raio1 != -1);

	}

}
