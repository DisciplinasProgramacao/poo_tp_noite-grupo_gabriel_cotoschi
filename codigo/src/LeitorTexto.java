import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class LeitorTexto {
	
	static String caminhoEspectadores = "POO_Espectadores.csv";
	//String caminhoSeries = "POO_Series.csv";
	//String caminhoAudiencia = "POO_Audiencia.csv";

	public static List<Espectador> lerArquivo(String arquivo) {
		
		List<Espectador> espectadores = new ArrayList<>();

		try (BufferedReader br = new BufferedReader(new FileReader(arquivo))) {
			
			String linha;

			while ((linha = br.readLine()) != null) {
				
				String[] valores = linha.split(";");
				Espectador spec = new Espectador(valores[0], valores[1], valores[2]);
				espectadores.add(spec);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}

		return espectadores;
	}
	
	
	public static List<Espectador> ImportarTextos() {
		List<Espectador> list = lerArquivo(caminhoEspectadores);
		//List<Serie> series = lerArquivo(caminhoSeries);
		//List<Audiencia> audiencia = lerArquivo(caminhoAudiencia);
		
		return list;
	}

}
