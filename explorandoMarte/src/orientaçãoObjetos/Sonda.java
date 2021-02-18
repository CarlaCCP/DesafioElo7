package orientaçãoObjetos;

import java.util.Scanner;

public class Sonda extends Malha {

	Scanner leia = new Scanner(System.in);
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
	/*L - 90º esquerda
	 *R - 90º direita
	 *M - Move um ponto
	 * */ 
	public void comandos () {
		String aux;
		String [] listaComando = new String [20];
		
				
				for( int i= 0; i< listaComando.length; i++) {
					System.out.printf("\nDigite os comandos: \n[L] - 90º Esquerda \n[R] - 90º Direita \n[M] - Mova \n[X] - Pare \n");					
					aux = leia.next().toUpperCase();
					listaComando[i] = aux;
					
					
				}
				
				for (int i=0; i< listaComando.length; i++) {
					System.out.printf("Sequência de comandos: \n" ,listaComando[i]);
				}
			
			}
	
	// Mostra Coordenada Final
	
	
}
