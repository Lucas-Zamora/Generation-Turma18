package Exemplos;

import java.util.Scanner;

public class tabuada {
	public static void main(String[] args) 
	{
		Scanner ler = new Scanner(System.in);
		int entrada;
		
		System.out.println("Quer ver a tabuada de qual número? ");
		entrada = ler.nextInt();
		
		int multiplicador = 1;
		while(multiplicador<=10) 
		{
			int resultado = entrada * multiplicador;
			System.out.println(entrada+" X "+multiplicador+" = "+resultado);
			multiplicador++;
		}
	}	
}
