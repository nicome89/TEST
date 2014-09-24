package controller;

import view.Vista;
import model.Modelo;

public class MainController {
	public static void main(String[] args) {
		Controlador c=Controlador.getControlador();
		Modelo m = Modelo.getJuego();
		Vista v = Vista.getVista();
		c.iniciar(m);
		m.iniciar(v); 
		v.iniciar(c,m);
	}
}
