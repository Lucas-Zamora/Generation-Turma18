package EXEMPLOS2;

public class teste03 {
		public static void main(String[] args) {
			int v0 = 3;
			int v1 = v0++;
			int v2 = ++v1;
			v1 += v0;
			v2 += --v1;
			
			System.out.println(v0 + " " + v1 + " " + v2);
		}
			
			/*int x, y; ------------- EX 4
			double z;

			x = 5;
			y = 2;
			z = x / y;
			System.out.print(z);
		}*/
			
			/*  for (int i = 1; i < 5; i++) {           -------EX 1 
				if (i==2) continue;
				System.out.print(" i = " + i); 
			}
		}*/
			/*   String nome = "João";        ----------EX 2
			   imprimeNome("Empty");
		}
		public static void imprimeNome(String nome) {
			   if(!nome.isEmpty()){
				    System.out.println("Tudo bem " + nome + "?");
			   } else { 
				    System.out.println("O nome é " + nome + "?");
			   }
		
	}*/
		/*int total = 0;                         ----------EX 3
		int c[] = new int[10];
		for (int i = 0; i < c.length; i++) {
			c[i] = i + i;
		}
		for (int i = 0; i < c.length; i++) {
			total += c[i];
		}
		System.out.println(total);
	}*/
}
