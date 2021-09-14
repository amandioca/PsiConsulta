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
		
		cidadeV[0] = "Santo Andr�";
		cidadeV[1] = "S�o Bernardo";
		cidadeV[2] = "Mau�";
		
		horarioV[0] = "09h";
		horarioV[1] = "10h";	
		horarioV[2] = "11h";	
	}
	
	public void fazAgendamento() {
		
		do {
			
			for (int y = 0; y < 1; y++) {
				
				System.out.println("\n=====================================================");
				System.out.println("               --> AGENDAMENTO <--");
				System.out.println("\nPara agendar, escolha uma das op��es.");
				System.out.print("\nCidades dispon�veis:"
						+ "\n1- Santo Andr�     "
						+ "2- S�o Bernardo     "
						+ "3- Mau�"
						+ "\n>>> ");
				cidade = scan.nextInt();
				
				if(cidade < 4 && cidade > 0) {
						
					System.out.print("\nHor�rios dispon�veis:"
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
								+ "\n-> Hor�rio: " + horarioTemporario 
								+ "\n\nConfirma?"
								+ "\n1- Sim                 2- N�o"
								+ "\n>>> ");
						x = scan.nextInt();
						
						if(x == 1) {
							
							cidadeTemporaria = cidadeAgendada;
							horarioTemporario = horarioAgendado;	
						}
						
						else {
							
							System.out.println("\n                  ***Tudo bem!***"
									+ "\n                  Vamos refazer o processo ent�o.");	
						}
					}
					
					else {
						
						System.out.println("\n      ***Cidade ou hor�rio n�o dispon�veis***"
								+ "\n                 Insira uma das op��es apresentadas.");
						y--;		
					}
				}

				else {
				
				System.out.println("\n      ***Cidade ou hor�rio n�o dispon�veis***"
						+ "\n                 Insira uma das op��es apresentadas.");
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
