package ListaExtra;

import java.util.Scanner;

public class exer1_extra {
	public static void main (String[] args)
	{
		Scanner ler = new Scanner(System.in);
		int pesoInformado = 0, excessoKg = 0;
		double multa = 0.00;
		final int limite = 50;
		final double valorM = 4.00;
		
		System.out.println("Informe o peso de tomates hoje em Kg: ");
		pesoInformado = ler.nextInt();
		
		if(pesoInformado<=limite) 
		{
			System.out.printf("Escesso: %d ",excessoKg);
			System.out.printf("Multa: R$ %.2f",multa);
		}else 
		{
			excessoKg = pesoInformado - limite;
			multa = excessoKg * valorM;
			System.out.printf("Escesso: %d ",excessoKg);
			System.out.printf("Multa: R$ %.2f",multa);
					
		}	
	}
}
