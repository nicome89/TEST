package view;

import model.Modelo;
import controller.Controlador;

public abstract class Vista {

	public static Vista getVista() {
		return new VistaEstandar();
	}

	public abstract void iniciar(Controlador c, Modelo m);

	public abstract void actualizar();

	public abstract void actualizarMensaje(String string);

}
