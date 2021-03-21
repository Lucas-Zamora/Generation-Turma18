package EXEMPLOS2;

import java.util.Scanner;

public class programamedia {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner ler = new Scanner(System.in);
		
		System.out.println("Qual é o ano do seu nascimento? ");
		int nasc = ler.nextInt();
		int id = 2021 - nasc;
		System.out.println("Sua idade é "+id);
		if(id>=18) {
			System.out.println("Maior de Idade!");
		}else {
			System.out.println("Menor de Idade!");
		}
		
		
		
		/*System.out.println("Primeira nota: ");
		float n1 = ler.nextFloat();
		System.out.println("Segunda nota: ");
		float n2 = ler.nextFloat();
		
		float m = (n1+n2)/2;
		
		System.out.println("Sua média foi "+m);	
			if(m>=9) 
			{
				System.out.print("Parabéns, seu enfadonho!");
			} 
	}*/
	}
}
