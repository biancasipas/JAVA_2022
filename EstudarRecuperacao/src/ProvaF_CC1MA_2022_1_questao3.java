import java.util.Scanner;

public class ProvaF_CC1MA_2022_1_questao3 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
        String palavra;
        int tot=0, cont=0;
        double perc;
        do {
        	System.out.println("Digite um palavra qualquer (FIM para encerrar):");
        	palavra = teclado.nextLine();
        	if (!palavra.equalsIgnoreCase("FIM")) {
        		tot++;
        		if (VerificarPalindromo(palavra)) {
        		    System.out.println("Esta palavra é um palíndromo");
        			cont++;
        		} else
        		    System.out.println("Esta palavra NÃO é um palíndromo");
        	}
        } while (!palavra.equalsIgnoreCase("FIM"));
        perc = (float) cont / tot * 100;
        System.out.println("Percentual de palíndromos encontrados = "+perc);
		teclado.close();
	}
    static boolean VerificarPalindromo(String palavra) {
    	String palavraInvertida="";
    	for (int aux=palavra.length()-1; aux>=0; aux--)
    		palavraInvertida += palavra.substring(aux, aux+1);
    	System.out.println(palavraInvertida);
     	return palavra.equals(palavraInvertida);
    }

}
