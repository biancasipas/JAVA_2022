import javax.swing.JOptionPane;
public class c09ex07 {
	public static void main(String[] args) {
		//Programadora: Bianca Maria 
		double num,den,serie=0;
	for(int aux = 1; aux <= 6; aux++) {
	 num = ((aux*2)-2)+(aux*3);
	 den = ((aux*6)+1);
	 serie += num/den;
	}
    JOptionPane.showMessageDialog(null,"Série"+serie);
	}

}