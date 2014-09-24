package model;

import view.Vista;

public class StandardTriqui extends Modelo {
	public static final int FILAS = 3;
	public static final int COLUMNAS = 3;

	public Celda[][] celdas;
	public int filaActual;
	public int columnaActual;
	private Vista v;

	public StandardTriqui() {
		celdas = new Celda[FILAS][COLUMNAS];
		for (int row = 0; row < FILAS; ++row) {
			for (int col = 0; col < COLUMNAS; ++col) {
				celdas[row][col] = new Celda(row, col);
			}
		}
	}

	public void iniciar(Vista v) {
		this.v = v;
		for (int row = 0; row < FILAS; ++row) {
			for (int col = 0; col < COLUMNAS; ++col) {
				celdas[row][col].clear();
			}
		}
	}

	public boolean esEmpate() {
		for (int row = 0; row < FILAS; ++row) {
			for (int col = 0; col < COLUMNAS; ++col) {
				if (celdas[row][col].contenido == Jugadores.EMPTY) {
					return false;
				}
			}
		}
		return true;
	}

	public boolean haGanado(Jugadores jugador) {
		return (celdas[filaActual][0].contenido == jugador
				&& celdas[filaActual][1].contenido == jugador
				&& celdas[filaActual][2].contenido == jugador
				|| celdas[0][columnaActual].contenido == jugador
				&& celdas[1][columnaActual].contenido == jugador
				&& celdas[2][columnaActual].contenido == jugador
				|| filaActual == columnaActual
				&& celdas[0][0].contenido == jugador
				&& celdas[1][1].contenido == jugador
				&& celdas[2][2].contenido == jugador || filaActual
				+ columnaActual == 2
				&& celdas[0][2].contenido == jugador
				&& celdas[1][1].contenido == jugador
				&& celdas[2][0].contenido == jugador);
	}

	public void actualizarVista() {
		v.actualizar();
	}

	public void validarMovimiento(int row, int col, Jugadores jugador) {
			if (row >= 0 && row < StandardTriqui.FILAS && col >= 0
					&& col < StandardTriqui.COLUMNAS
					&& celdas[row][col].contenido == Jugadores.EMPTY) {
					celdas[row][col].contenido = jugador;
					filaActual = row;
					columnaActual = col;
			}else{
				v.actualizarMensaje("El movimiento (" + (row + 1) + ","
						+ (col + 1) + ") no es valido. Intente nuevamente...");				
				
			}
	}
}
