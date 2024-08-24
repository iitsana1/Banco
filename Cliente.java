import java.util.Scanner;

public class Cliente
{
    private String nome;
    private String anoNascimento;
    private String telefone;
    private String CPF;
    private String email;
    private int senha;

    Menu menuInfo =  new Menu();
    ContaBancaria contaBancaria = new ContaBancaria();


    public Cliente(String nome, String anoNascimento, String telefone, String cpf, String email, int senha)
    {
        this.nome = nome;
        this.anoNascimento = anoNascimento;
        this.telefone = telefone;
        this.CPF = cpf;
        this.email = email;
        this.senha = senha;
    }

    public String getNome(){
        return nome;
    }

    public String getAnoNascimento(){
        return anoNascimento;
    }

    public void setTelefone(String telefone){
        this.telefone = telefone;
    }

    public String getTelefone(){
        return telefone;
    }

    public String getCpf(){
        return CPF;
    }

    public void setEmail(String email){
        this.email = email;
    }

    public String getEmail(){
        return email;
    }

    public void setSenha(int senha){
        this.senha = senha;
    }
    public int getSenha(){
        return senha;
    }

    public float getSaldo(){
        return contaBancaria.getSaldo();
    }

    public void informacoesCliente(){
        System.out.println("Nome: " + getNome());
        System.out.println("CPF: " + getCpf());
        System.out.println("Email: " + getEmail());
        System.out.println("Telefone: " + getTelefone());
        System.out.println("Saldo da conta: R$"+ getSaldo());
    }


    public void opcaoAlterarDados()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("------Atualizar Dados-------");
        System.out.println("1 - Email: " + getEmail());
        System.out.println("2- Telefone: " + getTelefone());
        System.out.println("3- Senha");
        System.out.println("Digite a opcao que deseja alterar: ");
        int opcaoDados = sc.nextInt();
        sc.nextLine();

        switch (opcaoDados) {
            case 1:
                System.out.println("Digite o novo email: ");
                String novoEmail = sc.nextLine();
                setEmail(novoEmail);
                System.out.println("Email atualizado com sucesso!");
                break;
            case 2:
                System.out.println("Digite o novo telefone: ");
                String novoTelefone = sc.nextLine();
                setTelefone(novoTelefone);
                System.out.println("Telefone atualizado com sucesso!");
                break;
            case 3:
                System.out.println("Confirme sua senha atual: ");
                int verificacao = sc.nextInt();
                sc.nextLine();
                if (verificacao == getSenha()) {
                    System.out.println("Digite a nova senha: ");
                    int novaSenha = sc.nextInt();
                    sc.nextLine();
                    setSenha(novaSenha);
                    System.out.println("Senha atualizada com sucesso!");
                } else {
                    System.out.println("Senha incorreta!");
                }
                break;
            default:
                System.out.println("Opção inválida!");
                break;
        }
    }
}


