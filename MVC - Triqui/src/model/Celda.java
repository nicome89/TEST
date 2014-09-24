package model;

public class Celda {
	public Jugadores contenido;
	public int fila, columna;

	public Celda(int fila, int columna) {
		this.fila = fila;
		this.columna = columna;
		clear();
	}

	public void clear() {
		contenido = Jugadores.EMPTY;
	}

	public String obtenerVal() {
		String cont = null;
		switch (contenido) {
		case X:
			cont= " X ";
			break;
		case O:
			cont=" O ";
			break;
		case EMPTY:
			cont= "   ";
			break;
		}
		return cont;
	}
}
