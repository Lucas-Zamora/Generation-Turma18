package Lista1;

import java.util.Scanner;

public class exer5 {
	//5. Fa�a um sistema que leia as 3 notas de um aluno e calcule a m�dia final deste
		//aluno. Considerar que a m�dia � ponderada e que o peso das notas �: 2,3 e 5,
		//respectivamente.
		public static void main (String[] arg) {
			double n1,n2,n3,media;
			Scanner ler = new Scanner(System.in);
			
			System.out.println("Insira a primeira nota: ");
			n1 = ler.nextDouble();
			System.out.println("Insira a segunda nota: ");
			n2 = ler.nextDouble();
			System.out.println("Insira a terceira nota: ");
			n3 = ler.nextDouble();
			media = ((n1*2)+(n2*3)+(n3*5))/10;
			
			System.out.println("Sua m�dia ponderada �: "+media);
		}
}
