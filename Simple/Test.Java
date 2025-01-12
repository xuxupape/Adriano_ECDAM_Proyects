public class Polvorones {

	public static void main(String[] args) {
		
		Cesta c1 = new Cesta();
		
		c1.insertar("Limón");
		c1.insertar("Crema");
		c1.mostrarCesta();
		System.out.println(c1.buscar("Limón"));
	}

}
