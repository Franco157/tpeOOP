package practicoEspecial.filtros;

import java.util.ArrayList;

import practicoEspecial.Elemento;

public class FiltroIdioma extends Criterio {
	private ArrayList<String> idiomas;
	
	public FiltroIdioma(String idioma) {
		this.idiomas = new ArrayList<>();
		this.idiomas.add(idioma);
	}
	public void addIdioma(String idioma) {
		this.idiomas.add(idioma);
	}

	@Override
	public boolean cumpleCon(Elemento pp) {
		// TODO Auto-generated method stub
		return pp.getIdiomas().containsAll(this.idiomas);
	}

}
