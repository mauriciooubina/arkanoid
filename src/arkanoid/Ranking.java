package arkanoid;

import java.util.Vector;

public class Ranking {

	private Vector<String> nombres = new Vector<String>();
	private Vector<Integer> puntajes = new Vector<Integer>();
	
	public void agregadorJugador(String nombre) {
		int posicion = nombres.size();
		nombres.add(posicion, nombre);
		puntajes.add(posicion, 0);
	}
	
	public void agregarPuntajeFinal(String nombre, int puntaje) {
		int posicion = nombres.indexOf(nombre);
		puntajes.set(posicion, puntaje);
	}
}
