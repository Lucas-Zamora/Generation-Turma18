package Exemplos;

import java.util.Scanner;

public class teste4 {
	public static void main(String[] args) 
	{
		Scanner ler = new Scanner(System.in);
		int senha = 123;
		String nomes;
		
		while(senha == 123)
		{
		System.out.println("Digite o seu nome: ");
		nomes = ler.next().toUpperCase();
		System.out.println("Digite a senha");
		senha = ler.nextInt();
		}
		System.out.println("Fim do programa.");
	}
}
