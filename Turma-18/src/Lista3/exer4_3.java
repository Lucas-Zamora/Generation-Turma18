package Lista3;

import java.util.Scanner;
/*Uma empresa desenvolveu uma pesquisa para saber as caracter�sticas 
psicol�gicas dos indiv�duos de uma regi�o. Para tanto, a cada uma das pessoas
era perguntado: idade, sexo (1-feminino / 2-masculino / 3-Outros), e as op��es
(1, se a pessoa era calma; 2, se a pessoa era nervosa e 3, se a pessoa era
agressiva). Pede-se para elaborar um sistema que permita ler os dados de 150
pessoas, calcule e mostre: (WHILE)
o n�mero de pessoas calmas;
o n�mero de mulheres nervosas;
o n�mero de homens agressivos;
o n�mero de outros calmos;
o n�mero de pessoas nervosas com mais de 40 anos;
o n�mero de pessoas calmas com menos de 18 anos.
*/
public class exer4_3 {

	public static void main(String[] args) 
	{
		Scanner leia = new Scanner(System.in);
		int idade, sexo, emocao;
		int pessoas = 0;
		int p1 = 0, p2 = 0, p3 = 0, p4 = 0, p5 = 0, p6 = 0;
		
		while(pessoas<=150)
		{
		System.out.println("Qual a sua idade?: ");
		idade = leia.nextInt();
		System.out.println("Qual o seu sexo? 1)Feminino / 2)Masculino / 3)Outros: ");
		sexo = leia.nextInt();
		System.out.println("Voc� se considera uma pessoa:? 1)Calma / 2)Nervosa / 3)Agressiva: ");
		emocao = leia.nextInt();
		if(emocao == 1) 
		{
			p1 ++;
		}
		if (emocao == 2 && sexo == 1)
		{
			p2 ++;
		}
		if(emocao == 3 && sexo == 2) 
		{
			p3 ++;
		}
		if(emocao == 1 && sexo == 3)
		{
			p4 ++;
		}
		if(idade>40 && emocao == 2)
		{
			p5 ++;
		}
		if(idade<18 && emocao == 1) 
		{
			p6 ++;
		}
		pessoas ++;
		}
		System.out.printf("A quantidade de pessoas calmas �: %d\n",p1);
		System.out.printf("A quantidade de mulheres nervosas �: %d\n",p2);
		System.out.printf("A quantidade de homens agressivos �: %d\n",p3);
		System.out.printf("A quantidade de pessoas do genero outro que s�o calmos �: %d\n",p4);
		System.out.printf("A quantidade de pessoas nervosas que est�o acima dos 40 anos �: %d\n",p5);
		System.out.printf("A quantidade de pessoas calmas que est�o abaixo dos 18 anos �: %d\n",p6);	
	}
}
