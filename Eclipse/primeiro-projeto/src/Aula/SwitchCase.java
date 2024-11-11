package Aula;

import java.util.Scanner;

public class SwitchCase {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite a nota para a apresentação: ");
		int nota = sc.nextInt();
		
		switch (nota) {
			case 0:
				System.out.println("Mandou mal, sua nota final foi " + nota + ".");
				break;
			case 1:
				System.out.println("Mandou mais ou menos, sua nota final foi " + nota + ".");
				break;
			case 2:
				System.out.println("Mandou bem, sua nota final foi " + nota + ".");
				break;
			case 3:
				System.out.println("Mandou muito bem, sua nota final foi " + nota + ".");
				break;
			default: 
				System.out.println("Erro.");
		}

	}

}
