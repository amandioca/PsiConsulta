package projectGenerationBrazil;

import java.util.Scanner;

public class Aplicativo {

	public static void main(String[] args) throws InterruptedException {

		int x;
	
		Scanner scan = new Scanner(System.in);
		
		Dados dados = new Dados();
		Login login = new Login();
		
		System.out.print("Voc� �:" 
				+ "\n1- Paciente            2- Psic�logo\n"
				+ "Resposta: ");
		

		for (int y = 0; y < 1; y++) {
			x = scan.nextInt();
			
			// PACIENTE
			if (x == 1){	
				
				System.out.print("\nO que voc� deseja?" 
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
			
			//PSIC�LOGA(O)
			else if(x == 2) {
				System.out.println("funcionou");
				
			}
			
			else {
			
			System.out.println("*N�mero inv�lido*"
					+ "\nInsira novamente:");
			y--;
			
			}
		}
	}
}