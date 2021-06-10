package arkanoid;

public class Nivel {

	private int nivel;
	private int cantLadrillos;
	private Casilla[][] mapa;
	private int puntaje;
	private int cantVidas;
	private int contadorMilPuntos;
	
	public Nivel() {
		this.mapa = new Casilla[12][7];
		this.cantLadrillos = 25;
		this.puntaje = 0;
		this.cantVidas = 3;
		this.nivel = 1;
		for(int i = 0; i < 12; i++ ){
	            for(int j = 0; j < 7; j++){
	                mapa[i][j] = new Casilla();
	            }
		}
		iniciarNivel();
	}
	
	public void iniciarNivel() {
		colocarBordes();
		colocarLadrillos();
		colocarBola();
		colocarBarraHorizontal();
	}
	
	public void incrementarNivel() {
		this.nivel++;
	}
	
	public void incrementarVida() {
		this.cantVidas++;
	}
	
	public void colocarLadrillos() {
		for(int i = 1; i < 6; i++) {
			for(int j = 1; j < 6; j++) {
				mapa[i][j].colocar(new Ladrillo(i,j,6-i));
			}
		}
	}
	
	public void colocarBordes() {
		for (int i = 0; i < 12; i++) {
			mapa[i][0].colocar(new BordeVertical(i,0));
			mapa[i][6].colocar(new BordeVertical(i,6));
		}
		for (int j = 0; j < 7; j++) {
			mapa[0][j].colocar(new BordeHorizontal(0,j));
			mapa[0][j].colocar(new BordeHorizontal(11,j));
		}
	}
	
	public void colocarBola() {
		mapa[9][3].colocar(new Bola());
	}
	
	public void colocarBarraHorizontal() {
		mapa[10][3].colocar(new Bola());
	}
	
	public int obtenerPuntajeNivel() {
		return puntaje;
	}		

	public int getNivel() {
		return this.getNivel();
	}
	
	public int getVidas() {
		return this.cantVidas;
	}
}
