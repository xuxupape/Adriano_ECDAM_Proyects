package biblioteca;

public class Libro {

	//Atributos
	
	private String titulo, autor;
	private int numPag;
	private boolean prestado;
	private static int libPrestados;
	
	//Constructores Uno que incluye el número de páginas y otro que no
	
	Libro(String titulo, String autor){
		
		this.titulo=titulo;
		this.autor=autor;
		
	}
	
	Libro(String titulo, String autor, int numPag){
		
		this(titulo,autor);
		this.numPag = numPag;
		
	}
	
	//getters para poder obtener los datos del Libro
	
	public String getTitulo() {
		return titulo;
	}
	
	public String getAutor() {
		return autor;
	}
	
	public int getNumPag() {
		return numPag;
	}
	
	//Método prestar libro con un if para comprobar si está ya prestado el libro o si se ha sobrepasado el limite de la biblioteca
	
	public void prestarLibro() {
		
		if(prestado==true || libPrestados >= Biblioteca.getMaximoLibrosPrestados() ) 
		{
			System.out.println("No se pudo prestar el libro: " + this.getTitulo() + " ya está prestado o se alcanzo el límite");			
		}
		else 
		{
			System.out.println("Libro prestado: " + this.getTitulo());
			libPrestados++;
			prestado=true;
		} 
		
	}
	
	//Método anterior con sobrecarga para asignarle una mensaje de prioridad intento de prestamo
	
	public void prestarLibro(String mensajePrioridad) {
		
		if(prestado==true || libPrestados >= Biblioteca.getMaximoLibrosPrestados() ) 
		{
			System.out.println("No se pudo realizar el prestamo de: " + this.getTitulo() + ". Tiene prioridad: " + mensajePrioridad);		
		}
		else 
		{
			System.out.println("Libro prestado: " + this.getTitulo() + ". Tiene prioridad: " + mensajePrioridad);
			libPrestados++;
			prestado=true;
		} ;
		
	}
	
	//Método que comprueba si el libro está en prestamo y si es así lo devuelve
	
	public void devolverLibro() {
		
		if(prestado==true) 
		{
			System.out.println("Libro devuelto: " + this.getTitulo());
			libPrestados++;
			prestado=false;
		}else 
			System.out.println("El libro no estaba en prestamo");
		
	}
	
	//Método estatico para que devuelve cuentos libros se han prestado en total
	
	public static int getLibrosPrestados() {
		return libPrestados;
	}
	
	
	
	
}
