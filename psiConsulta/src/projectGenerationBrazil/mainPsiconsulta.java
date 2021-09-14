package projectGenerationBrazil;

import java.util.Scanner;

public class mainPsiconsulta extends Usuario {

	public static void main(String[] args) throws InterruptedException {
		
		Scanner scan = new Scanner(System.in);
				
		Paciente paciente = new Paciente();
			
		System.out.println("=====================================================");
		System.out.print("Para iniciarmos, responda o que você é: " 
				+ "\n1- Paciente            2- Psicólogo\n"
				+ ">>> ");
		

		for (int y = 0; y < 1; y++) {
			x = scan.nextInt();
			
			// PACIENTE
			if (x == 1) {
				
				paciente.chamaPaciente();
				
			}

			//PSICO (IMPLEMENTAÇÕES FUTURAS)
			
			System.out.println("*Número inválido*"
					+ "\nInsira novamente:");
			y--;		
		}
		
		scan.close();
	}
}

