package Lista1;

import java.util.Scanner;

public class exer3 {
public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int hora, minuto, segundo, segundo2;
		
		System.out.println("Qual foi a duração do evento em segundos? ");
		segundo = ler.nextInt();
		hora = segundo/3600;
		minuto = (segundo%3600)/60;
		segundo2 = (segundo%3600)%60;
		System.out.println("A duração exata em horas, minutos e segundos foi: "+hora+" Hrs, "+minuto+" Min, "+segundo2+" Seg.");
}
}
