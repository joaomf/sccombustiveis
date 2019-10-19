package aulas;

import java.util.ArrayList;
import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int opcao;
		
		ArrayList<Gastos> lista = new ArrayList<>();
		
		do { 
			System.out.println("Controle de Combustiveis");
			System.out.println("========================");
			System.out.println("");
			System.out.println("1 - Gastos");
			System.out.println("2 - Relatorio");
			System.out.println("3 - Sair");

			Scanner sc = new Scanner(System.in);
			opcao = sc.nextInt();
			
			if (opcao == 1) {
				System.out.println("Digite o Nome:");
				String nome = sc.next();
				
				System.out.println("Km Rodado:");
				float kmRodado = sc.nextFloat();
				
				System.out.println("Litros");
				float litros = sc.nextFloat();
				
				Gastos gastos = new Gastos(nome, litros, kmRodado);
				
				lista.add(gastos);
				
			} else if (opcao == 2){
				System.out.println("");
				System.out.println("Relatorio de Autonomia");
				System.out.println("======================");
				for (Gastos gastos : lista) {
					System.out.println(gastos);				
				}
				System.out.println("");
			} else if (opcao !=3){
				System.out.println("Opcao Invalida !!!");
			}
			
		} while (opcao != 3);
		
		System.out.println("");
		System.out.println("Fim de execucao !!!");
		
		
		
		
		

	}

}