package pacote;

public class Soma {
	public static void main(String[] args) {
        int soma = 0;

        for (int i = 2; i <= 100; i += 2) {
            soma += i;
        }

        System.out.println("A soma dos números pares   entre 1 e 100 é: " + soma);
    }
}