package programa;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
	
		/*
		 * 			Fazer um programa para ler um conjunto de nomes de pessoas e suas respectivas idades.
		 * 			Os nomes devem ser armazenados em vetor, e as idades em um outro vetor. Depois, mostrar
		 * 		na tela o nome da pessoa mais velha.
		 */
		
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Quantas pessoas quer cadastrar? ");
		int num = sc.nextInt();
		
		String[] nome = new String[num];
		Integer[] idade = new Integer[num];
		
		int velho = 0, indice = 0;
		for(int i = 0; i < num; i++) {
			sc.nextLine();
			System.out.printf("Cadastro %d°: ", i + 1);
			System.out.println("\nNome: ");
			nome[i] = sc.nextLine();
			System.out.println("Idade: ");
			idade[i] = sc.nextInt();
			
			if(idade[i] > velho) {
				velho = idade[i];
				indice = i;
			} else if(idade[i] > velho) {
				velho = idade[i];
				indice = i;
			}
		}
		
		System.out.println("\nPessoa mais velha\nNome: " + nome[indice]);

		sc.close();
	}

}
