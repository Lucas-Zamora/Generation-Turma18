package Lista2;

import java.util.Scanner;
//Fa�a um programa que receba tr�s inteiros e diga qual deles � o maior.
public class exer1_2 {
	public static void main (String[] args) 
	{
		Scanner ler = new Scanner(System.in);
		
		int num1 = 0,num2 = 0,num3 = 0;
		
		System.out.println("Insira o primeiro n�mero inteiro:");
		num1 = ler.nextInt();
		System.out.println("Insira o segundo n�mero inteiro:");
		num2 = ler.nextInt();
		System.out.println("Insira o terceiro n�mero inteiro:");
		num3 = ler.nextInt();
		
		if(num1>num2 && num1>num3) 
		{
			System.out.printf("O mairo n�mero �: %d: ",num1);
		} 
		else if(num2>num1 && num2>num3) 
		{
			System.out.printf("O maior n�mero �: %d: ",num2);
		}else 
		{
			System.out.printf("O maior n�mero �: %d: ",num3);
		}
	}
}
