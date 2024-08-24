import java.util.Scanner;

public class ContaBancaria {
    private float saldo;
    String[] extrato = new String[100];
    private int transacao = 0;
    private Cliente cliente;
    private float saldoInicial;

    public ContaBancaria()
    {
        this.saldo = 0;
        this.cliente = null;
    }


    public float getSaldo() {
        return saldo;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void SaldoIncial(){
        this.saldo = saldoInicial;
        extrato[transacao++] = "Saldo Inicial: R$ " + saldoInicial;
    }

    public void opcaoDepositar()
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o valor que deseja depositar: ");
        float valorDeposito = scanner.nextFloat();

        if (valorDeposito > 0){
            saldo += valorDeposito;
            extrato[transacao++] = "Depósito: R$ " + valorDeposito;
            System.out.println("Depósito efetuado com sucesso!");
            System.out.println("Saldo atual: R$"+ saldo);
        }
        else{
            System.out.println("O valor deve ser positivo! Digite um valor válido!");
        }
    }

    public void opcaoSacar()
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o valor que deseja sacar: ");
        float valorSaque = scanner.nextFloat();

        if (valorSaque < saldo){
            saldo -= valorSaque;
            extrato[transacao++] = "Saque: R$ " + valorSaque;
            System.out.println("Saque efetuado com sucesso!");
            System.out.println("Saldo atual: R$" + saldo);
        }
        else if (valorSaque <= 0) {
            System.out.println("O valor deve ser positivo! Digite um valor válido!");
        }
        else{
            System.out.println("O valor para saque deve ser menor ou igual ao saldo!");
        }
    }

    public void opcaoVerSaldo()
    {
        System.out.println("Seu saldo atual é: "+ saldo);
    }

    public void opcaoVerExtrato() {
        if (transacao == 0) {
            System.out.println("Nenhuma transação encontrada!");
        } else {
            for (int i = 0; i < transacao; i++) {
                System.out.println(extrato[i]);
            }
        }
    }
}
