import java.util.Scanner;

public class c13ex03 {

	public static int numero1, posicao;

	public static void main(String[] args) {
		// O método receberá como parâmetros o número inteiro infromado!
		Scanner teclado = new Scanner(System.in);
    do {
    	 if(numero1 !=-1){
    System.out.print("Digite o número: ");
    numero1 = teclado.nextInt();
    System.out.print("Digite a posição: ");
    posicao = teclado.nextInt();
    System.out.println("Retorno = "+separador(numero1, posicao));
    	 }
    }while(numero1!=-1);
    teclado.close();
	}
	public static int separador(int numero, int posicao){
		int resto=0;
        for (int x=0; x<posicao; x++){
            resto = numero%10;
            numero /= 10;
        }
        System.out.println(resto);
        return resto;
    }
}
 
