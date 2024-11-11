package Exercicios;

import java.util.Scanner;

public class DespesasAna {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println(
				"Olá, Ana. Vamos começar a calcular suas despesas desse mês!\nQual o mês que estamos calculando?");
		String mes = sc.next();
		sc.nextLine();
		System.out.println("Quantas despesas voce fez em " + mes + "?");
		int desp = sc.nextInt();

		double totalDespesa = 0;

		for (int i = 1; desp >= i; i++) {
			sc.nextLine();
			System.out.println("Informe o valor da despesa " + i);
			totalDespesa = totalDespesa + sc.nextDouble();

			if (i == desp) {
				System.out.println("Ana, ate o momento voce gastou: R$ " + totalDespesa);
			}
		}

		sc.nextLine();
		System.out.println("Quanto voce ganhou esse mes?");
		double ganhou = sc.nextDouble();

		if (ganhou > totalDespesa) {
			System.out.println("Que bom que voce vai pagar todas as despesas e ainda vai sobrar R$" + (ganhou - totalDespesa));
		} else if (totalDespesa > ganhou) {
			System.out.println("E agora Ana? Ainda faltam R$ " + (totalDespesa - ganhou));
		} else {
			System.out.println("Valor suficiente para pagar as despesas!");
		}

		sc.close();
	}

}
