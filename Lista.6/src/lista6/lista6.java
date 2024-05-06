package lista6;

import javax.swing.JOptionPane;

public class lista6 {

    public static void main(String[] args) {
        exercicio1();
        exercicio2();
        exercicio3();
        exercicio4();
    }

    public static void exercicio1() {
        int num1 = Integer.parseInt(JOptionPane.showInputDialog("Digite o primeiro número: "));
        int num2 = Integer.parseInt(JOptionPane.showInputDialog("Digite o segundo número: "));

        int soma = 0;
        for (int i = num1; i <= num2; i++) {
            if (i % 2 != 0) {
                soma += i;
            }
        }

        JOptionPane.showMessageDialog(null, "A soma dos números ímpares entre " + num1 + " e " + num2 + " é: " + soma);
    }

    public static void exercicio2() {
        int num = Integer.parseInt(JOptionPane.showInputDialog("Digite um número para calcular o fatorial: "));

        if (num < 0) {
            JOptionPane.showMessageDialog(null, "Número inválido. O fatorial de um número negativo não existe.");
            return;
        }

        int fatorial = 1;
        for (int i = num; i > 0; i--) {
            fatorial *= i;
        }

        JOptionPane.showMessageDialog(null, "O fatorial de " + num + " é: " + fatorial);
    }

    public static void exercicio3() {
        int soma = 0;
        int contador = 0;

        while (true) {
            int idade = Integer.parseInt(JOptionPane.showInputDialog("Digite a idade (ou um número negativo para sair): "));
            if (idade < 0) {
                break;
            }
            soma += idade;
            contador++;
        }

        if (contador == 0) {
            JOptionPane.showMessageDialog(null, "Nenhuma idade foi informada.");
        } else {
            double media = (double) soma / contador;
            JOptionPane.showMessageDialog(null, "A média das idades informadas é: " + media);
        }
    }

    public static void exercicio4() {
        int maior = Integer.MIN_VALUE;
        int menor = Integer.MAX_VALUE;

        while (true) {
            int numero = Integer.parseInt(JOptionPane.showInputDialog("Digite um número (ou 0 para sair): "));
            if (numero == 0) {
                break;
            }
            if (numero > maior) {
                maior = numero;
            }
            if (numero < menor) {
                menor = numero;
            }
        }

        if (maior == Integer.MIN_VALUE && menor == Integer.MAX_VALUE) {
            JOptionPane.showMessageDialog(null, "Nenhum número foi informado.");
        } else {
            JOptionPane.showMessageDialog(null, "Maior número informado: " + maior + "\nMenor número informado: " + menor);
        }
    }
}
