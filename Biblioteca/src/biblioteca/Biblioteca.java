package biblioteca;

public class Biblioteca {
	
	//Atributo
	
	private static int limiteLibros = 3;
	
	// 1 Set y 1 Get para el límite de libros prestados
	
	public static void setMaximoLibrosPrestados(int maximo) {
		limiteLibros=maximo;
	}
	
	public static int getMaximoLibrosPrestados() {
		return limiteLibros;
	}
	
	//Método para mostrar por pantalla el número actual de libros prestados
	
	public static int consultarTotalLibrosPrestados() {
		return Libro.getLibrosPrestados();
	}
	
	
	
	
	
}
