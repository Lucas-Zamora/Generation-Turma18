package Exemplos;

import java.util.Scanner;

public class teste_2 {
	public static void main(String[] args) 
	{
		Scanner ler = new Scanner(System.in);
		
		int numero, numeroMaior = 0;
		System.out.println("Digite um numero");
		numero = ler.nextInt();
		
		while(numero>=0) 
		{
			if(numero>numeroMaior) 
			{
				numeroMaior = numero;
			}
			System.out.println("Digite + um n�mero: ");
			numero = ler.nextInt();
			
		}
		System.out.println("O maior n�mero foi: "+numeroMaior);
	}
}
