package br.univel;

public class NumeralEscadaContrario implements Desenho {
	public static int SIZE=8;
	
	public void desenhar(){
		for (int linha = 0; linha < SIZE; linha++){
			for(int coluna = 0 ; coluna < SIZE; coluna++) {
				if(coluna > linha-1 ) {
					System.out.print(coluna+1);
				} else {
					System.out.print(" ");
				}
			}
			System.out.print("\n");
		}
	}
}
