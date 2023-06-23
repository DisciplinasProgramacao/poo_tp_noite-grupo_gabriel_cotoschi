import java.util.ArrayList;
import java.util.List;

public class Serie {
    private String nome;
    private String idioma;
    private String genero;
    private List<Cliente> assistiram;

    public Serie(String nome, String idioma, String genero) {
        this.nome = nome;
        this.idioma = idioma;
        this.genero = genero;
        this.assistiram = new ArrayList<>();
    }

    public void cadastrarView(Cliente cliente) {
        if (!assistiram.contains(cliente)) {
            assistiram.add(cliente);
        }
    }

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getIdioma() {
		return idioma;
	}

	public void setIdioma(String idioma) {
		this.idioma = idioma;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public List<Cliente> getAssistiram() {
		return assistiram;
	}

	public void setAssistiram(List<Cliente> assistiram) {
		this.assistiram = assistiram;
	}

}