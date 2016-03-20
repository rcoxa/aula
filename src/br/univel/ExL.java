package br.univel;

public class ExL implements Desenho {
	
public static int SIZE = 11;
	
	@Override
	public void desenhar(){
		
		System.out.println("\nl)");
		
		for (int linha = 0; linha < SIZE; linha++){
			for(int coluna = 0 ; coluna < SIZE; coluna++) {
				if(linha==coluna ){
					System.out.print("#");
				} else {
					if(linha <= coluna+1 || SIZE-linha > coluna+1) {
						System.out.print(" ");
					} else {
						System.out.print("#");
					}		
				}
			}
			System.out.print("\n");
		}
	}
}