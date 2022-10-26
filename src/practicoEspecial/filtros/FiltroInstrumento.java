package practicoEspecial.filtros;

import java.util.ArrayList;

import practicoEspecial.Elemento;

public class FiltroInstrumento extends Criterio {
	private ArrayList<String> instrumentos;
	
	public FiltroInstrumento(String instrumento) {
		this.instrumentos = new ArrayList<>();
		this.instrumentos.add(instrumento);
	}
	public void addInstrumento(String instrumento) {
		this.instrumentos.add(instrumento);
	}
	@Override
	public boolean cumpleCon(Elemento pp) {
		// TODO Auto-generated method stub
		return pp.getInstrumentos().containsAll(this.instrumentos);
	}

}
