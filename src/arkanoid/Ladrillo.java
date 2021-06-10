package arkanoid;

public class Ladrillo implements Posicionable{

	private int posicionX;
	private int posicionY;
	private boolean destruido;
	private boolean alcanzado;
	private int fila;
	
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
	
	public float rebotar(int x, int y, float angulo) {
		float grados = (float) (Math.random()*(95-85+1)+85);
		destruirLadrillo();
		return grados;
	}
	
	public int getPosicionX() {
		return posicionX;
	}
	
	public int getPosicionY() {
		return posicionY;
	}
	
	public boolean estaDestruido() {
		return destruido;
	}
	
}
