package Exemplos;

import java.util.Scanner;

public class teste_1 {
	public static void main(String[] args) 
	{
		Scanner ler = new Scanner(System.in);
		String nome;
		char sexo;
		
		System.out.println("Digite o nome: ");
		nome = ler.next().toUpperCase();
		System.out.println("Digite o sexo M/F/O: ");
		sexo = ler.next().toUpperCase().charAt(0);
		
		while(sexo!='M' && sexo!='F' && sexo!='O') 
		{
			 System.out.println("Você digitou errado!! Tente novamente usando M/F/O: ");
			 sexo = ler.next().toUpperCase().charAt(0);
		}
		System.out.println("Fim do programa.");
	}
}
