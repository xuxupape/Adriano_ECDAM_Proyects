package unitaria;

public class Unitaria {

	public static void main(String[] args) {
		
		int [] [] tabla = new int [10] [10];
		
		for(int i=0; i<tabla.length ; i++) {
			
			for(int j=0; j<tabla[i].length ; j++) {
				if (j == i) {
					tabla[i][j]=1;
				}
				System.out.print(tabla[i][j] + " ");
			}
			System.out.println();
		}

	}

}
