package Exemplos;

public class exemplo_for1 {
	//Desenvolver um sistema que efetue a soma de todos os n�meros �mpares que s�o
	//m�ltiplos de tr�s e que se encontram no conjunto dos n�meros de 1 at� 500.
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
