package practicoEspecial.comparadores;

import java.util.Comparator;

import practicoEspecial.Elemento;

public class ComparadorInstrumentos implements Comparator<Elemento> {

	@Override
	public int compare(Elemento o1, Elemento o2) {
		if(o1.getInstrumentos().size() == o2.getInstrumentos().size())
			return 0;
		if(o1.getInstrumentos().size() > o2.getInstrumentos().size())
			return 1;
		return -1;
	}

}
