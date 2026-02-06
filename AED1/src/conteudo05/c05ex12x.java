package conteudo05;

import javax.swing.JOptionPane;
public class c05ex12x {
  public static void main (String [] args) {
	 String segundos = JOptionPane.showInputDialog(null,
	 "Quanto tempo de dura��o de um evento expresso em segundos: ",
	 "Tempo",
	 JOptionPane.QUESTION_MESSAGE);
	 int segundos1 = Integer.valueOf(segundos).intValue();
	 int hora = segundos1/3600;
	 int resto = segundos1 % 3600;
	 int minutos = resto/60;
	 int segundo2 = resto % 60;
	 JOptionPane.showMessageDialog(null,
			"O Segundo �:" +segundo2+ "\n A horas �: " +hora+"\n O tempo � um minuto: " +minutos+ "\n Eu gostaria sabe quanto o resto �: "+resto,
			"Calcular",
	 JOptionPane.INFORMATION_MESSAGE);
	 
			 
	 
  }

}
