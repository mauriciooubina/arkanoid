package arkanoid;

public interface Posicionable {

	public boolean alcanzado(int x, int y);
	
	public float rebotar(int x, int y, float angulo);
}
