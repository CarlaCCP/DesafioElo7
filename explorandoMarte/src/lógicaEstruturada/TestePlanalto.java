package lógicaEstruturada;

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
			
			

			
			//String comandos[] = {"N", "W", "S", "E"};
			//for (int d: comandos) {
				//System.out.println(comandos[d]);
			//}
			
	}

}
