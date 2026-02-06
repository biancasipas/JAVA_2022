public class EncupsulamentoContaCorrente {
    private int agencia;
    private int numero;
    private double saldo;

    public  EncupsulamentoContaCorrente(int numero, int agencia, Double saldo){
        this.numero =numero;
        this.agencia = agencia;
        this.saldo = saldo;
    }

    public int getAgencia() {
        return agencia;
    }

    public void setAgencia(int agencia) {
        this.agencia = agencia;
    }
    public int getNumero(){
        return numero;
    }
    public void setNumero(int numero){
        this.numero = numero;
    }
    public double getSaldo(){
        return saldo;
    }
    public void setSaldo(double saldo){
        this.saldo = saldo;
    }
    public Double depositar(double quantidade){
        return this.saldo += quantidade;
    }
    public Double sacar(double quantidade) {
        return this.saldo -= quantidade;
    }
    public Double consultarSaldo() {
        return this.saldo;
    }
}

