package practicoEspecial.comparadores;

import java.util.Comparator;

import practicoEspecial.Elemento;

public class ComparadorCompuesto implements Comparator<Elemento> {
	private Comparator<Elemento> c1;
	private Comparator<Elemento> c2;
	public ComparadorCompuesto(Comparator<Elemento> c1, Comparator<Elemento> c2) {
		this.c1 = c1;
		this.c2 = c2;
	}

	@Override
	public int compare(Elemento o1, Elemento o2) {
		int aux = c1.compare(o1, o2);
		if (aux == 0) {
			return c2.compare(o1, o2);
		}
		return aux;
	}

}
