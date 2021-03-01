package ARRAYS;

import java.util.Random;

public class crazyletter {
	public static void main (String[] args) 
	{
		Random letra = new Random();
		String vogal[] = {"A","E","I","O","U"};
		int teste = 0;
		
		System.out.println("Randomizando as vogais");
		
		for (int x=0;x<15;x++) 
		{
			teste = letra.nextInt(5);
			System.out.println(vogal[teste]);
		}
	}
}
