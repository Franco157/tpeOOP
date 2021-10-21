package practicoEspecial;

import java.util.ArrayList;

public class Coach {
	private String nombre;
	private ArrayList<Participante> participantesAsignados;
	
	public Coach(String nombre) {
		this.nombre = nombre;
		this.participantesAsignados = new ArrayList<>();
	}

	public String getNombre() {
		return nombre;
	}

	public ArrayList<Participante> getParticipantesAsignados() {
		return new ArrayList<>(this.participantesAsignados);
	}
	public void addParticipanteAsignado(Participante pp1) {
		if (!this.participantesAsignados.contains(pp1)) {
			this.participantesAsignados.add(pp1);
		}
	}

}
