import java.util.Scanner; 
public class ok8 {
		public static void main(String[] args) {
			// Programadora:Bianca Maria
			double A, B, C, r1,r2;
			Scanner teclado = new Scanner (System.in);
			System.out.print("Qual é o valor A: ");
			A = teclado.nextDouble();
			System.out.print("Qual é o valor B: ");
			B = teclado.nextDouble();
			System.out.print("Qual é o valor C: ");
			C = teclado.nextDouble();
			double delta = Math.pow(B,2)-4*A*C;
	        if (delta < 0)
	    		System.out.print("Nenhuma raizes" );
	    	else if (delta == 0){
	    	r1 = (-B+(Math.sqrt(delta)))/(2*A);
	        System.out.println("Teremos uma raiz: "+r1);}
	        else{
                r1 = (-B-(Math.sqrt(delta)))/(2*A);
                r2 = (-B+(Math.sqrt(delta)))/(2*A);
                System.out.println("Teremos duas raizes: " +r1+","+r2);
                }
	        teclado.close();
            }
	    	}

	    