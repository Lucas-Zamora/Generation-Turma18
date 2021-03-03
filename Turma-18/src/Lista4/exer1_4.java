package Lista4;

import java.util.Scanner;

public class exer1_4 {
	//1) Crie uma classe cliente e apresente os atributos e métodos referentes
	//esta classe, em seguida crie um objeto cliente, defina as instancias deste
	//objeto e apresente as informações deste objeto no console.
	
	public static void main(String[] args) {
			Cliente conta = new Cliente("Lucas","Playstation 5",17809,4999, true);
			Scanner ler = new Scanner(System.in);
			
			conta.inicio();
			conta.meio();
			conta.fim();		
	}
}
