package br.univel;

public class ExN implements Desenho {
	
public static int SIZE = 9;

	@Override
	public void desenhar(){
		
		System.out.println("\nn)");
		
		for (int linha = 0; linha < SIZE; linha++){
			for(int coluna = 0 ; coluna < SIZE; coluna++) {
				if (coluna > linha){
					System.out.print(coluna-linha);
				} else {
					System.out.print(" ");
				}
		
			}
			System.out.print("\n");
		}
	}
}