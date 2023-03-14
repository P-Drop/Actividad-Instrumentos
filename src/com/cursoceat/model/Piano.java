package com.cursoceat.model;

public class Piano extends Instrumento{
	
	protected TiposDePiano tipos;
	protected String modelo;
	protected int nTeclas;
	
	public Piano() {
		super();
		this.modelo = "Sauter 275 Concert Grand";
		this.tipos = TiposDePiano.Acustico;
		this.nTeclas = 88;
	}
	
	@Override
	public void interpretar() {
		System.out.println("Piano:");
		for (Nota nota : melodia) {
			switch(nota) {
			case C -> System.out.print("DO ");
			case Db -> System.out.print("DO# ");
			case D -> System.out.print("RE ");
			case Eb-> System.out.print("RE# ");
			case E -> System.out.print("MI ");
			case F -> System.out.print("FA ");
			case Gb -> System.out.print("FA# ");
			case G -> System.out.print("SOL ");
			case Ab -> System.out.print("SOL# ");
			case A -> System.out.print("LA ");
			case Bb -> System.out.print("LA# ");
			case B -> System.out.print("SI ");
			case SILENCIO -> System.out.print(", ");
			}
		}
		System.out.println("");
	}
}
