package practicoEspecial;
import practicoEspecial.filtros.*;

import java.time.LocalDate;
import java.util.Comparator;

import practicoEspecial.comparadores.*;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Produccion prod = new Produccion();
	
		Participante p1 = new Participante("lucas", "medico", LocalDate.of(1994, 12,30));
		
		p1.addGeneroMusical("rock");
		p1.addGeneroMusical("metal");
		//p1.addGeneroMusical("pop");
		p1.addIdioma("ingles");
		p1.addIdioma("aleman");
		p1.addInstrumento("flauta");

		Participante p2 = new Participante("franco", "fdas", LocalDate.of(1995, 03, 20));
		
		p2.addGeneroMusical("cumbia");
		p2.addGeneroMusical("metal");
		p2.addIdioma("español");
		p2.addIdioma("ingles");
		p2.addInstrumento("teclado");
		p2.addInstrumento("guitarra");
		
		Participante p3 = new Participante("pibito", "pppp", LocalDate.of(2010, 03, 15));
		
		p3.addGeneroMusical("metal");
		p3.addIdioma("español");
		p3.addInstrumento("teclado");
		p3.addInstrumento("guitarra");
		
		Participante p4 = new Participante("poy", "adsasd", LocalDate.of(1990, 03, 10));
		
		p4.addGeneroMusical("metal");
		p4.addIdioma("español");
		p4.addInstrumento("teclado");
		p4.addInstrumento("guitarra");
			
		Participante p5 = new Participante("cris", "ash", LocalDate.of(1995, 03, 05));
		Participante p6 = new Participante("castle", "rainbow", LocalDate.of(1995, 03, 06));
		Participante p7 = new Participante("thermite", "crosshair", LocalDate.of(1995, 03, 01));
		
		Participante p8 = new Participante("frank", "", LocalDate.of(1995, 03, 05));
		Participante p9 = new Participante("danzing", "glen", LocalDate.of(1995, 03, 06));
		Participante p10 = new Participante("jerry", "", LocalDate.of(1995, 03, 01));
		Participante p11 = new Participante("doyle", "", LocalDate.of(1995, 03, 01));
				
		Criterio c99 = new Criterio0(); 
		Coach b1 = new Coach("rainbow", c99);
		Banda b2 = new Banda("pibes");

		
		b1.addParticipante(p1);
		b1.addParticipante(p2);
		b1.addParticipante(p3);
		b1.addParticipante(p4);
		b2.addParticipante(p5);
		b2.addParticipante(p6);
		b2.addParticipante(p7);
		b2.addParticipante(b1);

	
		//Interseccion generos
		//System.out.println(b1.getGeneros());
		//Union de idiomas
		//System.out.println(b1.getIdiomas());
		//Union de instrumentos
		//System.out.println(b1.getInstrumentos());

		
		//Filtros
		FiltroIdioma c1 = new FiltroIdioma("ingles");
		//c1.addIdioma("aleman");
		Criterio c2 = new FiltroInstrumento("teclado");
		Criterio c3 = new FiltroAnd(c1,c2);
		//System.out.println(b1.participantesCon(c3));
		Cancion cancion = new Cancion("We will rock you", "ingles", "rock");
		Criterio c4 = new FiltroCancion(cancion);
		CriterioAceptacion c88 = new CriterioAceptacion(c1);
		c88.addCriterio(c2);
		
		
		
		Comparator<Elemento> comp = new ComparadorInstrumentos();
		Comparator<Elemento> comp1 = new ComparadorGenero();
		Comparator<Elemento> compComp = new ComparadorCompuesto(comp,comp1);
		
		Coach b3 = new Coach("misfits", c88);
		prod.addCancion(cancion);
		prod.addCoach(b1);
		
		b3.addParticipante(p2);
		b3.addParticipante(p9);
		b3.addParticipante(p10);
		b3.addParticipante(p11);
		b1.addParticipante(b3);
		System.out.println(p1.getEdad());
		//prod.addCoach(b3);
		
		//prod.setEstrategiaBatalla(compComp);
		//System.out.println(prod.batalla(b1, b3));
		
		//System.out.println(b1.toString());
		//System.out.println(b2.toString());
		//System.out.println(b3.toString());
	}

}