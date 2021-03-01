package ARRAYS;

import java.util.Random;
import java.util.Scanner;

public class tarefa2 {
	public static void main(String[] args) 
	{
		Scanner ler = new Scanner(System.in);
		int lanc[] = new int[10];
		double mediA=0.00;
		double somaV = 0.00;
		int maiorP = 0;
		int contadorMP = 0;
		Random numeroDado = new Random();
		
		for(int x=0;x<lanc.length;x++) 
		{
			//System.out.printf("Digite o %dº resultado do lançamento :",(x+1));
			//lanc[x] = ler.nextInt();
			//lanc[x] = (int) (Math.random()*6)+1;
			lanc[x] = numeroDado.nextInt(6)+1; //insira +1 caso nao queira que comece com 0
		}
		for(int y=0;y<lanc.length;y++)
		{
			System.out.printf("O valor do %dº lançamento é %d \n",(y+1),lanc[y]);
			somaV=somaV+lanc[y];
			if(lanc[y]>=maiorP)
			{	
				if(lanc[y]>maiorP)
				{
					contadorMP = 0;
				}
			maiorP = lanc[y];
			contadorMP++;
			}
		}	
		mediA = somaV/lanc.length;
		System.out.printf("Total dos lançamentos digitados: %.0f \n",somaV);
		System.out.printf("A média é %.2f \n",mediA);
		System.out.printf("O maior valor é %d \n",maiorP);
		System.out.printf("O maior valor aparece %d vezes \n",contadorMP);		
	}
}
