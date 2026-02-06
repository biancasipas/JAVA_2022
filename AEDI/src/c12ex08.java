import java.util.Scanner;
public class c12ex08 {
	public static void main(String[] args) {
		//Porgramadora:Bianca Maria Fernandes Alves
int numero[] = new int[20];
Scanner telcado = new Scanner(System.in);
for(int aux=0; aux<=numero.length-1; aux++) {
System.out.print("Digete o numero: ");
numero[aux]= telcado.nextInt();
}
for(int aux =0;aux<=9;aux++) {
System.out.println(numero[aux]+numero[aux+10]);
telcado.close();


	}

}}
