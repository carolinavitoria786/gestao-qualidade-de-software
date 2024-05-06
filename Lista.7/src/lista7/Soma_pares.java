package lista7;

import java.util.Scanner;

public class Soma_pares {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		int[] numeros = new int[10];
		int soma_pares = 0;

		for (int i = 0; i < numeros.length; i++) {

			System.out.println("Informe um número: ");
			numeros[i] = input.nextInt();

			if (numeros[i] % 2 == 0) {
				soma_pares += numeros[i];
			}

		}
		
		System.out.println("Soma dos pares: " + soma_pares);

	}
}