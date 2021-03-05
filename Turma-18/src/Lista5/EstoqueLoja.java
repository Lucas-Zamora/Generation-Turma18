package Lista5;

public class EstoqueLoja {
	private String produto;
	private int qtd;
	private double valor;
	
	public EstoqueLoja(String produto, int qtd, double valor) {
		super();
		this.produto = produto;
		this.qtd = qtd;
		this.valor = valor;
	}
	public String getProduto() {
		return produto;
	}
	public void setProduto(String produto) {
		this.produto = produto;
	}
	public int getQtd() {
		return qtd;
	}
	public void setQtd(int qtd) {
		this.qtd = qtd;
	}
	public double getValor() {
		return valor;
	}
	public void setValor(double valor) {
		this.valor = valor;
	}	
}
