package Exemplos;

import java.util.Scanner;
//fibonacci exemplo
public class ex_guanabara3 {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		int c,t1=0,t2=1,t3;
		
		System.out.println(t1);
		System.out.println(t2);
		
		for(c=3;c<=15;c++) 
		{
			t3 = t1 + t2;
			System.out.println(t3);
			t1=t2;
			t2=t3;
		}
	}
}
