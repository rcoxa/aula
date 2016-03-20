package br.univel;

public final class ExE implements Desenho {

	
	public static int SIZE = 6;
	
	@Override
	public void desenhar(){
		
		System.out.println("\ne)");
		
		for (int linha = 0; linha < SIZE; linha++){
			for(int coluna = 0 ; coluna < SIZE; coluna++) {
				if(linha == 0 || linha == SIZE -1){
					System.out.print("*");
				} else {
					if (coluna == 0 || coluna == SIZE - 1) {
						System.out.print("*");
					} else {
						System.out.print(" ");
					}
				}
			}
			System.out.print("\n");
		}
	}
}
