package edu.logica.factorymethod;

public class Trapecio extends Cuadrilatero{

	public Trapecio(int ladoA, int ladoB, int ladoC, int ladoD) {
		super(ladoA, ladoB, ladoC, ladoD);
	}

	@Override
	public String getDescripcion() {
		return "Trapecio";
	}

}
