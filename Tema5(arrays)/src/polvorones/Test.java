package polvorones;
import java.util.Scanner;

public class Test {

	public static void main(String[] args) {

		Polvorones p1 = new Polvorones("Chocolate", 2.35);
		Polvorones p2 = new Polvorones("Vainilla", 2.35);
		Polvorones p3 = new Polvorones("Limon", 2.35);
		Polvorones p4 = new Polvorones("Crema", 2.35);
		Polvorones p5 = new Polvorones("Almendra", 2.35);
		Polvorones p6 = new Polvorones("Naranja", 2.35);
		Polvorones p7 = new Polvorones("Mantequilla", 2.35);
		
		Scanner entrada = new Scanner(System.in);
		boolean encendido =false;
		
		
		while(!encendido) {
			
		System.out.println("Menu para la cesta de polvorones" + "\n1.Añadir polvoron\n2.Buscar polvoron en la cesta\n"
					+ "3.Eliminar polvoron\n4.Modificar cesta\n5.Mostrar cesta\n6.Precio cesta");
		int opcion = entrada.nextInt();	
			
		switch(opcion) {
		
		case 0:encendido = true; 
		break;
		
		case 1: 
			Cesta.insertar(p1);
		Cesta.insertar(p2);
		Cesta.insertar(p3);
		Cesta.insertar(p4);
		Cesta.insertar(p5);
		Cesta.insertar(p6);
		System.out.println();
		break;
		
		case 2: int [] vector = Cesta.buscar(p3);
			if(vector[0]==-1 && vector[1]==-1) {
				System.out.println("El polvorón que buscas no está en la cesta");
			}else {
				System.out.println("El polvorón que buscas se encuentra en la fila: " + vector[0] + " columna: " + vector[1] + "\n");
			}
		break;
		
		case 3:
			Cesta.eliminar(p3);
			break;
		
		case 4:Cesta.modificar(p1, p7);break;
		
		case 5: 
		System.out.println(); 
		Cesta.mostrarCesta() ;
		System.out.println();
		break;
		
		case 6:
			System.out.println(Cesta.mostrarPrecio());
		}
		
		

	}
	
	}
	
}
