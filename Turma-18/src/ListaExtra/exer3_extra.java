package ListaExtra;

import java.util.Scanner;

public class exer3_extra {
	public static void main (String[] args)
	{
		Scanner ler = new Scanner(System.in);
		double n1,n2,n3,n4,v1,v2,v3,v4;
		
		System.out.println("Insira o primeiro número: ");
		n1 = ler.nextDouble();
		System.out.println("Insira o segundo número: ");
		n2= ler.nextDouble();
		System.out.println("Insira o terceiro número: ");
		n3 = ler.nextDouble();
		System.out.println("Insira o quarto número: ");
		n4 = ler.nextDouble();
		
		v1 = Math.pow(n1, 2);
		v2 = Math.pow(n2, 2);
		v3 = Math.pow(n3, 2);
		v4 = Math.pow(n4, 2);
		
		if(v3>=1000) 
		{
			System.out.printf("Parabéns, seu número ao quadrado é: %f ",v3);
		}
		else if(v3<1000) 
		{
			System.out.println("O valor inicial do primeiro é "+n1+". O valor ao quadrado é: "+v1);
			System.out.println("O valor inicial do primeiro é "+n2+". O valor ao quadrado é: "+v2);
			System.out.println("O valor inicial do primeiro é "+n3+". O valor ao quadrado é: "+v3);
			System.out.println("O valor inicial do primeiro é "+n4+". O valor ao quadrado é: "+v4);
		}	
	}
}
