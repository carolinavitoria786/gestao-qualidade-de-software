package lista9;

import java.util.Scanner;

public class Lista8_ex4 {

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

    // Método para trocar os elementos das diagonais principal e secundária
    public static void trocarDiagonais(int[][] matriz) {
        int tamanho = matriz.length;
        for (int i = 0; i < tamanho; i++) {
            int temp = matriz[i][i]; // Elemento da diagonal principal
            matriz[i][i] = matriz[i][tamanho - 1 - i]; // Troca com o elemento da diagonal secundária
            matriz[i][tamanho - 1 - i] = temp; // Completa a troca
        }
    }

    // Método principal que chama os outros métodos
    public static void main(String[] args) {
        int[][] matriz = lerElementosDaMatriz(); // Leitura dos elementos da matriz
        imprimirMatriz(matriz); // Impressão da matriz original
        trocarDiagonais(matriz); // Troca os elementos das diagonais
        System.out.println("Matriz após troca de diagonais:");
        imprimirMatriz(matriz); // Impressão da matriz após a troca
    }
}
