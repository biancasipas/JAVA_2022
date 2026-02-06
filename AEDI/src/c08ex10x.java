import javax.swing.JOptionPane;
public class c08ex10x {
	public static void main(String[] args) {
		//Programadora: Bianca Maria
	String nome_produto,quantidade,preco_unitario;
	int custo_total,quantidade1;
	double soma=0,preco_unitario1,maiorpreco=0;
	String maiscaro;
	custo_total = (int) 1043.00;
	for(int aux = 1; aux<= custo_total;aux++) {
	nome_produto = JOptionPane.showInputDialog(null,"Qual é o nome do produto : ");
    quantidade = JOptionPane.showInputDialog(null,"Quantidade: ");
    preco_unitario = JOptionPane.showInputDialog(null,"Preço Unitario: ");
	quantidade1 = Integer.valueOf(quantidade).intValue();
	preco_unitario1 = Double.valueOf(preco_unitario).doubleValue();
    double custo_parcial = quantidade1*preco_unitario1;
    soma += custo_parcial;
    {
	}if (aux == 1 || preco_unitario1>maiorpreco) {
			maiorpreco = preco_unitario1;
			maiscaro=nome_produto;
	}
	
	double media = custo_parcial/4.0;
	
	JOptionPane.showMessageDialog(null,
	"A Média dos Custos Parciais"+media+"\n"+"Nome do Insumo de maior custo parcial  "+nome_produto,
	"Insumos conssumidos",
	JOptionPane.INFORMATION_MESSAGE);
	}

	}}
