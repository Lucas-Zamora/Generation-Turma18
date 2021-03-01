package Lista2;

import java.util.Scanner;

public class exer2_2 {
//Faça um programa que entre com três números e coloque em ordem crescente.
	public static void main(String[] args)
	{
		Scanner ler = new Scanner(System.in);
		int num1, num2, num3;
		
		System.out.println("Digite o primeiro número: ");
		num1 = ler.nextInt();
		System.out.println("Digite o segundo número: ");
		num2 = ler.nextInt();
		System.out.println("Digite o terceiro número: ");
		num3 = ler.nextInt();

		if(num3< num2) 
		{
			var aux = num2;
			num2 = num3;
			num3 = aux;
		}
		if(num2 < num1) 
		{
			var aux = num1;
			num1 = num2;
			num2 = aux;
		}
		if(num3< num2) 
		{
			var aux = num2;
			num2 = num3;
			num3 = aux;
		}
		
		System.out.println("Os números em ordem crescente são: "+num1+" "+num2+" "+num3+" ");
		
	}
}
