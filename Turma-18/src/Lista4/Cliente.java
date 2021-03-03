package Lista4;
//1) Crie uma classe cliente e apresente os atributos e métodos referentes
//esta classe, em seguida crie um objeto cliente, defina as instancias deste
//objeto e apresente as informações deste objeto no console.
public class Cliente {

	public String titular, NomeP;
	int numeroDoProduto;
	int valorD;
	int saldoR;
	boolean status=true;
	
	public Cliente(String titular, String nomeP, int numeroDoProduto,int valorD, boolean status) {
		super();
		this.titular = titular;
		NomeP = nomeP;
		this.numeroDoProduto = numeroDoProduto;
		this.valorD = valorD;
		this.status = status;
	}
	public void inicio() {
		System.out.println("Olá "+titular+"!!\nSeja Bem vindo ao central de atendimento das Casas Paulistanas");
	}
	public void meio() {
		System.out.println("Obrigado por comprar conosco, aqui está o recibo da sua compra:");
		System.out.println("---------------------------------------------------------------------------");
		System.out.println("          R      E      C      I      B       O                ");
		System.out.println("---------------------------------------------------------------------------");
		System.out.println(" Pedido "+numeroDoProduto+" com relação a: "+NomeP+", de preço R$"+valorD+".");
		System.out.println("---------------------------------------------------------------------------");
	}
	public void fim() {
		System.out.println(" Obrigado por comprar conosco! Volte sempre!");
		System.out.println("---------------------------------------------------------------------------");
	}
}
