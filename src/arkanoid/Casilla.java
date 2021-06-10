package arkanoid;

public class Casilla {

	private boolean estaVacio;
	private Posicionable elemento;
	
	public Casilla() {
		this.estaVacio = true;
		this.elemento = null;
	}
	public Casilla(Posicionable elemento) {
		this.elemento = elemento;
		this.estaVacio = false;
	}

	public boolean estaVacia() {
		return this.estaVacio;
	}
	
	public void colocar(Posicionable elemento) {
		this.elemento = elemento;
	}
	
	public Posicionable getElemento() {
		return elemento;
	}
	
	public void vaciar() {
		this.estaVacio = true;
		this.elemento = null;
	}
}
