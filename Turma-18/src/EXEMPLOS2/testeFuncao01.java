package EXEMPLOS2;

public class testeFuncao01 {

	//static void soma(int a, int b) 
	static int soma(int a,int b)
	{
		int s = a + b;
		return s;
		//System.out.println("A Soma é " + s);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Começou o programa!");
		//soma(5, 2);
		int sm = soma(5,2);
		System.out.println("A soma vale " + sm);
	}

}
// ctrl + shift + f para ajustar 