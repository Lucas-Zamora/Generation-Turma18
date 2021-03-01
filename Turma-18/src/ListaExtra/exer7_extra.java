package ListaExtra;

import java.util.Scanner;

public class exer7_extra {
	public static void main (String[] args) 
	{
		Scanner ler = new Scanner(System.in);
		double base, altura, area;
		
		System.out.println("Insira o valor da base do triângulo:");
		base = ler.nextDouble();
		System.out.println("Insira o valor da altura do triângulo:");
		altura = ler.nextDouble();
		
		if(base>0) 
		{
			area = (base*altura)/2;
			System.out.println("A área do triângulo é: "+area);
		}
		else if (base<0) 
		{
			System.out.println("Não foi possivel calcular a área do triângulo.");
		}
	}
}
