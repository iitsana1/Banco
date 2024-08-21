import java.util.Scanner;
public class Menu {

    public static void selecionarOpcao() {
        System.out.println("Bem vindo ao Banco!");

        System.out.println("1 - Realizar cadastro.");
        System.out.println("2 - Sacar.");
        System.out.println("3 - Depositar.");
        System.out.println("4 - Verificar saldo.");
        System.out.println("5 - Verificar extrato.");
        System.out.println("6 - Alterar dados pessoais.");

        Scanner scanner = new Scanner(System.in);
        System.out.println("Escolha uma opção: ");
        int opcao = scanner.nextInt();

        if(opcao == 1 ){
            cadastrarUsuario();
        }
        else if (opcao == 2)
        {
            opcaoSacar();
        }
        else if (opcao == 3){
            opcaoDepositar();
        }
        else if (opcao == 4){
            opcaoVerSaldo();
        }
        else if (opcao == 5){
            opcaoVerExtrato();
        }
        else if(opcao == 6){
            opcaoAlterarDados();
        }
        else{
            System.out.println("Opção inválida!");
        }
    }
    private void cadastrarUsuario(){

        System.out.println("---- CADASTRO DE USUÁRIO ----");
        System.out.println("Preencha os dados a seguir para realizar seu cadastro!");

        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite seu nome: ");
        String nome = scanner.nextLine;
        System.out.println("Digite sua idade: ");
        String idade = scanner.nextLine;
        System.out.println("Digite seu telefone: ");
        String telefone = scanner.nextLine;
        System.out.println("Digite seu email: ");
        String email = scanner.nextLine;
        System.out.println("Informe uma senha: ");
        String senha = scanner.nextLine;
    }
}
