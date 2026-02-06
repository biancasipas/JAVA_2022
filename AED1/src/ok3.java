import java.util.Scanner;
    public class ok3 {	
	 public static void main(String[] args) {
		 double celsius;   
	     Scanner teclado = new Scanner (System.in);
	     System.out.print("Digite o valor, em Celsius, da temperatura:");
	     celsius = teclado.nextDouble ();
	     double kelvin = celsius + 273;
	     double fahrenheit = (1.8*celsius)+32;
	     System.out.println ("A temperatura " +celsius + "ºC, em Kelvin é de: "+kelvin );
	     System.out.println ("A temperatura " +celsius + "ºC, em Fahrenheit é de:" +fahrenheit);
		 teclado.close();
	}

}