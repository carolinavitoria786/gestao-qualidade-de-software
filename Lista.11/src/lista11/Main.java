package lista11;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Cadastro cadastro = new Cadastro(10);

		while (true) {
			System.out
					.print("Escolha o tipo de pessoa a cadastrar (1 - Pessoa Física, 2 - Pessoa Jurídica, 0 - sair: ");
			int escolha = input.nextInt();
			if (escolha == 0) {
				break;
			}
			input.nextLine();
			Pessoa novaPessoa;
			if (escolha == 1) {
				PessoaFisica pf = new PessoaFisica();
				pf.setNome(input.nextLine());
				System.out.print("CPF: ");
				pf.setcpf(input.nextLine());
				novaPessoa = pf;

			} else if (escolha == 2) {
				PessoaJuridica pj = new PessoaJuridica();
				pj.setNome(input.nextLine());
				System.out.print("CNPJ: ");
				pj.setcnpj(input.nextLine());
				novaPessoa = pj;
			} else {
				System.out.print("Opção Inválida !");
				continue;

			}
			cadastro.cadastrarPessoa(novaPessoa);

		}
		cadastro.imprimirCadastro();
		input.close();
	}

}
