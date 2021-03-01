package ARRAYS;

import java.util.Random;

public class tarefa4 {
	public static void main(String[] args) 
	{
		Random num = new Random();
		//Scanner ler = new Scanner(System.in);
		int receba[][] = new int [3][3];
		int linha;
		int coluna;
		int somaT=0, somaD=0;
		
		for(linha = 0;linha < receba.length; linha++) {
			for(coluna = 0;coluna < receba.length; coluna++) {
				//System.out.println("Digite o valor: ");
				//receba[linha][coluna] = ler.nextInt();
				receba[linha][coluna]= num.nextInt(10)+1;			
				somaT += receba[linha][coluna];
			}
		}
		for(linha = 0; linha<receba.length; linha++) {
			for(coluna = 0; coluna<receba.length; coluna++) {
				System.out.println("[ "+receba[linha][coluna]+" ]");
			}
				System.out.println("\n");
		}
		System.out.println("Valor total da matriz: "+somaT);
		somaD = receba[0][0]+receba[1][1]+receba[2][2];
		System.out.println("Valor da soma da diagonal principal: "+somaD);
	}
}
