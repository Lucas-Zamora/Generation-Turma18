package Exemplos;
import java.util.Locale;
import java.util.Scanner;

//para - tem numero dfinido de vezes
//enquanto - testar no inicio
//faca.. enquanto - testar no final
public class ex_funcao {
	public static void main(String[] args) 
	{
		Scanner ler = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		int traco;
		
		System.out.print("Insira a quantidade de traços que você deseja: ");
		traco = ler.nextInt();
		linha(traco);
	}
	
	public static void linha (int traco) 
	{
		for(int x = 1;x<=traco;x++) 
		{
			System.out.print("-");
		}
	}
}
