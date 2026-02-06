import java.util.*;

public class GeradorSenha {
    public static void main (String[] args){
        //caracteres para a senha
        String upper="ABCDEFGHIJKLMNOPQRSTUWXYZ",
        lower="abcdefghijklmnopqrstuwxyz",
        num="0123456789",
        special="!?.;<>/-=",
        //Essa string recebe tudas as strings acima e as concatena
        combination=upper+lower+special+num;
        
        //Tamanho da senha que vai ser decido pelo user
        int lenght= 0;
        Scanner teclado = new Scanner(System.in);
        System.out.printf("Informe o número de caracteres que deseja na senha: ");
        lenght = teclado.nextInt();
        //
        char[] password = new char [lenght];
        //Gera um número aleatório que definirá qual caractere sera escolhido
        Random r=new Random();

        //Loop que combina os caraceteres baseado no tamanho desejado
        for (int i=0; i<lenght; i++){

            /* Variável "password" recebe 1 char da combinação toda X vezes
            Onde X = input do usuário
            */
            password[i]=combination.charAt(r.nextInt(combination.length()));
        }
        System.out.println("Password generated => "+new String(password));
        teclado.close();
    }
}