package arkanoid;

public class BordeHorizontal {
	
	private int posY;

	public BordeHorizontal(int posY) {
		this.posY = posY;
	}

	public boolean alcanzado(int posY) {
		if(this.posY == posY) return true;
		else return false;
	}
	
	public float rebotar() {
		return (float) (Math.random()*(90-85+1)+85);
	}
}
