import java.util.Scanner;

public class c13ex05 {

	public static double angulo;
	public static void main(String[] args) {
		//Seno,Cosseno...!
    Scanner teclado = new Scanner(System.in);
    System.out.print("Digite o ângulo: ");
    angulo = teclado.nextDouble();
    System.out.println("Calcular = "+calcular(angulo));
    teclado.close();
	}
	public static double calcular(double angulo){
	double seno = Math.sin(Math.toRadians(angulo));
	double cosseno = Math.cos(Math.toRadians(angulo));
	double tangente = Math.tan(Math.toRadians(angulo));
	double arco_seno = (1/seno);
	double arco_cosseno = (1/cosseno);
	double arco_tangente = (1/tangente);
    System.out.println("Seno: "+seno);
    System.out.println("Cosseno: "+cosseno);
    System.out.println("Tangente: "+tangente);
    System.out.println("Arco seno: "+arco_seno);
    System.out.println("Arco Cosseno: "+arco_cosseno);
    System.out.println("Arco Tangente: "+arco_tangente);
	return arco_tangente;
	
	}}
