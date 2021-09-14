package projectGenerationBrazil;

public class Dados {
	
	String userV[] = new String[5];
	String senhaV[] = new String[5];
	
	public Dados() {		
		
		userV[0] = "joao";
		userV[1] = "evelyn";
		userV[2] = "pablo";
		userV[3] = "";
		userV[4] = "rafa";
		
		senhaV[0] = "3232";
		senhaV[1] = "4545";
		senhaV[2] = "0000";
		senhaV[3] = "";
		senhaV[4] = "1000";		
	}
	
	public void imprimeDados() {
		
		System.out.println("\nimprimindo usuários e senhas:");
		
		for(int cont = 0; cont < 5; cont++) {
			if(!userV[cont].equals("")) {					
				System.out.println(userV[cont] + "        |  " + senhaV[cont]);		
				
				}
			}
		}
	
	public String getUserV(int i) {	
		return userV[i];
	}

	public void setUserV(String userV, int i) {
		this.userV[i] = userV;
	}

	public String getSenhaV(int i) {
		return senhaV[i];
	}

	public void setSenhaV(String senhaV, int i) {
		this.senhaV[i] = senhaV;
	}		
}