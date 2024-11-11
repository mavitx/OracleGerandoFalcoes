package Aula;

import java.util.Scanner;

public class CadastroPlus {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int opcao = 0;
		String nome[] = new String[3];
		
		do {
			
			for (int i = 0; i <= nome.length; i++) {
			
				System.out.println("=======================");
				System.out.println("SISTEMA DE ALUNO GERANDO FALCOES");
				System.out.println("=======================");
				System.out.println("0 - Sair");
				System.out.println("1 - Cadastrar aluno " + i + "/" + nome.length);
				System.out.println("2 - Listar alunos");
				System.out.println("=======================");
				opcao = sc.nextInt();
					
				switch (opcao) {
				case 0: 
					System.out.println("Saindo");
					break;
				case 1: 
					sc.nextLine();
					System.out.println("Qual seu nome?");
					nome[i] = sc.nextLine();
					break;
				case 2: 
					System.out.println("Alunos:");
					System.out.println(nome[0]);
					System.out.println(nome[1]);
					System.out.println(nome[2]);
					break;
				default:
					System.out.println("Opcao invalida " + opcao);
				}
			}
			
		} while (opcao != 0);

		sc.close();

	}

}
