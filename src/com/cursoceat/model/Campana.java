package com.cursoceat.model;

public class Campana extends Instrumento{

	protected final int nTubos = 18;
	protected String model;
	
	public Campana() {
		super();
		this.model = "Adams BK 5216L";
	}
	
	@Override
	public void interpretar() {
		System.out.println("Tubulares: ");
		for (Nota nota: melodia) {
			switch (nota) {
			case C -> System.out.print("dooo ");
			case Db -> System.out.print("dooo# ");
			case D -> System.out.print("reee ");
			case Eb -> System.out.print("reee# ");
			case E -> System.out.print("miii ");
			case F -> System.out.print("faaa ");
			case Gb -> System.out.print("faaa# ");
			case G -> System.out.print("soool ");
			case Ab -> System.out.print("soool# ");
			case A -> System.out.print("laaa ");
			case Bb -> System.out.print("laaa# ");
			case B -> System.out.print("siii ");
			case SILENCIO -> System.out.print(", ");
			}
	}
		System.out.println();
	}
}
