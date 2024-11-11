package Aula;

import java.util.Scanner;

public class CadastroAlunoTwo {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int opcao;
		String nome[] = new String[3];
		int posicaoLista = 0;
		
		do {
			
			System.out.println("=======================");
			System.out.println("SISTEMA DE ALUNO GERANDO FALCOES");
			System.out.println("=======================");
			System.out.println("0 - Sair");
			System.out.println("1 - Cadastrar aluno (" + posicaoLista + "/" + nome.length + ")");
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
				nome[posicaoLista++] = sc.nextLine();
				break;
			case 2: 
				System.out.println("Alunos:");
				for (int i = 0; i < posicaoLista; i++) {
					System.out.println(nome[i]);
				}
				break;
			default:
				System.out.println("Opcao invalida " + opcao);
			}
			
		} while (opcao != 0);

		sc.close();
	}
}
