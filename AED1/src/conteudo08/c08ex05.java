package conteudo08;

import javax.swing.JOptionPane;
public class c08ex05 {
	public static void main(String[] args) {
		//Programadora Bianca Maria
  int voto,total = 0;
  int vota_primeiro1=0,vota_segundo2=0,vota_terceiro3=0;
  for (int repeticao = 1; repeticao <= 10; repeticao++) {
  voto = Integer.parseInt(JOptionPane.showInputDialog("Qual n�mero de voto"));
		  switch(voto){
		   case 1:
		  JOptionPane.showMessageDialog(null,"Candidato Fulano votado");
		  vota_primeiro1++;
		  break;
		   case 2:
		  JOptionPane.showMessageDialog(null,"Candidato Ciclano votado");
		  vota_segundo2++;
		  break;
		   case 3:
		  JOptionPane.showMessageDialog(null,"Candidato Beltrano votado");
		  vota_terceiro3++;
		  break;
		   default:
		  }
  
          total= vota_primeiro1+vota_segundo2+vota_terceiro3;
          if (vota_primeiro1 >vota_segundo2 && vota_primeiro1 > vota_terceiro3){
        		JOptionPane.showMessageDialog (null, "Venceu as elei��es");
        	}
        	if (vota_segundo2 > vota_terceiro3){
        		JOptionPane.showMessageDialog (null, "Venceu as elei��es");
        	}
        	else {
        		JOptionPane.showMessageDialog (null, "Venceu as elei��es");
        		
        			}
        		}
		  JOptionPane.showMessageDialog(null,
		  "Quantidade de n�mero de candidato Fulano votado total: "+vota_primeiro1+"\n"+
		  "Quantidade de n�mero de candidato Ciclano votado total: "+vota_segundo2+"\n"+
	      "Qauntidade de n�mero de candidato Beltrano votado total: "+vota_terceiro3,
		  "ELEI��O",
	      JOptionPane.INFORMATION_MESSAGE);
		  
		  }
		}
		 
	


