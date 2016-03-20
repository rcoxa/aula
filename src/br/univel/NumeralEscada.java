package br.univel;

public class NumeralEscada implements Desenho {
	
	public static int SIZE=8;
	
	public void desenhar(){
		for (int linha = 0; linha < SIZE; linha++){
			for(int coluna = 0 ; coluna < SIZE; coluna++) {
				if(coluna < linha+1 ) {
					System.out.print(coluna+1);				
				}
			}
			System.out.print("\n");
		}
	}
}
