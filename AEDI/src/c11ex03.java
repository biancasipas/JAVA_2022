import javax.swing.JOptionPane;
public class c11ex03 {
	public static void main(String[] args) {
		//Programadora:Bianca Maria
	String nome,valor_aplicacao,classificacaoB,classificacaoP,classificacaoO;
	int contadorB=0,soma=0;
	double valor_aplicacao1,media_bronze;
	nome = JOptionPane.showInputDialog(null,"Qual seu nome: ");
	valor_aplicacao = JOptionPane.showInputDialog(null,"O Valor da Aplicação: ");
	valor_aplicacao1 = Double.valueOf(valor_aplicacao);
	if(valor_aplicacao1 <= 1000) {
	
	 classificacaoB = "Bronze";
	 soma += valor_aplicacao1;
	 contadorB++;
	}
	else if (valor_aplicacao1 > 1000 && valor_aplicacao1 <= 5000) {
	 classificacaoP = "Prata";
	}
	else {
	 classificacaoO = "Ouro";
	}
	media_bronze = soma/contadorB;
	}
	

}
