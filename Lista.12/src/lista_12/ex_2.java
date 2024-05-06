package lista_12;

import java.util.Scanner;

class main {
    public static int realizarDivisao(int dividendo, int divisor) throws ArithmeticException {
        if (divisor == 0 || dividendo < 10) {
            throw new ArithmeticException("error.");
        }
        return dividendo / divisor;
    }
}

public class ex_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.println("Informe o dividendo: ");
            int a = scanner.nextInt();

            System.out.println("Informe o divisor: ");
            int b = scanner.nextInt();

            System.out.println("Resultado: " + main.realizarDivisao(a, b));
        } catch (ArithmeticException e) {
            System.out.println("ERRO: " + e.getMessage());

            scanner.close();
        }
    }
}

