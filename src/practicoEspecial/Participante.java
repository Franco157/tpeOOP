package practicoEspecial;

import java.time.LocalDate;
import java.util.ArrayList;

public class Participante implements Comparable<Participante>{
	private String nombre;
	private String apellido;
	private LocalDate fechaNacimiento;
	private ArrayList<String> generosMusicales;
	private ArrayList<String> idiomas;
	private ArrayList<String> instrumentos;
	
	public Participante(String nombre, String apellido, LocalDate fechaNacimiento) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.fechaNacimiento = fechaNacimiento;
		
		this.generosMusicales = new ArrayList<>();
		this.idiomas = new ArrayList<>();
		this.instrumentos = new ArrayList<>();
	}

	public String getNombre() {
		return nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public LocalDate getFechaNacimiento() {
		return fechaNacimiento;
	}

	public ArrayList<String> getGenerosMusicales() {
		return new ArrayList<>(this.generosMusicales);
	}

	public ArrayList<String> getIdiomas() {
		return new ArrayList<>(this.idiomas);
	}

	public ArrayList<String> getInstrumentos() {
		return new ArrayList<>(this.instrumentos);
	}
	public void addGeneroMusical(String genero) {
		if (!this.generosMusicales.contains(genero))
			this.generosMusicales.add(genero);
	}
	public void addIdioma(String idioma) {
		if (!this.idiomas.contains(idioma)) {
			this.idiomas.add(idioma);
		}
	}
	public void addInstrumento(String instrumento) {
		if (!this.instrumentos.contains(instrumento)) 
			this.instrumentos.add(instrumento);
	}

	@Override
	public int compareTo(Participante o) {
		int aux = this.getApellido().compareTo(o.getApellido());
		if (aux == 0) 
			return this.getNombre().compareTo(o.getNombre());
		return aux;
	}

	@Override
	public boolean equals(Object obj) {
		Participante pp1 = (Participante) obj;	
		return ( this.getApellido().equals(pp1.getApellido()) ) &&
				( this.getNombre().equals(pp1.getNombre()) );
	}
	
	

}
