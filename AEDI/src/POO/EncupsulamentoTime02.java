import java.util.Scanner;

public class EncupsulamentoTime02 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Que horas: ");
        int horas = teclado.nextInt();
        System.out.println("Quanto segundos: ");
        int segundos = teclado.nextInt();
        System.out.println("Quanto minutos: ");
        int minutos = teclado.nextInt();

        //(nome da classe) (nomear) = new (nome da classe) (parametros)
        EncupsulamentoTime Tempo = new EncupsulamentoTime(horas,minutos,segundos);
        System.out.println("Tempo: "+
                Tempo.exibe02());
        teclado.close();
    }
}

