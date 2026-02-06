import javax.swing.JOptionPane;
public class c08ex03 {
	public static void main(String[] args) {
		// Programadora Bianca Maria
	    for (int repeticao = 1; repeticao <= 3; repeticao++) {
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
	    int contador = 0, contador2 =0;
	    if (nota1 >= 65 && falta1 <= 16) {
	    JOptionPane.showMessageDialog(null,
	    "APROVADO",
	    "REPROVADO ou APROVADO",
	    JOptionPane.INFORMATION_MESSAGE);
	    contador++;
	    }else {
	    JOptionPane.showMessageDialog(null,
	    "REPROVADO",
	    "APROVADO ou REPROVADO",
	    JOptionPane.INFORMATION_MESSAGE);
    	contador2++;
	    }
	    JOptionPane.showMessageDialog(null,
	     "Quantidade de números APROVADO: "+contador+"\n"+
	     " Quantidade de númros REPOVADO: " +contador2,
	     "APROVADO ou REPROVADO",
	    JOptionPane.INFORMATION_MESSAGE);
	    }
		}

	}

	
