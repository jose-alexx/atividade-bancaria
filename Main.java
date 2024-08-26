import java.util.Scanner;

public class Main {
    public static void main (String[] args) {
        Scanner entrada = new Scanner(System.in);
        Conta conta1 = new Conta(12223, "Ribeiro", 1000.00);

        System.out.println("Digite o valor do deposito: ");
        double valor_deosito = entrada.nextDouble();
        conta1.depositar(valor_deosito);
        conta1.verificar_saldo();

        System.out.println("Digite o valor do saque: ");
        double valor_saque = entrada.nextDouble();
        conta1.sacar(valor_saque);
        conta1.verificar_saldo();
    }
}
