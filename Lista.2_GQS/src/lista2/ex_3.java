package lista2;

import java.util.Scanner;
public class ex_3 {
  public static void main(String[] args) {

    int salario_minimo = 1320;

    System.out.print("Informe o salario do funcionario: "); 
    Scanner scanner = new Scanner(System.in);

    int salario_funcionario = scanner.nextInt();
    int qtd_salarios = salario_funcionario / salario_minimo;

    System.out.println("O funcionario recebe " + qtd_salarios + " salarios minimos");
    scanner.close();
  }
  
}