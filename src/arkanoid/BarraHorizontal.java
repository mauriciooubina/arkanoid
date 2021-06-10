package arkanoid;

public class BarraHorizontal implements Posicionable{
	
	private int posX;
	private int posY;
	private int mitadIzqX;
	private int mitadIzqY;
	private int mitadDerX;
	private int mitadDerY;
	private boolean puedeJugar;

	public BarraHorizontal(int posX, int posY) {
		this.posX = posX;
		this.posY = posY;
		this.puedeJugar = true;
		this.mitadIzqX = posX -  1;
		this.mitadIzqY = posY - 1;
		this.mitadDerX = posX + 1;
		this.mitadDerY = posY + 1;
	}
	
	public void moverBarra(int posX) {
		this.posX = posX;
		this.mitadDerX = posX + 1;
		this.mitadIzqX = posX - 1;
	}
	
	public float barraRebotarIzq(int bolaX, int bolaY, float angulo) {
		return 0;
	}
	
	public float barraRebotarDer(int bolaX, int bolaY, float angulo) {
		return 0;
	}

	@Override
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

	@Override
	public float rebotar(int x, int y, float angulo) {
		barraRebotarIzq(x,y,angulo);
		barraRebotarIzq(x,y,angulo);
		return 0;
	}
}
