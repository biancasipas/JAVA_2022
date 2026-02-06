import javax.swing.JOptionPane;
public class c05ex09x {
	public static void main(String[] args) {
		// Programadora Bianca Maria 
		//A media final deste aluno
	String nota_primeiro = JOptionPane.showInputDialog(null,
			"Qual é a nota do primeiro: ",
			"Calcular",
    JOptionPane.QUESTION_MESSAGE);
	String nota_segundo = JOptionPane.showInputDialog(null,
			"Qual é a nota da segunda: ",
			"Calcular",
	JOptionPane.QUESTION_MESSAGE);
	String nota_terceiro = JOptionPane.showInputDialog(null,
			"Qual é a nota da terceiro: ",
			"Calcular",
	JOptionPane.QUESTION_MESSAGE);
	double nota_primeiro1 = Double.valueOf(nota_primeiro).doubleValue();
	double nota_segundo1 = Double.valueOf(nota_segundo).doubleValue();
	double nota_terceiro1 = Double.valueOf(nota_terceiro).doubleValue();
	double peso_primeiro = 2;
	double peso_segundo = 3;
	double peso_terceiro = 5;
	double media = (nota_primeiro1*peso_primeiro + nota_segundo1*peso_segundo + nota_terceiro1*peso_terceiro)/(peso_primeiro + peso_segundo + peso_terceiro);
	System.out.println("Média final é: "+media);		
	}
}
