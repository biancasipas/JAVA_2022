import java.util.Scanner;

public class EncupsulamentoContaCorrente02 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Qual é o seu número de agencia da conta: ");
        int agencia = teclado.nextInt();
        System.out.println("Qual é o número da conta: ");
        int numero = teclado.nextInt();
        System.out.println("Quanto o saldo da conta: ");
        double saldo = teclado.nextDouble();
        //(nome da classe) (nomear) = new (nome da classe) (parametros)
        EncupsulamentoContaCorrente conta_Corrente = new EncupsulamentoContaCorrente(numero,agencia,saldo);
        System.out.println("Saldo da conta: R$"+
                conta_Corrente.consultarSaldo());
        teclado.close();
    }
}
