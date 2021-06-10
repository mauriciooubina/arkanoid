package arkanoid;

public class Ladrillo {

	private int posicionX;
	private int posicionY;
	private boolean destruido;
	private boolean alcanzado;
	private int fila;
	private int valor;
	
	public Ladrillo(int x, int y, int fila) {
		posicionX = x;
		posicionY = y;
		destruido = false;
		alcanzado = false;
		this.fila = fila;
	}
	
	public boolean alcanzado(int posX, int posY) {
		if (posX == posicionX && posY == posicionY) {
			alcanzado = true;
		}			
		return alcanzado;
	}
	
	public int destruirLadrillo() {
		destruido = true;
		return fila;
	}
	
	public float rebotar() {
		float grados = (float) (Math.random()*(90-85+1)+85);
		destruirLadrillo();
		return grados;
	}
	
	public int getPosicionX() {
		return posicionX;
	}
	
	public int getPosicionY() {
		return posicionY;
	}
	
	
}
