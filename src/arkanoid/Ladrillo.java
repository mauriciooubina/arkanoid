package arkanoid;

import java.util.Random;

public class Ladrillo {

	int posicionX;
	int posicionY;
	boolean destruido;
	boolean alcanzado;
	
	public Ladrillo(int x, int y) {
		posicionX = 0;
		posicionY = 0;
		destruido = false;
		alcanzado = false;
	}
	
	public boolean alcanzado(int posX, int posY) {
		if (posX == posicionX && posY == posicionY) {
			alcanzado = true;
		}			
		return alcanzado;
	}
	
	public void destruirLadrillo() {
		destruido = true;
	}
	
	public int rebotar() {
		int grados = (int) (Math.random()*(90-85+1)+85);
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
