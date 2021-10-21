package practicoEspecial;

import java.util.ArrayList;

public class Cancion {
	private String titulo;
	private String idioma;
	private ArrayList<String> generosMusicales;
	private ArrayList<String> instrumentosNecesarios;
	
	
	public Cancion(String titulo, String idioma) {
		this.titulo = titulo;
		this.idioma = idioma;
		this.generosMusicales = new ArrayList<>();
		this.instrumentosNecesarios = new ArrayList<>();
	}

	public String getTitulo() {
		return titulo;
	}
	public String getIdioma() {
		return idioma;
	}
	public ArrayList<String> getGenerosMusicales() {
		return new ArrayList<>(this.generosMusicales);
	}
	public ArrayList<String> getInstrumentosNecesarios() {
		return new ArrayList<>(this.instrumentosNecesarios);
	}
	public void addGeneroMusical(String genero) {
		if (!this.generosMusicales.contains(genero))
			this.generosMusicales.add(genero);
	}
	public void addInstrumentoNecesario(String instrumento) {
		if (!this.instrumentosNecesarios.contains(instrumento)) 
			this.instrumentosNecesarios.add(instrumento);
	}

	@Override
	public boolean equals(Object obj) {
		Cancion cc1 = (Cancion) obj;
		
		return this.getTitulo().equalsIgnoreCase(cc1.getTitulo());
	}
	

}
