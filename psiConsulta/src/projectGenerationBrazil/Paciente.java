package projectGenerationBrazil;

import java.util.Scanner;

public class Paciente extends Usuario {
	
	Scanner scan = new Scanner(System.in);
	
	Dados dados = new Dados();
	Login login = new Login();
	Agendamento agendamento = new Agendamento();
	
	public Paciente () {
		
	}
	
	public void chamaPaciente() throws InterruptedException {
		
		System.out.print("\nO que você deseja?" 
				+ "\n1- Login               2- Cadastre-se"
				+ "\n>>> ");
		x = scan.nextInt();

		// LOGIN
		if (x == 1) { 
			
			login.fazLogin();
		}

		//CADASTRO
		else if (x == 2) {
			
			login.criaLogin();							
		} 
		
		do {
			System.out.println("\n=====================================================");
			System.out.println("                   --> MENU <--");
			System.out.print("\nO que deseja fazer?" 
					+ "\n1- Consultas agendadas          "
					+ "2- Agendar consulta" 
					+ "\n>>> ");
			x = scan.nextInt();
			
			//>>>>>>>>>>>CONSULTAS AGENDADAS
			if (x == 1) {
				
				Usuario.setCidadeAgendada(cidadeTemporaria);
				System.out.println("teste: " + Usuario.getCidadeAgendada());
				
				
				
				
				/*System.out.print("\nVocê tem uma consulta marcada para:"
						+ "\nDia: 20/09/21"
						+ "\nHora: 17h"
						+ "\nLocal: cidade de Maua"
						+ "\nCom o Dr. Joao.\n");*/
			}
			
			//AGENDAR CONSULTA
			if (x == 2) {
				
				agendamento.fazAgendamento();
			}
			System.out.println("\n=====================================================");
			System.out.print("\nVocê deseja: "
					+ "\n1- Voltar ao MENU          "
					+ "2- Sair"
					+ "\n>>> ");
			x = scan.nextInt();
					
		}

		while (x == 1);
		System.out.println("\n=====================================================");
		System.out.println("                  ***Até logo!***");
	}
}
