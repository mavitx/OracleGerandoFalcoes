package Exercicios;

import java.util.Scanner;

public class CalendarioPaula {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("DATA ATUAL\nQue dia é hoje?");
		int dia = sc.nextInt();
		
		System.out.println("Que mes estamos?");
		int mes = sc.nextInt();
		
		System.out.println("Que ano estamos?");
		int ano = sc.nextInt();
		
		System.out.println("Certo Paula, e há quanto tempo aconteceu o fato que está na sua cabeça?\nInforme quantos anos(Informar valores inteiros apenas): ");
		int anoFato = sc.nextInt();
		
		System.out.println("Informe quantos meses(Informar valores inteiros apenas): ");
		int mesFato = sc.nextInt();
		
		System.out.println("Informe quantos dias(Informar valores inteiros apenas): ");
		int diaFato = sc.nextInt();
		
		System.out.println("Hoje sendo " + dia + "/" + mes + "/" + ano + " e o fato aconteceu ha " + anoFato + " anos, " + mesFato + " meses e " + diaFato + " dias, ");
		System.out.print(" o fato aconteceu no dia ");

		
	}

}
