package Lista1;

import java.util.Scanner;

public class exer8 {
	//8. O custo ao consumidor de um carro novo � a soma do custo de f�brica com a
		//percentagem do distribuidor e dos impostos (aplicados ao custo de f�brica).
		//Supondo que a percentagem do distribuidor seja de 28% e os impostos de 45%,
		//escrever um sistema que leia o custo de f�brica de um carro e escreva o custo ao
		//consumidor.
		
		public static void main (String [] arg) {
			double cf,cc,porc;
			Scanner ler = new Scanner(System.in);
			System.out.println("Insira o custo de f�brica: ");
			cf = ler.nextDouble();
			
			porc = (cf*0.28)+(cf*0.45);
			cc = cf + porc;
			
			System.out.println("O custo para o consumidor �: R$"+cc);
		}
}
