package Lista3;

import java.util.Scanner;
//2- Ler 10 n�meros e imprimir quantos s�o pares e quantos s�o �mpares. (FOR)
public class exer2_3 {
	public static void main (String[] args) 
	{
		Scanner ler = new Scanner(System.in);
		int par=0,num,i;
		
		for(i = 1;i<=10;i++) 
		{
			System.out.println("Insira um n�mero: ");
			num = ler.nextInt();		
			if(num%2==0) 
			{
				par ++;
			}
		}
		System.out.printf("Pares %d \n",par);
		System.out.printf("Impares %d",10-par);
	}
}
