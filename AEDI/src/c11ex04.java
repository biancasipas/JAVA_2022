import javax.swing.JOptionPane;
public class c11ex04 {
	public static void main(String[] args) {
		String nome,sexo,idade,pontos,multa,nomeVelha = "";
		int pontos1,idade1,soma=0,contador=0,contadorH=0,contadorF=0,idadeVelha=0;
		double multa1,media,somaMulta=0,perc;
	do {
	nome = JOptionPane.showInputDialog(null,"Qual seu nome: ");
	if(!nome.equalsIgnoreCase("X"));
	sexo = JOptionPane.showInputDialog(null,"Qual seu sexo: ");
	idade = JOptionPane.showInputDialog(null,"Qual sua idade: ");
	idade1 = Integer.valueOf(idade);
	pontos = JOptionPane.showInputDialog(null,"Quantidade de pontos perdidos: ");
	pontos1 = Integer.valueOf(pontos);
	multa = JOptionPane.showInputDialog(null,"Valor da Multar: ");
	multa1 = Double.valueOf(multa);
	soma+=idade1;
	contador++;
	somaMulta+=multa1;
	if (sexo.equalsIgnoreCase("M")||sexo.equalsIgnoreCase("Masculino")) {
		contadorH++;
	}
	if(sexo.equalsIgnoreCase("F")&& pontos1 == 7) {
		contadorF++;
		
	}
	if(contador==1||idade1>idadeVelha) {
		idadeVelha=idade1;
		nomeVelha=nome;
	}
	}while(!nome.equalsIgnoreCase("X"));
	media =(float)soma/contador;
	perc = (float)contadorH/contador;
	JOptionPane.showMessageDialog(null,"Idade Média : "+media);
	JOptionPane.showMessageDialog(null,"Somatório Multa: "+somaMulta);
	JOptionPane.showMessageDialog(null,"Mulheres com 7 pontos: "+contadorF);
	JOptionPane.showMessageDialog(null,"Percentual de homens: "+perc);
	JOptionPane.showMessageDialog(null,"Idade pessoa mais velha: "+nomeVelha);
	}
}
