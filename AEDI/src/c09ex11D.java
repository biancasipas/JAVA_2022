import javax.swing.JOptionPane;
public class c09ex11D {
	public static void main(String[] args) {
		//Programadora: Bianca Maria
    double num,den,serie=0;  
	for(int aux =1;aux <=100;aux++) {
	num = (aux*aux*aux);
	den = Math.pow(10,aux-1);
	serie += num/den;
	}
	    JOptionPane.showMessageDialog(null,"Série "+serie);
	}

}
