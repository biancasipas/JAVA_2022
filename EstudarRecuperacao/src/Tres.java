import java.util.Scanner;
import java.util.Arrays;

public class Tres {
    public static void main(String[] args) {
        String[] nome = new String[26];
        int[] codigo = new int[nome.length];
        int conta = 0;
        Scanner keyb = new Scanner(Tres.class.getResourceAsStream("debug2.txt"));
        while (keyb.hasNextLine()) {
            nome[conta] = keyb.nextLine();
            codigo[conta] = Integer.parseInt(keyb.nextLine());
            conta += 1;
        }
        String[] livro = new String[nome.length];
        for (int cont = 0; cont < nome.length; cont++) {
            livro[cont] = nome[cont];
        }
        Arrays.sort(nome);
        for (int aux = 0; aux < nome.length; aux++) {
            for (int cont = 0; cont < livro.length; cont++) {
                //System.out.println(nome[aux] +" x " +livro[cont]);
                if (nome[aux].equals(livro[cont]) && codigo[cont] > 1001 && 1100 > codigo[cont]) {
                    System.out.printf("\nLivro: %s \nCódigo: %s \n", livro[cont], codigo[cont]);
                }
            }
        }
        keyb.close();
        System.out.println("FIM");
    }
}