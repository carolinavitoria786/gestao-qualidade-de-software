package lista3;

import java.util.Scanner;

public class ex_2 {
  public static void main(String[] args) {
    
    Scanner input = new Scanner(System.in);

    int tipo_Apto;
    double num_diarias;

    num_diarias = 0.0;

    System.out.println("1 - Apto Simples com número de diárias < 10");
    System.out.println("2 - Apto Duplo com número de diárias < 10");
    System.out.println("3 - Apto Simples com número de diárias entre 10 e 15");
    System.out.println("4 - Apto Duplo com número de diárias entre 10 e 15");
    System.out.println("5 - Apto Simples com número de diárias > 15");
    System.out.println("6 - Apto Duplo com número de diárias > 15");

    System.out.println("Digite a opção que se enquadra (número): ");
    tipo_Apto = input.nextInt();
    
    switch (tipo_Apto) {
      
      case 1:
        System.out.println(" Apto Simples com número de diárias < 10");
      num_diarias += 100.00;
      System.out.println("O valor do apartamento é de: R$ " + num_diarias);
      break;

      case 2:
        System.out.println("Apto Duplo com número de diárias < 10");
      num_diarias += 140.00;
      System.out.println("O valor do apartamento é de: R$ " + num_diarias);
      break;

      case 3:
        System.out.println("Apto Simples com número de diárias entre 10 e 15");
      num_diarias += 90.00;
      System.out.println("O valor do apartamento é de: R$ " + num_diarias);
      break;

      case 4:
        System.out.println("Apto Duplo com número de diárias entre 10 e 15");
      num_diarias += 120.00;
      System.out.println("O valor do apartamento é de: R$ " + num_diarias);
      break;

      case 5:
        System.out.println("Apto Simples com número de diárias > 15");
      num_diarias += 80.00;
      System.out.println("O valor do apartamento é de: R$ " + num_diarias);
      break;

      case 6:	
        System.out.println("Apto Duplo com número de diárias > 15");
      num_diarias += 100.00;
      System.out.println("O valor do apartamento é de: R$ " + num_diarias);
      break;
    }   
  }
  
}
