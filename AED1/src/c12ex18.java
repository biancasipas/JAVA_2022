import java.util.Arrays;
import java.util.Scanner;
public class c12ex18 {
  public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);
    String Nomes[] = new String[10];
    for (int aux=0; aux<Nomes.length; aux++) {
       System.out.print("Digite um nome: ");
       Nomes[aux] = teclado.nextLine();
    }
    System.out.print("Digite um nome a procurar: ");
    Arrays.sort(Nomes);
    String nome = teclado.nextLine();
    int pos = Arrays.binarySearch(Nomes, nome);
    if (pos < 0)
       System.out.println("Nome não encontrado");
    else
       System.out.println("Nome encontrado no índice "+(pos+1));
    teclado.close();
}}