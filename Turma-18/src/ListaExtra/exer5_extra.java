package ListaExtra;

import java.util.Scanner;

public class exer5_extra {
	public static void main(String[] args)
	{
		Scanner ler = new Scanner(System.in);
		double ind = 0.00;
		
		System.out.println("Insira o �ndice de polui��o da sua �ndustria: ");
		ind = ler.nextDouble();
		
		if(ind>0.05 && ind<=0.25)
		{
			System.out.println("O �ndice est� aceit�vel, nenhuma empresa precisa encerrar as atividades!");
		}
		else if(ind>=0.3 && ind<0.4) 
		{
			System.out.println("As industrias do 1� grupo devem suspender as atividades!"); 
		}
		else if(ind>0.4 && ind<0.5) 
		{
			System.out.println("As industrias do 1� e 2� grupo devem suspender as atividades!");
		}
		else if (ind == 0.5)
		{
			System.out.println("Todos os grupos de ind�stria devem suspender as atividades!");
		}
		else 
		{
			System.out.println("Insira um �ndice v�lido.");
		}
	}
}
