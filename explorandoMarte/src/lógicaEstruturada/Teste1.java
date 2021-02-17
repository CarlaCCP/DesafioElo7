package lógicaEstruturada;

import java.util.Scanner;

public class Teste1 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		// Entradas 
		// 1º Entrada: matriz
		System.out.print("Escreva o tamanho de linhas: ");
		int linha = leia.nextInt();
		
		System.out.print("Escreva o tamanho de colunas: ");
		int coluna = leia.nextInt();
		String [] [] planalto = new String [linha][coluna];
	
		
		
		
		// 2ª Entrada: Coordenadas e orientação
		System.out.println("Escreva a coordenada x da sonda: ");
		int x = leia.nextInt();
		
		System.out.println("Escreva a coordenada y da sonda: ");
		int y = leia.nextInt();
		
		System.out.print("Orientação: ");
		
		char orient = leia.next().charAt(0);
		
		planalto [x][y] = "o";
		
	
		
		// 3ª Entrada
		
		System.out.print("Dê os comandos: ");
		char comando = leia.next().charAt(0);
		


	}
	
}


