package Exemplos;

import java.util.Scanner;

public class ex_agendamatriz {
	public static void main (String[] args) {
		Scanner ler = new Scanner(System.in);
		String agenda[][] = new String [31][24];
		int dia = 0, hora = 0, atividades = 0;
		char opcao;
		
		do{
			System.out.println("Digite um número do dia [1-31] : ");
			dia = ler.nextInt();
			System.out.println("Digite a hora da ativadade [0-23] : ");
			hora = ler.nextInt();
			System.out.println("Digite a tarefa");
			agenda[dia-1][hora] = ler.next();
			System.out.println("Continua 1-Sim ou 2-Não : ");
			opcao = ler.next().charAt(0);
		}while (opcao == '1');
		
		for(int dias = 0; dias <agenda.length;dias++) {
			for(int horas = 0; horas<agenda[dias].length;horas++) {
				if(agenda[dias][horas]!=null) {
					System.out.println("Dia "+(dias+1)+" Hora: "+horas+" hrs: "+agenda[dias][horas]);
					atividades++;
				}
			}
		}
		System.out.println("Total de atividades cadastradas: "+atividades);
	}
}
