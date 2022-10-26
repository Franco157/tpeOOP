package practicoEspecial.comparadores;

import java.util.Comparator;

import practicoEspecial.Elemento;

public class ComparadorIdiomas implements Comparator<Elemento> {

	@Override
	public int compare(Elemento o1, Elemento o2) {
		if(o1.getIdiomas().size() == o2.getIdiomas().size())
			return 0;
		if(o1.getIdiomas().size() > o2.getIdiomas().size())
			return 1;
		return -1;
	}
}
