package Lista3;
//Crie um programa que leia um número do teclado até que encontre um
//número igual a zero. No final, mostre a soma dos números
//digitados.(DO...WHILE)
import java.util.Scanner;

public class exer5_3 {
	public static void main(String[] args) 
	{
		Scanner ler = new Scanner(System.in);
		double numero = 0.00, maiorN = 0.00, soma = 0.00;
		
		do 
		{
			System.out.println("Insira um número");
			numero = ler.nextDouble();
			if(numero>0) 
			{
				soma += numero;
				if(numero>maiorN)
				{
					maiorN = numero;
				}
			}
		}while (numero>0);
		if(numero == 0) {
			System.out.printf("Você digitou 0 \n"+"A soma de tudo é: %.2f",soma);
		}
	}
}
