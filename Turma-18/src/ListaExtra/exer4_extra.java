package ListaExtra;

import java.util.Scanner;

public class exer4_extra {
	public static void main(String[] args) 
	{
		Scanner ler = new Scanner(System.in);
		int numero = 0;
		
		System.out.println("Digite um n�mero inteiro positivo ou negativo: ");
		numero = ler.nextInt();
		
		if (numero % 2 == 0) 
		{
			System.out.println("O n�mero "+numero+" � par.");
		}
		else 
		{
			System.out.println("O n�mero "+numero+" � impar.");
		}
			if(numero>0) 
			{
				System.out.println("E � positivo!");
			}
		
			if(numero<0)
			{
				System.out.println("E � negativo!");
			}
	}
}
