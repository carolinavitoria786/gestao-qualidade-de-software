package lista4;

import java.util.Scanner;

public class ex_1 {

	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
	int alunos90 = 0;
	int reprovados = 0;
	int maiorNota = Integer.MIN_VALUE;
	int menorNota = Integer.MAX_VALUE;
	int totalNotas = 0;
	int quantidadeAlunos = 0;
		
	while(true) {
		System.out.print("Informe o nome do aluno ou digite 'OUT' para sair: ");
		String aluno = input.nextLine();
		if (aluno.equalsIgnoreCase("OUT")) {
		break;
		}
			System.out.print("Digite a nota final do aluno: ");
			int notaFinal = input.nextInt();
			
			if (notaFinal < 0 || notaFinal > 100) {
				System.out.print("Nota Inválida.");
				return;
			}
		System.out.print("Insira o total de faltas do aluno: ");
		int faltas = input.nextInt();
		
		if(notaFinal >= 90) {
			alunos90++;
		}
		if(totalNotas < 70 || faltas >= 20) {
			reprovados++;
				
		}
		maiorNota = Math.max(maiorNota, notaFinal);
		menorNota = Math.min(menorNota, notaFinal);
		
		totalNotas += notaFinal;
		quantidadeAlunos++;
		input.nextLine();
	}
	double mediaNotas = (double) totalNotas / quantidadeAlunos;
	System.out.println("a. Alunos com nota final >= 90: " + alunos90);
    System.out.println("b. Alunos reprovados por nota (<70) ou falta (>=20): " + reprovados);
    System.out.println("c. Maior nota: " + maiorNota + ", Menor nota: " + menorNota);
    System.out.println("d. Média de notas da turma: " + mediaNotas);
	
	
	
	input.close();
	
	
	}

}
