package practicoEspecial.comparadores;

import java.util.Comparator;

import practicoEspecial.Elemento;

public class ComparadorNot  implements Comparator<Elemento>{

	private Comparator<Elemento> c1;
	
	public ComparadorNot(Comparator<Elemento> c1) {
		this.c1 = c1;
	}

	@Override
	public int compare(Elemento o1, Elemento o2) {
		// TODO Auto-generated method stub
		return c1.compare(o2, o1);
	}
}
