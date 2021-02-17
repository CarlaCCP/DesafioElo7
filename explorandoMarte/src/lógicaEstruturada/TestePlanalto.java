package lógicaEstruturada;

public class TestePlanalto {

	public static void main(String[] args) {
		   int linha = 5;
	       int coluna = 5;
	       int x = 4;
	       int y = 4;
	       String texto = " *\t";
	       String sonda = " ô\t";
	       String [] [] planalto = new String [linha][coluna];

			for (int i = 0; i<linha; i++ ) {
				System.out.print("\n\n");

				for (int j = 0; j<coluna; j++) {

					planalto [i][j] = texto;
					 planalto [x][y]= sonda;
						System.out.print(planalto[i][j]);
				}

			}

	}

}
