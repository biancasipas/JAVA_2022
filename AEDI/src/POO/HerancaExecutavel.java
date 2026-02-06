import java.util.Scanner;

public class HerancaExecutavel {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Circulo");
        System.out.print("Qual o valor de x: ");
        int x = teclado.nextInt();
        System.out.print("Qual o valor de y: ");
        int y = teclado.nextInt();
        System.out.print("Qual e o valor do raio: ");
        float raio = teclado.nextFloat();
        HerancaCirculo circulo = new  HerancaCirculo (x,y,raio);
        System.out.println("Retangulo");
        System.out.print("Qual é o valor de altura do eixo x: ");
        int alturaX = teclado.nextInt();
        System.out.print("Qual é o valor de altura do eixo :y ");
        int alturaY = teclado.nextInt();
        //tem que perguntar se quer um cir
        System.out.println("MOVER CIRCULO: ");
        System.out.print("Qual valor para acrescentar X: " );
        int dx = teclado.nextInt();
        System.out.print("Qual valor para acrescentar Y: ");
        int dy = teclado.nextInt();
        circulo.moverHarancaCirculo (dx,dy);
        System.out.println("Circulo: " +circulo);
                //isso é um metodo
        HerancaRetangulo retangulo = new HerancaRetangulo(x,y);
        System.out.print("MOVER RETANGULO: ");
        System.out.print("Qual valor para acrescentar X: " );
         dx = teclado.nextInt();
        System.out.print("Qual valor para acrescentar Y: ");
         dy = teclado.nextInt();
         retangulo.MoverRetangulo(dx,dy);
        System.out.println("Retangulo: "+
                retangulo);



        teclado.close();
    }
}
