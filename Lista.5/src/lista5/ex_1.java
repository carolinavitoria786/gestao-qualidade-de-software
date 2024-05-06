package lista5;

import javax.swing.JOptionPane;
public class ex_1 {
public static void main (String args[]) {
	String entrada;
    int numeroConta, digitoVerificador;

    do {
        entrada = JOptionPane.showInputDialog("Informe o número da conta corrente (3 dígitos): ");
       
        numeroConta = Integer.parseInt(entrada);

      
        digitoVerificador = calcularDigitoVerificador(numeroConta);

        JOptionPane.showMessageDialog(null, "O dígito verificador é: " + digitoVerificador);

        entrada = JOptionPane.showInputDialog("Deseja continuar? (S)im ou (N)ão");
    } while (entrada.equalsIgnoreCase("s") || entrada.equalsIgnoreCase("sim"));
}


public static int calcularDigitoVerificador(int numeroConta) {
 
    int inverso = Integer.parseInt(new StringBuilder(String.valueOf(numeroConta)).reverse().toString());
    int soma = numeroConta + inverso;

  
    int somaMultiplicacoes = 0;

 
    for (int i = 0; soma > 0; i++) {
        int digito = soma % 10; 
        somaMultiplicacoes += digito * i;
        soma /= 10; 
    }

  
    return somaMultiplicacoes % 10;
    }
 }
