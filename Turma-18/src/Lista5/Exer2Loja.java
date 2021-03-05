package Lista5;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Scanner;

public class Exer2Loja 
{
	public static void main(String[] args) 
	{
		Scanner ler = new Scanner(System.in);
		Collection<String> item = new ArrayList();
		
		item.add("Camisa");
		item.add("Boné");
		item.add("Calça");
		item.add("Blusa");
		
		String prod = "";
		char opcao;
		
		System.out.println("Lista de produtos: "+ item);
		System.out.println();
		
		for(int i = 0;i<item.size();i++) 
		{
			System.out.print("Deseja fazer o cadastro do produto? S / N ");
			opcao =ler.next().toUpperCase().charAt(0);
			ler.nextLine();
			
			if(opcao != 'N') 
			{
				System.out.print("Qual é o nome do produto? ");
				prod = ler.nextLine();
				item.add(prod);
				
				System.out.println("O produto: "+prod+" foi cadastrado no sistema.");
			}
			
			if(!(item.isEmpty())) 
			{
				System.out.println("Lista de produtos: "+ item);
				System.out.println();
				
				System.out.print("Deseja excluir algum produto? S / N ");
				opcao = ler.next().toUpperCase().charAt(0);
				ler.nextLine();
				
				if(opcao != 'N') 
				{
					System.out.print("Qual o nome do produto? ");
					prod = ler.nextLine();
					item.add(prod);
					
					i--;
					
					System.out.println("O produto: "+prod+" foi retirado do sistema.");
					
					if(item.size() == 0) 
					{
						System.out.println("Você retirou todos os itens do estoque.");
						
						for(int x = 0; x<3; x++)
						{
							System.out.println();
						}
						
						System.out.println("Pressione 0 para finalizar a sessão");
						System.out.println("Pressione 1 para realizar um novo cadastro");
						System.out.print("selecione a opção: ");
						opcao = ler.next().toUpperCase().charAt(0);
						
						for(int y = 0; y<3; y++) 
						{
							System.out.println();
						}
						if(opcao == '1') 
						{
								System.out.print("Qual o nome do produto? ");
								prod = ler.nextLine();
								item.add(prod);
						}
					}
				}
				
			}
			
				System.out.println("Lista de nomes: "+ item);
				System.out.println();
			
		}
	}
}
