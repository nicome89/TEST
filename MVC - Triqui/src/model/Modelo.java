package model;

import view.Vista;

public abstract class Modelo {

	public static Modelo getJuego() {
		return new StandardTriqui();
	}

	public abstract void iniciar(Vista v);

	public abstract void validarMovimiento(int row, int col, Jugadores jugador);
	
	public abstract boolean haGanado(Jugadores jugador);
}
