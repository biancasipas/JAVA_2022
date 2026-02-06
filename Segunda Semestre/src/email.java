import java.util.Scanner;

public class email {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite um email: ");//teste
        String email = teclado.nextLine();//isso? imprimir?
        System.out.println(email.indexOf('@'));
        int pos = email.indexOf('@');
        if (pos!=-1 && email.length()> email.indexOf('@')+1) {
            System.out.println("Email correto");
        }else
            System.out.println("Email incorreto");
        System.out.println("Indice: "+ email.indexOf('@'));
        System.out.println("Tamanho: "+email.length());
        //olha aqui
        //SE achar o @ o valor retorna a posição dele
        //SENAO achar ele retorna o valor -1
        //eu tenho que escrever ta erradO?
        //entendeu?
        teclado.close();
    }}