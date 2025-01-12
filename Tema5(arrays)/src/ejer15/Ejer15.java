package ejer15;
import java.util.Scanner;

public class Ejer15 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		double [] notas = new double [4];
		int opcion;
		int j = 0;
		Alumno [] clase = new Alumno[10];
		String [] [] pc = new String [5][5];
		
		boolean encendedor = false;
		
		while(!encendedor) {
		
			System.out.println("Bienvenido al menú de notas del IES Villaverde"
					+ "\n-------------------------------------------\n 1.Añadir alumno"
					+ "\n 2.Mostrar alumnos añadidos\n 3.Modificar notas\n 4.Eliminar alumno\n 5.Asignar a  lumno a pc");
			opcion=entrada.nextInt();
		switch(opcion) {
		
		case 1: 
			System.out.println("Introduce el nombre del alumno");
			String nombre = entrada.next();
			notas = new double [4];
			
			for(int i = 0; i<notas.length ; i++){
				double nota=0;
				System.out.println("Introduce otra nota");
				nota = entrada.nextDouble();
				notas[i]=nota;
				}
			
			Alumno a1 = new Alumno(nombre, notas);
			clase[j] = a1 ;
			j++;
			break;
		
		case 2: 
			
			for(int i=0; i<j; i++ ) {
				
				if(clase[i] != null) {
					System.out.println(clase[i].toString());;
				}
				
			}
			
			
			break;
		
		case 3: 
		
			System.out.println("Introduzca el nombre del alumno al que le quieres cambiar las notas");
			nombre = entrada.next();
			boolean comp = false;
			notas = new double [4];
			for(int i = 0; i<clase.length && comp==false ; i++) {
				if(clase[i] != null && clase[i].getNombre().equalsIgnoreCase(nombre) && comp == false) {
					System.out.println("El alumno ha sido identificado correctamente. Introduzca las nuevas notas");
					for(int p = 0; p<notas.length ; p++){
						double nota=0;
						System.out.println("Introduce otra nota");
						nota = entrada.nextDouble();
						notas[p]=nota;
						}	
					clase[i].setNotas(notas);
					comp = true;
				}
			}
		break;
		
		case 4:
			
			System.out.println("Introduzca el nombre del alumno que deseas eliminar");
			nombre = entrada.next();
			comp=false;
			for(int i = 0; i<clase.length && comp==false ; i++) {
				if(clase[i] != null && clase[i].getNombre().equalsIgnoreCase(nombre) && comp == false) {
					System.out.println("El alumno ha sido identificado y eliminado correctamente.");
					clase[i] = null;
					comp=true;
				}
			}
			
			break;
			
		case 0:
			encendedor = true;
			break;
		}
		
		}
	}
	
}
