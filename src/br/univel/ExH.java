package br.univel;

public class ExH implements Desenho{
	
	public static int SIZE = 7;
	
	@Override
	public void desenhar(){
		
		System.out.println("\nh)");
		
		
		for (int linha = 0; linha < SIZE; linha++){
			for(int coluna = 0 ; coluna < SIZE; coluna++) {
				if(linha == 0 || linha == SIZE -1 || coluna == (SIZE - linha -1) || linha == coluna){
					System.out.print("#");
				} else {
					System.out.print(" ");
				}		
			}
			System.out.print("\n");
		}
	}

}
