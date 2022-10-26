package practicoEspecial.filtros;

import practicoEspecial.Cancion;
import practicoEspecial.Elemento;


public class FiltroCancion extends Criterio {
	private Cancion cancion;
	
	public FiltroCancion(Cancion cancion) {
		this.cancion = cancion;
	}
	
	@Override
	public boolean cumpleCon(Elemento pp) {
		return cancion.getPuedeSerInterpretado(pp);
	}

	public Cancion getCancion() {
		return cancion;
	}

}
