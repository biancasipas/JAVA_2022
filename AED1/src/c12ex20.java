import java.util.Scanner;
public class c12ex20 {
	public static void main(String[] args) {
		//Programadora: Bianca Maria Fernandes Alves
	int numero[] = new int[10];
	Scanner teclado = new Scanner(System.in);
	int soma=0,contador=0;
	double media;
	for(int aux=0;aux<= numero.length-1;aux++) {
	System.out.print("Digite o número: ");
	numero[aux] = teclado.nextInt();
	}
	for(int aux=0; aux<= numero.length-1; aux++) {
		if(numero[aux] > numero[numero.length-1]) {
			soma +=numero[aux];
			contador++;
			media = soma/contador;
		
	System.out.print("Números impressos: "+numero[aux]+ "\n"+"Média dos números impressos: "+media);
	}
   teclado.close();
}}}
