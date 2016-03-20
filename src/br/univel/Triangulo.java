package br.univel;

public class Triangulo implements Desenho {
	
	public static int SIZE = 11;
	
	@Override
	public void desenhar(){
		for (int linha = 0; linha < SIZE; linha++){
			for(int coluna = 0 ; coluna < SIZE; coluna++) {
				if (coluna == (SIZE/2) && linha==0) {
					System.out.print("*");
				} else {
					if ((4 <= coluna && coluna <= 6) && linha==1) {
						System.out.print("*");
					} else {
						if ((3 <= coluna && coluna <= 7) && linha==2) {
							System.out.print("*");
						} else {
							if ((2 <= coluna && coluna <= 8) && linha==3) {
								System.out.print("*");
							} else {
								if ((1 <= coluna && coluna <= 9) && linha==4) {
									System.out.print("*");
								} else {
									if (linha==5) {
										System.out.print("*");
									} else {
										System.out.print(" ");
									}
								}
							}
						}
					}
				}					
			}
			System.out.print("\n");
		}
	}
}
