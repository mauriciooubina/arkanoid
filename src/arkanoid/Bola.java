package arkanoid;

public class Bola implements Posicionable{

	private int posicionX;
	private int posicionY;
	private int velocidad;
	private int anguloTrayectoria;
	private int contadorVidaExtra;
	private boolean puedeJugar;
	
	public Bola() {
		this.posicionX= 3;
		this.posicionY = 9;
		this.velocidad = 1;
		this.puedeJugar = true;
	}

	public void incrementarPosicion() {
		
	}
	
	public void incrementarVelocidad() {
			
		}
	
	public void rebotarBarraHorizontal() {
		
	}
	
	public void rebotarLadrillo() {
		
	}
	
	public void rebotarBorde() {
		
	}
	
	public void verificarColision() {
			
	}
	
	public void pausarBola() {
		this.puedeJugar = false;
	}
	
	public void reiniciarBola() {
		this.puedeJugar = true;
	}

	@Override
	public boolean alcanzado(int x, int y) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public float rebotar(int x, int y, float angulo) {
		// TODO Auto-generated method stub
		return 0;
	}
}
