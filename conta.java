public class Conta {
    private int numero;
    public String titular;
    public double saldo;

    public Conta(int numero, String titular, double saldo){
        this.numero = numero;
        this.titular = titular;
        this.saldo = saldo;
    }

    public void depositar(double valor_deposito) {
        if (valor_deposito > 0) {
            saldo = saldo += valor_deposito;
        } else {
            System.out.println("O seu deposito não foi finalizado!");
        }
    } 

    public void sacar(double valor_deposito) {
        if (valor_deposito > 0) {
            saldo = saldo -= valor_deposito;
        } else {
            System.out.println("O seu saque não foi finalizado!");
        }
    }

    public void verificar_saldo() {
        System.out.println("O seu saldo é: " + saldo);
    }
}