package projectGenerationBrazil;

public abstract class Usuario {
	
	protected static String cidadeTemporaria = "";
	protected static String horarioTemporario = "";
	protected static String cidadeAgendada = "";
	protected static String horarioAgendado = "";
	protected String user;
	protected String senha;
	protected static int x; //resposta do usuário
	protected int cidade;
	protected int horario;
	
	
	
	public static String getCidadeTemporaria() {
		return cidadeTemporaria;
	}

	public static void setCidadeTemporaria(String cidadeTemporaria) {
		Usuario.cidadeTemporaria = cidadeTemporaria;
	}

	public static String getHorarioTemporario() {
		return horarioTemporario;
	}

	public static void setHorarioTemporario(String horarioTemporario) {
		Usuario.horarioTemporario = horarioTemporario;
	}

	public static String getCidadeAgendada() {
		return cidadeAgendada;
	}

	public static void setCidadeAgendada(String cidadeAgendada) {
		Usuario.cidadeAgendada = cidadeAgendada;
	}

	public static String getHorarioAgendado() {
		return horarioAgendado;
	}

	public static void setHorarioAgendado(String horarioAgendado) {
		Usuario.horarioAgendado = horarioAgendado;
	}
	
	public String getUser() {
		return user;
	}
	
	public void setUser(String user) {
		this.user = user;
	}
	
	public String getSenha() {
		return senha;
	}
	
	public void setSenha(String senha) {

		this.senha = senha;
	}
	
	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}
	
	public int getCidade() {
		return cidade;
	}
	
	public void setCidade(int cidade) {
		this.cidade = cidade;
	}
	
	public int getHorario() {
		return horario;
	}
	
	public void setHorario(int horario) {
		this.horario = horario;
	}
}