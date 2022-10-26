package practicoEspecial;

import java.time.LocalDate;
import java.util.ArrayList;

import practicoEspecial.filtros.Criterio;

public class Participante extends Elemento implements Comparable<Participante>{

	private String apellido;
	private LocalDate fechaNacimiento;
	private ArrayList<String> generosMusicales;
	private ArrayList<String> idiomas;
	private ArrayList<String> instrumentos;
	
	public Participante(String nombre, String apellido, LocalDate fechaNacimiento) {
		super(nombre);
		this.apellido = apellido;
		this.fechaNacimiento = fechaNacimiento;
		
		this.generosMusicales = new ArrayList<>();
		this.idiomas = new ArrayList<>();
		this.instrumentos = new ArrayList<>();
	}


	public String getApellido() {
		return apellido;
	}
	
	@Override
	public double getEdad() {
		int edad;
		edad = LocalDate.now().getYear() - this.fechaNacimiento.getYear();
		if(!yaCumplio())
			edad--;
		return edad;
	}

	private boolean yaCumplio() {
		LocalDate hoy = LocalDate.now();
		if(hoy.getMonthValue() > this.fechaNacimiento.getMonthValue())
			return true;
		else if(hoy.getMonthValue() == this.fechaNacimiento.getMonthValue() && 
				hoy.getDayOfMonth() >= this.fechaNacimiento.getDayOfMonth())
			return true;
		return false;
	}

	public ArrayList<String> getGeneros() {
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
	public int getCantidad() {
		// TODO Auto-generated method stub
		return 1;
	}

	@Override
	public ArrayList<Elemento> participantesCon(Criterio c1) {
		ArrayList<Elemento> aux = new ArrayList<>();
		if(c1.cumpleCon(this))
			aux.add(this);
		return aux;
	}

	@Override
	public Elemento getCopy() {
		Participante pp1 = new Participante(this.getNombre(), this.getApellido(), this.getFechaNacimiento());
		
		for (String genero : this.getGeneros()) {
			pp1.addGeneroMusical(genero);
		}
		for (String instrumento : this.getInstrumentos()) {
			pp1.addInstrumento(instrumento);
		}
		for (String idioma : this.getIdiomas()) {
			pp1.addIdioma(idioma);
		}
		return pp1;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Nombre: "+this.getNombre()+" "+this.getApellido()+ "Edad: "+this.getEdad()+"Idiomas:" +this.getIdiomas()+"Instrumentos: "+this.getInstrumentos()+"Generos: "+this.getGeneros();
	}

	public LocalDate getFechaNacimiento() {
		return this.fechaNacimiento;
	}
	
	

}
