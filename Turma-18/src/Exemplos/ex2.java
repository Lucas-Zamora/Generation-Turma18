package Exemplos;
/*
 * 6) Elabore um sistema que dada a idade de um nadador 
 * classifique-o em uma das seguintes categorias:
    Infantil A = 5 a 7 anos
    Infantil B = 8 a 11 anos
    Juvenil A = 12 a 13 anos
    Juvenil B = 14 a 17 anos
    Adultos = Maiores de 18 anos
 */
import java.util.Scanner;

public class ex2 {
	public static void main (String[] args) 
	{
		Scanner ler = new Scanner(System.in);
		
		int idadeN;
		
		System.out.println("Digite a idade do nadador: ");
		idadeN = ler.nextInt();
		
		if (idadeN<5) 
		{
			System.out.println("Infelizmente não podemos atender");
		}else if(idadeN<=7) 
		{
			System.out.println("Infantil A = 5 a 7 anos");
		}else if(idadeN<=11) 
		{
			System.out.println("Infantil B = 8 a 11 anos");
		}else if(idadeN<=13) 
		{
			System.out.println("Juvenil A = 12 a 13 anos");
		}else if(idadeN<=17) 
		{
			System.out.println("Juvenil B = 14 a 17 anos");
		}else 
		{
			System.out.println("Adultos = Maiores de 18 anos");
		}
		
		System.out.println("Obrigado! Volte sempre!!");		
		
	}
}
