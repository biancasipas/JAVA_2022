package conteudo09;

import javax.swing.JOptionPane;
public class c09ex02 {
	public static void main(String[] args) {
		//Programadora: Bianca Maria
	      double num, den, serie=0;
	      for (int aux=1; aux<=100; aux++) {
	         num = aux;
	         den = (Math.pow(aux,2)+(aux-1));
	         serie += num / den;
	      }
	  JOptionPane.showMessageDialog(null,"Valor da S�rie = "+serie);
	   }
	}

	
