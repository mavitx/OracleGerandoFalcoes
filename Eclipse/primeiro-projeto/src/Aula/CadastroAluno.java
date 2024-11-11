package Aula;

import java.util.Scanner;

public class CadastroAluno {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int opcao;
		String nome = "";
		
		do {
			
			System.out.println("=======================");
			System.out.println("SISTEMA DE ALUNO GERANDO FALCOES");
			System.out.println("=======================");
			System.out.println("0 - Sair");
			System.out.println("1 - Cadastrar aluno ");
			System.out.println("2 - Listar aluno");
			System.out.println("=======================");
			opcao = sc.nextInt();
				
			switch (opcao) {
			case 0: 
				System.out.println("Saindo");
				break;
			case 1: 
				sc.nextLine();
				System.out.println("Qual seu nome?");
				nome = sc.nextLine();
				break;
			case 2: 
				System.out.println("Alunos:");
				System.out.println(nome);
				break;
			default:
				System.out.println("Opcao invalida " + opcao);
			}
			
		} while (opcao != 0);

		sc.close();
		}

}

