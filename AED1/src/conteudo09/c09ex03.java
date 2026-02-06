package conteudo09;

import javax.swing.JOptionPane;
public class c09ex03 {
	public static void main(String[] args) {
		//Programadora:Bianca Maria
	double num,den,serie=0;
	for(int aux=1; aux<=20;aux++) {
		num = (1+Math.sqrt(4*aux));
		den = (aux*3);
		serie += num/den;
	}
	JOptionPane.showMessageDialog(null,"S�rie:"+serie);

	}

}
