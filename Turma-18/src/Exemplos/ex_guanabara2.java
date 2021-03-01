package Exemplos;

import java.util.Scanner;

public class ex_guanabara2 {
	public static void main(String[] args) 
	{
		Scanner ler = new Scanner(System.in);
		int tot, cont=1;
		String nome, malto = null;
		double nota,mN = 0;
		
		System.out.println("------------------------");
		System.out.println("ESCOLINHA DO ZÉ MANGUAÇA");
		System.out.println("------------------------");
		System.out.print("Quantos alunos a turma tem? ");
		tot = ler.nextInt();
		while(cont<=tot) 
		{
			System.out.println("------------------------");
			System.out.println("ALUNO "+cont);
			System.out.println("Nome do aluno: ");
			nome = ler.next().toUpperCase();
			System.out.println("Nota do aluno: ");
			nota = ler.nextDouble();
			if(nota>mN) 
			{
				mN = nota;
				malto = nome;
			}
			cont++;
		}
		System.out.println("----------------------");
		System.out.print("O melhor desempenho foi do/a "+malto+" tendo a maior nota: "+mN);
	}
}
