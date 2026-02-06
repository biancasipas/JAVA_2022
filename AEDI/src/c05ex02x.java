import javax.swing.JOptionPane;
public class c05ex02x {
	public static void main (String [] args) {
	 String raio = JOptionPane.showInputDialog(null, 
	 "Qual é o valor raio : ",
	 "Calcular: ",
	 JOptionPane.QUESTION_MESSAGE);
	 double raio1 = Double.valueOf(raio).doubleValue();
     double area = 4*3.1416* Math.pow(raio1,2);
     double volume = (4*3.1416*Math.pow(raio1,3)/3);
     System.out.print("Volume é: "+volume);
     System.out.print("Área é: "+area);		
	}

}
