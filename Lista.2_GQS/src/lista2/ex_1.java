package lista2;

import java.util.Scanner;

public class ex_1 {
  public static void main(String[] args) {
    
	Scanner input = new Scanner(System.in);

    int diagonal_maior, diagonal_menor;

    System.out.print("Informe um numero para a diagonal maior: ");
    diagonal_maior = input.nextInt();

    System.out.print("Informe um numero para a diagonal menor: ");
    diagonal_menor = input.nextInt();

    int area = (diagonal_maior * diagonal_menor) / 2;
    System.out.println("A area do losango é: " + area);
    input.close();
  }

}