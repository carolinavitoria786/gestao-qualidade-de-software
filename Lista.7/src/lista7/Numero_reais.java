package lista7;

import java.util.Scanner;

public class Numero_reais {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		double[] numeros = new double[10];
		
		for (int i = 0; i < numeros.length; i++) {
			System.out.print(i + 1 + " - informe um número real: ");
			numeros[i] = input.nextDouble();
		}
		System.out.println(numeros[0]);
		double menor_numero = numeros[0], maior_numero = numeros[0];
		
		for (int i = 1; i < numeros.length; i++) {
			if (numeros[i] < menor_numero) {
				menor_numero = numeros[i];
			}

			if (numeros[i] > maior_numero) {
				maior_numero = numeros[i];
			}
		}
		System.out.println("O maior número é : " + maior_numero);
		System.out.println("O menor número é : " + menor_numero);
	}
}