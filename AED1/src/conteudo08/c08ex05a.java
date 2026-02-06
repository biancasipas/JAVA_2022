package conteudo08;

import javax.swing.JOptionPane;
public class c08ex05a {
	public static void main(String[] args) {
		//Programadora Bianca Maria
		  final String ANSI_YELLOW = "\u001B[33m";  // AMARELHO
		  final String ANSI_BLUE = "\u001B[34m";    // AZUL
		  final String ANSI_PURPLE = "\u001B[35m";  // ROXA
		  final String ANSI_CYAN = "\u001B[36m";    // CIANO
		  final String ANSI_WHITE = "\u001B[37m";   // BRANCA
	int voto = 0;
	int vota_primeiro=0,vota_segundo=0,vota_terceiro=0,nulo=0,codigo=0, total=0;
	String candidato1 = "Fulano",candidato2 = "Ciclano", candidato3="Beltrano";
	for (int repeticao = 1; repeticao <= 10; repeticao++) {
		 voto = Integer.parseInt(JOptionPane.showInputDialog(ANSI_YELLOW+"Qual n�mero de voto"));
		  switch(voto){
		   case 1:
		  JOptionPane.showMessageDialog(null,ANSI_BLUE+"Candidato Fulano votado");
		  vota_primeiro++;
		  break;
		   case 2:
		  JOptionPane.showMessageDialog(null,ANSI_PURPLE+"Candidato Ciclano votado");
		  vota_segundo++;
		  break;
		   case 3:
		  JOptionPane.showMessageDialog(null,ANSI_CYAN+"Candidato Beltrano votado");
		  vota_terceiro++;
		  break;
		   default:
		  JOptionPane.showMessageDialog(null,ANSI_WHITE+"Voto nulo");
		  nulo++;
		  break;
	}
	}
 //VERIFICADOR DE VOTOS EM NULO
 total = vota_primeiro+vota_segundo+vota_terceiro;
 if (total<nulo){
	 JOptionPane.showMessageDialog(null,
     "N�mero de votos nulos maior que votos v�lidos, elei��o encerrada",
     "ELEI��O",
     JOptionPane.INFORMATION_MESSAGE);
 }
 //VERIFICAR VECERDOR
 if(vota_primeiro>vota_segundo && vota_primeiro>vota_segundo){
	 JOptionPane.showMessageDialog(null,
	 vota_primeiro+"Venceu as elei��es",
	 "ELEI��ES",
	JOptionPane.INFORMATION_MESSAGE);
 }else if (vota_segundo>vota_terceiro && vota_segundo>vota_terceiro){
	 JOptionPane.showMessageDialog(null,
			 vota_segundo+"Venceu as elei��es",
			 "ELEI��ES",
			JOptionPane.INFORMATION_MESSAGE);
 }else if(vota_terceiro>vota_primeiro && vota_terceiro>vota_primeiro){
	 JOptionPane.showMessageDialog(null,
			 vota_terceiro+"Venceu as elei��es",
			 "ELEI��ES",
			JOptionPane.INFORMATION_MESSAGE);
 }
 //VERIFICAR DE EMPATE
 if (vota_primeiro==vota_segundo){
	 codigo=1;
 }else if (vota_primeiro==vota_terceiro){
	 codigo=2;
 }else if (vota_segundo==vota_terceiro){
	 codigo=3;
 }else {
	 codigo=0;
	 
 //L�gica do 2 turno
 if(codigo>0){
	 JOptionPane.showMessageDialog(null,ANSI_YELLOW+"Segundo turno!");
 switch (codigo){
 case 1:
	 JOptionPane.showMessageDialog(null,candidato1+" e "+candidato2);
 break;
 case 2:
	 JOptionPane.showMessageDialog(null,candidato1+" e "+candidato3);
 candidato2 = "Beltrano";
 break;
 case 3:
	 JOptionPane.showMessageDialog(null,candidato2+" e "+candidato3);
 candidato1="Ciclano";
 candidato2="Beltrano";
 break;
 default:
 }
 for (int repeticao = 1; repeticao <= 10; repeticao++) {
	JOptionPane.showMessageDialog(null,ANSI_YELLOW+"Coleque seu voto: ");
	switch (voto){
	case 1:
	JOptionPane.showMessageDialog(null,ANSI_BLUE+"Candidato "+candidato1+" votado");
	vota_primeiro++;
	break;
	case 2:
	JOptionPane.showMessageDialog(null,ANSI_PURPLE+"Candidato "+candidato2+" votado");
	vota_segundo++;
	break;
	default:
	JOptionPane.showMessageDialog(null,ANSI_WHITE+"Voto nulo");
	nulo++;
	break;
	}
 }
  //RESULTADO DAS ELEI��ES
 for(int repeticao = 1; repeticao <= 10; repeticao++) {
	if(vota_primeiro>vota_segundo) {
	JOptionPane.showMessageDialog(null,candidato1+"Fulano venceu as elei��es");
	}else if (vota_segundo>vota_primeiro){
	JOptionPane.showMessageDialog(null,candidato2+"Ciclano venceu as elei��es");
	}else {
	JOptionPane.showMessageDialog(null,"Deu empate");
	}
	}
}
 }
	}
}