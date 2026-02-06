import javax.swing.JOptionPane;

public class prova0b {
	public static void main(String[] args) {
		// Programdadora Bianca Maria
		// Informação o CEP(Código de Endereçamento Postal) e sub-região que ele e
		// pertence, e se ele PERTENCE(ou não) a uma Caixa Postal Comunitária (CPC).
		String CEP = JOptionPane.showInputDialog(null, "Qual e o seu CEP: ", "Código de Endereçamento Postal: ",
				JOptionPane.QUESTION_MESSAGE);
		String regiao = null;
		int CEP1 = Integer.valueOf(CEP).intValue();
		int codigo_regiao = CEP1 / 10000000;
		int sub_regiao = (CEP1 / 1000000) % 10;
		if (codigo_regiao == 0) {
			regiao = "Regiao São Paulo";
		} else if (codigo_regiao >= 1 && codigo_regiao <= 3) {
			regiao = "Sudeste";
		} else if (codigo_regiao == 4 || codigo_regiao == 5) {
			regiao = "Nordeste(Bahia,Sergipe,Pernambuco,Alagoas,Paraíba,Rio Grnade do Norte)";
		} else if (codigo_regiao == 6) {
			regiao = "Norte e Nordeste(CE,PI,MA)";
		} else if (codigo_regiao == 7) {
			regiao = "Centro Oeste e Brasilia(DF)";
		} else if (codigo_regiao == 8 || codigo_regiao == 9)
			regiao = "Sul";
		int sufixo = CEP1 % 1000;
		String CPC;
		if (sufixo >= 990 && sufixo <= 998) {
			CPC = "Possui CPC";
		} else {
			CPC = "Não possui CPC";
		}
		JOptionPane.showMessageDialog(null,
				"A região do CEP: " + regiao + "\n A sub-região do CEP: " + sub_regiao
						+ "\n Caixas Postais Comunitária: " + CPC,
				"Código de Endereçamento Postal", JOptionPane.INFORMATION_MESSAGE);
	}
}
