package Lista3;

import java.util.Scanner;
//3- Solicitar a idade de várias pessoas e imprimir: Total de pessoas com menos de
//21 anos. Total de pessoas com mais de 50 anos. O programa termina quando
//idade for =-99. (WHILE)
public class exer3_3 {
	public static void main(String[] args) 
	{
		Scanner ler = new Scanner(System.in);
		int totalM=0,totalA=0,idade=0;
		
		while(idade!=-99)
		{
			System.out.println("Informe a idade: ");
			idade = ler.nextInt();
			if(idade>=0 && idade<=21) 
			{
				totalM++;
			}
			if(idade>=50)
			{
				totalA++;
			}
		}
		System.out.printf("O total de pessoas com menos de 21 anos é: %d \n",totalM);
		System.out.printf("O total de pessoas com mais de 50 anos é: %d \n",totalA);
	}
}
