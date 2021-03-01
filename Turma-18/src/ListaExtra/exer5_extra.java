package ListaExtra;

import java.util.Scanner;

public class exer5_extra {
	public static void main(String[] args)
	{
		Scanner ler = new Scanner(System.in);
		double ind = 0.00;
		
		System.out.println("Insira o índice de poluição da sua índustria: ");
		ind = ler.nextDouble();
		
		if(ind>0.05 && ind<=0.25)
		{
			System.out.println("O índice está aceitável, nenhuma empresa precisa encerrar as atividades!");
		}
		else if(ind>=0.3 && ind<0.4) 
		{
			System.out.println("As industrias do 1º grupo devem suspender as atividades!"); 
		}
		else if(ind>0.4 && ind<0.5) 
		{
			System.out.println("As industrias do 1º e 2º grupo devem suspender as atividades!");
		}
		else if (ind == 0.5)
		{
			System.out.println("Todos os grupos de indústria devem suspender as atividades!");
		}
		else 
		{
			System.out.println("Insira um índice válido.");
		}
	}
}
