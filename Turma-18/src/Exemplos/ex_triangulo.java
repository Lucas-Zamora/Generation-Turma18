package Exemplos;

import java.util.Scanner;

public class ex_triangulo {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int base1, altura1, base2, altura2, base3, altura3;
		int area1,area2,area3,areaMaior=0;
		
		System.out.println("Digite a base do primeiro triangulo: ");
		base1 = ler.nextInt();
		System.out.println("Digite a altura do primeiro triangulo: ");
		altura1 = ler.nextInt();
		System.out.println("Digite a base do segundo triangulo: ");
		base2 = ler.nextInt();
		System.out.println("Digite a altura do segundo triangulo: ");
		altura2 = ler.nextInt();
		System.out.println("Digite a base do terceiro triangulo: ");
		base3 = ler.nextInt();
		System.out.println("Digite a altura do terceiro triangulo: ");
		altura3 = ler.nextInt();
		
			area1 = (base1*altura1)/2;
			System.out.printf("Area do primeiro triangulo é: %d \n",area1);	

			area2 = (base2*altura2)/2;
			System.out.printf("Area do segundo triangulo é: %d \n",area2);

			area3 = (base3*altura3)/2;
			System.out.printf("Area do terceiro triangulo é: %d \n",area3);
			
			if(area1>area2 && area1>area3) {
				areaMaior = area1;
			}
			if(area2>area1 && area2>area3) {
				areaMaior = area2;
			}
			if(area3>area2 && area3>area1) {
				areaMaior = area3;
			}
			System.out.printf("A base do 1º triangulo é %d e sua altura é %d. Sua area é : %d \n",base1,altura1,area1);
			System.out.printf("A base do 2º triangulo é %d e sua altura é %d. Sua area é : %d \n",base2,altura2,area2);
			System.out.printf("A base do 3º triangulo é %d e sua altura é %d. Sua area é : %d \n",base3,altura3,area3);
			System.out.printf("A maior area é: %d",areaMaior);
	}
}
