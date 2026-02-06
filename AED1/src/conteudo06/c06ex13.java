package conteudo06;

import javax.swing.JOptionPane;
public class c06ex13 {
	public static void main(String[] args) {
		// TODO Programadora: Bianca Maria
	String hora_inicial = JOptionPane.showInputDialog(null,
			"Que hora inicio: ",
			"Calcular: ",
	JOptionPane.QUESTION_MESSAGE);
	String hora_final = JOptionPane.showInputDialog(null,
			"Que hora fim: ",
			"Calcular: ",
	JOptionPane.QUESTION_MESSAGE);
	String minuto_inicial = JOptionPane.showInputDialog(null,
			"Quanto tempo o minuto inicial: ",
			"Calcular: ",
	JOptionPane.QUESTION_MESSAGE);
	String minuto_final = JOptionPane.showInputDialog(null,
			"Quanto tempo o minuto final: ",
			"Calcular",
	JOptionPane.QUESTION_MESSAGE);
	double hora_inicial1 = Double.valueOf(hora_inicial).doubleValue();
	double hora_final1 = Double.valueOf(hora_final).doubleValue();
	double minuto_inicial1 = Double.valueOf(minuto_inicial).doubleValue();
	double minuto_final1 = Double.valueOf(minuto_final).doubleValue();
	double duracao = (hora_inicial1 + minuto_inicial1)-(hora_final1 + minuto_final1);
	JOptionPane.showMessageDialog(null,
		"A dura��o do jogo: " +duracao,
		"Calcular",
	JOptionPane.INFORMATION_MESSAGE);

	}

}
