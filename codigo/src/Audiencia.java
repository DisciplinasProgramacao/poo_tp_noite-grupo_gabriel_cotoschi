public class Audiencia {
	private Espectador espectador;
	private char FA;
	private Serie serie;

	public Audiencia(Espectador espectador, char FA, Serie serie) {
		this.espectador = espectador;
		this.FA = FA;
		this.serie = serie;
	}

	public Espectador getEspectador() {
		return espectador;
	}

	public char getFA() {
		return FA;
	}

	public Serie getSerie() {
		return serie;
	}

	@Override
	public String toString() {
		return "Audiencia{" + "espectador=" + espectador + ", FA='" + FA + '\'' + ", serie=" + serie + '}';
	}
}
