import javax.swing.JOptionPane;
public class c09ex06 {
	public static void main(String[] args) {
		//Programadora: Bianca Maria
		double num,den,serie=0,serie1;
		for(int aux=1;aux<=20;aux++) {
		num = aux;	
		den = (Math.sqrt(aux*2));
		serie += num/den;
		}
		serie1 = (10+(serie));
JOptionPane.showMessageDialog(null,"Série " +serie1);
}

}