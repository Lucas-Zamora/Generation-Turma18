package Lista1;
import java.util.Scanner;
//1. Faça um sistema que leia a idade de uma pessoa expressa em anos, meses e
//dias e mostre-a expressa apenas em dias.
public class exer1 {
public static void main(String[] args) {
	Scanner ler = new Scanner(System.in);
	int a,b,c,soma;
	System.out.println("Insira os anos da pessoa: ");
	a = ler.nextInt();
	System.out.println("Insira os meses da pessoa: ");
	b = ler.nextInt();
	System.out.println("Insira os dias da pessoa: ");
	c = ler.nextInt();
	soma = (a*365)+(b*30)+c;
	System.out.println("Sua idade em dias é: "+soma);	
}
}

