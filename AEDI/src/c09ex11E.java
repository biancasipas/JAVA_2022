import javax.swing.JOptionPane;
public class c09ex11E {
	public static void main(String[] args) {
		//Programadora: Bianca Maria
    double num,den,serie=0,serie1;  
	for(int aux =1;aux <=100;aux++) {
	num = (aux*aux)*Math.sqrt(aux*2+3);
	den = Math.pow(aux+1,aux);
	serie += num/den;
		}
		serie1 = 2/3.0*serie; 
	    JOptionPane.showMessageDialog(null,"Série "+serie1);
	}

}
