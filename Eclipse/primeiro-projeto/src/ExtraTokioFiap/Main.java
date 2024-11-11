//package ExtraTokioFiap;
//
//import java.io.BufferedReader;
//import java.io.File;
//import java.io.FileReader; // ler
//import java.io.FileWriter; // escritor
//import java.io.IOException; // "ignora" o exception para evitar erros
//import java.util.Scanner;
//
//public class Main {
//
//	public static void main(String[] args) throws IOException { // classe para permitir o fileWriter
//		
//		Scanner scannerInt = new Scanner(System.in); // 
//		Scanner scannerStr = new Scanner(System.in);
//		
//		String caminho = "C:\\\\Users\\\\Gerando Falcões\\\\Desktop\\\\oracle\\\\manhã\\\\MariaVitoria-t7-2024\\\\Eclipse\\\\primeiro-projeto\\\\src\\\\ExtraTokioFiap\\\\oi.txt";
//		
//		while (true) {
//			System.out.println("""
//					-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-
//					Qual opção você deseja realizar: 
//					[0] Sair
//					[1] cadastra aluno
//					[2] listar aluno
//					""");
//			 int opcao = scannerInt.nextInt();
//			 
//		     if (opcao == 1) {
//		    	 FileWriter escritor = new FileWriter(caminho, true);
//		    	 System.out.println(" ");
//		    	 System.out.println("qual seu nome? ");
//		    	 String conteudo = " " + scannerStr.nextLine(); 
//		    	 escritor.close();
//		     } else if (opcao == 2) {
//		    	 Scanner sc = new Scanner(new File(caminho));
//		    	 System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-");
//		    		 System.out.println(sc.nextLine());
//		    	 }
//		    	 System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
//		     } else if (opcao == 3) {
//		    	 FileWriter escritor = new FileWriter(caminho); // false opicional
//		     } else {
//		    	 break;
//		     }
//		}
//		
//		System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-");
//		System.out.println("Programa finalizado!");
//
//	}
//
//}
