package DEUPAU;

import java.io.File; //input - entrada - o - output
import java.util.Scanner;
import java.io.FileNotFoundException;

public class Leiturinha {
	public static void main(String[] args)
	{
		File arquivo = new File("C:\\teste\\lista.txt");
		Scanner leia = new Scanner(System.in);	
		Scanner sc = null;
		try
		{
			sc = new Scanner(arquivo);
			while (sc.hasNextLine()) 
			{
			System.out.println(sc.nextLine());
			}
		}
		catch(FileNotFoundException erro)
		{
			System.out.println("Arquivo não encontrado!");
		}
		finally
		{
			if(sc!=null) {
				sc.close();
			}
		}
	}
} // fim
