package practicoEspecial.filtros;

import practicoEspecial.Elemento;

public class FiltroEdad extends Criterio {
	private int edad;
	
	public FiltroEdad(int edad) {
		this.edad = edad;
	}

	@Override
	public boolean cumpleCon(Elemento pp) {
		// TODO Auto-generated method stub
		return pp.getEdad() > this.edad;
	}

}
