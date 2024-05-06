package lista_12;

import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    try {

      System.out.println("Informe o dividendo: ");
      int a = scanner.nextInt();

      System.out.println("Informe o divisor: ");
      int b = scanner.nextInt();

      System.out.println("Resultado: " + divisao(a,b));
    }

    catch (ArithmeticException e) {
      System.out.println("ERRO!");
    }

    finally {
      System.out.println("Fim do programa!");
      scanner.close();
    }

  }

  public static int divisao(int a, int b) {
    return a / b;
  }

}