import javax.swing.JOptionPane;
public class c06ex11 {
	public static void main(String[] args) {
		// Programadora Bianca Maria
	String equipe_primeiro = JOptionPane.showInputDialog(null,
	"Qual nome da equipe: ",
	"Regulamento Tecnico de Voleibol",
	JOptionPane.QUESTION_MESSAGE);
	String equipe_segundo = JOptionPane.showInputDialog(null,
	"Qual nome da equipe segunda: ",
	"Regulamento Tecnico de Voleibol",
	JOptionPane.QUESTION_MESSAGE);
	String sets_primeiro = JOptionPane.showInputDialog(null,
	"Quanto stes a equipe 1 :",
	"Regulamento Tecnico de Voleibol",
	JOptionPane.QUESTION_MESSAGE);
	String sets_segundo = JOptionPane.showInputDialog(null,
	"Quanto stes a equipe 2: ",
	"Regulamento Tecnico de Voleibol",
	JOptionPane.QUESTION_MESSAGE);
	double pontos_primeiro1 = 0, pontos_segundo1 = 0;
	double equipe_primeiro1 = Double.valueOf(equipe_primeiro).doubleValue();
	double equipe_segundo1 = Double.valueOf(equipe_segundo).doubleValue();
	double sets_primeiro1 = Double.valueOf(sets_primeiro).doubleValue();
	double sets_segundo1 = Double.valueOf(sets_segundo).doubleValue();
	if (sets_primeiro1 == 3 && sets_segundo1 == 0){
		equipe_primeiro1 = 3;
		equipe_segundo1 = 0;
	}
	else if	(sets_primeiro1 == 3 && sets_segundo1 == 1) {
		pontos_primeiro1 = 3;
		pontos_segundo1 = 1;
	}
	else if (sets_primeiro1 == 3 && sets_segundo1 == 2) {
		pontos_primeiro1 = 3;
		pontos_segundo1 = 2;
	}
	else if (sets_primeiro1 == 0 && sets_segundo1 == 3) {
		pontos_primeiro1 = 0;
		pontos_segundo1 = 3;
	}
	else if (sets_primeiro1 == 1 && sets_segundo1 == 3) {
		pontos_primeiro1 = 1;
		pontos_segundo1 = 3;
	}
	else if (sets_primeiro1 == 2 && sets_segundo1 == 3) {
		pontos_primeiro1 = 2;
	    pontos_segundo1 = 3;
	}
	JOptionPane.showMessageDialog(null,"A equipe" +equipe_primeiro1+ "ganhou"+pontos_primeiro1+ "pontos." + "A equipe" +equipe_segundo1+" ganhou"+pontos_segundo1+"pontos");
  
	
	    	
	}

}
