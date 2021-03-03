package Lista4;

public class Aviao {
	public String boeing;
	public String cor;
	int velocidadeM;
	int alcance;
	int altitude;
	double envergadura;
	int assentos;
	
	public Aviao(String boeing, String cor, int velocidadeM, int alcance, int altitude, double envergadura, int assentos) {
		super();
		this.boeing = boeing;
		this.cor = cor;
		this.velocidadeM = velocidadeM;
		this.alcance = alcance;
		this.altitude = altitude;
		this.envergadura = envergadura;
		this.assentos = assentos;
	}
	
	public void infor() {
		System.out.println("===========================================================================");
		System.out.println("                   A E R O P O R T O  A M A K H A                  ");
		System.out.println("===========================================================================");
		System.out.println(" O avião do tipo "+boeing+" "+cor+" tem diversas peculiaridades!");
		System.out.println("===========================================================================");
		System.out.println(" A velocidade máxima alcançada por ele é "+velocidadeM+"Km/h");
		System.out.println("===========================================================================");
		System.out.println(" Seu alcance é de: "+alcance+"Km/h e sua altitude é "+altitude+"ft");
		System.out.println("===========================================================================");
		System.out.println(" Sua envergardura é de "+envergadura+"m contando com "+assentos+" bons assentos.");
		System.out.println("===========================================================================");
	}
	
}
