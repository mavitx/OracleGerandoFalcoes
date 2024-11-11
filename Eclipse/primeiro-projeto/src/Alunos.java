import java.util.Scanner;

public class Alunos {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int opcao;
		String nomeAluno = "";
		do {
	     System.out.println("=========================================");
	     System.out.println("Sistema Cadastro aluno");
	     System.out.println("===========================================");
	     System.out.println("[0] sair");
	     System.out.println("[1] Cadastrar aluno");
	     System.out.println("[2] Listar aluno");
	     opcao = sc.nextInt();
	     switch(opcao) {
	     case 0:
	    	 System.out.println ("Saindo");
	    	 break;
	     case 1:
	    	 sc.nextLine();
	    	 break;
	     case 2: 
	    	 System.out.println("Alunos:");
	    	 System.out.println(nomeAluno);
	    	 break;
	    	 default:
	    		 System.out.println("opcao ivalidada" + opcao);
	     }
	    	
	    } while (opcao !=0);
		sc.close();
		
		
	}
     
}
