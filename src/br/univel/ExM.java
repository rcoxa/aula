package br.univel;

public class ExM implements Desenho {
	
public static int SIZE = 8;

	@Override
	public void desenhar(){
		
		System.out.println("\nm)");
		
		for (int linha = 0; linha < SIZE; linha++){
			for(int coluna = 0 ; coluna < SIZE; coluna++) {
				if (coluna > linha){
					System.out.print(" ");
				} else {
					System.out.print(coluna+1);
				}
		
			}
			System.out.print("\n");
		}
	}
}