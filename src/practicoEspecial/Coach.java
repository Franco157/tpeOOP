package practicoEspecial;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

import practicoEspecial.comparadores.ComparadorNot;
import practicoEspecial.filtros.Criterio;

public class Coach extends Banda {
	private Criterio criterioAceptacion;
	public Coach(String nombre, Criterio criterioAceptacion) {
		super(nombre);
		this.criterioAceptacion = criterioAceptacion;
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public ArrayList<Elemento> participantesCon(Criterio filtro) {
		ArrayList<Elemento> aux = new ArrayList<>();
		for (Elemento participante : this.getParticipantes()) {
			aux.addAll(participante.participantesCon(filtro));
		}
		return aux;
	}

	
	//generos coach, lista de generos sin repetir y ordenados
	@Override
	public ArrayList<String> getGeneros() {
		ArrayList<String> generos = new ArrayList<>();
		for (Elemento part : this.getParticipantes()) {
			for (String genero : part.getGeneros()) {
				if(!generos.contains(genero))
					generos.add(genero);
			}
		}
		Collections.sort(generos);
		return generos;
	}
	@Override
	public void addParticipante(Elemento pp1) {
		if(this.criterioAceptacion.cumpleCon(pp1))
			super.addParticipante(pp1);
	}
	
	public ArrayList<Elemento> getOrdenados(Comparator<Elemento> c1){
		ArrayList<Elemento> aux = new ArrayList<Elemento>(this.getParticipantes());
		Collections.sort(aux, new ComparadorNot(c1));
		return aux;
	}
	
	public Elemento getBatallador(Comparator<Elemento> comparadorBatalla) {
		if(this.getParticipantes().size() > 0)
			return this.getOrdenados(comparadorBatalla).get(0);
		else
			return null;
	}
	
	public void setCriterio(Criterio c1) {
		this.criterioAceptacion = c1;
	}

	

}
