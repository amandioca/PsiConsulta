package projectGenerationBrazil;

import java.util.Scanner;

public class Aplicativo {

	public static void main(String[] args) {

		int x, veri = 0;
		String userV [] = {"amanda", "rafaela", "joao"};
		String senhaV [] = {"1234", "1212", "3232"};
		String user, senha;

		Scanner scan = new Scanner(System.in);

		System.out.print("Voc� �:" 
				+ "\n1- Paciente" 
				+ "\n2- Psic�logo" 
				+ "\nResposta: ");
		

		for (int y = 0; y < 1; y++) {
			x = scan.nextInt();
			
			// PACIENTE
			if (x == 1){	

				System.out.print("\nO que voc� deseja?" 
						+ "\n1- Login" 
						+ "\n2- Registre-se" 
						+ "\nResposta: ");
				x = scan.nextInt();

				// LOGIN
				if (x == 1) {

					do {
						System.out.print("\nInsira seu usu�rio:\n");
						user = scan.next();

						System.out.println("Insira sua senha:");
						senha = scan.next();

						System.out.print("\nusu�rio: " + user);
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
			
			//PSIC�LOGA(O)
			else if(x == 2) {
				System.out.println("funcionou");
				
			}
			
			else {
			
			System.out.println("N�mero inv�lido.\nInsira novamente:");
			y--;
			
			}
		}
	}
}