package conteudo08;

import javax.swing.JOptionPane;
public class c08ex12 {
	public static void main(String[] args) {
		// Programadora Bianca Maria
  String codigo,quantidade;
  int valorprimeiro=0,valorsegundo=0,valorterceiro=0,valorquarto=0,valorquinto=0;
  double valor1=0,valor2=0,valor3=0,valor4=0,valor5=0;
   for(int aux=1; aux<=5; aux++); 
     codigo = JOptionPane.showInputDialog(null,
     "Digite n�mero do c�digo do modelo: ",
     "A IND�SUTRIA PRODUTORA DE M�QUINAS AGR�GOLAS",
     JOptionPane.QUESTION_MESSAGE);
     quantidade = JOptionPane.showInputDialog(null,
     "Quantidade: ",
     "A IND�SUTRIA PRODUTORA DE M�QUINAS AGR�GOLAS",
     JOptionPane.QUESTION_MESSAGE);
     int quantidade1 = Integer.valueOf(quantidade).intValue();
     switch (codigo){
     case "1":
         valor1 += quantidade1*1565.00;
         valorprimeiro++;
         break;
     case "2":
         valor2 += quantidade1*1890.00;
         valorsegundo++;
         break;
     case "3":
         valor3 += quantidade1*2150.00;
         valorterceiro++;
         break;
     case "4" :
         valor4 += quantidade1*2963.00;
         valorquarto++;
         break;
     case "5":
         valor5 += quantidade1*3750.00;
         valorquinto++;
         break;
     default:
         System.out.println("C�digo inv�lido");
         break;
     }
        double faturamento_total = valor1+valor2+valor3+valor4+valor5;
        {
        JOptionPane.showMessageDialog(null,
       " Faturamento total �: "+faturamento_total,
        "A IND�SUTRIA PRODUTORA DE M�QUINAS AGR�GOLAS",
        JOptionPane.INFORMATION_MESSAGE);
        		            
     

    		    
     }
	}
	}

    		        
    		        
    		 
    		        
