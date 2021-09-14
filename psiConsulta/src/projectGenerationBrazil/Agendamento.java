package projectGenerationBrazil;

import java.util.Scanner;

public class Agendamento extends Usuario {
	
	int verificar;
	
	//String cidadeTemporaria = "";
	//String horarioTemporario = "";
	//String cidadeAgendada = "";
	//String horarioAgendado = "";
	String[] cidadeV = new String [3];
	String[] horarioV = new String [3];
	
	Scanner scan = new Scanner(System.in);
	
	public Agendamento () {	
		
		cidadeV[0] = "Santo André";
		cidadeV[1] = "São Bernardo";
		cidadeV[2] = "Mauá";
		
		horarioV[0] = "09h";
		horarioV[1] = "10h";	
		horarioV[2] = "11h";	
	}
	
	public void fazAgendamento() {
		
		do {
			
			for (int y = 0; y < 1; y++) {
				
				System.out.println("\n=====================================================");
				System.out.println("               --> AGENDAMENTO <--");
				System.out.println("\nPara agendar, escolha uma das opções.");
				System.out.print("\nCidades disponíveis:"
						+ "\n1- Santo André     "
						+ "2- São Bernardo     "
						+ "3- Mauá"
						+ "\n>>> ");
				cidade = scan.nextInt();
				
				if(cidade < 4 && cidade > 0) {
						
					System.out.print("\nHorários disponíveis:"
							+ "\n1- 09h     "
							+ "2- 10h     "
							+ "3- 11h"
							+ "\n>>> ");
					horario = scan.nextInt();
		
					if(horario < 4 && horario > 0) {
							
						for(int cont = 0; cont < 3; cont++) {
							if((cidade - 1) == cont) {
								
								cidadeTemporaria = cidadeV[cont];
							}
							
							if((horario - 1) == cont) {
								
								horarioTemporario = horarioV[cont];
							}
						}
						
						System.out.print("\n-> Cidade: " + cidadeTemporaria
								+ "\n-> Horário: " + horarioTemporario 
								+ "\n\nConfirma?"
								+ "\n1- Sim                 2- Não"
								+ "\n>>> ");
						x = scan.nextInt();
						
						if(x == 1) {
							
							cidadeTemporaria = cidadeAgendada;
							horarioTemporario = horarioAgendado;	
						}
						
						else {
							
							System.out.println("\n                  ***Tudo bem!***"
									+ "\n                  Vamos refazer o processo então.");	
						}
					}
					
					else {
						
						System.out.println("\n      ***Cidade ou horário não disponíveis***"
								+ "\n                 Insira uma das opções apresentadas.");
						y--;		
					}
				}

				else {
				
				System.out.println("\n      ***Cidade ou horário não disponíveis***"
						+ "\n                 Insira uma das opções apresentadas.");
				y--;
				
				}
			}
		}
		
		while(x == 2);
			
		System.out.println("\n       ***Agendamento feito com sucesso!!!***");

	}

	public int getVerificar() {
		return verificar;
	}

	public void setVerificar(int verificar) {
		this.verificar = verificar;
	}

	public String[] getCidadeV() {
		return cidadeV;
	}

	public void setCidadeV(String[] cidadeV) {
		this.cidadeV = cidadeV;
	}

	public String[] getHorarioV() {
		return horarioV;
	}

	public void setHorarioV(String[] horarioV) {
		this.horarioV = horarioV;
	}

	public Scanner getScan() {
		return scan;
	}

	public void setScan(Scanner scan) {
		this.scan = scan;
	}
}
