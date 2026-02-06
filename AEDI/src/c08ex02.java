import javax.swing.JOptionPane;
public class c08ex02 {
	public static void main(String[] args) {
		// Programadora Bianca Maria
    for (int repeticao = 1; repeticao <= 4; repeticao++) {
    String nota = JOptionPane.showInputDialog(null,
    		"Qual e sua nota:",
    		"APROVADO ou REPROVADO",
    JOptionPane.QUESTION_MESSAGE);
    String falta = JOptionPane.showInputDialog(null,
    		"Quanta falta:",
    		"APROVADO ou REPROVADO",
    JOptionPane.QUESTION_MESSAGE);
    double falta1 = Double.valueOf(falta).doubleValue();
    double nota1 = Double.valueOf(nota).doubleValue();
    if(nota1 == -1) 
    	break;
    String aluno;
    if (nota1 >= 65 && falta1 <= 16) {
    	aluno = "APROVADO";
    }else {
    	aluno = "REPROVADO";
    }
    JOptionPane.showMessageDialog(null,
    	"ALUNO " +aluno,
    	"APROVADO ou REPROVADO",
    JOptionPane.INFORMATION_MESSAGE);
    	
    	
    }

	}

}
