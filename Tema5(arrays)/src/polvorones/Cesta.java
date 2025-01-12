package polvorones;
import java.util.Arrays;
import java.util.Scanner;

public class Cesta {
	
	static String [] []  cestaP = new String [2][3];
	static int i = 0, j = 0, c = 0;
	static int [] buscador = new int [6];	
	static Polvorones [] [] cesta = new Polvorones [2][3];
	
	public static void insertar(Polvorones p) {
		boolean lleno = false;
		boolean repe = false;
		
		for(int i = 0; i<cestaP.length && repe==false ; i++) {
			for(int j=0; (j<cestaP[i].length) && repe==false ;j++) {
				
				if(cesta[i][j] != null && p.getSabor().equalsIgnoreCase(cesta[i][j].getSabor())) {
					repe=true;
					System.out.println("El sabor: " + p.getSabor() + " se ha repetido y no se ha podido introducir");
				}	
				if(cesta[i][j]==null && lleno==false) {
					cesta[i][j]=p;
					lleno=true;
				}
			}	
			if(i==cesta.length && repe==false && lleno==false) {
				i=0;
				j=0;
			}	
		}
	}
	public static int [] buscar(Polvorones p) {
		int [] vector = {-1,-1};
		boolean repe = false;
		
		for(int i = 0; i<cesta.length && repe==false ; i++) {
			
			
			for(int j = 0; j<cesta[i].length && repe==false ; j++) {
				
				if(cesta[i][j] != null && p.getSabor().equalsIgnoreCase(cesta[i][j].getSabor())) {
					vector [0] = i;
					vector [1] = j;
					repe = true;
				}
			}
		}
		
	return vector;
	}
	
	public static void eliminar(Polvorones p) {
		
		int [] vector = Cesta.buscar(p);
		if(vector[0]==-1 && vector[1]==-1) {
			System.out.println("El polvorón que buscas no está en la cesta");
		}else {
			cesta[vector[0]][vector[1]] = null;
		}
	}
	public static void modificar(Polvorones p, Polvorones p1) {
		
		int [] vector = Cesta.buscar(p);
		if(vector[0]==-1 && vector[1]==-1) {
			System.out.println("El polvorón que has intentado modificar no está en la cesta");
		}else {
			cesta[vector[0]][vector[1]] = p1;
		}
		
	}
	
	public static void mostrarCesta() {
		
		for(int i = 0; i<cesta.length;i++) {
			
			for(int j = 0; j<cesta[i].length;j++) {
				System.out.print(cesta[i][j] + " ");
			}
			
			System.out.println();
			
		}
		
	}
	
	public static double mostrarPrecio() {
		
		double precio = 0;
		
		for(int i = 0; i<cesta.length;i++) {
			
			for(int j = 0; j<cesta[i].length;j++) {
				if(cesta[i][j] != null) {
					precio+=cesta[i][j].getPrecio();
				}
			}
			
			System.out.println();
			
		}
		return precio;
	}
	
	
}
