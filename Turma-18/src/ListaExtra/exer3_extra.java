package ListaExtra;

import java.util.Scanner;

public class exer3_extra {
	public static void main (String[] args)
	{
		Scanner ler = new Scanner(System.in);
		double n1,n2,n3,n4,v1,v2,v3,v4;
		
		System.out.println("Insira o primeiro n�mero: ");
		n1 = ler.nextDouble();
		System.out.println("Insira o segundo n�mero: ");
		n2= ler.nextDouble();
		System.out.println("Insira o terceiro n�mero: ");
		n3 = ler.nextDouble();
		System.out.println("Insira o quarto n�mero: ");
		n4 = ler.nextDouble();
		
		v1 = Math.pow(n1, 2);
		v2 = Math.pow(n2, 2);
		v3 = Math.pow(n3, 2);
		v4 = Math.pow(n4, 2);
		
		if(v3>=1000) 
		{
			System.out.printf("Parab�ns, seu n�mero ao quadrado �: %f ",v3);
		}
		else if(v3<1000) 
		{
			System.out.println("O valor inicial do primeiro � "+n1+". O valor ao quadrado �: "+v1);
			System.out.println("O valor inicial do primeiro � "+n2+". O valor ao quadrado �: "+v2);
			System.out.println("O valor inicial do primeiro � "+n3+". O valor ao quadrado �: "+v3);
			System.out.println("O valor inicial do primeiro � "+n4+". O valor ao quadrado �: "+v4);
		}	
	}
}
