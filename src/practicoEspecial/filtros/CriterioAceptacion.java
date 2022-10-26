package practicoEspecial.filtros;

import java.util.ArrayList;

import practicoEspecial.Elemento;

// FUNCIONA, PERO ESTA BIEN HECHO CON EL ARRAYLIST DE CRITERIOS?

public class CriterioAceptacion extends Criterio {
	private ArrayList<Criterio> criterios;
	
	public CriterioAceptacion(Criterio filtro) {
		this.criterios = new ArrayList<>();
		this.criterios.add(filtro);
		
	}
	public void cleanCriterios() {
		this.criterios = new ArrayList<>();
	}

	public void addCriterio(Criterio criterio) {
		this.criterios.add(criterio);
	}

	@Override
	public boolean cumpleCon(Elemento pp) {
		for (Criterio criterio : criterios) {
			if(!criterio.cumpleCon(pp))
				return false;
		}
		return true;
	}
	
}
