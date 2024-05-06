package lista9;

import java.util.Scanner;

public class Lista7_ex2 {

    // Método para ler 10 números reais e retornar o vetor preenchido
    public static double[] readRealNumbers() {
        Scanner scanner = new Scanner(System.in);
        double[] numbers = new double[10];
        for (int i = 0; i < numbers.length; i++) {
            System.out.println("Digite o número real " + (i + 1) + ":");
            numbers[i] = scanner.nextDouble();
        }
        scanner.close();
        return numbers;
    }

    // Método para imprimir o vetor
    public static void printArray(double[] array) {
        System.out.println("Elementos do vetor:");
        for (double element : array) {
            System.out.print(element + " ");
        }
        System.out.println(); // Nova linha após os elementos do vetor
    }

    // Método para imprimir as posições de números negativos no vetor
    public static void printNegativePositions(double[] array) {
        System.out.println("Posições dos números negativos no vetor:");
        for (int i = 0; i < array.length; i++) {
            if (array[i] < 0) {
                System.out.println("Posição " + i + ": " + array[i]);
            }
        }
    }

    // Método principal que chama os outros métodos
    public static void main(String[] args) {
        double[] numbers = readRealNumbers();
        printArray(numbers);
        printNegativePositions(numbers);
    }
}
