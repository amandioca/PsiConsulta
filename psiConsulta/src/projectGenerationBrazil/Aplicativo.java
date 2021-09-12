package projectGenerationBrazil;

import java.util.Scanner;

public class Aplicativo {

	public static void main(String[] args) throws InterruptedException {

		int x;
	
		Scanner scan = new Scanner(System.in);
		
		Dados dados = new Dados();
		Login login = new Login();
		
		System.out.print("Você é:" 
				+ "\n1- Paciente            2- Psicólogo\n"
				+ "Resposta: ");
		

		for (int y = 0; y < 1; y++) {
			x = scan.nextInt();
			
			// PACIENTE
			if (x == 1){	
				
				System.out.print("\nO que você deseja?" 
						+ "\n1- Login               2- Registro\n"
						+ "Resposta: ");
				x = scan.nextInt();

				// LOGIN
				if (x == 1) { 					
					login.fazLogin();
				}
				
				//REGISTRO
				else if (x == 2) {
					
					dados.imprimeDados();
					login.criaLogin();
					dados.imprimeDados();
				} 
			}
			
			//PSICÓLOGA(O)
			else if(x == 2) {
				System.out.println("funcionou");
				
			}
			
			else {
			
			System.out.println("*Número inválido*"
					+ "\nInsira novamente:");
			y--;
			
			}
		}
	}
}