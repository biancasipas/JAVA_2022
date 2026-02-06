import java.util.Scanner;
import java.util.Arrays;
public class c12ex23 {
	public static void main(String[] args) {
		// Programadora: Bianca Maria Fernades Alves
	int numero[] = new int[5]; //100 pisoções as placas dos carros e teste10!
	String nome_morador[] = new String[numero.length];
	int procura;
	int temp;
	String nometemp;
	Scanner teclado = new Scanner (System.in);
	
	for(int aux=0;aux<= numero.length-1;aux++) {
	System.out.print("Digite o número de placa do carro: ");
	numero[aux] = teclado.nextInt();
	teclado.nextLine();
	System.out.print("Qual seu nome do dono de vaga ");
	nome_morador[aux] = teclado.nextLine();
	}
	System.out.print("Achar o número da sua vaga: ");
	procura=teclado.nextInt();
	for(int aux=0; aux<=numero.length-2;aux++) {
		for(int x=0; x< numero.length-1;x++) {
			if(numero[x]>numero[x+1]) {
				temp = numero[x];
				numero[x] = numero[x+1];
				numero[x+1] = temp;
				nometemp = nome_morador[x+1];
				nome_morador[x] = nome_morador[x+1];
				nome_morador[x+1]= nometemp;
			}
		}
	}
    int pos = Arrays.binarySearch(numero,procura);
    if (pos < 0)
       System.out.println("Numero de placa não encontrado");
    else
       System.out.println("O número da sua vaga:  "+(pos+1));
    teclado.close();
	}

}
