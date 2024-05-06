package lista9;

import java.util.Scanner;

public class Lista7_ex3 {
  // Método para ler 10 números reais do teclado e retornar o vetor preenchido
  public static double[] lerNumerosReais() {
    Scanner scanner = new Scanner(System.in);
    double[] numeros = new double[10];
    for (int i = 0; i < numeros.length; i++) {
        System.out.println("Digite o número real " + (i + 1) + ":");
        numeros[i] = scanner.nextDouble();
    }
    scanner.close();
    return numeros;
}

// Método para imprimir os elementos do vetor
public static void imprimirVetor(double[] vetor) {
    System.out.println("Elementos do vetor:");
    for (double elemento : vetor) {
        System.out.print(elemento + " ");
    }
    System.out.println(); // Nova linha após imprimir todos os elementos
}

// Método para encontrar e imprimir o menor e o maior número do vetor
public static void imprimirMenorEMaior(double[] vetor) {
    double menor = vetor[0];
    double maior = vetor[0];
    for (double valor : vetor) {
        if (valor < menor) {
            menor = valor;
        }
        if (valor > maior) {
            maior = valor;
        }
    }
    System.out.println("Menor número: " + menor);
    System.out.println("Maior número: " + maior);
}

// Método principal que chama os outros métodos
public static void main(String[] args) {
    double[] numeros = lerNumerosReais(); // Lê os números e armazena no vetor
    imprimirVetor(numeros); // Imprime todos os números do vetor
    imprimirMenorEMaior(numeros); // Encontra e imprime o menor e o maior número
}
}
