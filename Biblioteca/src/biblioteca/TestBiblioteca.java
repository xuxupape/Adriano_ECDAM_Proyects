package biblioteca;

import java.nio.file.spi.FileSystemProvider;

public class TestBiblioteca {

	public static void main(String[] args) {
		
		//Creo 3 libros diferentes para ejecutar los métodos sobre ellos
		
		Libro l1 = new Libro("Cien Años de soledad", "Desconocido", 550);
		Libro l2 = new Libro("El quijote", "Miguel de cervantes",800);
		Libro l3 = new Libro("La odisea","Homero" );
		
		//Se usa el método para asignar un máximo de libros prestados nuevo y uso el método de prestar libros para
		//comprobar si el máximo se ha puesto correctamente
		
		Biblioteca.setMaximoLibrosPrestados(2);
		l1.prestarLibro();	
		l2.prestarLibro();
		l3.prestarLibro();
		
		//Pruebo el método con sobrecarga para comprobar su funcionamiento y uso los métodos de prestar y devolver libros
		//mientras consulto el total de libros prestados para ver si se están restando y sumando correctamente
		
		l3.prestarLibro("Muy urgente");
		System.out.println(" Total de libros prestados actualmente: " + Biblioteca.consultarTotalLibrosPrestados());
		l1.devolverLibro();
		System.out.println(" Total de libros prestados actualmente: " + Biblioteca.consultarTotalLibrosPrestados());
		l3.prestarLibro();
		System.out.println(" Total de libros prestados actualmente: " + Biblioteca.consultarTotalLibrosPrestados());
		l3.prestarLibro();
		
		System.out.println("----------------------------------------------------");
		
		//Por último pruebo los getters hechos en la clase Libro
		
		System.out.println(l1.getAutor());
		System.out.println(l2.getNumPag());
		System.out.println(l3.getTitulo());
		System.out.println(l3.getNumPag());

	}

}
