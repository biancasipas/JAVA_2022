import java.util.Scanner;

public class EncupsulamentoTempo01 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Que dia: ");
        int dia = teclado.nextInt();
        System.out.println("Qual mês: ");
        int mes = teclado.nextInt();
        System.out.println("Que ano: ");
        int ano = teclado.nextInt();
        //(nome da classe) (nomear) = new (nome da classe) (parametros)
        EncupsulamentoTempo Tempo = new EncupsulamentoTempo(dia,mes,ano);
        System.out.println("Tempo: "+
               Tempo.exibe());
        teclado.close();
    }
}
