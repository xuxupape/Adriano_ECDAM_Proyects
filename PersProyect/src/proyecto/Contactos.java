package proyecto;

public class Contactos {
	
	String nombre;
	String apellidos;
	String direccion;
	int prefijo;
	int numero;
	String cumple;
	
	
	Contactos(String nombre,int prefijo,int numero){
		
		this.nombre = nombre;
		this.prefijo = prefijo;
		this.numero = numero;
		
	}
	
	Contactos(String nombre,String apellidos, int prefijo, int numero){
		
		this(nombre, prefijo,numero);
		this.apellidos = nombre;
		
	}
	
	Contactos(String nombre,String apellidos,String direccion, int prefijo, int numero){
		
		this(nombre,apellidos, prefijo,numero);
		this.direccion = direccion;
		
	}
	
	Contactos(String nombre,String apellidos,String direccion, int prefijo, int numero, String cumple){
		
		this(nombre,apellidos, direccion, prefijo,numero);
		this.cumple = cumple;
		
	}	
	
	
}
