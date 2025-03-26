package tarea;
import java.util.*;
import java.io.*;

public class Tarea {
	
//	Crea y sube a esta tarea una clase java SE17 para probar los métodos de File, al menos los siguientes:
//		1- Debes crear y comprobar si existen los ficheros y directorios. Si no existen, debes crearlos.
//		2 - Debes renombrar directorios y ficheros que estén en alguna ruta que no sea el directorio raíz. 
//    	Es decir, la ruta debe contener al menos dos carpetas anidadas.
//		3 - Debes mover ficheros de un directorio a otro. Si el directorio destino no existe, debes crearlo.
//		4 - Debes borrar ficheros y directorios en el orden adecuado. 
//	   ¿Qué problemas pueden surgir al borrar un directorio que contiene otros ficheros dentro?
//  	¿Y si tiene otros directorios dentro pero sin ficheros? Prueba y refleja estos casos.
//		5 - Realiza un código ordenado con métodos para cada operación que se quiera realizar 
//  	e incluye comentarios explicando lo que se pretende hacer.
//		6 - Tendrás que explicar en clase el código creado, todo lo que hace y hacer demostración. Para ello dispondrás de 5 minutos.
	
	public static void crearComprobar(File f) throws IOException{
		
		Scanner sc = new Scanner(System.in);
		String opcion;
		
		if(f.exists()) {
			System.out.println("El directorio ya existe");
		}else {
			System.out.println("Elige lo que quieres crear ¿Fichero o directorio?");
			opcion = sc.next();
			if(opcion.equalsIgnoreCase("Directorio")) {
				if(f.mkdirs()) {
					System.out.println("Se ha creado el directorio correctamente");
				}else {
					System.out.println("No se ha creado el directorio correctamente");
				}
			}else if(opcion.equalsIgnoreCase("Fichero")) {
				if(f.createNewFile()) {
					System.out.println("Se ha creado el fichero correctamente");
				}else {
					System.out.println("No se ha creado el fichero correctamente");
				}
			}
		}
		
	}
	
	public static void renombrar(File f, String nomNuevo) throws IOException {
		
		if(f.exists()) {
			File f1 = new File(f.getParent(), nomNuevo);
			if(f.renameTo(f1)) {
				System.out.println("El cambio de nombre se ha realizado correctamente");
			}else {
				System.out.println("El cambio de nombre no se ha completado");
			}
		}else {
			System.out.println("No se puede cambiar el nombre de un archivo que no existe");
		}
		
	}
	
	
	
	public static void main(String[] args) throws IOException {
		
		File f = new File("prueba\\hola");
		
		crearComprobar(f);
		renombrar(f, "patata");
		
	}

}
