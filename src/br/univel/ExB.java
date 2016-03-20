package br.univel;

public class ExB implements Desenho {
	
	public static int SIZE = 8;
	
	@Override
	public void desenhar(){
		
		System.out.println("\nb");
		
		int caracteres = SIZE;
		for (int linha = 0; linha < SIZE; linha++){
			for(int coluna = 0 ; coluna < caracteres; coluna++) {
				System.out.print("#");
			}
			caracteres--;
			System.out.print("\n");
		}
	}

}
