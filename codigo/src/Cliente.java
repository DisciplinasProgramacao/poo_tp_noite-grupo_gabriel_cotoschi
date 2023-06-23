import java.util.ArrayList;
import java.util.List;

public class Cliente {
	private String login;
	private List<Serie> seriesAssistidas;
	private List<Serie> seriesFuturas;

	public Cliente(String login) {
		this.login = login;
		this.seriesAssistidas = new ArrayList<>();
		this.seriesFuturas = new ArrayList<>();
	}

	public List<Serie> realizarBusca(String nome, String genero, String idioma) {
		List<Serie> resultados = new ArrayList<>();

		for (Serie serie : seriesAssistidas) {
			if (serie.getNome().equalsIgnoreCase(nome) && serie.getGenero().equalsIgnoreCase(genero)
					&& serie.getIdioma().equalsIgnoreCase(idioma)) {
				resultados.add(serie);
			}
		}

		return resultados;
	}

	public void adicionarSeries(Serie serie) {
		if (!seriesAssistidas.contains(serie) && !seriesFuturas.contains(serie)) {
			seriesFuturas.add(serie);
		}
	}
}