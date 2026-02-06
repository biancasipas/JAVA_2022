package conteudo06;

import javax.swing.JOptionPane;
public class c06ex03x {
	public static void main (String [] args) {
		String salario = JOptionPane.showInputDialog(null,
				"Qual e o sal�rio: ",
				"Calcular",
		JOptionPane.QUESTION_MESSAGE);
		String numero_dependentes = JOptionPane.showInputDialog(null,
				"Qual e o numero de dependentes: ",
				"Calcular",
		JOptionPane.QUESTION_MESSAGE);
		double salario1 = Double.valueOf(salario).doubleValue();
        double numero_dependentes1 = Double.valueOf(numero_dependentes).doubleValue();
        double liquido = salario1 -(numero_dependentes1*60.0);
        double imposto_renda = 0.15 *liquido;
        JOptionPane.showMessageDialog(null,
         "O Imposto de Renda � :"+imposto_renda,
         "Calcular",
        JOptionPane.INFORMATION_MESSAGE);
				
				
	}

}
