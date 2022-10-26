package practicoEspecial.comparadores;

import java.util.Comparator;

import practicoEspecial.Elemento;

public class ComparadorEdad implements Comparator<Elemento> {

	@Override
	public int compare(Elemento o1, Elemento o2) {
		if(o1.getEdad() == o2.getEdad())
			return 0;
		if(o1.getEdad() > o2.getEdad())
			return 1;
		return -1;
	}

}
