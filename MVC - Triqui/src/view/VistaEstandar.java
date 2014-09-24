package view;

import java.util.Scanner;

import model.Jugadores;
import model.EstadoJuego;
import model.Modelo;
import model.StandardTriqui;
import controller.Controlador;
import controller.ControladorEstandar;

public class VistaEstandar extends Vista {
	private ControladorEstandar c;
	private StandardTriqui board;
	private EstadoJuego estadoActual;
	private Jugadores jugadorActual;
	private Scanner in = new Scanner(System.in);

	public void iniciar(Controlador c, Modelo m) {
		this.c = (ControladorEstandar) c;
		this.board = (StandardTriqui) m;

		jugadorActual = Jugadores.X;
		estadoActual = EstadoJuego.EN_JUEGO;
		do {
			enviarNuevoMovimiento(jugadorActual);
			
			actualizar();
			updateGame(jugadorActual);
			
			if (estadoActual == EstadoJuego.X_GANA) {
				System.out.println("'X' Gana!!");
			} else if (estadoActual == EstadoJuego.O_GANA) {
				System.out.println("'O' Gana!!");
			} else if (estadoActual == EstadoJuego.EMPATE) {
				System.out.println("Empate!!");
			}

			jugadorActual = (jugadorActual == Jugadores.X) ? Jugadores.O
					: Jugadores.X;
		} while (estadoActual == EstadoJuego.EN_JUEGO); 
	}

	public void enviarNuevoMovimiento(Jugadores jugador) {
		if (jugador == Jugadores.X) {
			System.out
					.print("Jugador 'X', ingrese movimiento (fila<1-3> columna<1-3>): ");
		} else if(jugador == Jugadores.O) {
			System.out
					.print("Jugador 'O', ingrese movimiento (fila<1-3> columna<1-3>): ");
		}
		int row = in.nextInt() - 1;
		int col = in.nextInt() - 1;
		c.ordenarMovimiento(row, col, jugador);
	}

	public void updateGame(Jugadores jugador) {
		if (board.haGanado(jugador)) {
			estadoActual = (jugador == Jugadores.X) ? EstadoJuego.X_GANA
					: EstadoJuego.O_GANA;
		} else if (board.esEmpate()) {
			estadoActual = EstadoJuego.EMPATE;
		}
	}

	public void actualizar() {
		for (int row = 0; row < StandardTriqui.FILAS; ++row) {
			for (int col = 0; col < StandardTriqui.COLUMNAS; ++col) {
				System.out.print(board.celdas[row][col].obtenerVal());
				if (col < StandardTriqui.COLUMNAS - 1)
					System.out.print("|");
			}
			System.out.println();
			if (row < StandardTriqui.FILAS - 1) {
				System.out.println("-----------");
			}
		}
	}

	public void actualizarMensaje(String string) {
		System.out.println(string);
	}
}
