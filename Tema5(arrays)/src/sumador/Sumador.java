package sumador;
import java.lang.Math;

public class Sumador {

	public static void main(String[] args) {

		int [] [] tabla = new int [4] [5];
		int [] sumFil = new int [4];
		int [] sumCol = new int [5];
		
		for(int i = 0; i < tabla.length ;i++) {
			for(int j = 0; j < tabla[i].length  ;j++) {
				tabla[i][j]=(int) ((Math.random()*10)+1);
				sumFil[i] += tabla[i][j];
				System.out.print(tabla[i][j] + " ");
				sumCol[j]+=tabla[i][j];
			}
			
			System.out.println();
		}
		
		for(int i = 0; i < sumFil.length ; i++) {	
			System.out.println("Suma de la fila " + i + ": " + sumFil[i]);
		}
		
		for(int i = 0; i < sumCol.length ; i++) {	
			System.out.println("Suma de la columna " + i + ": " + sumCol[i]);
		}
	}

}
