package CLASSES;

public class Conta {
    //atributos da classe Conta, dentro do pacote CLASSES: 
    private int numero;
    private String cpf;
    protected double saldo;
    private boolean ativa;


    //CONSTRUTORES
    public Conta(int numero, String cpf) {
        this.numero = numero;
        this.cpf = cpf;
    }

    public Conta(int numero) {
        this.numero = numero; 
    }

    public Conta(int numero, String cpf, boolean ativa) {
        this.numero = numero;
        this.cpf = cpf;
        this.ativa = ativa;
    }
    //ENCAPSULAMENTO
    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public double getSaldo() {
        return saldo;
    }

    //SET SALDO REMOVIDO. M�XIMA DO PROJETO
    public boolean isAtiva() {
        return ativa;
    }

    public void setAtiva(boolean ativa) {
        this.ativa = ativa;
    }

    //METODOS
    public void credito(double valor) {
        this.saldo = this.saldo + valor;
    }

    public void debito (double valor) { 
        if (this.saldo >= valor) {
        this.saldo = this.saldo - valor;
        System.out.printf("Saque de R$ %.2f. Retire seu dinheiro abaixo! \n", valor);
        System.out.println();
        System.out.printf("Saldo R$ %.2f \n", this.getSaldo());
        }
        else if (valor > saldo) {
            System.out.println("Saldo insuficiente. Procure um atendente ou fa�a um dep�sito na conta.");
        }
    }
}