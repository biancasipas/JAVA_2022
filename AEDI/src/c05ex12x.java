import javax.swing.JOptionPane;
public class c05ex12x {
  public static void main (String [] args) {
	 String segundos = JOptionPane.showInputDialog(null,
	 "Quanto tempo de duração de um evento expresso em segundos: ",
	 "Tempo",
	 JOptionPane.QUESTION_MESSAGE);
	 int segundos1 = Integer.valueOf(segundos).intValue();
	 int hora = segundos1/3600;
	 int resto = segundos1 % 3600;
	 int minutos = resto/60;
	 int segundo2 = resto % 60;
	 JOptionPane.showMessageDialog(null,
			"O Segundo é:" +segundo2+ "\n A horas é: " +hora+"\n O tempo é um minuto: " +minutos+ "\n Eu gostaria sabe quanto o resto é: "+resto,
			"Calcular",
	 JOptionPane.INFORMATION_MESSAGE);
	 
			 
	 
  }

}
