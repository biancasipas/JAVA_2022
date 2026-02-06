import java.util.Scanner;
public class ok4 {
	public static void main(String[] args) {
	double area,angulo;
	Scanner teclado = new Scanner (System.in);
	System.out.print(" Digite o valor da Área do setor circular:");
	area = teclado.nextDouble();
    System.out.print ("Digite o valor do angulo:");
    angulo = teclado.nextDouble();
    double pi = 3.1416;
    double raio = Math.sqrt((360*area)/(angulo*pi));
    System.out.println("O valor do Raio desse setor circular é de: "+raio);
    teclado.close();
    
}
}
