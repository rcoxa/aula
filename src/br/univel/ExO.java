package br.univel;

public class ExO implements Desenho {
	
public static int SIZE = 8;

	@Override
	public void desenhar(){
		
		System.out.println("\no)");
		
		for (int linha = 0; linha < SIZE; linha++){
			for(int coluna = 0 ; coluna < SIZE; coluna++) {
				if (linha >= SIZE-coluna-1) {
					System.out.print(SIZE-coluna);
				} else {
					System.out.print(" ");
				}
		
			}
			System.out.print("\n");
		}
	}
}