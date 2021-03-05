package Lista5;

public class Cavalo extends Animal{

	public Cavalo(String nome, int idade) {
		super(nome, idade);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public String somEmitido(String somFeito) {
		return super.somEmitido(somFeito);
	}
	public String corre() {
		return "puf puf puf tap tap tap...";
	}
}
