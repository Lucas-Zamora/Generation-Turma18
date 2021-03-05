package Lista5;

public class Cachorro extends Animal{

	public Cachorro(String nome, int idade) {
		super(nome, idade);
	}
	
	@Override
	public String somEmitido(String somFeito) {
		return super.somEmitido(somFeito);
	}
	public String corre() {
		return "puf puf puf tap tap tap...";
	}
	
}
