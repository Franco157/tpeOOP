package practicoEspecial;

import java.util.ArrayList;
import practicoEspecial.filtros.*;

public class Banda extends Elemento {
	  ArrayList<Elemento> participantes;

	
	public Banda(String nombre) {
		super(nombre);
		this.participantes = new ArrayList<>();
	}
	
	@Override
	public ArrayList<Elemento> participantesCon(Criterio filtro) {
		ArrayList<Elemento> aux = new ArrayList<>();
		if(filtro.cumpleCon(this)) {
			aux.add(this);
			return aux;
		}
		for (Elemento participante : this.participantes) {
			aux.addAll(participante.participantesCon(filtro));
		}
		return aux;
	}
	
	
	public ArrayList<String> getGeneros() {
		ArrayList<String> generos = new ArrayList<>();
		Elemento part = this.participantes.get(0);
			for (String genero : part.getGeneros()) {
				int repeticion = 0;
				for (Elemento pp : this.participantes) {
					if(pp.getGeneros().contains(genero))
						repeticion++;
					if(repeticion == this.getCantidad() && !generos.contains(genero))
						generos.add(genero);	
				}
			}
		return generos;
	}

	@Override
	public ArrayList<String> getInstrumentos() {
		ArrayList<String> aux = new ArrayList<>();
		for (Elemento participante : this.participantes) {
			for (String instrumento : participante.getInstrumentos()) {
				if(!aux.contains(instrumento))
					aux.add(instrumento);
			}
		}
		return aux;
	}
	
	@Override
	public ArrayList<String> getIdiomas() {
		ArrayList<String> aux = new ArrayList<>();
		for (Elemento participante : this.participantes) {
			for (String idioma : participante.getIdiomas()) {
				if(!aux.contains(idioma))
					aux.add(idioma);
			}
		}
		return aux;
	}

	@Override
	public double getEdad() {
		return this.getSumaEdad()/this.getCantidad();
		
	}
	private double getSumaEdad() {
		double aux = 0;
		for (Elemento pp : participantes) {
			aux += pp.getEdad();
		}
		return aux;
	}

	@Override
	public int getCantidad() {
		int cantidad = 0;
		for (Elemento elemento : participantes) {
			cantidad+=elemento.getCantidad();
		}
		return cantidad;
	}
	
	@Override
	public Elemento getCopy() {
		Banda pp1 = new Banda(this.getNombre());
		for (Elemento participante: this.getParticipantes()) {
			pp1.addParticipante(participante.getCopy());
		}
		return pp1;
	}
	
	public void addParticipante(Elemento pp1) {
		if (!this.participantes.contains(pp1))
				this.participantes.add(pp1);
	}
	

	public ArrayList<Elemento> getParticipantes() {
		return new ArrayList<>(this.participantes);
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Nombre: "+this.getNombre()+"Participantes: "+this.getParticipantes();
	}
	
	
}
