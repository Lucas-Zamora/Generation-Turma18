package Exemplos;

public class exemplo_for1 {
	//Desenvolver um sistema que efetue a soma de todos os números ímpares que são
	//múltiplos de três e que se encontram no conjunto dos números de 1 até 500.
		public static void main(String[] args) {
			int totalImpar = 0;
			
			for(int contador = 1; contador <= 500; contador++) {
				
				if(contador%3 == 0) {
					totalImpar = totalImpar + contador;
				}
			}
				System.out.println(totalImpar);
		}
}
