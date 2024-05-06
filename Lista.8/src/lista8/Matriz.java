package lista8;

import java.util.Scanner;

public class Matriz {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Informe o número de linhas da matriz: ");
        int linhas = input.nextInt();
        System.out.print("Informe o número de colunas da matriz: ");
        int colunas = input.nextInt();

        int[][] matriz = new int[linhas][colunas];

        for (int i = 0; i < linhas; i++) {
            for (int j = 0; j < colunas; j++) {
                System.out.print("Informe o elemento da posição [" + i + "][" + j + "]: ");
                matriz[i][j] = input.nextInt();
            }
        }

        System.out.println("Matriz informada:");
        for (int i = 0; i < linhas; i++) {
            for (int j = 0; j < colunas; j++) {
                System.out.print(matriz[i][j] + "\t");
            }
            System.out.println();
        }

        System.out.println("Matriz com índice par e com índice da coluna ímpar:");
        for (int i = 0; i < linhas; i++) {
            for (int j = 0; j < colunas; j++) {
                if (i % 2 == 0 && j % 2 == 1) {
                    System.out.print(matriz[i][j] + "\t");
                }
            }
            System.out.println();
        }

        System.out.println("Matriz transposta:");
        for (int i = 0; i < colunas; i++) {
            for (int j = 0; j < linhas; j++) {
                System.out.print(matriz[j][i] + "\t");
            }
            System.out.println();
        }

       
        for (int i = 0; i < linhas; i++) {
            int temp = matriz[i][i];
            matriz[i][i] = matriz[i][linhas - 1 - i];
            matriz[i][linhas - 1 - i] = temp;
        }

        System.out.println("Matriz após troca das diagonais:");
        for (int i = 0; i < linhas; i++) {
            for (int j = 0; j < colunas; j++) {
                System.out.print(matriz[i][j] + "\t");
            }
            System.out.println();
        }

       
    }
}
