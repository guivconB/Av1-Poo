package pacote;

import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
			System.out.print("Digite seu peso em kg: ");
			double peso = scanner.nextDouble();

			System.out.print("Digite sua altura em metros: ");
			double altura = scanner.nextDouble();

			double imc = peso / (altura * altura);

			if (imc < 18.5) {
			    System.out.println("Abaixo do peso");
			} else if (imc >= 18.5 && imc <= 24.9) {
			    System.out.println("Peso normal");
			} else if (imc >= 25.0 && imc <= 29.9) {
			    System.out.println("Sobrepeso");
			} else {
			    System.out.println("Obesidade");
			}
		}
    }
}