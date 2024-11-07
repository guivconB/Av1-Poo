package pacote;

import java.util.Scanner;

public class Numeros {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        int[] numeros = new int[10];


        System.out.println("Digite 10 números inteiros:");
        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = scanner.nextInt();
        }
        System.out.print("Digite o número a ser procurado: ");
        int numeroProcurado = scanner.nextInt();

        int contador = 0;

        for (int numero : numeros) {
            if (numero == numeroProcurado) {
                contador++;
            }
        }

        System.out.println("O número " + numeroProcurado + " aparece " + contador + " vezes.");

        scanner.close();
    }
}
