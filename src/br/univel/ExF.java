package br.univel;

public class ExF implements Desenho {

	public static int SIZE = 7;
	
	@Override
	public void desenhar(){
		
		System.out.println("\nf)");
		
		for (int linha = 0; linha < SIZE; linha++){
			for(int coluna = 0 ; coluna < SIZE; coluna++) {
				if(linha == 0 || linha == SIZE -1){
					System.out.print("#");
				} else {
					if(linha == coluna) {
						System.out.print("#");
					} else {
						System.out.print(" ");
					}
				}
			}
			System.out.print("\n");
		}
	}

}
