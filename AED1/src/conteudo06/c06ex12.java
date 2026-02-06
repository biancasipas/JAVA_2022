package conteudo06;

import javax.swing.JOptionPane;
public class c06ex12 {
	public static void main(String[] args) {
		// TODO Programadora: Bianca Maria
	String bola = JOptionPane.showInputDialog(null,
	"Quanto produ��o de bolas: ",
    "Calcular: ",
    JOptionPane.QUESTION_MESSAGE);
	String quantidade_meses = JOptionPane.showInputDialog(null,
	"Quantos meses para a Copa: ",
	"Calcular: ",
	JOptionPane.QUESTION_MESSAGE);
	String boladefeituosa = JOptionPane.showInputDialog(null,
			"Quantas bolas com defeito?: ",
			"Caclular: ",JOptionPane.QUESTION_MESSAGE);
	String aluguel = JOptionPane.showInputDialog(null,
			"Qual e o pre�o do aluguel?: ",
			"Caclular: ",JOptionPane.QUESTION_MESSAGE);
	String valor_caixa = JOptionPane.showInputDialog(null,
			"Qual e o pre�o da caixa: ",
			"Caclular: ",JOptionPane.QUESTION_MESSAGE);
	double boladefeituosa1 = Double.valueOf(boladefeituosa).doubleValue();
	double bola1 = Double.valueOf(bola).doubleValue();
	double total_bola=(bola1 - boladefeituosa1);
	double valor_caixa2 = Double.valueOf(valor_caixa).doubleValue();
	double aluguel1 = Double.valueOf(aluguel).doubleValue();
	double caixa1 = total_bola/10;
	if (caixa1 % 10 != 0)
		caixa1 +=1;
		
		
	double meses1 = Double.valueOf(quantidade_meses).doubleValue();
	double galpao = caixa1/850;
	if (caixa1 % 10 != 0 )
		galpao += 1;
	double total = (caixa1*valor_caixa2)+(aluguel1*meses1)*galpao;

	
	
	JOptionPane.showMessageDialog(null,
	"O custo total de embalagem mais custo total de  estocagem de toda a produ��o: "+total,
	"Calcular",
	JOptionPane.INFORMATION_MESSAGE);
	

	}

}