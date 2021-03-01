package ListaExtra;

import java.util.Scanner;

public class exer8_extra {
	public static void main(String[] args) 
	{
		Scanner ler = new Scanner(System.in);
		int n = 0;
		
		System.out.println("Insira um número:");
		n = ler.nextInt();
		
		if(n>100) 
		{
			System.out.println(n+", seu valor numérico é superior a 100.");
		}
		else if (n<=100) 
		{
			System.out.println(0);
		}
	}
}
