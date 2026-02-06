package conteudo10;

import javax.swing.JOptionPane;

public class c10ex04 {
	public static void main(String[] args) {
		// Programadora: Bianca Maria
		String nome_produto, quantidade_material, preco_unitario,taxa_bdi;
		double quantidade_material1,preco_unitario1,custo_total=0,taxa_bdi1,custo_parcial,BDI,preco_final;
		taxa_bdi = JOptionPane.showInputDialog(null, "Taxa de BDI: ", "Produto manufaturado ",
				JOptionPane.QUESTION_MESSAGE);
		do {
		nome_produto = JOptionPane.showInputDialog(null, "Qual nome do produto: ", "Produto manufaturado ",
				JOptionPane.QUESTION_MESSAGE);
		taxa_bdi1 = Double.valueOf(taxa_bdi).doubleValue();
		if (!nome_produto.equalsIgnoreCase("FIM")) {
		quantidade_material= JOptionPane.showInputDialog(null, "Quantidade do Material  : ", "Produto manufaturado ",
				JOptionPane.QUESTION_MESSAGE);
		preco_unitario= JOptionPane.showInputDialog(null, "Pre�o Unitario  : ", "Produto manufaturado ",
				JOptionPane.QUESTION_MESSAGE);
		quantidade_material1 = Double.valueOf(quantidade_material).doubleValue();
		preco_unitario1 = Double.valueOf(preco_unitario).doubleValue();
		custo_parcial = quantidade_material1*preco_unitario1;
		custo_total+= custo_parcial;
		}}while(!nome_produto.equalsIgnoreCase("FIM"));
		BDI = (custo_total*(taxa_bdi1/100));
		preco_final = (custo_total + BDI);
		JOptionPane.showMessageDialog(null,
		"Custo Total � : "+custo_total+"\n"+"BDI: "+BDI+"\n"+"Pre�o final: "+preco_final,
		"Produto manufaturado",
		JOptionPane.INFORMATION_MESSAGE);
		
		}}
