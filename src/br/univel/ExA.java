package br.univel;

public class ExA implements Desenho {
	

	public static int SIZE = 8;
	
	@Override
	public void desenhar(){
		
		System.out.println("a)");
		
		int caracteres = 1;
		for (int linha = 0; linha < SIZE; linha++){
			for(int coluna = 0 ; coluna < caracteres; coluna++) {
				System.out.print("#");
			}
			caracteres++;
			System.out.print("\n");
		}
	}
}
