import static org.junit.Assert.*;
import model.Jugadores;
import model.StandardTriqui;

import org.junit.Test;


public class Prueba {

	@Test
	public void testValidaMovimiento() {
		
	  StandardTriqui V = new StandardTriqui( );
	  Jugadores j = Jugadores.EMPTY;
	  
	   	V.validarMovimiento(1, 3, j);
	  
	}
}

