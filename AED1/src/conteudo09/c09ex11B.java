package conteudo09;

import javax.swing.JOptionPane;
public class c09ex11B {
	public static void main(String[] args) {
		//Programadora: Bianca Maria
    double num,den,serie=0,serie1;  
	for(int aux =1;aux <=100;aux++) {
	num = (aux*3)-2;
	den = Math.sqrt((aux*3)+4);
	serie += num/den;
		}
		serie1 = 5/3.0*serie; 
	    JOptionPane.showMessageDialog(null,"S�rie "+serie1);
	}

}
