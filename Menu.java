import java.util.Date;
import java.util.Scanner;
public class Menu {

    ContaBancaria cb = new ContaBancaria();
    Cliente cliente = null;
    int opcao = 0;

    private void cadastrarUsuario() {

        System.out.println("---- CADASTRO DE USUÁRIO ----");
        System.out.println("Preencha os dados a seguir para realizar seu cadastro:");

        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite seu nome completo: ");
        String nome = scanner.nextLine();
        System.out.println("Digite seu ano de nascimento: ");
        String anoNascimento = scanner.nextLine();
        System.out.println("Digite seu telefone: ");
        String telefone = scanner.nextLine();
        System.out.println("Digite seu CPF: ");
        String CPF = scanner.nextLine();
        System.out.println("Digite seu email: ");
        String email = scanner.nextLine();
        System.out.println("Informe uma senha: ");
        int senha = scanner.nextInt();

        cliente = new Cliente(nome, anoNascimento, telefone, CPF, email, senha);
    }

    public void opcaoSair() {
        System.out.println("Saindo...");
        System.exit(0);
    }

    public void selecionarOpcao() {
        while (opcao != 7) {
            System.out.println("Bem vindo ao Banco!");

            System.out.println("1 - Realizar cadastro.");
            System.out.println("2 - Sacar.");
            System.out.println("3 - Depositar.");
            System.out.println("4 - Verificar saldo.");
            System.out.println("5 - Verificar extrato.");
            System.out.println("6 - Alterar dados pessoais.");
            System.out.println("7 - Sair.");

            Scanner scanner = new Scanner(System.in);
            System.out.println("Escolha uma opção: ");
            int opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    cadastrarUsuario();
                    break;
                case 2:
                    if (cliente != null) {
                        cb.opcaoSacar();
                    } else {
                        System.out.println("Nenhum cliente cadastrado. Cadastre-se primeiro.");
                    }
                    break;
                case 3:
                    if (cliente != null) {
                        cb.opcaoDepositar();
                    } else {
                        System.out.println("Nenhum cliente cadastrado. Cadastre-se primeiro.");
                    }
                    break;
                case 4:
                    if (cliente != null) {
                        cb.opcaoVerSaldo();
                    } else {
                        System.out.println("Nenhum cliente cadastrado. Cadastre-se primeiro.");
                    }
                    break;
                case 5:
                    if (cliente != null) {
                        cb.opcaoVerExtrato();
                    } else {
                        System.out.println("Nenhum cliente cadastrado. Cadastre-se primeiro.");
                    }
                    break;
                case 6:
                    if (cliente != null) {
                        cliente.opcaoAlterarDados();
                    } else {
                        System.out.println("Nenhum cliente cadastrado. Cadastre-se primeiro.");
                    }
                    break;
                case 7:
                    opcaoSair();
                    break;
                default:
                    System.out.println("Opção inválida! Tente novamente.");
            }
        }
        System.out.println();
    }
}