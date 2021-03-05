package Lista5;

public class Exer1Animal {
	public static void main(String[] args) {
		
		Cachorro cao = new Cachorro("Springles",12);
		Cavalo cav = new Cavalo("Matilda",9);
		Preguica sono = new Preguica("Jacinto",20);
		
		System.out.println("Prazer, meu nome é "+cao.getNome());
		System.out.println("Minha idade em tempo normal é "+cao.getIdade()+" anos de vida.");
		System.out.println("Com licença, preciso uivar! "+cao.somEmitido("Auuuuuuuu"));
		System.out.println(cao.corre());
		
		for(int i = 0; i < 5; i++) 
		{
			System.out.println();
		}
		
		System.out.println("Olá meu querido, eu sou a "+cav.getNome());
		System.out.println("Tenho cerca de "+cav.getIdade()+" anos de vida.");
		System.out.println("Estou com uma coceira nas costas "+cav.somEmitido("hinn in in hinn in in"));
		System.out.println(cav.corre());
		
		for(int i = 0; i < 5; i++) 
		{
			System.out.println();
		}
		
		System.out.println("Oi....eu....sou...o..."+sono.getNome());
		System.out.println("Devo....ter....uns..."+sono.getIdade()+"...anos.");
		System.out.println("Est..ooou...com...tanto...sono.."+sono.somEmitido("Zzzzzzzz roonc"));
		System.out.println(sono.escalando());
	}
}
