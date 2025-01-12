package barcos;
import java.lang.Math;

public class Barquitos {

	public static void main(String[] args) {
		
		int [] [] tabla = new int [5] [8];
		int mayor = 0, menor = 40;
		int [] posMenor = new int [2];
		int [] posMayor = new int [2];
		
		for(int i = 0; i < tabla.length ;i++) {
			for(int j = 0; j < tabla[i].length  ;j++) {
				tabla[i][j]=(int) ((Math.random()*20)+20);
				if (mayor < tabla[i][j]) {
					mayor = tabla[i][j];
					posMayor[0] = i + 1;
					posMayor[1] = j + 1;		
				}
				if (menor > tabla[i][j]) {
					menor = tabla[i][j];
					posMenor[0] = i + 1;
					posMenor[1] = j + 1;
				} 
				
			}
		}
		
		for(int i = 0; i < tabla.length ;i++) {
			for(int j = 0; j < tabla[i].length  ;j++) {
				System.out.print(tabla[i][j] + " ");
			}
			System.out.println();
		}
		System.out.println("Elemento mayor: " + mayor + " Fila: " + posMayor[0] + " Columna: " + posMayor[1]);
		System.out.println("Elemento menor: " + menor + " Fila: " + posMenor[0] + " Columna: " + posMenor[1]);

	}

}
