package EXEMPLOS2;
// repetição do while = faça enquanto
import java.util.Scanner;

public class testeextra2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner ler = new Scanner(System.in);
		int a, b = 0;
		String resp;

		do {
			System.out.println("Digite um número: ");
			a = ler.nextInt();
			b += a;
			System.out.println("Quer prosseguir ? ");
			resp = ler.next().toUpperCase();
		} while (resp.equals("S"));
		System.out.println("A soma dos valores é: "+ b);
	}

}
