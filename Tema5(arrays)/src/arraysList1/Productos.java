package arraysList1;

import java.util.ArrayList;

public class Productos {

	//Atributos
	
	private String nombre;
	private double precio;
	private int cantidad = 0;
	private double totalper = 0;
	private static double total = 0;
	static ArrayList<Productos> ticket = new ArrayList<Productos>();
	
	public Productos(String nombre,double precio, int cantidad) {
		
		this.nombre = nombre;
		this.precio = precio;
		this.cantidad = cantidad;
		
	}
	
	public void addprod() {
		cantidad++;
		totalper = cantidad * precio;
		total+=precio;
		Productos p = new Productos(nombre, precio, cantidad);
		ticket.add(p);
	}

	public String getNombre() {
		return nombre;
	}

	public double getTotalper() {
		return totalper;
	}

	public void setTotalper(double totalper) {
		this.totalper = totalper;
	}

	public static double getTotal() {
		return total;
	}

	public static void setTotal(double total) {
		Productos.total = total;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public int getCantidad() {
		return cantidad;
	}

	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}

	public String toString() {
		return nombre + "\t" + precio + "\t" + cantidad + "\t" + totalper ;
	}
	
	public void Ticket() {
		System.out.println("Producto" + "\t" + "Precio" + "\t" + "Cantidad" + "\t" + "total");
		for(int i = 0; i<ticket.size() ; i++) {
			if(ticket.get(i).getNombre() != null) {
			System.out.println(ticket.get(i));
			}
		}
	}
	
	
	
}
