import javax.swing.JOptionPane;
public class c09ex10D {
	public static void main(String[] args) {
		//Programadora: Bianca Maria
    double num,den,serie=0;  
	for(int aux =1;aux <=100;aux++) {
	num = (aux+(aux-1));
	den = (Math.pow(aux,2));
	serie += num/den;
	}
    JOptionPane.showMessageDialog(null,"Série "+serie);
	}

}
