package orienta��oObjetos;

import java.util.Scanner;

public class Malha {

	Scanner leia = new Scanner(System.in);
	private String [][] matriz;
	
	public Malha(String [][] matriz) {
		this.matriz = matriz;
	}
	
	public Malha() {
		
	}
	
	
	public String[][] getMatriz() {
		return matriz;
	}

	public void setMatriz(String[][] matriz) {
		this.matriz = matriz;
	}
	
	// Monta a matriz
	public void mostraMalha(String [][] matriz) {
		System.out.println("\nOl� tripula��o, este � o territ�rio que iremos nos aventurar");
	
		for(int linha = 0; linha <matriz.length; linha++) {
			System.out.print("\n\n\t");
			for(int coluna = 0; coluna<matriz.length; coluna++) {
				System.out.print(matriz[linha][coluna]= " *\t"); 
			}
		}
	}
	
	
	
	
}
