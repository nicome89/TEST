package controller;

import model.Jugadores;
import model.Modelo;

public class ControladorEstandar extends Controlador {
	private Modelo m;
	public void iniciar(Modelo m) {
		this.m=m;
	}
	
	public void ordenarMovimiento(int row, int col, Jugadores jugador) {			
		m.validarMovimiento(row,col,jugador);
	}
}
