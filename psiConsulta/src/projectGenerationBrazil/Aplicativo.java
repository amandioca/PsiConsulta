package projectGenerationBrazil;

import java.util.Scanner;

public class Aplicativo {

	public static void main(String[] args) {

		int x, veri = 0;
		String userV [] = {"amanda", "rafaela", "joao"};
		String senhaV [] = {"1234", "1212", "3232"};
		String user, senha;

		Scanner scan = new Scanner(System.in);

		System.out.print("Você é:" 
				+ "\n1- Paciente" 
				+ "\n2- Psicólogo" 
				+ "\nResposta: ");
		

		for (int y = 0; y < 1; y++) {
			x = scan.nextInt();
			
			// PACIENTE
			if (x == 1){	

				System.out.print("\nO que você deseja?" 
						+ "\n1- Login" 
						+ "\n2- Registre-se" 
						+ "\nResposta: ");
				x = scan.nextInt();

				// LOGIN
				if (x == 1) {

					do {
						System.out.print("\nInsira seu usuário:\n");
						user = scan.next();

						System.out.println("Insira sua senha:");
						senha = scan.next();

						System.out.print("\nusuário: " + user);
						System.out.print("\nsenha: " + senha);
						
						for(int cont = 0; cont < 3; cont++) {
							if(user.equals(userV[cont])) {
								veri = cont;
							}
						}
					}

					while (!user.equals(userV[veri]) || !senha.equals(senhaV[veri]));

					System.out.println("\nO que deseja fazer?" 
							+ "\n1- Consultas" 
							+ "\n2- Agendamentos" 
							+ "\nResposta: ");
				}
				
			} 
			
			//PSICÓLOGA(O)
			else if(x == 2) {
				System.out.println("funcionou");
				
			}
			
			else {
			
			System.out.println("Número inválido.\nInsira novamente:");
			y--;
			
			}
		}
	}
}