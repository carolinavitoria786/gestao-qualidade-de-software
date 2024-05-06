package lista4;

import java.util.Scanner;
public class ex_2 {

	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);

		double totalSalarios = 0;
		int totalPessoas = 0;
		int totalFilhos = 0;
		
		
		
		while(true) {
			System.out.print("Informe o salário do cidadão ou digite OUT para sair: ");
			double salarioCidadao = input.nextDouble();
			
		
			if (salarioCidadao < 0) {
				break;
			}
		System.out.print("Informe o número de filhos");
		int numFilhos = input.nextInt();
		totalSalarios += salarioCidadao;
		totalFilhos += numFilhos;
		totalPessoas++;
		
		}
		if (totalPessoas == 0){
			System.out.print("Nenhum dado foi inserido. ");
			
		} else {
			 double mediaSalarial = totalSalarios / totalPessoas;
	            double mediaFilhos = (double) totalFilhos / totalPessoas;

	            System.out.println("Média salarial da população: " + mediaSalarial);
	            System.out.println("Média do número de filhos: " + mediaFilhos);
	        }
	        
	        input.close();
		
	}

}