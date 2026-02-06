import javax.swing.JOptionPane;
public class c09ex01 {
	public static void main(String[] args) {
		//Programadora: Bianca Maria
	      double num, den, serie=0;
	      for (int aux=1; aux<=37; aux++) {
	         num = (38-aux)*(39-aux);
	         den = aux;
	         serie += num / den;
	      }
	  JOptionPane.showMessageDialog(null,"Valor da Série = "+serie);
	   }
	}
	
