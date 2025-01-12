package carroCompra;

public class Producto {

	String nomprod;
	double precio,iva;
	static String almacen;
	static int total;
	
	public Producto(String nompro,double prec,double iv) {
		
	nomprod=nompro;
	precio=prec;
	iva=iv;
		
	}
	
	public void quitPro(Producto c1) {
		total-=precio;
	}
	
	public void getPro() {
		almacen = almacen + "Nombre de producto: " + nomprod + "\nPrecio del producto " + precio + "\n IVA: " + iva + "\n";
		System.out.println("Nombre de producto: " + nomprod + "\nPrecio del producto " + precio + "\n IVA: " + iva + "\n");
	}
	
}
