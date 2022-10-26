package practicoEspecial.filtros;

import practicoEspecial.Elemento;


public class FiltroAnd extends Criterio {
	private Criterio f1;
	private Criterio f2;
	
	public FiltroAnd(Criterio f1, Criterio f2) {
		this.f1 = f1;
		this.f2 = f2;
		
	}

	@Override
	public boolean cumpleCon(Elemento pp) {
		// TODO Auto-generated method stub
		return f1.cumpleCon(pp) && f2.cumpleCon(pp);
	}

}
