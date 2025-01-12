package carroCompra;

public class Ejer62 {

	public static void main(String[] args) {


		CarroCompra c1 = new CarroCompra("Adriano", "Increible", "52134123G");
		CarroCompra c2 = new CarroCompra("Adrianowefq", "wefqIncreible", "fw52134123G");
		
		Producto p1 = new Producto("Gulas", 2.15, 7);
		Producto p2 = new Producto("Flan", 1.15, 21);
		
		p1.getPro();
		p2.getPro();
	}

}
