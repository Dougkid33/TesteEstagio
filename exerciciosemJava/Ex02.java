package exerciciosemJava;

import java.util.Scanner;

public class Ex02 {
	public static void main(String[] args) {

		int i = 0;
		int fibonacci = 1;
		try (Scanner sc = new Scanner(System.in)) {
			System.out.print("Escreva o número desejado: ");
			int numero = sc.nextInt();
			while (fibonacci < numero) {
				int temp = fibonacci;
				fibonacci = i + fibonacci;
				i = temp;
			}
			if (fibonacci == numero) {
				System.out.printf("O número %d informado faz parte da sequência Fibonacci.", numero);
			} else {
				System.out.printf("O número %d não faz parte da sequência Fibonacci.", numero);
			}
		}
	}

}
