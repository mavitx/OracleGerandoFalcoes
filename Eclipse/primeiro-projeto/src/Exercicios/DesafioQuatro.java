package Exercicios;

import java.util.Scanner;

public class DesafioQuatro {

	public static void main(String[] args) {
		
		Scanner total = new Scanner(System.in);
		
		System.out.println("Informe o total gasto: ");
		double totalGasto = total.nextDouble();
		
		System.out.println("Informe o total gasto por alimentação: ");
		double alimentacao = total.nextDouble();
		
		System.out.println("Informe o total gasto por higiene: ");
		double higiene = total.nextDouble();
		
		System.out.println("Informe o total gasto por itens para casa: ");
		double itens = total.nextDouble();
		
		System.out.println((alimentacao/totalGasto)*100 + "% gasto com alimentação.");
		System.out.println((higiene/totalGasto)*100 + "% gasto com higiene.");
		System.out.println((itens/totalGasto)*100 + "% gasto com itens.");
		
	}

}
