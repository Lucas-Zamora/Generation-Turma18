package Lista3;
//Escrever um programa que receba v�rios n�meros inteiros no teclado. E no
//final imprimir a m�dia dos n�meros m�ltiplos de 3. Para sair digitar
//0(zero).(DO...WHILE)
import java.util.Scanner;

public class exer6_3 {
	public static void main(String[] args)
	{
		Scanner ler = new Scanner(System.in);
		int num;
		int soma = 0;
		double media = 0, cont = 0;
		System.out.println("Insira n�meros inteiros para prosseguir, e zero caso queira finalizar.");
		do {
			System.out.println("Insira um n�mero: ");
			num = ler.nextInt();
			if(num%3==0) {
				soma += num;
				cont++;
				media = soma/cont;
			}			
		}while(num!=0);
		System.out.println("\n A m�dia dos n�meros �: "+media);
	}
}
