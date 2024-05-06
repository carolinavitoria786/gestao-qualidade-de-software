package lista9;

import java.util.Scanner;

public class Lista8_ex2 {

    // Método para ler os elementos de uma matriz 5x5
    public static int[][] lerElementosDaMatriz() {
        Scanner scanner = new Scanner(System.in);
        int[][] matriz = new int[5][5];
        System.out.println("Digite os elementos da matriz 5x5:");
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.printf("Elemento [%d][%d]: ", i + 1, j + 1);
                matriz[i][j] = scanner.nextInt();
            }
        }
        scanner.close();
        return matriz;
    }

    // Método para imprimir a matriz
    public static void imprimirMatriz(int[][] matriz) {
        System.out.println("Matriz informada:");
        for (int[] linha : matriz) {
            for (int elemento : linha) {
                System.out.print(elemento + " ");
            }
            System.out.println(); // Quebra de linha ao final de cada linha da matriz
        }
    }

    // Método para imprimir os elementos em posições onde o índice da linha é par e o da coluna é ímpar
    public static void imprimirElementosEspeciais(int[][] matriz) {
        System.out.println("Elementos em posições com índice de linha par e índice de coluna ímpar:");
        for (int i = 0; i < matriz.length; i++) {
            if (i % 2 == 0) { // Índices de linha pares (considerando que i começa de 0, ímpar para o usuário)
                for (int j = 0; j < matriz[i].length; j++) {
                    if (j % 2 != 0) { // Índices de coluna ímpares (considerando que j começa de 0, par para o usuário)
                        System.out.printf("Elemento [%d][%d]: %d\n", i + 1, j + 1, matriz[i][j]);
                    }
                }
            }
        }
    }

    // Método principal que chama os outros métodos
    public static void main(String[] args) {
        int[][] matriz = lerElementosDaMatriz(); // Leitura dos elementos da matriz
        imprimirMatriz(matriz); // Impressão da matriz
        imprimirElementosEspeciais(matriz); // Impressão dos elementos nas posições especificadas
    }
}
