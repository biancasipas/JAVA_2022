import javax.swing.JOptionPane; 
public class ok5 {
	// Programadora: Bianca Maria
	// Este programa resolve uma equação a partir dr um número inteiro dado pelo usuário
   public static void main(String[] args) {
      String x = JOptionPane.showInputDialog(null,
         "Digite um número Inteiro", 
         "Equação",
         JOptionPane.QUESTION_MESSAGE);
      double x1 = Integer.valueOf(x).intValue();
      double f =  Math.pow(x1,3) + 4* x1 +10;
     JOptionPane.showMessageDialog(null,
    		 "O resultado da equação x² + 4x + 10 é: " +f,
             "Equação",
              JOptionPane.INFORMATION_MESSAGE);
   }
}