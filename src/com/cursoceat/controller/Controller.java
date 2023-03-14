package com.cursoceat.controller;

import com.cursoceat.model.Campana;
import com.cursoceat.model.Nota;
import com.cursoceat.model.Piano;

public class Controller {
	
	public static void main(String[] args) {
		Nota cancion[] = {Nota.A, Nota.A, Nota.C, Nota.A, Nota.SILENCIO, Nota.A, Nota.A, Nota.E, Nota.A};
		Piano p = new Piano();
		Campana tubular = new Campana();
		for(Nota nota: cancion) {
			p.add(nota);
			tubular.add(nota);
		}
		p.interpretar();
		tubular.interpretar();
	}

}
