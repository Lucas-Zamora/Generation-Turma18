package ListaExtra;

import java.util.Scanner;

public class exer2_extra {
	public static void main (String[] args) 
	{
		Scanner ler = new Scanner(System.in);
		double c,n,v1,v2,v3;
		
		System.out.println("Insira o número de horas trabalhadas: ");
		n = ler.nextDouble();
		
		if(n<=50) 
		{
			v1=n*10;
			c=(n-50)*10;
			System.out.printf("Seu salário sera de: %.2f",v1);
			System.out.printf("\nDescontos de: %.2f",c);
		}
		else if(n>50) 
		{
			c=n-50;
			v2=50*10+c*20;
			v3=c*20;
			System.out.printf("Seu salário com extras sera de: %.2f",v2);
			System.out.printf("\nHoras extras: %.2f",v3);
		}
	}
}
