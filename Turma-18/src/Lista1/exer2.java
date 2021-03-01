package Lista1;

import java.util.Scanner;

public class exer2 {
public static void main(String[] args) {
	Scanner ler = new Scanner(System.in);
	int dias, meses, anos, dias2;
	System.out.println("Insira sua idade em dias: ");
	dias = ler.nextInt();
	anos = dias/365;
	meses = (dias%365)/30;
	dias2 = (dias%365)%30;
	System.out.println("Você tem: "+anos+" Anos, "+meses+" Meses e "+dias2+" Dias de vida!");
}
}
