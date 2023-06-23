import java.util.ArrayList;
import java.util.List;

public class ListaSeries {
    private ArrayList<Serie> validar;
    private ArrayList<Serie> assistiu;

    public ListaSeries() {
        this.validar = new ArrayList<>();
        this.assistiu = new ArrayList<>();
    }

    public Serie procurarAssistida(Serie serie) {
        for (Serie s : assistiu) {
            if (s.getNome().equals(serie.getNome())) {
                return s;
            }
        }

        return null;
    }

    public Serie procurarSerie(Serie serie) {
        for (Serie s : validar) {
            if (s.getNome().equals(serie.getNome())) {
                return s;
            }
        }

        return null;
    }
}