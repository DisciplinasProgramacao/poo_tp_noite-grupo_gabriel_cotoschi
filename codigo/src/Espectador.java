public class Espectador {
	private String nome;
	private String login;
	private String senha;

	public Espectador(String nome, String login, String senha) {
		this.nome = nome;
		this.login = login;
		this.senha = senha;
	}

	public String getNome() {
		return nome;
	}

	public String getLogin() {
		return login;
	}

	public String getSenha() {
		return senha;
	}

	@Override
	public String toString() {
		return "Espectador{" + "nome='" + nome + '\'' + ", login='" + login + '\'' + ", senha='" + senha + '\'' + '}';
	}
}
