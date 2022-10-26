package practicoEspecial.filtros;

import practicoEspecial.Cancion;
import practicoEspecial.Elemento;

public class FiltroCancionFinal extends Criterio {

	private Cancion cancion;
	private int CantidadMiembros;
	
	public FiltroCancionFinal(Cancion cancion, int CantidadMiembros) {
		this.cancion = cancion;
		this.CantidadMiembros = CantidadMiembros;
	}

	@Override
	public boolean cumpleCon(Elemento pp) {
		return this.cancion.getPuedeSerInterpretadoFinal(pp, this.getCantidadMiembros());
	}

	public Cancion getCancion() {
		return this.cancion;
	}
	
	public int getCantidadMiembros() {
		return this.CantidadMiembros;
	}
}