package Exemplos;

import java.util.Scanner;

public class exemplo_for2 {
	public static void main(String[] args) 
	{
		Scanner ler = new Scanner(System.in);
		double salario, j = 0.00, somaS = 0.00, somaF = 0.00, mediaF = 0.00;
		double mediaS = 0.00,maiorSalario = 0.00, salarioMenor = 0.00;
		int filhos;
		final int HABITANTES = 3;
		
		for(int cont = 1; cont<=HABITANTES;cont++){
			System.out.println("Qual é o seu salario: ");
			salario = ler.nextDouble();
			System.out.println("Quantos filhos você tem: ");
			filhos = ler.nextInt();
			
			somaS = somaS + salario;
			somaF = somaF + filhos;
			
			if(salario>maiorSalario) {
				maiorSalario = salario;
			}
			if(salario<=100) {
				salarioMenor++;
			}
		}
			mediaS = somaS/HABITANTES;
			mediaF = somaF/HABITANTES;
			
			System.out.printf("A média de salario é %.2f \n ",mediaS);
			System.out.printf("A média de filhos é %.2f \n ",mediaF);
			System.out.printf("O maior salario é %f \n ",maiorSalario);
			System.out.println("A porcentagem de salarios até R$100,00: "+(salarioMenor*100)/HABITANTES);
	}
}
