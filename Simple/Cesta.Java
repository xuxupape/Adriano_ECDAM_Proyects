package polvorones;
import java.util.Arrays;
import java.util.Scanner;

public class Cesta {
	
	String [] [] polvorones = new String [2][3];
	int i = 0, j = 0, c = 0;
	int [] buscador = new int [6];

	public void insertar(String polvoron) {
		
		Scanner entrada = new Scanner(System.in);
		System.out.println("¿Donde quieres añadir el polvoron?" );
		System.out.print("Fila (horizontal): ");
		i = entrada.nextInt();
		System.out.print("Columna (vertical): ");
		j = entrada.nextInt();
		
		
		
		if(i>=3 || j>=2) {
			System.out.println("Las coordenadas están fuera de los parámetros esperados");
		}else if(i<0 || j<0 ) {
			System.out.println("Las coordenadas están fuera de los parámetros esperados");
		}else {
			polvorones [i] [j] = polvoron;
		}
		
	}
	
	public String buscar(String polvoron) {
		
		Arrays.fill(polvorones, "Vacio");
		int x=0;
		boolean comprobador = false;
		String devolver = "No se ha encontrado el polvoron que estabas buscando";
		
		while(comprobador == false || x >= 1) {
			for(int y=0; y<polvorones[x].length;y++) {
				String temp = polvorones[x][y];
				if(temp.equalsIgnoreCase(polvoron)) {
					devolver = "Se ha encontrado " + polvoron + " y se encuentra en la fila " + x + " columna: " + y;
					comprobador=true;
				}
			}
			x++;
		}
		
		return devolver;
		
	}
	
	public void eliminar(String polvoron) {
		
		System.out.println("Eliga la fila (Vertical) y (Columna Horizontal) que deseas eliminar");
		for(int i = 0; i<polvorones.length ; i++) {
			for(int j = 0; j<polvorones[i].length ; j++) {
				System.out.print(polvorones[i][j] + " ");
			}
			System.out.println();	
		}
		
		System.out.println("fila :");
		 
		
	}
	
	public void modificar() {
		
	}
	
	public void mostrarCesta() {
		
		for(int i = 0; i<polvorones.length ; i++) {
			for(int j = 0; j<polvorones[i].length ; j++) {
				System.out.print(polvorones[i][j] + " ");
			}
			System.out.println();	
		}
		
	}
	
	
}
