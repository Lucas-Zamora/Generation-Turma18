package Lista2;

import java.util.Scanner;

public class exer2_2 {
//Fa�a um programa que entre com tr�s n�meros e coloque em ordem crescente.
	public static void main(String[] args)
	{
		Scanner ler = new Scanner(System.in);
		int num1, num2, num3;
		
		System.out.println("Digite o primeiro n�mero: ");
		num1 = ler.nextInt();
		System.out.println("Digite o segundo n�mero: ");
		num2 = ler.nextInt();
		System.out.println("Digite o terceiro n�mero: ");
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
		
		System.out.println("Os n�meros em ordem crescente s�o: "+num1+" "+num2+" "+num3+" ");
		
	}
}
