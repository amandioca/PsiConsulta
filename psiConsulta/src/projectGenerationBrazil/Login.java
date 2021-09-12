package projectGenerationBrazil;

import java.util.Scanner;

public class Login extends Usuario {
	
	int verificar;
	Scanner scan = new Scanner(System.in);
	
	Dados dados = new Dados();
	
	public Login () {	
		//System.out.println("abrir a classe login");
	}
	
	///////////////////////////// FAZ LOGIN /////////////////////////////
	public void fazLogin() throws InterruptedException {
		
		System.out.print("\n=====================================================");
		
		do {
			System.out.print("\nInsira seu usuário: ");
			user = scan.next();

			System.out.print("Insira sua senha: ");
			senha = scan.next();

			for (int cont = 0; cont < 5; cont++) {
				if (user.equals(dados.getUserV(cont))) {
					verificar = cont;
				}
			}
			
			if (!user.equals(dados.getUserV(verificar)) || !senha.equals(dados.getSenhaV(verificar))) {
				
				System.out.println("\n*Usuário ou senha inválidos*"
						+ "\nTente novamente.");
			}
			
			if(user.equals(dados.getUserV(verificar)) && senha.equals(dados.getSenhaV(verificar))) {
				
				System.out.print("\nEntrando");
				
				for(int cont = 0; cont < 5; cont++) {
					System.out.print(".");
					Thread.sleep(750);	
				}	
				System.out.println("\nLogin efetuado com sucesso!!!");
			}
		} 
	
		while (!user.equals(dados.getUserV(verificar)) || !senha.equals(dados.getSenhaV(verificar)));
	}
	
	///////////////////////////// CRIA LOGIN /////////////////////////////
	public void criaLogin() {
		
		String senhaConfere;
		
		System.out.print("\n=====================================================");
		System.out.print("\nPara se registrar, insira as seguintes informações:"
				+ "\n\nUsuário: ");
		user = scan.next();
		
		do {
			System.out.print("Senha: ");
			senha = scan.next();					
			
			System.out.print("Confirmação de senha: ");
			senhaConfere = scan.next();
			
			if (!senha.equals(senhaConfere)) {
				System.out.println("\n*As senhas inseridas são diferentes*"
						+ "\nInsira novamente.\n");			
			}										
		}
		
		while(!senha.equals(senhaConfere));
		
		for(int cont = 0; cont < 5; cont++) {
			if(dados.getUserV(cont).equals("")) {
				
				dados.setUserV(user, cont);
				dados.setUserV(senha, cont);
								
				break;
			}
		}	
	}
}