package ARRAYS;

import java.util.Scanner;
//matriz e vetor === for
public class tarefa1 {
	public static void main(String[] args)
	{
		Scanner ler = new Scanner(System.in);
		int valores []= new int[5];
		int maiorValor = 0;
		
		for(int x = 0;x<valores.length;x++)
		{
			System.out.printf("Digite o valor %d: ",(x+1));
			valores[x] = ler.nextInt();
		}
		for(int y = 0;y<valores.length;y++)
		{
			System.out.println("O valor "+(y+1)+" é "+valores[y]);
			if(valores[y]>maiorValor) 
			{
				maiorValor = valores[y];
			}
		}
		System.out.println("O maior valor é: "+maiorValor);
	}
}
