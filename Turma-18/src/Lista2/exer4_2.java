package Lista2;

import java.util.Scanner;
//Fa�a um programa em que permita a entrada de um n�mero qualquer e exiba se este
//n�mero � par ou �mpar. Se for par exiba tamb�m a raiz quadrada do mesmo; se for
//�mpar exiba o n�mero elevado ao quadrado.
public class exer4_2 {
	public static void main (String[] args) 
	{
		Scanner ler = new Scanner(System.in);
		int num;
		
		System.out.println("Digite um n�mero aleatorio: ");
		num = ler.nextInt();
		
		if(num%2==0) 
		{
			System.out.println("O num�ro: "+num+" � par"+" e sua raiz quadrada ser�: "+(Math.sqrt(num))+".");
		}else 
		{
			System.out.println("O num�ro: "+num+" � impar"+" e seu n�mero elevado ao quadrado ser�: "+Math.pow(num, 2));
		}
	}
}
