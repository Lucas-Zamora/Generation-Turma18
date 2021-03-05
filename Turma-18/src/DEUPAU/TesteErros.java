package DEUPAU;

import java.util.InputMismatchException;
import java.util.Scanner;

public class TesteErros {

	public static void main(String[] args) {
		
		// se - if - desvio condicional - switch - fun��es
		// for - while - do while - la�os de repeti��o
		// try - catch
		
		Scanner leia = new Scanner(System.in);
		int numero = 0;
		String nomes[] = {"JOAO","MARIA","PEDRO"};
		
		try 
		{
			System.out.println("Digite o numero da posi��o do vetor: [0-2]");
			numero = leia.nextInt();
		
			System.out.println("O nome escolhido foi : "+nomes[numero]);
			
		}
		catch (InputMismatchException error) 
		{
				System.out.println("Voc� digitou uma letra ao inves de n�mero.");
				error.printStackTrace();
		}
		catch(ArrayIndexOutOfBoundsException error) 
		{
				System.out.println("Voc� inseriu um n�mero invalido.");
		}
		finally 
		{
			System.out.println("VAI SEMPRE ACONTECER");
		}
			System.out.println("fim de programa.");
		
		// erro de tipo diferente
		// java.util.InputMismatchException
		
		//erro de tamanho de vetor
		// java.lang.ArrayIndexOutOfBoundsException
		
	}

}
