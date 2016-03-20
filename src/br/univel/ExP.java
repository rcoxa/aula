package br.univel;

public class ExP implements Desenho {
	
public static int SIZE = 8;

	@Override
	public void desenhar(){
		
		System.out.println("\np)");
		
		for (int linha = 0; linha < SIZE; linha++){
			for(int coluna = 0 ; coluna < SIZE; coluna++) {
				if (coluna >= SIZE-linha-1) {
					System.out.print(" ");
				} else {
					System.out.print(coluna-linha);
				}
		
			}
			System.out.print("\n");
		}
	}
}