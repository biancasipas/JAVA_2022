import java.util.Scanner;

public class E06e06 {
	public static void main(String[] args) {
		int A, B, C;
		double y;
		Scanner teclado = new Scanner(System.in);
		System.out.print("Digite o valor de A: ");
		A = teclado.nextInt();
		System.out.print("Digite o valor de B: ");
		B = teclado.nextInt();
		System.out.print("Digite o valor de C: ");
		C = teclado.nextInt();
      y= (Math.pow(B,2)- 4*A*C);
      if  (y < 0)
      System.out.println("Não teremos raízes ="+y);
      else if (y == 0)
    	  System.out.println("Teremos 1 raíz ="+y);
      else 
	  System.out.println(" Teremos 2 raízes ="+y);
      teclado.close();
	}

}
