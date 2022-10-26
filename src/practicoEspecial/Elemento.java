package practicoEspecial;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

import practicoEspecial.filtros.Criterio;

public abstract class Elemento {
	protected String nombre;
	
	public Elemento(String nombre) {
		this.nombre = nombre;
	}
	public abstract ArrayList<String> getGeneros();
	public abstract ArrayList<String> getIdiomas();
	public abstract ArrayList<String> getInstrumentos();
	public abstract double getEdad();
	public abstract int getCantidad();
	public abstract Elemento getCopy();
	
	public abstract ArrayList<Elemento> participantesCon(Criterio criterio);
	
	public ArrayList<Elemento> participantesCon(Criterio criterio, Comparator<Elemento> comparador){
		ArrayList<Elemento> aux = new ArrayList<>();
		aux.addAll(this.participantesCon(criterio));
		Collections.sort(aux, comparador);
		return aux;
	}
	
	public String getNombre() {
		return nombre;
	}
	
	@Override
	public boolean equals(Object obj) {
		Elemento pp1 = (Elemento) obj;	
		return ( this.getNombre().equals(pp1.getNombre()) );
	}

	
}
