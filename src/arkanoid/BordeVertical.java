package arkanoid;

public class BordeVertical {
	
	private int posX;

	public BordeVertical(int posX) {
		this.posX = posX;
	}

	public boolean alcanzado(int posX) {
		if(this.posX == posX) return true;
		else return false;
	}
	
	public float rebotar() {
		return (float) (Math.random()*(90-85+1)+85);
	}
}
