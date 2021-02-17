package orientaçãoObjetos;

import java.util.Scanner;

public class Marte {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		Sonda sonda = new Sonda();
		Malha malha = new Malha();
		
		System.out.print("Digite a quantidade de linhas: ");
		int linha = leia.nextInt();
		
		System.out.print("Digite a quantidade de colunas: ");
		int coluna = leia.nextInt();
		
		String matriz1 [][] = new String[linha][coluna];
		
		malha.mostraMalha(matriz1);
		
		System.out.print("\n\nDigite a coordenada x da sonda: ");
		int x = leia.nextInt();
		
		System.out.print("Digite a coordenada y da sonda: ");
		int y = leia.nextInt();
		
		System.out.print("Digite a direção cardinal da sonda, exemplo: \n[N] - Norte \n[W] - Oeste \n[S] - Sul \n[E] - Leste: ");
		String cardinal = leia.next().toUpperCase();
		
		sonda.mostraSonda(x, y, cardinal, matriz1);
	}

}
