package conteudo04;

import javax.swing.JOptionPane;
public class c04ex05 {
   public static void main(String[] args) {
      String nome = JOptionPane.showInputDialog(null,
         "Qual seu nome?", 
         "FICHA FUNCIONAL DE: ",
         JOptionPane.QUESTION_MESSAGE);
      String cpf = JOptionPane.showInputDialog(null,
         "Qual o seu CPF?", 
         "DOCUMENTOS",
         JOptionPane.QUESTION_MESSAGE);
      String idade = JOptionPane.showInputDialog(null,
         "Qual sua identidade ?",
         "DOCUMENTOS",
    	 JOptionPane.QUESTION_MESSAGE);
      String eleitor = JOptionPane.showInputDialog(null,
    	 "T�tulo de eleitor",
    	 "DOCUMENTOS",
    	 JOptionPane.QUESTION_MESSAGE);
      String carteira1 = JOptionPane.showInputDialog(null,
         "Carteria de motorista",
         "DOCUMENTOS",
         JOptionPane.QUESTION_MESSAGE);
      long carteira = Integer.valueOf(carteira1).intValue();
      JOptionPane.showMessageDialog(null,
         nome+ ", " +cpf +" ," +idade+","+eleitor+"\ncarteria: "+carteira, 
         "Aula de Java",
         JOptionPane.INFORMATION_MESSAGE);
   }
}