package practicoEspecial;

import java.util.ArrayList;

import practicoEspecial.filtros.*;

public class Cancion {
	
	private String titulo;
	private String idioma;
	private ArrayList<String> generosMusicales;
	private ArrayList<String> instrumentosNecesarios;
	

	public Cancion(String titulo, String idioma, String genero) {
		this.titulo = titulo;
		this.idioma = idioma;
		this.generosMusicales = new ArrayList<>();
		this.instrumentosNecesarios = new ArrayList<>();
		this.generosMusicales.add(genero);

	}
	public boolean getPuedeSerInterpretado(Elemento p) {
		if(p.getIdiomas().contains(this.idioma)) {
			for(String g: p.getGeneros()) {
				if(this.generosMusicales.contains(g))
					return true;
			}
		}
		return false;
	}
	
	public boolean getPuedeSerInterpretadoFinal(Elemento p, int cantMiembros) {
		boolean aux = this.getPuedeSerInterpretado(p);
		ArrayList<Elemento> auxAr = new ArrayList<Elemento>();
		
		if (aux == true && cantMiembros <= p.getCantidad()) {
			for(String instrumento: this.instrumentosNecesarios) {
				ArrayList<Elemento> participantes = p.participantesCon(new FiltroInstrumento(instrumento));
				for(Elemento part: participantes) {
					if(!auxAr.contains(part))
						auxAr.add(part);
				}
			}
			if(auxAr.size() >= cantMiembros)
				return true;
		}
		return false;
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
		
		return ( this.getTitulo().equalsIgnoreCase(cc1.getTitulo()) && this.getIdioma().equalsIgnoreCase(cc1.getIdioma()) );
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return this.getTitulo()+" en idioma "+this.getIdioma();
	}
	

}
