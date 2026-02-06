import javax.swing.JOptionPane;
public class c09ex11C {
	public static void main(String[] args) {
		//Programadora: Bianca Maria
    double num,den,serie=0,serie1;  
	for(int aux =1;aux <=100;aux++) {
	num = (aux*2+1)*Math.sqrt(aux*4+1);
	den = Math.pow(5,aux);
	serie += num/den;
		}
		serie1 = Math.pow(serie,2); 
	    JOptionPane.showMessageDialog(null,"Série "+serie1);
	}

}
