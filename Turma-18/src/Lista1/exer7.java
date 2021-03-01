package Lista1;

import java.util.Scanner;

public class exer7 {
	//Escreva um sistema que lê os coeficientes a,b,c,d,e e f e calcula e mostra os
		//valores de x = ((a*e)-(b*f))/((a*e)-(b*d)); y = ((a*f)-(c*d))/((a*e)-(b*d));
		public static void main (String[] arg) {
			double a,b,c,d,e,f;
			double x,y;
			Scanner ler = new Scanner(System.in);
			
			System.out.println("Digite o valor de a: ");	
			a = ler.nextDouble();
			System.out.println("Digite o valor de b: ");
			b = ler.nextDouble();
			System.out.println("Digite o valor de c: ");
			c = ler.nextDouble();
			System.out.println("Digite o valor de d: ");
			d = ler.nextDouble();
			System.out.println("Digite o valor de e: ");
			e = ler.nextDouble();
			System.out.println("Digite o valor de f: ");
			f = ler.nextDouble();
			
			x = ((a*e)-(b*f))/((a*e)-(b*d));
			y = ((a*f)-(c*d))/((a*e)-(b*d));
			
			System.out.println("O resultado de x é: "+x);
			System.out.println("O resultado de y é: "+y);
					
		}
}
