package Exemplos;

import java.util.Scanner;

public class ex1 {
	public static void main(String[] args) 
	{
		Scanner ler = new Scanner(System.in);
		int num;
		
		System.out.println("Digite um número: ");
		num = ler.nextInt();
		
		if (num%2 == 0) 
		{
			System.out.println("O número "+num+" é par!");
			
		} 
		else
		{
			System.out.printf("O número %d é impar!",num);
		}
	}
// String resposta;
// resposta = (num%2 == 0) ? "O numero é par!":"O numero é impar"
}
