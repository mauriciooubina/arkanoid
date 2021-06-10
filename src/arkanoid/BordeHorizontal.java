package arkanoid;

public class BordeHorizontal implements Posicionable{
	
	private int posY;
	private int posX;

	public BordeHorizontal(int posX, int posY) {
		this.posY = posY;
		this.posX = posX;
	}

	public boolean alcanzado(int posX, int posY) {
		if(this.posY == posY) return true;
		else return false;
	}
	
	public float rebotar(int x, int y, float angulo) {
		return (float) (Math.random()*(90-85+1)+85);
	}
}
