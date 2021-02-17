package orientaçãoObjetos;

public class Sonda extends Malha {

	private int x;
	private int y; 
	private String cardinal;
	private Malha malha;
	
	public Sonda(int x, int y, String cardinal) {
		super();
		this.x= x;
		this.y= y;
		this.cardinal = cardinal;
	}
	
	public Sonda() {
		
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
	public String getCardinal() {
		return cardinal;
	}
	public void setCardinal(String cardinal) {
		this.cardinal = cardinal;
	}
	
	// Mostra Coordenada e a sonda
	public void mostraSonda(int x, int y, String cardinal, String[][] matriz) {
		String texto = " *\t";
		String sonda = " ô\t";
		if(this.cardinal == "N") {
			sonda = " ô\t";
		} else if (this.cardinal == "W") {
			sonda = " <o\t";
		} else if(this.cardinal == "S") {
			sonda = " ?\t";
		} else if (this.cardinal == "E") {
			sonda = " o>\t";
		}
	    
		System.out.printf("\nA nossa sonda é representada por 'ô' e suas coordenadas são %d,%d,%s", x, y, cardinal);
		for(int i = 0; i<matriz.length; i++) {
			System.out.print("\n\n\t");
			for(int j = 0; j<matriz.length ; j++) {
				matriz[i][j] = texto;
				matriz[x][y]= sonda;
				System.out.print(matriz[i][j]);
			}
		}
	}
	// Lista de comandos
	
	// Mostra Coordenada Final
	
	
}
