package Lista3;
//Escrever um programa que receba vários números inteiros no teclado. E no
//final imprimir a média dos números múltiplos de 3. Para sair digitar
//0(zero).(DO...WHILE)
import java.util.Scanner;

public class exer6_3 {
	public static void main(String[] args)
	{
		Scanner ler = new Scanner(System.in);
		int num;
		int soma = 0;
		double media = 0, cont = 0;
		System.out.println("Insira números inteiros para prosseguir, e zero caso queira finalizar.");
		do {
			System.out.println("Insira um número: ");
			num = ler.nextInt();
			if(num%3==0) {
				soma += num;
				cont++;
				media = soma/cont;
			}			
		}while(num!=0);
		System.out.println("\n A média dos números é: "+media);
	}
}
