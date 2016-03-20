package br.univel;

public class ExD implements Desenho {
	
	public static int SIZE = 8;
	
	@Override
	public void desenhar(){
		
		System.out.println("\nd)");
		
		int caracteres = SIZE -1;
		for (int linha = 0; linha < SIZE; linha++){
			for(int coluna = 0 ; coluna < SIZE; coluna++) {
				if (coluna > caracteres){
					System.out.print("#");
				} else {
					System.out.print(" ");
				}				
			}
			caracteres--;
			System.out.print("\n");
		}
	}


}
