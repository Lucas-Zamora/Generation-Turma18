package Exemplos;

import java.util.Locale;
import java.util.Scanner;

public class ex_funcao1 {

	public static void main(String[] args) 
	{
		Locale.setDefault(Locale.US); // define o padrão de tela/teclado americano
		Scanner ler = new Scanner(System.in); //instanciou o teclado
		
		int numero;
		String nome;
		char genero;
		String vocativo = "";
		
		System.out.println("Digite o seu nome: ");
		nome = ler.next().toUpperCase();
		System.out.println("Digite o seu gênero [M,F,O]: ");
		genero = ler.next().toUpperCase().charAt(0);  //toUpperCase() aparecer letra maiuscula
		
		System.out.println("Digite um número inteiro positivo: ");
		numero = ler.nextInt();
		parImpar(numero);
		System.out.printf("A raiz quadrada do numero é: %.2f",raiz(numero));
		pula();
		vocativo = tipo(genero);
		System.out.printf("Bom dia %s %s, este é um teste de retorno",vocativo, nome);
		
		System.out.println("-----------------------------------");
	}
	
	public static void pula() //funcao para pular linha
	{
		System.out.println();
	}
	public static void parImpar(int numero) // funcao par e impar
	{
		if (numero%2==0) 
		{
			System.out.printf("O numero %d é par!",numero);
			pula();
		}else 
		{
			System.out.printf("O numero %d é impar!",numero);
			pula();
		}	
	}
	public static String tipo(char genero) 
	{
		String vocativo=""; //
		if (genero == 'M') 
		{
			vocativo = "Sr";
		}else if(genero == 'F') 
		{
			vocativo = "Sra";
		}else if(genero == 'O') 
		{
			vocativo = "Srx";
		}
		else {
			vocativo = "N/D";
		}
		return vocativo;
	}
	public static double raiz(double numero) 
	{
		return Math.sqrt(numero);
	}
}
