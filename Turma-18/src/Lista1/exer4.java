package Lista1;

import java.util.Scanner;

public class exer4 {
	//4. Escreva um sistema que leia três números inteiros e positivos (A, B, C) e
		//calcule a seguinte expressão: (a+b)² (b+c)² sendo D = (R+S)/2
		public static void main(String[] arg){
			int a,b,c;
			int d,r,s;
			Scanner ler = new Scanner(System.in);
			System.out.println("Insira apenas números inteiros e positivos!");
			System.out.println("Insira o primeiro número: ");
			a = ler.nextInt();
			System.out.println("Insira o segundo número: ");
			b = ler.nextInt();
			System.out.println("Insira o terceiro número: ");
			c = ler.nextInt();
		
			r = (int) Math.pow((a+b),2);
			s = (int) Math.pow((b+c),2);
			d = (r+s)/2;
			
			System.out.println("O valor de R é: "+r);
			System.out.println("O valor de S é: "+s);
			System.out.println("O valor de D é: "+d);
		}
}
