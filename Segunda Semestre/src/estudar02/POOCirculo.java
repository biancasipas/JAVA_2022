package estudar02;
import java.util.Scanner;

public class POOCirculo {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner teclado = new Scanner (System.in);
        System.out.print("Digite a coordenada (x,y): ");
        int x1 = teclado.nextInt();
        int y1 = teclado.nextInt();
        System.out.print("Digite o raio do circulo: ");
        double raio = teclado.nextDouble();
        objetoCirculo circulo = new objetoCirculo(x1, y1, raio);
        // ele pede pra fazer um MENU
        //1-MOVER,2-AUMENTAR,3-IMPRIMIR, 4-SAIR
        System.out.println("===============MENU================");
        System.out.println("ESCOLHA A OPÇÃO");
        System.out.println("1 - MOVER");
        System.out.println("2 - AUMENTAR ");
        System.out.println("3- IMPRIMIR ");
        System.out.println("4- SAIR" );
        System.out.print("digite (1/2/3/4): ");
        int resposta = teclado.nextInt();
        while (resposta!=4) {
            //pq se o usuario digitar 4 eu paro o programa
        //enquanto nao digitar 4 eu continuo
            if (resposta == 1) {
                System.out.print("Digite quanto acrescentar em X e Y: ");
                int x2 = teclado.nextInt();
                int y2 = teclado.nextInt();
                circulo.moveX(x2);
                circulo.moveY(y2);
            }
            else if (resposta == 2) {
                System.out.println("Digite em quantas vezes aumentar o raio: ");
                int aumentaRaio = teclado.nextInt();
                circulo.aumentaRaio(aumentaRaio);

            }
            else if (resposta == 3) {
                System.out.println(circulo);
            }
            System.out.print("digite (1/2/3/4): ");
            resposta = teclado.nextInt();
            //escrevi dnv pq ele vai voltar no começo para testar
            //CERTEZA?

        }
        teclado.close();

    }

}