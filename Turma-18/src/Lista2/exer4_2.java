package Lista2;

import java.util.Scanner;
//Faça um programa em que permita a entrada de um número qualquer e exiba se este
//número é par ou ímpar. Se for par exiba também a raiz quadrada do mesmo; se for
//ímpar exiba o número elevado ao quadrado.
public class exer4_2 {
	public static void main (String[] args) 
	{
		Scanner ler = new Scanner(System.in);
		int num;
		
		System.out.println("Digite um número aleatorio: ");
		num = ler.nextInt();
		
		if(num%2==0) 
		{
			System.out.println("O numéro: "+num+" é par"+" e sua raiz quadrada será: "+(Math.sqrt(num))+".");
		}else 
		{
			System.out.println("O numéro: "+num+" é impar"+" e seu número elevado ao quadrado será: "+Math.pow(num, 2));
		}
	}
}
