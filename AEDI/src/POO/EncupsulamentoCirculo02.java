import java.util.Scanner;

public class EncupsulamentoCirculo02 {
    public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);
    System.out.print("Qual o valor do raio: ");
    double raio = teclado.nextDouble();
    System.out.print("Qual o valor de x: ");
    int x = teclado.nextInt();;
    System.out.print("Qual o valor de Y: ");
    int y = teclado.nextInt();
        EncupsulamentoCirculo circulo = new EncupsulamentoCirculo(x, y, raio);
        System.out.println("===============MENU================");
        System.out.println("ESCOLHA A OPÇÃO");
        System.out.println("1 - MOVER");
        System.out.println("2 - AUMENTAR ");
        System.out.println("3- IMPRIMIR ");
        System.out.println("4- SAIR" );
        System.out.print("digite (1/2/3/4): ");
        int digite = teclado.nextInt();;
    switch(digite){
        case 1:
            System.out.print("Digite quanto acrescentar em X e Y: ");
            int x1 = teclado.nextInt();
            int y1 = teclado.nextInt();
            circulo.moveX(x1);
            circulo.moveY(y1);
            break;
        case 2:
            System.out.print("Qual o valor de raio: ");
            int aumentaRaio = teclado.nextInt();
            circulo.aumentaRaio(aumentaRaio);
            break;
        case 3:
            System.out.println();
            System.out.println(circulo);
            break;
        case 4:
            System.out.println("=====CANCELAMENTO=====");
    }
        teclado.close();

    }

}
