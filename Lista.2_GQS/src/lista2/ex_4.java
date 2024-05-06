package lista2;

import java.util.Scanner;

public class ex_4 {

	public static void main(String[] args) {
	    @SuppressWarnings("resource")
		Scanner input = new Scanner (System.in);

	    double a, b, c;

	    System.out.println("Informe o valor de um cateto: ");
	    a = input.nextDouble();

	    System.out.println("Informe o valor do outro cateto: ");
	    b = input.nextDouble();

	    c= Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2));

	    System.out.println("O valor da Hipotenusa é: " + c);

	  }

	}
