package Lista4;

import java.util.Scanner;

public class exer6_4 {
	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		int num = 0;
		Banco conta = new Banco(1450,"670.890.905-89",true);
		double valor;
		char opcao;
		do {	
			System.out.println("Insira o número da sua conta:");
			num = ler.nextInt();
			if(num==conta.getNumero()) {
				System.out.println("Acesso Autorizado");
			}else {
				System.out.println("Acesso Negado, tente novamente.");
			}
		}while(num!=conta.getNumero());

		System.out.println("Debito ou credito? D/C:");
		opcao = ler.next().toUpperCase().charAt(0);
		System.out.println("Digite o valor: ");
		valor = ler.nextDouble();
		if(opcao == 'D') {
			conta.debito(valor);
		}
		else if(opcao == 'C') {
			conta.credito(valor);
		}else {
			System.out.println("Opção invalida!");
		}
		
		System.out.println("Saldo atual: R$"+conta.getSaldo());
	}
}
