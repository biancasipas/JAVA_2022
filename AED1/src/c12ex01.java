import javax.swing.JOptionPane;
public class c12ex01 {
	public static void main(String[] args) {
		//Programadora: Bianca Maria Fernandes Alves     
		     int cont = 0;
		     int vet[] = new int[10];
		     String numero;
		     for (int aux=0; aux<10; aux++) {
		    	 numero = JOptionPane.showInputDialog(null,"Informe os valores:","", 
		        JOptionPane.INFORMATION_MESSAGE);
		    	 vet[aux] = Integer.valueOf(numero).intValue();
		     }
		     for (int aux=0; aux<10; aux++) {
		        if (vet[aux] % 5 == 0 && vet[aux] % 7 == 0  )
		           cont++;
		     }
		     JOptionPane.showMessageDialog(null,"Quantidade de divisores de 5 e 7 ao mesmo tempo = "+cont);
		   }
		}