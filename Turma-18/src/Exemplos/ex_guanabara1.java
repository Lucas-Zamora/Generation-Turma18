package Exemplos;

import java.util.Scanner;

public class ex_guanabara1 {
	public static void main(String[] args)
	{
		Scanner ler = new Scanner(System.in);
		int i,f,cont;
		
		System.out.println("CONTAGEM INTELIGENTE");
		System.out.println("--------------------");
		System.out.println("Início: ");
		i = ler.nextInt();
		System.out.println("Fim: ");
		f = ler.nextInt();
		System.out.println("--------------------");
		System.out.println("   C O N T A N D O  ");
		System.out.println("--------------------");
		
		if (f>0)
		{
			cont = i;
			while(cont<=f)
			{
				System.out.print(cont+"..");
				cont++;
			}
		}else 
		{
			cont = i;
			while(cont>=f)
			{
				System.out.print(cont+"..");
				cont--;
			}
		}
	}
}
