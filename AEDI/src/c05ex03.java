import javax.swing.JOptionPane;
public class c05ex03 {
    // Programadora: Bianca Maria
	public static void main(String[] args) {
		 String salario = JOptionPane.showInputDialog(null, 
				"Qual é o salário: ",
				"Calcular",
		JOptionPane.QUESTION_MESSAGE);
		 String  numeroDependente = JOptionPane.showInputDialog(null,
				 "Qual o numero de dependente: ",
				 "Calcular",
		 JOptionPane.QUESTION_MESSAGE);
		  double salario1 = Integer.valueOf(salario).intValue();
		  double numeroDependente1 = Integer.valueOf(numeroDependente).intValue();
		  double liquido = salario1 - (numeroDependente1 * 60);
		  double imposto = liquido* 0.15;
		  JOptionPane.showMessageDialog(null,
				  "Imposoto de renda: " +imposto,
                  "Calcular",
                  JOptionPane.INFORMATION_MESSAGE);

	}

}
