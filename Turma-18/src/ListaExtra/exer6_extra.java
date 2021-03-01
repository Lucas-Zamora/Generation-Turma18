package ListaExtra;

import java.util.Scanner;

public class exer6_extra {
	public static void main (String[] args) {
		Scanner ler = new Scanner(System.in);
		int idade;
		
		System.out.println("Insira a sua idade: ");
		idade = ler.nextInt();
		
		if (idade<=4) 
		{
			System.out.println("Desculpe, mas você é muito jovem");
		}
		else if(idade>=5 && idade<=7) 
		{
			System.out.println("Você faz parte do grupo Infantil A");
		}
		else if(idade>=8 && idade<=11) 
		{
			System.out.println("Você faz parte do grupo Infantil B");
		}
		else if(idade>=12 && idade<=13) 
		{
			System.out.println("Você faz parte do grupo Juvenil A");
		}
		else if(idade>=14 && idade<=17)
		{
			System.out.println("Você faz parte do grupo Juvenil B");
		}
		else 
		{
			System.out.println("Você faz parte do grupo Adulto");
		}
	}
}
