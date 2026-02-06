import javax.swing.JOptionPane;
public class c10ex06 {
	public static void main(String[] args) {
		//Programadora: Bianca Maria
	String A,B,C,y,x;
	Double A1,B1,C1,y1,x1,distancia = null ;
	A = JOptionPane.showInputDialog(null,"Qual e o valor de A: ");
	B = JOptionPane.showInputDialog(null, "Qual é o valor de B: ");
	C = JOptionPane.showInputDialog(null,"Qual é o valor de C: ");
	A1 = Double.valueOf(A).doubleValue();
	B1 = Double.valueOf(B).doubleValue();
	C1 = Double.valueOf(C).doubleValue();
	do {
	x = JOptionPane.showInputDialog(null,"Qual é o valor de x: ");
	y = JOptionPane.showInputDialog(null,"Qual é o valor de y: ");
	x1 = Double.valueOf(x).doubleValue();
	y1 = Double.valueOf(y).doubleValue();
	JOptionPane.showMessageDialog(null,"Distância: "+distancia);
	distancia = (A1*x1+B1*y1+C1)/Math.sqrt(Math.pow(A1,2)+Math.pow(B1,2));
	}while(distancia!=0);
	
	
	}
}
