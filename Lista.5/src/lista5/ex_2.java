package lista5;

import javax.swing.JOptionPane;

public class ex_2 {

	public static void main(String[] args) {
		double nota = -1;
		double salario = -1;
		char sexo = ' ';
		int idade = -1;

		
		while (nota < 0 || nota > 10) {
			String notaStr = JOptionPane.showInputDialog("Informe a nota (entre 0 e 10): ");
			nota = Double.parseDouble(notaStr);

			if (nota < 0 || nota > 10) {
				JOptionPane.showMessageDialog(null, "Nota inválida. Informe uma nota entre 0 e 10.");
			}
		}

	
		while (salario <= 0) {
			String salarioStr = JOptionPane.showInputDialog("Informe o salário (maior que zero): ");
			salario = Double.parseDouble(salarioStr);

			if (salario <= 0) {
				JOptionPane.showMessageDialog(null, "Salário inválido. Informe um salário maior que zero.");
			}
		}

		
		while (sexo != 'm' && sexo != 'f') {
			String sexoStr = JOptionPane.showInputDialog("Informe o sexo (m ou f): ");
			sexo = sexoStr.toLowerCase().charAt(0);

			if (sexo != 'm' && sexo != 'f') {
				JOptionPane.showMessageDialog(null, "Sexo inválido. Informe 'm' para masculino ou 'f' para feminino.");
			}
		}


		while (idade < 0 || idade > 150) {
			String idadeStr = JOptionPane.showInputDialog("Informe a idade (entre 0 e 120): ");
			idade = Integer.parseInt(idadeStr);

			if (idade < 0 || idade > 150) {
				JOptionPane.showMessageDialog(null, "Idade inválida. Informe uma idade entre 0 e 120.");
			}
		}

		JOptionPane.showMessageDialog(null,
				"Dados válidos:\nNota: " + nota + "\nSalário: " + salario + "\nSexo: " + sexo + "\nIdade: " + idade);
	}
}
