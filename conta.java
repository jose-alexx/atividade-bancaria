public class Conta {
    private int numero;
    public String titular_da_conta;
    public double saldo_da_conta;

    public Conta(int numero, String titular_da_conta, double saldo_da_conta){
        this.numero = numero;
        this.titular_da_conta = titular_da_conta;
        this.saldo_da_conta = saldo_da_conta;
    }

    public void depositar(double valor_deposito) {
        if (valor_deposito > 0) {
            saldo_da_conta = saldo_da_conta += valor_deposito;
        } else {
            System.out.println("O seu deposito não foi finalizado!");
        }
    } 

    public void sacar(double valor_deposito) {
        if (valor_deposito > 0) {
            saldo_da_conta = saldo_da_conta -= valor_deposito;
        } else {
            System.out.println("O seu saque não foi finalizado!");
        }
    }

    public void extrato() {
        System.out.println("O seu saldo é: " + saldo_da_conta);
    }
}