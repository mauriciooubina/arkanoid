package arkanoid;

public class BordeVertical implements Posicionable{
	
	private int posX;
	private int posY;
	
	public BordeVertical(int posX, int posY) {
		this.posX = posX;
		this.posY = 0;
	}

	@Override
	public boolean alcanzado(int posX, int posY) {
		if(this.posX == posX) return true;
		else return false;
	}
	
	public float rebotar(int x, int y, float angulo) {
		return (float) (Math.random()*(90-85+1)+85);
	}
}
