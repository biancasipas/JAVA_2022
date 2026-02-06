import java.util.Scanner;


public class c14ex02 {

    
    public static void main (String[] args) {
        Scanner teclado = new Scanner(System.in);
        int input;
        //Recebe os valores
        System.out.println("Opção desejada: ");
        System.out.println("Quadrado - Digite 1 ");
        System.out.println("Retângulo - Digite 2 ");
        System.out.println("Triângulo rentângulo - Digite 3 ");
        System.out.println("Circulo - Digite 4 ");
        input = teclado.nextInt();
        switch (input){
            case 1:
            double lado,area;
            System.out.println("Lado: ");
            lado = teclado.nextDouble();
            area = c14ex02A.Quadrado(lado);
            System.out.println("Area ="+area);
            break;
            case 2:
            double lado1,altura1,area1;
            System.out.println("Lado: ");
            lado1 = teclado.nextDouble();
            System.out.println("Altura: ");
            altura1 = teclado.nextDouble();
            area1 = c14ex02A.Retangulo(lado1,altura1);
            System.out.println("Area ="+area1);
            break;
            case 3:
            double lado2,altura2,area2;
            System.out.println("Lado: ");
            lado2 = teclado.nextDouble();
            System.out.println("Altura: ");
            altura2 = teclado.nextDouble();
            area2 = c14ex02A.Triangulo(lado2,altura2);
            System.out.println("Area ="+area2);
            break;
            case 4:
            double raio,area3;
            System.out.println("Raio: ");
            raio = teclado.nextDouble();
            area3 = c14ex02A.Circulo(raio);
            System.out.println("Area ="+area3);
            break;
            default:
            System.out.println("Deu erro ai chefia");
            break;
        }
        teclado.close();
    }
}
