package practicoEspecial;

import java.util.ArrayList;
import java.util.Comparator;

public class Produccion {
	private ArrayList<Coach> coaches;
	private ArrayList<Cancion> canciones;
	private Comparator<Elemento> estrategiaBatalla;
	
	public Produccion() {
		this.canciones = new ArrayList<>();
		this.coaches = new ArrayList<>();
	}
	
	public int batalla(Coach coach1, Coach coach2) {
		Elemento Participante1 = coach1.getBatallador(this.estrategiaBatalla);
		Elemento Participante2 = coach2.getBatallador(this.estrategiaBatalla);
		if(Participante2 == null) {
			return 1;
		} else if(Participante1 == null) {
			return -1;
		} else {
			return this.estrategiaBatalla.compare(Participante1, Participante2);
		}
		
	}
	
	public ArrayList<Cancion> getCanciones() {
		return new ArrayList<>(this.canciones);
	}
	public ArrayList<Coach> getCoaches() {
		return new ArrayList<>(this.coaches);
	}
	public void addCancion(Cancion c1) {
		if(!this.canciones.contains(c1))
			this.canciones.add(c1);
	}
	public void addCoach(Coach coach) {
		if(!this.coaches.contains(coach))
			this.coaches.add(coach);
	}

	public Comparator<Elemento> getEstrategiaBatalla() {
		return estrategiaBatalla;
	}

	public void setEstrategiaBatalla(Comparator<Elemento> estrategiaBatalla) {
		this.estrategiaBatalla = estrategiaBatalla;
	}


}
