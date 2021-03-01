package Lista1;

import java.util.Scanner;

public class exer6 {
	//Construa um programa em c que, tendo como dados de entrada dois pontos
		//quaisquer no plano, P(x1, y1) e P(x2, y2), escreva a distância entre eles. A fórmula
		//que efetua tal cálculo é: d = raiz de (x2-x1)²+(y2-y1)²

		public static void main (String[] arg) {
			double d,p1,p2;
			double x1,x2,y1,y2;
			
			Scanner ler = new Scanner(System.in);
			System.out.println("Insira o valor do primeiro ponto (x1):");
			x1 = ler.nextDouble();
			System.out.println("Insira o valor do primeiro ponto (y1):");
			y1 = ler.nextDouble();
			System.out.println("Insira o valor do segundo ponto (x2):");
			x2 = ler.nextDouble();
			System.out.println("Insira o valor do segundo ponto (y2):");
			y2 = ler.nextDouble();
			
			p1 = (x2-x1);
			p2 = (y2-y1);
			p1 = Math.pow(p1,2);
			p2 = Math.pow(p2,2); 
			d = Math.sqrt((p1+p2));		
			
			System.out.printf("A diferença entre os pontos é: %.2f" , d);
		}
}
