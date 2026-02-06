import javax.swing.JOptionPane;
public class c06ex10 {
	public static void main(String[] args) {
		// Programdora: Bianca Maria
	String capital_aplicado = JOptionPane.showInputDialog(null,
			"Qual e o valor do capital aplicado: ",
			"Calcular: ",
			JOptionPane.QUESTION_MESSAGE);
	String numero_dia = JOptionPane.showInputDialog(null,
			"Qual e o numero de dia : ",
			"Calcular: ",
			JOptionPane.QUESTION_MESSAGE);
    String taxa_diaria = JOptionPane.showInputDialog(null,
    		"Qual e a taxa diária: ",
    		"Calcular",
    		JOptionPane.QUESTION_MESSAGE);
    double capital_aplicado1 = Double.valueOf(capital_aplicado).doubleValue();
    double taxa_diaria1 = Double.valueOf(taxa_diaria).doubleValue();
    double numero_dia1 = Double.valueOf(numero_dia).doubleValue();
    double redimento = capital_aplicado1*numero_dia1*taxa_diaria1/100;
    double imposto_renda = 15.0/100*redimento;
    double taxa_administracao = 10;
    double valor_resgatado = capital_aplicado1 + redimento - imposto_renda - taxa_administracao;
    JOptionPane.showMessageDialog(null,
     "Qual o valor resgatado: "+valor_resgatado,
     "Calcular: ",
    JOptionPane.INFORMATION_MESSAGE);
	}

}