package CLASSES;

import java.util.Scanner;

//Solicitar a qualquer tempo ou após os 10 movimentos o uso do emprestimo (limitado a R$ 10.000) levando o valor para o saldo.
public class ContaEmpresa extends Conta
{
	double emprestimoEmpresa = 10000;
	Scanner ler = new Scanner(System.in);
	
	public ContaEmpresa(int numero, String cpf, double emprestimoEmpresa) {
		super(numero, cpf);
		this.emprestimoEmpresa = emprestimoEmpresa;
	}
	
	public ContaEmpresa(int numero, String cpf, boolean ativa, double emprestimoEmpresa) {
		super(numero, cpf, ativa);
		this.emprestimoEmpresa = emprestimoEmpresa;
	}
	
	public ContaEmpresa(int numero, double emprestimoEmpresa) {
		super(numero);
		this.emprestimoEmpresa = emprestimoEmpresa;
	}

	public double getEmprestimoEmpresa() {
		return emprestimoEmpresa;
	}

	public void setEmprestimoEmpresa(double emprestimoEmpresa) {
		this.emprestimoEmpresa = emprestimoEmpresa;
	}
	
	public double pedirEmprestimo() {
		 double valor = 0.00;
	        if(valor>=emprestimoEmpresa) {
	        	valor = super.getSaldo();
	            super.credito(valor);
	        }
		return pedirEmprestimo();
	}
}