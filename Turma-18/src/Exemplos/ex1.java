package Exemplos;

import java.util.Scanner;

public class ex1 {
	public static void main(String[] args) 
	{
		Scanner ler = new Scanner(System.in);
		int num;
		
		System.out.println("Digite um n�mero: ");
		num = ler.nextInt();
		
		if (num%2 == 0) 
		{
			System.out.println("O n�mero "+num+" � par!");
			
		} 
		else
		{
			System.out.printf("O n�mero %d � impar!",num);
		}
	}
// String resposta;
// resposta = (num%2 == 0) ? "O numero � par!":"O numero � impar"
}
