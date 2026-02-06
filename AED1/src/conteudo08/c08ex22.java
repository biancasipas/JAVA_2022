package conteudo08;

import javax.swing.JOptionPane;
public class c08ex22 {
	public static void main(String[] args) {
		// Programadora: Bianca Maria
   String numer;
   int numero = 0,divisor=0;
   numer = JOptionPane.showInputDialog(null,"Digite o n�mero");
   numero = Integer.valueOf(numer).intValue();
   if (numero<=0) {
   JOptionPane.showMessageDialog(null,
   "ERROR",
   "PRIMOS OU N�O",
   JOptionPane.INFORMATION_MESSAGE);
   }else {
   for(int aux=1; aux<=numero;aux++) {
	   if(numero % aux==0) {
		   divisor++;
	   }
   }
   if(divisor<=2) {
	JOptionPane.showMessageDialog(null,"S�o primos");
   }else {
	JOptionPane.showMessageDialog(null,"N�o s�o primos");

   }
   }
	}
}
