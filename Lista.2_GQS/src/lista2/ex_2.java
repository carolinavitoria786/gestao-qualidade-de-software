package lista2;

import java.util.Scanner;

public class ex_2 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Informe a temperatura em Celsius a ser convertida: ");
    int celsius = scanner.nextInt();
    double temperatura_F = (celsius * 1.8) + 32;
    System.out.println("A temperatura em Fahrenheit é: " + temperatura_F);
    scanner.close();
  }
  
}