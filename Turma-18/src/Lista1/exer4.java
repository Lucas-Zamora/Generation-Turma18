package Lista1;

import java.util.Scanner;

public class exer4 {
	//4. Escreva um sistema que leia tr�s n�meros inteiros e positivos (A, B, C) e
		//calcule a seguinte express�o: (a+b)� (b+c)� sendo D = (R+S)/2
		public static void main(String[] arg){
			int a,b,c;
			int d,r,s;
			Scanner ler = new Scanner(System.in);
			System.out.println("Insira apenas n�meros inteiros e positivos!");
			System.out.println("Insira o primeiro n�mero: ");
			a = ler.nextInt();
			System.out.println("Insira o segundo n�mero: ");
			b = ler.nextInt();
			System.out.println("Insira o terceiro n�mero: ");
			c = ler.nextInt();
		
			r = (int) Math.pow((a+b),2);
			s = (int) Math.pow((b+c),2);
			d = (r+s)/2;
			
			System.out.println("O valor de R �: "+r);
			System.out.println("O valor de S �: "+s);
			System.out.println("O valor de D �: "+d);
		}
}
