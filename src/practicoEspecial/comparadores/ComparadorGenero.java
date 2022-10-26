package practicoEspecial.comparadores;

import java.util.Comparator;

import practicoEspecial.Elemento;

public class ComparadorGenero implements Comparator<Elemento> {

	@Override
	public int compare(Elemento o1, Elemento o2) {
		if(o1.getGeneros().size() == o2.getGeneros().size())
			return 0;
		if(o1.getGeneros().size() > o2.getGeneros().size())
			return 1;
		return -1;
	}
}
