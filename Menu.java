import java.util.Date;
import java.util.Scanner;
public class Menu {

    ContaBancaria cb = new ContaBancaria();
    Cliente cliente = null;

    public void selecionarOpcao() {
        System.out.println("Bem vindo ao Banco!");

        System.out.println("1 - Realizar cadastro.");
        System.out.println("2 - Sacar.");
        System.out.println("3 - Depositar.");
        System.out.println("4 - Verificar saldo.");
        System.out.println("5 - Verificar extrato.");
        System.out.println("6 - Alterar dados pessoais.");
        System.out.println("7 - Saindo...");

        Scanner scanner = new Scanner(System.in);
        System.out.println("Escolha uma opção: ");
        int opcao = scanner.nextInt();

        if(opcao == 1 ){
            cadastrarUsuario();
        }
        else if (opcao == 2)
        {
            cb.opcaoSacar();
        }
        else if (opcao == 3){
           cb.opcaoDepositar();
        }
        else if (opcao == 4){
            cb.opcaoVerSaldo();
        }
        else if (opcao == 5){
            cb.opcaoVerExtrato();
        }
        else if(opcao == 6){
//            cliente.opcaoAlterarDados();
        }
        else if (opcao == 7)
        {
//            opcaoSair();
        } else{
            System.out.println("Opção inválida!");
        }
    }

    private void cadastrarUsuario(){

        System.out.println("---- CADASTRO DE USUÁRIO ----");
        System.out.println("Preencha os dados a seguir para realizar seu cadastro:");

        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite seu nome completo: ");
        String nome = scanner.nextLine();
        System.out.println("Digite sua idade: ");
        int anoNascimento = scanner.nextInt();
        System.out.println("Digite seu telefone: ");
        int telefone = scanner.nextInt();
        System.out.println("Digite seu CPF ");
        String CPF = scanner.nextLine();
        System.out.println("Digite seu email: ");
        String email = scanner.nextLine();
        System.out.println("Informe uma senha: ");
        int senha = scanner.nextInt();

        cliente = new Cliente(nome, anoNascimento, CPF, email, senha);

    }

}
