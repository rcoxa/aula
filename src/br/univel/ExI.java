package br.univel;

public class ExI implements Desenho {
	
	public static int SIZE = 7;
	
	@Override
	public void desenhar(){
		
		System.out.println("\ni)");
		
		
		for (int linha = 0; linha < SIZE; linha++){
			for(int coluna = 0 ; coluna < SIZE; coluna++) {
				if(linha == 0 || linha == SIZE -1){
					System.out.print("#");
				} else {
					if(coluna == (SIZE - linha -1) || linha == coluna || coluna == 0 || coluna == SIZE-1) {
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
