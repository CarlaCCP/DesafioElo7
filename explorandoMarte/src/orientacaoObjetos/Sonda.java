package orientacaoObjetos;

public class Sonda {
	
	private int x;
	private int y; 
	private char cardinal;
	
	public Sonda (int x, int y, char cardinal) {
		super();
		this.x = x;
		this.y = y;
		this.cardinal = cardinal;
	}
	
	public int getX() {
		
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
	public char getCardinal() {
		return cardinal;
	}
	public void setCardinal(char cardinal) {
		this.cardinal = cardinal;
	}
	
	
	
	
}
