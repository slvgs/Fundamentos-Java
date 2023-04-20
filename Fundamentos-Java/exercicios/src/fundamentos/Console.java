package fundamentos;

import java.util.Scanner;

public class Console {
	
	public static void main(String[] args) {
		
		System.out.println("Bom");
		System.out.println("dia!\n\n");
		
		System.out.println("Bom");
		System.out.println("dia!");
		
		System.out.printf("Megasena %d %d %d %d %d %d ¨%n", 1, 2, 3, 4, 5 ,6 );
		
		System.out.printf("Salário: %.1f%n", 12.9822 );
		System.out.printf("Nome: %s %n ", "João");
		
		Scanner entrada = new Scanner(System.in);
		System.out.println("Digite seu primeiro nome:");
		String nome = entrada.nextLine();
		
		
		
		System.out.println("Digie seu sobrenome:");
		String sobrenome = entrada.nextLine();
		
		System.out.println("Digite sua idade:");
		int idade = entrada.nextInt();
		
		
		System.out.printf("Dados:  %s %s tem %d anos ", nome, sobrenome, idade );
		
		entrada.close();
		
	}
}
