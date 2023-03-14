package com.cursoceat.model;

import java.util.Arrays;

public abstract class Instrumento {

	protected Nota[] melodia;
	
	public Instrumento() {
		this.melodia = new Nota[0];
	}
	
	public void add(Nota n) {
		melodia = Arrays.copyOf(melodia, melodia.length +1);
		melodia[melodia.length -1] = n;
	}
	
	abstract void interpretar();
}
