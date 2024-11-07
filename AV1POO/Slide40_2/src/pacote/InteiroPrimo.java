package pacote;

import java.util.Scanner;

public class InteiroPrimo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número inteiro positivo: ");
        int numero = scanner.nextInt();

        boolean ePrimo = true;
        for (int i = 2; i <= Math.sqrt(numero); i++) {
            if (numero % i == 0) {
                ePrimo = false;
                break;
            }
        }

        if (ePrimo) {
            System.out.println(numero + " é um número primo.");
        } else {
            System.out.println(numero + " não é um número primo.");
        }
    }
}