package Exercicios;

import java.util.Scanner;

public class DesafioDois {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Informe a quantidade de ruas ate o endereço do destino: ");
		int ruas = sc.nextInt();
		
		double totalKm = 0;

		for (int i = 1; ruas >= i; i++) {
			sc.nextLine();
			System.out.println("Informe o valor de km da rua: " + i);
			totalKm += sc.nextDouble();

			if (i == ruas) {
				System.out.println("Voce vai se deslocar por " + totalKm + "km.");
			}
		}

	}

}
