import java.util.List;

public class Main {

	public static void main(String[] args) {
		
		List<Espectador> espectadores = LeitorTexto.ImportarTextos();
		
		for(Espectador spec : espectadores) {
			System.out.println(spec.toString());
		}
	}

}
