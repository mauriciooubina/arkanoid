package arkanoid;

public class BarraHorizontal {
	
	private int posX;
	private int posY;
	private boolean mitadIzq;
	private boolean mitadDer;
	private boolean puedeJugar;

	public BarraHorizontal(int posX, int posY) {
		this.posX = posX;
		this.posY = posY;
		this.puedeJugar = true;
	}
	
	public void moverBarra(int posX) {
		this.posX = posX;
	}
	
	public float barraRebotarIzq(int bolaX, int bolaY, float angulo) {
		return 0;
	}
	
	public float barraRebotarDer(int bolaX, int bolaY, float angulo) {
		return 0;
	}

	public boolean alcanzado(int posX, int posY) {
		if (this.posX == posX && this.posY == posY) return true;
		else return false;
	}
	
	public void pausarBarra() {
		this.puedeJugar = false;
	}
	
public void reiniciarBarra() {
		this.puedeJugar = true;
	}
}
