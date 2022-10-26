package practicoEspecial.filtros;

import practicoEspecial.Elemento;

public class FiltroNot extends Criterio {
	private Criterio f1;
	public FiltroNot(Criterio f1) {
		this.f1 = f1;
	}

	@Override
	public boolean cumpleCon(Elemento pp) {
		// TODO Auto-generated method stub
		return !f1.cumpleCon(pp);
	}

}