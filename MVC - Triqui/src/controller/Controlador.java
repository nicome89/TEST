package controller;

import model.Modelo;

public abstract class Controlador {
	public static Controlador getControlador(){
		return new ControladorEstandar();
	}
	public abstract void iniciar(Modelo m);
}
