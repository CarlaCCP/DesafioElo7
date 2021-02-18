package lógicaEstruturada;

import java.util.ArrayList;
import java.util.Scanner;

public class TestePlanalto {

	public static void main(String[] args) {
		   
           int linha = 6;
	       int coluna = 6;
	       int x = 2;
	       int y = 1;
	       char c;
	       String texto = " *\t";
	       String sonda = " ô\t";
	       String [] [] planalto = new String [linha][coluna];
	       Scanner leia = new Scanner(System.in);
	      
			for (int i = 0; i<planalto.length; i++ ) {
				System.out.print("\n\n\t");
				
				for (int j = 0; j<planalto.length; j++) {
					
					planalto [i][j] = texto;
					 planalto [x][y]= sonda;
					 System.out.print(planalto[i][j]);
				}
				
			}
			
			//System.out.print(" escreva: " );
			//String aux = leia.next().toUpperCase();
			//String [] listaComando = new String [5];
			
			//for( int i= 0; i< listaComando.length; i++) {
				//listaComando[i] = aux;
				//System.out.print(listaComando[i]);
			//}
			
			
			//TESTE 
//			String parada = "M";
//			String aux;
//			String [] listaComando = new String [10];
//			
//			do {
//				
//					for( int i= 0; i< listaComando.length; i++) {
//						System.out.println("Digite os comandos: \n[L] - 90º Esquerda \n[R] - 90º Direita \n[M]- Mova \n[X] - Pare");
//						aux = leia.next().toUpperCase();
//						parada = aux;
//						listaComando[i] = aux;
//						
//					}
//					
//					for(int i = 0; i< listaComando.length; i++) {
//						System.out.print(listaComando[i]);
//					}
//					
//					
//			} while (parada == "M" || parada == "R" || parada == "L");
			
//			
//			String parada = "x";
//			String aux = "x";
//			String [] listaComando = new String [5];
//			
//			
//				
//				for(int i= 0; i< listaComando.length && aux != "X" ; i++) {
//					System.out.println("Digite os comandos: \n[L] - 90º Esquerda \n[R] - 90º Direita \n[M] - Mova \n[X] - Pare");					
//					aux = leia.next().toUpperCase();
//					listaComando[i] = aux;
//					parada = listaComando[i];
//					aux = parada;
//				}
//				
//				for(int i = 0; i< listaComando.length; i++) {
//					System.out.print(listaComando[i]);
//				}	
			
			
		ArrayList<String> listaComando = new ArrayList<>();
		
		String aux;
		int continua = 0;
		while(continua == 0) {
			System.out.println("Digite os comandos: \n[L] - 90º Esquerda \n[R] - 90º Direita \n[M] - Mova \n[X] - Pare");					
			aux = leia.next().toUpperCase();
			listaComando.add(aux);
			if (aux == "XX") {
				continua++;
			}
		
		}
		System.out.print(listaComando);
		
		
			
			
			
	}

}
