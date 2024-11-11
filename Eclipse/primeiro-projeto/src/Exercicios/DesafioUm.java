package Exercicios;

import java.util.Scanner;

public class DesafioUm {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Informe sua idade: ");
		int idade = sc.nextInt();
		
		if (idade < 18) {
			System.out.println("Você é menor de idade, pois você tem " + idade + " anos.");
		} else {
			System.out.println("Você é maior de idade, pois você tem " + idade + " anos.");
		}

	}

}
