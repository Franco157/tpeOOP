package practicoEspecial.filtros;

import java.util.ArrayList;

import practicoEspecial.Elemento;


public class FiltroGenero extends Criterio {
	private ArrayList<String> generos;
	
	public FiltroGenero(String genero) {
		this.generos = new ArrayList<>();
		this.generos.add(genero);
	}
	public void addGenero(String genero) {
		this.generos.add(genero);
	}

	@Override
	public boolean cumpleCon(Elemento pp) {
		// TODO Auto-generated method stub
		return pp.getGeneros().containsAll(this.generos);
	}

}
