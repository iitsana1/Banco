import java.util.Scanner;

public class ContaBancaria {
    float saldo;

    public void SaldoIncial(float SaldoIncial){
        this.saldo = SaldoIncial;
    }

    public void opcaoDepositar()
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o valor que deseja depositar: ");
        float valorDeposito = scanner.nextFloat();

        if (valorDeposito > 0){
            saldo += valorDeposito;
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
            System.out.println("Saque efetuado com sucesso!");
            System.out.println("Saldo atual: R$" + saldo);
        }
        else{
            System.out.println("O valor para saque deve ser menor que o saldo!");
        }
    }

    public void opcaoVerSaldo()
    {
        System.out.println("Seu saldo atual é: "+ saldo);
    }

    public void opcaoVerExtrato()
    {

    }
}
