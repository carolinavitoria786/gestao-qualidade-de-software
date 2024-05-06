package lista10;

import java.util.Scanner;

public class Cadastro {

    private PessoaFisica[] pessoasFisicas;
    private PessoaJuridica[] pessoasJuridicas;
    private int qtdPessoasFisicas;
    private int qtdPessoasJuridicas;

    public Cadastro() {
        pessoasFisicas = new PessoaFisica[100];
        pessoasJuridicas = new PessoaJuridica[100];
        qtdPessoasFisicas = 0;
        qtdPessoasJuridicas = 0;
    }

    public void cadastrarPessoa() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Selecione o tipo de pessoa a ser cadastrada (1 - Pessoa Física, 2 - Pessoa Jurídica):");
        int tipoPessoa = scanner.nextInt();
        scanner.nextLine(); // Limpar o buffer do teclado

        if (tipoPessoa == 1) {
            System.out.println("Informe o nome da Pessoa Física:");
            String nome = scanner.nextLine();
            System.out.println("Informe o CPF da Pessoa Física:");
            String cpf = scanner.nextLine();

            PessoaFisica pessoaFisica = new PessoaFisica(nome, cpf);
            pessoasFisicas[qtdPessoasFisicas++] = pessoaFisica;
        } else if (tipoPessoa == 2) {
            System.out.println("Informe o nome da Pessoa Jurídica:");
            String nome = scanner.nextLine();
            System.out.println("Informe o CNPJ da Pessoa Jurídica:");
            String cnpj = scanner.nextLine();

            PessoaJuridica pessoaJuridica = new PessoaJuridica(nome, cnpj);
            pessoasJuridicas[qtdPessoasJuridicas++] = pessoaJuridica;
        } else {
            System.out.println("Opção inválida.");
        }
    }

    public void imprimirPessoasFisicas() {
        System.out.println("Pessoas Físicas cadastradas:");
        for (int i = 0; i < qtdPessoasFisicas; i++) {
            System.out.println(pessoasFisicas[i]);
        }
    }

    public void imprimirPessoasJuridicas() {
        System.out.println("Pessoas Jurídicas cadastradas:");
        for (int i = 0; i < qtdPessoasJuridicas; i++) {
            System.out.println(pessoasJuridicas[i]);
        }
    }

    public void pesquisarPessoa(String documento) {
        for (int i = 0; i < qtdPessoasFisicas; i++) {
            if (pessoasFisicas[i].getCpf().equals(documento)) {
                System.out.println("Pessoa Física encontrada:");
                System.out.println(pessoasFisicas[i]);
                return;
            }
        }

        for (int i = 0; i < qtdPessoasJuridicas; i++) {
            if (pessoasJuridicas[i].getCnpj().equals(documento)) {
                System.out.println("Pessoa Jurídica encontrada:");
                System.out.println(pessoasJuridicas[i]);
                return;
            }
        }

        System.out.println("Pessoa não encontrada.");
    }

    public void atualizarPessoa(String documento) {
        for (int i = 0; i < qtdPessoasFisicas; i++) {
            if (pessoasFisicas[i].getCpf().equals(documento)) {
                Scanner scanner = new Scanner(System.in);
                System.out.println("Informe o novo nome da Pessoa Física:");
                String nome = scanner.nextLine();
                System.out.println("Informe o novo CPF da Pessoa Física:");
                String cpf = scanner.nextLine();

                pessoasFisicas[i].setNome(nome);
                pessoasFisicas[i].setCpf(cpf);
                return;
            }
        }

        for (int i = 0; i < qtdPessoasJuridicas; i++) {
            if (pessoasJuridicas[i].getCnpj().equals(documento)) {
                Scanner scanner = new Scanner(System.in);
                System.out.println("Informe o novo nome da Pessoa Jurídica:");
                String nome = scanner.nextLine();
                System.out.println("Informe o novo CNPJ da Pessoa Jurídica:");
                String cnpj = scanner.nextLine();

                pessoasJuridicas[i].setNome(nome);
                pessoasJuridicas[i].setCnpj(cnpj);
                return;
            }
        }

        System.out.println("Pessoa não encontrada.");
    }

    public void excluirPessoa(String documento) {
        for (int i = 0; i < qtdPessoasFisicas; i++) {
            if (pessoasFisicas[i].getCpf().equals(documento)) {
                for (int j = i; j < qtdPessoasFisicas - 1; j++) {
                    pessoasFisicas[j] = pessoasFisicas[j + 1];
                }
                pessoasFisicas[--qtdPessoasFisicas] = null;
                return;
            }
        }

        for (int i = 0; i < qtdPessoasJuridicas; i++) {
            if (pessoasJuridicas[i].getCnpj().equals(documento)) {
                for (int j = i; j < qtdPessoasJuridicas - 1; j++) {
                    pessoasJuridicas[j] = pessoasJuridicas[j + 1];
                }
                pessoasJuridicas[--qtdPessoasJuridicas] = null;
                return;
            }
        }

        System.out.println("Pessoa não encontrada.");
    }

    public static void main(String[] args) {
        Cadastro cadastro = new Cadastro();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Selecione a opção desejada:");
            System.out.println("1 - Cadastrar Pessoa");
            System.out.println("2 - Imprimir Pessoas Físicas");
            System.out.println("3 - Imprimir Pessoas Jurídicas");
            System.out.println("4 - Pesquisar Pessoa");
            System.out.println("5 - Atualizar Pessoa");
            System.out.println("6 - Excluir Pessoa");
            System.out.println("0 - Sair");

            int opcao = scanner.nextInt();
            scanner.nextLine(); // Limpar o buffer do teclado

            switch (opcao) {
                case 1:
                    cadastro.cadastrarPessoa();
                    break;
                case 2:
                    cadastro.imprimirPessoasFisicas();
                    break;
                case 3:
                    cadastro.imprimirPessoasJuridicas();
                    break;
                case 4:
                    System.out.println("Digite o CPF ou CNPJ da pessoa a ser pesquisada:");
                    String documentoPesquisa = scanner.nextLine();
                    cadastro.pesquisarPessoa(documentoPesquisa);
                    break;
                case 5:
                    System.out.println("Digite o CPF ou CNPJ da pessoa a ser atualizada:");
                    String documentoAtualizacao = scanner.nextLine();
                    cadastro.atualizarPessoa(documentoAtualizacao);
                    break;
                case 6:
                    System.out.println("Digite o CPF ou CNPJ da pessoa a ser excluída:");
                    String documentoExclusao = scanner.nextLine();
                    cadastro.excluirPessoa(documentoExclusao);
                    break;
                case 0:
                    System.out.println("Saindo do programa...");
                    System.exit(0);
                default:
                    System.out.println("Opção inválida.");
                    break;
            }
        }
    }
}

class PessoaFisica {
    private String nome;
    private String cpf;

    public PessoaFisica(String nome, String cpf) {
        this.nome = nome;
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    @Override
    public String toString() {
        return "PessoaFisica{" +
                "nome='" + nome + '\'' +
                ", cpf='" + cpf + '\'' +
                '}';
    }
}

class PessoaJuridica {
    private String nome;
    private String cnpj;

    public PessoaJuridica(String nome, String cnpj) {
        this.nome = nome;
        this.cnpj = cnpj;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    @Override
    public String toString() {
        return "PessoaJuridica{" +
                "nome='" + nome + '\'' +
                ", cnpj='" + cnpj + '\'' +
                '}';
    }
}