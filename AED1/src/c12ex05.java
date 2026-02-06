import javax.swing.JOptionPane;

public class c12ex05 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int vet[] = new int[10];
		String numero;
		int maiorvalor = 0;
		for (int aux = 0; aux < 10; aux++) {
			numero = JOptionPane.showInputDialog(null, "Informe os valores:", "", JOptionPane.INFORMATION_MESSAGE);
			vet[aux] = Integer.valueOf(numero).intValue();
		}
		for (int aux = 0; aux < 10; aux++) {
			
		if (vet[aux] < maiorvalor) 
			
		JOptionPane.showMessageDialog(null, "Maior Valor: " + maiorvalor, "Números", JOptionPane.INFORMATION_MESSAGE);

	}
}
}