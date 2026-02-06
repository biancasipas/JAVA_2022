import javax.swing.JOptionPane;

public class chamado05 {
	public static void programar05() {
	    double num,den,serie=0;  
		for(int aux =1;aux <=100;aux++) {
		num = aux;
		den = Math.sqrt(aux*2);
		serie += num/den;
		}
	    JOptionPane.showMessageDialog(null,"Série"+serie);
		
	}

}
