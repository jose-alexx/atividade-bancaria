public class Conta {
    public int numero;
    public String titular_da_conta;
    public double saldo_da_conta;

    public void depositar(double saldo_da_conta, double valor_usuario, double resultado_adicionado){
        resultado_adicionado = saldo_da_conta + valor_usuario;
    }


}