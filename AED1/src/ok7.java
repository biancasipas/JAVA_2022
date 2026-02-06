import javax.swing.JOptionPane;
public class ok7 {
	public static void main(String[] args) {
		//Programadora: Bianca Maria
	String A = JOptionPane.showInputDialog(null,
	 "Qual e o valor A: ",
	 "Calcular",
	JOptionPane.QUESTION_MESSAGE);
	String B = JOptionPane.showInputDialog(null,
	"Qual e o valor B: ",
	"Calcular",
	JOptionPane.QUESTION_MESSAGE);
	String C = JOptionPane.showInputDialog(null,
    "Qual e o valor C: ",
    "Calcular: ",
    JOptionPane.QUESTION_MESSAGE);
	double A1 = Double.valueOf(A).doubleValue();
	double B1 = Double.valueOf(B).doubleValue();
	double C1 = Double.valueOf(C).doubleValue();
	double delta = Math.pow(B1,2) -(4*A1*C1);
	double delta1 = Math.sqrt(delta);
	double r0 = (-B1 ) / (2*A1);
    double r1 = (-B1 + delta1)/ (2*A1);
    double r2 = (-B1 - delta1)/ (2*A1);
    if (delta == 0){
		System.out.printf("Teremos uma raiz com valor de:" +r0);
	}
	else if (delta > 0){
			System.out.printf("Teremos duas raizes com valor de:" +r1+ " e "+r2);

	}else{
		System.out.printf("não temos raizes");
	   };
	}
}


