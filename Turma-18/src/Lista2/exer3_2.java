package Lista2;

import java.util.Scanner;

public class exer3_2 {

	//Fa�a um programa que receba a idade de uma pessoa e mostre na sa�da em qual
	//categoria ela se encontra: 10-14 infantil; 15-17 juvenil; 18-25 adulto;
	
	public static void main (String[] args) 
	{
		Scanner ler = new Scanner(System.in);
		int idade;
		
		System.out.println("Digite a sua idade: ");
		idade = ler.nextInt();
		
		if((idade<=14) && (idade>=10))
		{
			System.out.println("Voc� esta na categoria INFATIL.");
		}
		else if((idade<=17) && (idade>=15))
		{
			System.out.println("Voc� esta na categoria JUVENIL.");
		}
		else if((idade<=25) && (idade>=18))
		{
			System.out.println("Voc� esta na categoria ADULTO.");
		}else 
		{
			System.out.println("Voc� n�o se enquadra em nenhuma categoria.");
		}
	}
}
