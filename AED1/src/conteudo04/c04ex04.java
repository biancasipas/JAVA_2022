package conteudo04;

import javax.swing.JOptionPane;
public class c04ex04 {
   public static void main(String[] args) {
      String nome = JOptionPane.showInputDialog(null,
         "Qual seu nome?", 
         "Aula de Java",
         JOptionPane.QUESTION_MESSAGE);
      String nomeMeio = JOptionPane.showInputDialog(null,
         "Qual seu nome do Meio?", 
         "Aula de Java",
         JOptionPane.QUESTION_MESSAGE);
      String sobrenome = JOptionPane.showInputDialog(null,
         "Qual seu sobrenome ?",
    	 JOptionPane.QUESTION_MESSAGE);
      String idade = JOptionPane.showInputDialog(null,
    	 "Qual sua idade ?", 
    	 JOptionPane.QUESTION_MESSAGE);
      int idade1 = Integer.valueOf(idade).intValue();
      JOptionPane.showMessageDialog(null,
         sobrenome+ ", " +nome +" " +nomeMeio+"\nIdade: "+idade1, 
         "Aula de Java",
         JOptionPane.INFORMATION_MESSAGE);
   }
}

