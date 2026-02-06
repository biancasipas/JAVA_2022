import javax.swing.JOptionPane;
public class c08ex08 {
	public static void main(String[] args) {
		//Programadora Bianca Maria
	String falta,nota;
	int contador1=0,contador2=0,soma=0,repfalta=0;
	double media, falta1, nota1;
	for(int repeticao = 1; repeticao <=3; repeticao++) {
	nota = JOptionPane.showInputDialog(null,
	    		"Qual e sua nota:",
	    		"APROVADO ou REPROVADO",
	    JOptionPane.QUESTION_MESSAGE);
	falta = JOptionPane.showInputDialog(null,
	    		"Quanta falta:", 
	    		"APROVADO ou REPROVADO",
	    JOptionPane.QUESTION_MESSAGE);
	falta1 = Double.valueOf(falta).doubleValue();
	nota1 = Double.valueOf(nota).doubleValue();
	if (nota1 >= 65 && falta1 <= 16) {
	    JOptionPane.showMessageDialog(null,
	    "APROVADO",
	    "REPROVADO ou APROVADO",
	    JOptionPane.INFORMATION_MESSAGE);
	    soma += nota1;
	    contador1++;
	    repfalta++;
	    }else {
	    JOptionPane.showMessageDialog(null,
	    "REPROVADO",
	    "APROVADO ou REPROVADO",
	    JOptionPane.INFORMATION_MESSAGE);
    	contador2++;
	    }
	}
	media = (float)soma/(contador1);
	 JOptionPane.showMessageDialog(null,
			   "Quantidade de números APROVADO: " + contador1 + "\n"
			   + "Quantidade de números REPORVADO: " + contador2+ "\n"+ "Media das notas dos aprovados: "+media+
			   "\n"+"Quantidade de alunos com mais de 16 faltas é: "+repfalta,
			   "ALUNOS DE UMA TURMA", JOptionPane.INFORMATION_MESSAGE);
	}
     
}
