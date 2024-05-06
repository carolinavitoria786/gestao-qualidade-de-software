package lista9;

import java.util.Scanner;

public class Lista7_ex1 {
    public static int[] readNumbers() {
        Scanner scanner = new Scanner(System.in);
        int[] numbers = new int[10];
        for (int i = 0; i < numbers.length; i++) {
            System.out.println("Digite um número " + (i + 1) + ":");
            numbers[i] = scanner.nextInt();
        }
        scanner.close();
        return numbers;
    }

    public static void printArray(int[] array) {
        System.out.println("Array elements:");
        for (int element : array) {
            System.out.print(element + " ");
        }
        System.out.println();
    }

    public static int sumEvenNumbers(int[] array) {
        int sum = 0;
        for (int num : array) {
            if (num % 2 == 0) {
                sum += num;
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        int[] numbers = readNumbers();
        printArray(numbers);
        int sum = sumEvenNumbers(numbers);
        System.out.println("Soma dos números pares: " + sum);
    }
}
