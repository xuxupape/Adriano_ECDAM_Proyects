package cuadrado;

public class Cuadrado {

	public static void main(String[] args) {
		
		int [] [] tabla = new int [4] [4];
		int comprobador = 0;

//		tabla[1][2] = 3;
//		tabla[2][1] = 3;
		
		for(int i=0; i<tabla.length ; i++) {
			
			for(int j=0; j<tabla[i].length ; j++) {
				
				if (tabla[i][j] == tabla[j][i]) {
					comprobador++;
				}
				
				System.out.print(tabla[i][j] + " ");
			}
			
			System.out.println();
		}
		
		if(comprobador == 16) {
			System.out.println("Es simétrico");
		}else System.out.println("No es simétrico");
	}

}
