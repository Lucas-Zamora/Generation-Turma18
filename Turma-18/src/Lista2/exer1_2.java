package Lista2;

import java.util.Scanner;
//Faça um programa que receba três inteiros e diga qual deles é o maior.
public class exer1_2 {
	public static void main (String[] args) 
	{
		Scanner ler = new Scanner(System.in);
		
		int num1 = 0,num2 = 0,num3 = 0;
		
		System.out.println("Insira o primeiro número inteiro:");
		num1 = ler.nextInt();
		System.out.println("Insira o segundo número inteiro:");
		num2 = ler.nextInt();
		System.out.println("Insira o terceiro número inteiro:");
		num3 = ler.nextInt();
		
		if(num1>num2 && num1>num3) 
		{
			System.out.printf("O mairo número é: %d: ",num1);
		} 
		else if(num2>num1 && num2>num3) 
		{
			System.out.printf("O maior número é: %d: ",num2);
		}else 
		{
			System.out.printf("O maior número é: %d: ",num3);
		}
	}
}
