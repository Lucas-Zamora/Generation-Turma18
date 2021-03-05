package APLICACAO;

import java.util.Scanner;

import CLASSES.Conta;
import CLASSES.ContaEmpresa;
import CLASSES.ContaEspecial;

public class Teste {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		
		System.out.println("Digite o numero da conta: ");
		int numero = ler.nextInt();
		System.out.println("DIgite o cpf da conta: ");
		String cpf = ler.next();
		System.out.println("Digite 1- conta ativa ou 2 - conta inativa");
		char tipo = ler.next().charAt(0);
		boolean ativa;
		if(tipo =='1')
		{
			ativa = true;
		}else {
			ativa = false;
		}
			
		System.out.println("CONTA NORMAL OU ESPECIAL:");
		char contaTipo = ler.next().toUpperCase().charAt(0);
		if (contaTipo == 'E') {
		System.out.println("Digite o limite da conta: ");
		double limite = ler.nextDouble();
		ContaEspecial cli = new ContaEspecial(numero,cpf,ativa,limite);	
		}else {
		Conta cliN = new Conta(numero,cpf,ativa);
		}
		Conta conta3 = new Conta(345,"111.111.111-22",true);
		ContaEspecial cliEspecial1 = new ContaEspecial(555,1000);
		double valor;
		char opcao;
		System.out.println("Digite o valor: ");
		valor = ler.nextDouble();
		System.out.println("Debito ou credito? D/C:");
		opcao = ler.next().toUpperCase().charAt(0);
		if(opcao == 'D') {
		conta3.debito(valor);
		}
		else if(opcao == 'C') {
		conta3.credito(valor);
		}else {
		System.out.println("Opção invalida!");
		}
	
	System.out.println("Saldo atual: R$"+conta3.getSaldo());
	System.out.println("Limite:"+cliEspecial1.getLimite());
	}
}

//Conta contaTeste = new Conta(numero,cpf,ativa);
//System.out.println("Digite o limite da conta: ");
//double limite = ler.nextDouble();
//ContaEspecial contaTeste = new ContaEspecial(numero,cpf,ativa,limite);	