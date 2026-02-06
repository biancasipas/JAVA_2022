import javax.swing.JOptionPane;
public class c08ex21 {
	public static void main(String[] args) {
		//Programadora: Bianca Maria
		String altura = JOptionPane.showInputDialog(null,
				"Qual e sua altura:",
				"Para calcular o IMC (), basta preencher os campos abaixo.",
				JOptionPane.QUESTION_MESSAGE);
				double altura1 = Double.valueOf(altura).doubleValue();
				
		for (int aux=60; aux<=100; aux++) {
				
				
				
				double IMC = aux/(Math.pow(altura1,2));
				if (IMC <20) {
				JOptionPane.showMessageDialog(null,
				"Abaixo do peso",	
				" Informação Índice de Massa Corporal",
				JOptionPane.INFORMATION_MESSAGE);
				}else if (IMC > 20 && IMC < 25) {
					JOptionPane.showMessageDialog(null,
				"Peso ideal",	
				" Informação Índice de Massa Corporal",
						JOptionPane.INFORMATION_MESSAGE);
				}else if (IMC > 20 && IMC <= 25) {
				JOptionPane.showMessageDialog(null,
				"Acima do peso",	
				" Informação Índice de Massa Corporal",
				JOptionPane.INFORMATION_MESSAGE);
		
				JOptionPane.showMessageDialog(null,
					"Seu Índice de Massa Corporal é:" +IMC,	
					" Informação Índice de Massa Corporal",
				JOptionPane.INFORMATION_MESSAGE);
				
	}}}}